/** * @authors Quezada Esteban Joshua Arturo
 *             Martínez Granados Emanuel
 *             Roldán López Christian Jair
 */
package back;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import models.Autor;
import models.Editorial;
import models.Genero;
import models.Libro;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbRequest {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "root";
    private static String url = "jdbc:mysql://localhost:3306/bibliotecadb";
    private static String dbName = "bibliotecadb";
    private static Connection com;

    public static void driverConnection() {
        com = null;
        try {
            com = (Connection) DriverManager.getConnection(url, user, password);
            if (com != null) {
                System.out.println("Conexion Exitosa");
            }

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public List<Autor> requestAutors() {
        List<Autor> autores = new ArrayList<>();
        String sql = "SELECT * FROM Autor";

        try (Statement stmt = com.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Autor autor = new Autor(
                        rs.getInt("id_autor"),
                        rs.getString("nombre_pila"),
                        rs.getString("apellidos"),
                        rs.getString("nacionalidad")
                );
                autores.add(autor);
            }

        } catch (SQLException e) {
            System.out.println("Error al solicitar autores: " + e.getMessage());
        }

        return autores;
    }

    public List<Editorial> requestEditors() {
        List<Editorial> editoriales = new ArrayList<>();
        String sql = "SELECT * FROM Editorial";

        try (Statement stmt = com.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Editorial editorial = new Editorial(
                        rs.getInt("id_editorial"),
                        rs.getString("nombre"),
                        rs.getString("direccion")
                );
                editoriales.add(editorial);
            }

        } catch (SQLException e) {
            System.out.println("Error al solicitar editoriales: " + e.getMessage());
        }

        return editoriales;
    }

    public List<Genero> requestGenders() {
        List<Genero> generos = new ArrayList<>();
        String sql = "SELECT * FROM Genero";

        try (Statement stmt = com.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Genero genero = new Genero(
                        rs.getInt("id_genero"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("edad_recom")
                );
                generos.add(genero);
            }

        } catch (SQLException e) {
            System.out.println("Error al solicitar géneros: " + e.getMessage());
        }

        return generos;
    }

    public List<Libro> requestBooks() {
        List<Libro> libros = new ArrayList<>();
        String sql = """
        SELECT m.id_matBiblio, m.titulo, 
               CONCAT(a.nombre_pila, ' ', a.apellidos) AS autor,
               e.nombre AS editorial,
               m.ano_publicacion,
               g.nombre AS genero,
               m.ubicacion,
               m.copias_disponibles
        FROM Mat_Bliografico m
        JOIN autor a ON m.id_autor = a.id_autor
        JOIN editorial e ON m.id_editorial = e.id_editorial
        JOIN genero g ON m.id_genero = g.id_genero
        """;

        try (Statement stmt = com.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Libro libro = new Libro(
                        rs.getInt("id_matBiblio"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editorial"),
                        rs.getString("ano_publicacion"),
                        rs.getString("genero"),
                        rs.getString("ubicacion"),
                        rs.getInt("copias_disponibles")
                );
                libros.add(libro);
            }

        } catch (SQLException e) {
            System.out.println("Error al solicitar libros: " + e.getMessage());
        }

        return libros;
    }

    public Autor getAutorByName(String name) {
        String sql = "SELECT * FROM autor WHERE CONCAT(nombre_pila, ' ', apellidos) = ?";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Autor(
                        rs.getInt("id_autor"),
                        rs.getString("nombre_pila"),
                        rs.getString("apellidos"),
                        rs.getString("nacionalidad")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar autor: " + e.getMessage());
        }

        return null;
    }

    public Editorial getEditorialByName(String name) {
        String sql = "SELECT * FROM editorial WHERE nombre = ?";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Editorial(
                        rs.getInt("id_editorial"),
                        rs.getString("nombre"),
                        rs.getString("direccion")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar editorial: " + e.getMessage());
        }

        return null;
    }

    public Genero getGeneroByName(String name) {
        String sql = "SELECT * FROM genero WHERE nombre = ?";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Genero(
                        rs.getInt("id_genero"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("edad_recom")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar género: " + e.getMessage());
        }

        return null;
    }

    public List<Libro> searchBook(String name) {
        List<Libro> libros = new ArrayList<>();

        String sql = """
        SELECT m.id_matBiblio, m.titulo, 
               CONCAT(a.nombre_pila, ' ', a.apellidos) AS autor,
               e.nombre AS editorial,
               m.ano_publicacion,
               g.nombre AS genero,
               m.ubicacion,
               m.copias_disponibles
        FROM Mat_Bliografico m
        JOIN autor a ON m.id_autor = a.id_autor
        JOIN editorial e ON m.id_editorial = e.id_editorial
        JOIN genero g ON m.id_genero = g.id_genero
        WHERE LOWER(m.titulo) LIKE ?
    """;

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, "%" + name.toLowerCase() + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Libro libro = new Libro(
                        rs.getInt("id_matBiblio"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editorial"),
                        rs.getString("ano_publicacion"),
                        rs.getString("genero"),
                        rs.getString("ubicacion"),
                        rs.getInt("copias_disponibles")
                );
                libros.add(libro);
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar libros: " + e.getMessage());
        }

        return libros;
    }

    public boolean createReserve(int idUsuario, int idLibro) {
        String sql = """
        INSERT INTO reservas (fecha_reserva, fecha_limite, id_usuario, id_libro)
        VALUES (?, ?, ?, ?)
    """;

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            LocalDate fechaReserva = LocalDate.now();
            LocalDate fechaLimite = fechaReserva.plusDays(7); // por ejemplo, 7 días de préstamo

            stmt.setDate(1, Date.valueOf(fechaReserva));
            stmt.setDate(2, Date.valueOf(fechaLimite));
            stmt.setInt(3, idUsuario);
            stmt.setInt(4, idLibro);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al crear reserva: " + e.getMessage());
            return false;
        }
    }

    public Libro searchBook(int id) {
        String sql = """
        SELECT m.id_matBiblio, m.titulo, 
               CONCAT(a.nombre_pila, ' ', a.apellidos) AS autor,
               e.nombre AS editorial,
               m.ano_publicacion,
               g.nombre AS genero,
               m.ubicacion,
               m.copias_disponibles
        FROM Mat_Bliografico m
        JOIN autor a ON m.id_autor = a.id_autor
        JOIN editorial e ON m.id_editorial = e.id_editorial
        JOIN genero g ON m.id_genero = g.id_genero
        WHERE m.id_matBiblio = ?
    """;

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Libro(
                        rs.getInt("id_matBiblio"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editorial"),
                        rs.getString("ano_publicacion"),
                        rs.getString("genero"),
                        rs.getString("ubicacion"),
                        rs.getInt("copias_disponibles")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar libro por ID: " + e.getMessage());
        }

        return null;
    }

    public boolean signUser(String name, String email, String phoneNumber, String direction, String password, String lastName) {
        try {
            if (com == null || com.isClosed()) {
                driverConnection();
            }
            String sql = "INSERT INTO Usuario (nombre_pila, email, telefono, tipo_usuario, direccion, contrasenia, paterno) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = com.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, phoneNumber);
                stmt.setString(4, "Estudiante");
                stmt.setString(5, direction);
                stmt.setString(6, password);
                stmt.setString(7, lastName);
                stmt.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error en signUser: " + e.getMessage());
            return false;
        }
    }

    public boolean signUser(String name, String lastName, String email, String phoneNumber, String direction, String password, int nip, String type) {
        try {
            if (com == null || com.isClosed()) {
                driverConnection();
            }

            if (type.equals("Administrador")) {

                String sql = "INSERT INTO Bibliotecario (nombre_pila , email, telefono, tipo_usuario, direccion, paterno, contrasenia, nip) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = com.prepareStatement(sql)) {
                    stmt.setString(1, name);
                    stmt.setString(2, email);
                    stmt.setString(3, phoneNumber);
                    stmt.setString(4, type);
                    stmt.setString(5, direction);
                    stmt.setString(6, lastName);
                    stmt.setString(7, password);
                    stmt.setInt(8, nip);
                    stmt.executeUpdate();
                    return true;
                }

            } else {

                String sql = "INSERT INTO Bibliotecario (nombre_pila , email, telefono, tipo_usuario, direccion, paterno, contrasenia) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = com.prepareStatement(sql)) {
                    stmt.setString(1, name);
                    stmt.setString(2, email);
                    stmt.setString(3, phoneNumber);
                    stmt.setString(4, type);
                    stmt.setString(5, direction);
                    stmt.setString(6, lastName);
                    stmt.setString(7, password);
                    stmt.executeUpdate();
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en signUser (Admin/Biblio): " + e.getMessage());
            return false;
        }
    }

    public boolean validateIdentify(String Ddmin) throws SQLException {
        if (com == null || com.isClosed()) {
            driverConnection();
        }

        String sqlValidate = "SELECT nip FROM bibliotecario WHERE tipo_usuario = \"Administrador\" AND nip = ?";

        try (PreparedStatement stmtValidate = com.prepareStatement(sqlValidate)) {
            stmtValidate.setString(1, Ddmin);
            ResultSet rsUser = stmtValidate.executeQuery();

            if (rsUser.next()) {
                String nipBD = rsUser.getString("nip");
                System.out.println("NIP encontrado: " + nipBD);
                return Ddmin.equals(nipBD);
            } else {
                System.out.println("No se encontró ningún administrador con ese NIP.");
            }
        } catch (SQLException e) {
            System.out.println("Lo hiciste mal hijo");
            e.printStackTrace();
        }

        return false;
    }

    public int loginUser(String name, String password) throws SQLException {
        if (com == null || com.isClosed()) {
            driverConnection();
        }

        String sqlUser = "SELECT contrasenia, tipo_usuario FROM Usuario WHERE nombre_pila = ?";
        String sqlBibliotecario = "SELECT contrasenia, tipo_usuario FROM Bibliotecario WHERE nombre_pila = ?";

        try (
                PreparedStatement stmtUser = com.prepareStatement(sqlUser); PreparedStatement stmtBiblio = com.prepareStatement(sqlBibliotecario)) {
            // Buscar en Usuario
            stmtUser.setString(1, name);
            ResultSet rsUser = stmtUser.executeQuery();

            if (rsUser.next()) {
                String storedPassword = rsUser.getString("contrasenia");
                String tipo = rsUser.getString("tipo_usuario");
                if (storedPassword.equals(password) && tipo.equalsIgnoreCase("Estudiante")) {
                    return 1;
                }
            }

            // Buscar en Bibliotecario
            stmtBiblio.setString(1, name);
            ResultSet rsBiblio = stmtBiblio.executeQuery();

            if (rsBiblio.next()) {
                String storedPassword = rsBiblio.getString("contrasenia");
                String tipo = rsBiblio.getString("tipo_usuario");
                if (storedPassword.equals(password)) {
                    if (tipo.equalsIgnoreCase("Bibliotecario")) {
                        return 2;
                    } else if (tipo.equalsIgnoreCase("Administrador")) {
                        return 3;
                    }
                }
            }

            // No encontrado o contraseña incorrecta
            return 0;
        }
    }

    public int loginUserWithId(String name, String password) throws SQLException {
        if (com == null || com.isClosed()) {
            driverConnection();
        }

        String sqlUser = "SELECT id_usuario, contrasenia, tipo_usuario FROM Usuario WHERE nombre_pila = ?";
        String sqlBibliotecario = "SELECT id_bibliotecario, contrasenia, tipo_usuario FROM Bibliotecario WHERE nombre_pila = ?";

        try (
                PreparedStatement stmtUser = com.prepareStatement(sqlUser); PreparedStatement stmtBiblio = com.prepareStatement(sqlBibliotecario)) {

            // Buscar en Usuario
            stmtUser.setString(1, name);
            ResultSet rsUser = stmtUser.executeQuery();

            if (rsUser.next()) {
                String storedPassword = rsUser.getString("contrasenia");
                String tipo = rsUser.getString("tipo_usuario");
                if (storedPassword.equals(password) && tipo.equalsIgnoreCase("Estudiante")) {
                    return rsUser.getInt("id_usuario");
                }
            }

            // Buscar en Bibliotecario
            stmtBiblio.setString(1, name);
            ResultSet rsBiblio = stmtBiblio.executeQuery();

            if (rsBiblio.next()) {
                String storedPassword = rsBiblio.getString("contrasenia");
                String tipo = rsBiblio.getString("tipo_usuario");
                if (storedPassword.equals(password)
                        && (tipo.equalsIgnoreCase("Bibliotecario") || tipo.equalsIgnoreCase("Administrador"))) {
                    return rsBiblio.getInt("id_bibliotecario");
                }
            }

            // No encontrado o contraseña incorrecta
            return 0;
        }
    }

    public boolean createBook(String name, String year, String ubication, int available, String gender, String editorial, String autor) {
        String sql = """
        INSERT INTO Mat_Bliografico (titulo, ano_publicacion, ubicacion, copias_disponibles, id_genero, id_editorial, id_autor)
        VALUES (?, ?, ?, ?, 
            (SELECT id_genero FROM genero WHERE nombre = ?),
            (SELECT id_editorial FROM editorial WHERE nombre = ?),
            (SELECT id_autor FROM autor WHERE CONCAT(nombre_pila, ' ', apellidos) = ?)
        )
    """;

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, year);
            stmt.setString(3, ubication);
            stmt.setInt(4, available);
            stmt.setString(5, gender);
            stmt.setString(6, editorial);
            stmt.setString(7, autor);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al crear libro: " + e.getMessage());
            return false;
        }
    }

    public boolean createAutor(String name, String nationality, String lastName) {
        String sql = "INSERT INTO autor (nombre_pila, apellidos, nacionalidad) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, lastName);
            stmt.setString(3, nationality);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al crear autor: " + e.getMessage());
            return false;
        }
    }

    public boolean createGender(String name, String description, int age) {
        String sql = "INSERT INTO genero (nombre, descripcion, edad_recom) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, description);
            stmt.setInt(3, age);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al crear género: " + e.getMessage());
            return false;
        }
    }

    public boolean createEditorial(String name, String address) {
        String sql = "INSERT INTO editorial (nombre, direccion) VALUES (?, ?)";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, address);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al crear editorial: " + e.getMessage());
            return false;
        }
    }

    public boolean updateBook(int id, String name, String year, String ubication, int available, String gender, String editorial, String autor) {
        String sql = """
        UPDATE Mat_Bliografico
        SET titulo = ?, 
            ano_publicacion = ?, 
            ubicacion = ?, 
            copias_disponibles = ?,
            id_genero = (SELECT id_genero FROM genero WHERE nombre = ?),
            id_editorial = (SELECT id_editorial FROM editorial WHERE nombre = ?),
            id_autor = (SELECT id_autor FROM autor WHERE CONCAT(nombre_pila, ' ', apellidos) = ?)
        WHERE id_matBiblio = ?
    """;

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, year);
            stmt.setString(3, ubication);
            stmt.setInt(4, available);
            stmt.setString(5, gender);
            stmt.setString(6, editorial);
            stmt.setString(7, autor);
            stmt.setInt(8, id);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar libro: " + e.getMessage());
            return false;
        }
    }

    public boolean updateAutor(int id, String name, String nationality, String lastName) {
        String sql = "UPDATE autor SET nombre_pila = ?, apellidos = ?, nacionalidad = ? WHERE id_autor = ?";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, lastName);
            stmt.setString(3, nationality);
            stmt.setInt(4, id);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar autor: " + e.getMessage());
            return false;
        }
    }

    public boolean updateGender(int id, String name, String description, int age) {
        String sql = "UPDATE genero SET nombre = ?, descripcion = ?, edad_recom = ? WHERE id_genero = ?";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, description);
            stmt.setInt(3, age);
            stmt.setInt(4, id);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar género: " + e.getMessage());
            return false;
        }
    }

    public boolean updateEditorial(int id, String name, String address) {
        String sql = "UPDATE editorial SET nombre = ?, direccion = ? WHERE id_editorial = ?";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setInt(3, id);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar editorial: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteObject(int id, String type) {

        String idColumn = "id_" + type.toLowerCase(); // id_autor, id_editorial, etc.

        String sql = "DELETE FROM " + type + " WHERE " + idColumn + " = ?";

        try (PreparedStatement stmt = com.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int result = stmt.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar " + type + ": " + e.getMessage());
            return false;
        }
    }

}
