/*
 * Created by JFormDesigner on Thu Jun 25 16:53:46 BRT 2020
 */

package n3.frames;

import n3.Main;
import n3.entity.Frete;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListDataListener;


/**
 * @author unknown
 */
public class ListarFrete extends JFrame {

    public ListarFrete() {
        initComponents();
    }

    private void initComponents() {



        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown

        frame1 = new JFrame();
        lista = new JComboBox();

        for (Frete value : Main.getController().getListFretes().values()) {
            lista.addItem("Tipo: " + value.getTipoFrete()+ "," +"Origem: "+value.getCidadeOrigem()+ ","+"Destino: " + value.getCidadeDestino());
        }

        //======== frame1 ========
        {
            Container frame1ContentPane = frame1.getContentPane();

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lista, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lista, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame frame1;
    private JComboBox lista;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



    public JComboBox getComboBox1() {
        return lista;
    }

    public JFrame getFrame1() {
        return frame1;
    }
}
