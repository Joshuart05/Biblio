package back;

import front.MainPage;
import front.index;

public class Main {
    private static MainPage mainPage;
    
    public static void main(String[] args) {
        DbRequest.driverConnection();
        Main controlador = new Main();
        index window = new index(controlador);
        window.setVisible(true);
    }
    
    public MainPage getMainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
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