/*
 * Created by JFormDesigner on Thu Jun 25 21:16:20 BRT 2020
 */

package n3.frames;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Gabriela da Rocha
 */
public class VincularMercadoriaFrete extends JFrame {
    public VincularMercadoriaFrete() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
        vincularMercAoFrete = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        listaMercadorias = new JList();
        scrollPane2 = new JScrollPane();
        listaFretes = new JList();
        button1 = new JButton();
        button2 = new JButton();
        mercExcolhida = new JTextField();
        freteEscolhido = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== vincularMercAoFrete ========
        {
            vincularMercAoFrete.setTitle("Vincular Mercadoria ao Frete");
            Container vincularMercAoFreteContentPane = vincularMercAoFrete.getContentPane();

            //---- label1 ----
            label1.setText("Lista de Mercadorias");

            //---- label2 ----
            label2.setText("Lista de Fretes");

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(listaMercadorias);
            }

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(listaFretes);
            }

            //---- button1 ----
            button1.setText("Vincular");

            //---- button2 ----
            button2.setText("Cancelar");

            //---- label3 ----
            label3.setText("Id da Mercadoria");

            //---- label4 ----
            label4.setText("Id do Frete");

            GroupLayout vincularMercAoFreteContentPaneLayout = new GroupLayout(vincularMercAoFreteContentPane);
            vincularMercAoFreteContentPane.setLayout(vincularMercAoFreteContentPaneLayout);
            vincularMercAoFreteContentPaneLayout.setHorizontalGroup(
                vincularMercAoFreteContentPaneLayout.createParallelGroup()
                    .addGroup(vincularMercAoFreteContentPaneLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(vincularMercAoFreteContentPaneLayout.createSequentialGroup()
                                .addComponent(button2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button1))
                            .addGroup(vincularMercAoFreteContentPaneLayout.createSequentialGroup()
                                .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(vincularMercAoFreteContentPaneLayout.createSequentialGroup()
                                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(scrollPane1)
                                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                        .addGap(50, 50, 50))
                                    .addGroup(GroupLayout.Alignment.LEADING, vincularMercAoFreteContentPaneLayout.createSequentialGroup()
                                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(mercExcolhida, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(vincularMercAoFreteContentPaneLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, vincularMercAoFreteContentPaneLayout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(freteEscolhido, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(35, Short.MAX_VALUE))
            );
            vincularMercAoFreteContentPaneLayout.setVerticalGroup(
                vincularMercAoFreteContentPaneLayout.createParallelGroup()
                    .addGroup(vincularMercAoFreteContentPaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(label2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup()
                            .addComponent(label4)
                            .addComponent(label3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(mercExcolhida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(freteEscolhido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(vincularMercAoFreteContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button2)
                            .addComponent(button1))
                        .addGap(26, 26, 26))
            );
            vincularMercAoFrete.pack();
            vincularMercAoFrete.setLocationRelativeTo(vincularMercAoFrete.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
    private JFrame vincularMercAoFrete;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JList listaMercadorias;
    private JScrollPane scrollPane2;
    private JList listaFretes;
    private JButton button1;
    private JButton button2;
    private JTextField mercExcolhida;
    private JTextField freteEscolhido;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JFrame getVincularMercAoFrete() {
        return vincularMercAoFrete;
    }

    public JTextField getMercExcolhida() {
        return mercExcolhida;
    }

    public JTextField getFreteEscolhido() {
        return freteEscolhido;
    }
}
