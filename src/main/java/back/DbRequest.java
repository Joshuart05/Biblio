package back;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joshu
 */
public class DbRequest {
    
    private static String user = "Joshu";
    private static String password = "root";
    private static String db = "bibliotecadb";
    
    public static void driverConnection() {
        try {
            DriverManager.getConnection("jdbc:mysql://localhost/3306/" + db +  "user=minty&password=greatsqldb");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    public String requestAutors()   {
        return "" + "";
    }
    
    public String requestEditors()   {
        return "" + "";
    }
    
    public String requestGenders()   {
        return "" + "";
    }
    
    public boolean signUser(String name, String email, String phoneNumber, String direction, String password) {

        return false;
    }
    
    public boolean signUser(String name, String email, String phoneNumber, String direction, String password, String nip){
         
         return false;
     }
    
    public boolean validateIdentify(String Ddmin){
        
        return false;
    }
    
    public boolean loginUser(String name, String password){
        
        return false;
    }
    
    public boolean createBook(String name, String year, String ubication, int avaible, String gender, String editorial){
        
        return false;
    }
    
    public boolean createAutor(String name, String nationality, String lastName){
        
        return false;
    }
    
    public boolean createGender(String name, String description, int age){
        
        return false;
    }
    
    public boolean createEditorial(String name, String address){
        
        return false;
    }
}
