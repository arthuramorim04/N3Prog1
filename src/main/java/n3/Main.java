package n3;


import n3.database.DBManager;
import n3.frames.TelaMenu;

import javax.swing.*;

public class Main {

    private static DBManager dbManager;

    public static void main(String[] args) throws Exception {

        dbManager = new DBManager("arthur","1234","localhost",3306,"n3");
        dbManager.openConnection();

        TelaMenu menu = new TelaMenu();

        JFrame frame1 = menu.getMenuPrincipal();

        frame1.setTitle("N3- Arthur Amorim, Gabriela da Rocha");
        frame1.setSize(660,300);
        frame1.setLocation(500,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setVisible(true);
    }

    public static DBManager getDbManager() {
        return dbManager;
    }
}
