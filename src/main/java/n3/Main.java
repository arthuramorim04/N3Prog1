package n3;


import n3.frames.TelaMenu;

import javax.swing.*;

public class Main {


    public static void main(String[] args) throws Exception {
//        menu.menu();

        TelaMenu menu = new TelaMenu();

        JFrame frame1 = menu.getMenuPrincipal();

        frame1.setTitle("N3- Arthur Amorim, Gabriela da Rocha");
        frame1.setSize(660,300);
        frame1.setLocation(500,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setVisible(true);
    }


}
