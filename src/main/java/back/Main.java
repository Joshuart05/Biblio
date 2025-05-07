/** * @authors Quezada Esteban Joshua Arturo
 *             Martínez Granados Emanuel
 *             Roldán López Christian Jair
 */

package back;

import front.MainPage;
import front.index;
import java.sql.SQLException;

public class Main {
    private static MainPage mainPage;
    private int userType;
    private int userId;
    
    public static void main(String[] args) throws SQLException {
        DbRequest.driverConnection();
        DbRequest test = new DbRequest();
        System.out.println(test.validateIdentify("9101"));
        Main controlador = new Main();
        index window = new index(controlador);
        window.setVisible(true);
    }
    
    public void setIDUser(int userId){
        this.userId = userId;
    }
    
    public int showIdUser(){
        return userId;
    }
    
    public void setUserType(int userType){
        this.userType = userType;
    }
    
    public int showUserType(){
        return userType;
    }
    
    public MainPage getMainPage() {
        if (mainPage == null) {
            mainPage = new MainPage(this);
        }
        return mainPage;
    }

    public boolean MainIsActive() {
        return mainPage != null && mainPage.isVisible();
    }

    public void showMain(boolean flag) {
        getMainPage().setVisible(flag);
    }

    public void destroyMainFrame() {
        if (mainPage != null) {
            mainPage.dispose();
            mainPage = null;
        }
    }
}