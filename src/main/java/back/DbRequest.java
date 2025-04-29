package back;

import java.sql.Connection;
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

/**
 *
 * @author joshu
 */
public class DbRequest {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "root";
    private static String url = "jdbc:mysql://localhost:3306/bibliotecadb";
    private static String dbName = "bibliotecadb";
    private static Connection com;
    private static Statement changes;

    public static void driverConnection() {
        com = null;
        try {
            com = (Connection) DriverManager.getConnection(url, user, password);
            if (com != null) {
                System.out.println("Conexion Exitosa");
                changes = com.createStatement();
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
        String sql = "SELECT * FROM Mat_Bliografico";

        try (Statement stmt = com.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Libro libro = new Libro(
                        rs.getInt("id_matBiblio"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editorial"),
                        rs.getInt("ano_publicacion"),
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

    public boolean signUser(String name, String email, String phoneNumber, String direction, String password) {
        try {
            if (com == null || com.isClosed()) {
                driverConnection();
            }
            String sql = "INSERT INTO Usuario (nombre_pila, email, telefono, tipo_usuario, direccion, contrasenia) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = com.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, phoneNumber);
                stmt.setString(4, "Estudiante"); // Puedes cambiar el tipo si quieres
                stmt.setString(5, direction);
                stmt.setString(6, password);
                stmt.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error en signUser: " + e.getMessage());
            return false;
        }
    }

    public boolean signUser(String name, String email, String phoneNumber, String direction, String password, int nip) {
        try {
            if (com == null || com.isClosed()) {
                driverConnection();
            }
            String sql = "INSERT INTO Bibliotecario (nombre_pila, email, telefono, tipo_usuario, direccion, paterno, contrasenia, nip) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = com.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, phoneNumber);
                stmt.setString(4, "Bibliotecario"); // O "Administrador", depende
                stmt.setString(5, direction);
                stmt.setString(6, ""); // paterno vacío si no lo manejas
                stmt.setString(7, password);
                stmt.setInt(8, nip);
                stmt.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error en signUser (Bibliotecario): " + e.getMessage());
            return false;
        }
    }

    public boolean validateIdentify(String Ddmin) {

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

    public boolean createBook(String name, String year, String ubication, int avaible, String gender, String editorial) {

        return false;
    }

    public boolean createAutor(String name, String nationality, String lastName) {

        return false;
    }

    public boolean createGender(String name, String description, int age) {

        return false;
    }

    public boolean createEditorial(String name, String address) {

        return false;
    }
}
