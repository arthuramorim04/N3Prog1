/*
 * Created by JFormDesigner on Thu Jun 25 16:53:39 BRT 2020
 */

package n3.frames;

import n3.Main;
import n3.entity.Mercadoria;

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class ListarProdutos extends JFrame {
    public ListarProdutos() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame1 = new JFrame();
        comboBox1 = new JComboBox();

        for (Mercadoria value : Main.getController().getListMercadoria().values()) {
            if(value.getAuditado() == false){
                getComboBox1().addItem("Tipo Produto: "+value.getTipo() +"\n Descrucao: "+ value.getDescricao() + "Auditado: nao");
            }else{
                getComboBox1().addItem("Tipo Produto: "+value.getTipo() +"\n Descrucao: "+ value.getDescricao() + "Auditado: sim" + "Orgao Inspetor: "+value.getOrgaoInspetor() + " Data inspecao: " + value.getDataInspecao()
                );
            }
        }

        //======== frame1 ========
        {
            frame1.setTitle("Lista de Produtos");
            Container frame1ContentPane = frame1.getContentPane();

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(67, Short.MAX_VALUE))
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame frame1;
    private JComboBox comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JFrame getFrame1() {
        return frame1;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }
}
