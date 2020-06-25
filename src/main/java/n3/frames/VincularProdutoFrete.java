/*
 * Created by JFormDesigner on Thu Jun 25 16:53:19 BRT 2020
 */

package n3.frames;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author unknown
 */
public class VincularProdutoFrete {
    public VincularProdutoFrete() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
        vincularMercadoriaAoFrete = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        button1 = new JButton();
        button2 = new JButton();

        //======== vincularMercadoriaAoFrete ========
        {
            vincularMercadoriaAoFrete.setTitle("Vincular Mercadoria ao Frete");
            Container vincularMercadoriaAoFreteContentPane = vincularMercadoriaAoFrete.getContentPane();

            //---- label1 ----
            label1.setText("Vincular Mercadoria ao Frete");

            //---- label2 ----
            label2.setText("Escolha a Mercadoria");

            //---- label3 ----
            label3.setText("Escolha o Frete");

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(list1);
            }

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(list2);
            }

            //---- button1 ----
            button1.setText("Cancelar");

            //---- button2 ----
            button2.setText("Cadastrar");

            GroupLayout vincularMercadoriaAoFreteContentPaneLayout = new GroupLayout(vincularMercadoriaAoFreteContentPane);
            vincularMercadoriaAoFreteContentPane.setLayout(vincularMercadoriaAoFreteContentPaneLayout);
            vincularMercadoriaAoFreteContentPaneLayout.setHorizontalGroup(
                vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup()
                    .add(vincularMercadoriaAoFreteContentPaneLayout.createSequentialGroup()
                        .add(vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup()
                            .add(vincularMercadoriaAoFreteContentPaneLayout.createSequentialGroup()
                                .add(115, 115, 115)
                                .add(label1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                            .add(vincularMercadoriaAoFreteContentPaneLayout.createSequentialGroup()
                                .add(30, 30, 30)
                                .add(vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup()
                                    .add(vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                                        .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .add(label2, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                    .add(button1))
                                .add(73, 73, 73)
                                .add(vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                                    .add(label3, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .add(scrollPane2, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .add(GroupLayout.TRAILING, button2))))
                        .addContainerGap(37, Short.MAX_VALUE))
            );
            vincularMercadoriaAoFreteContentPaneLayout.setVerticalGroup(
                vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup()
                    .add(vincularMercadoriaAoFreteContentPaneLayout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(label1)
                        .add(18, 18, 18)
                        .add(vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup()
                            .add(label2)
                            .add(label3))
                        .add(18, 18, 18)
                        .add(vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup()
                            .add(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.RELATED, 76, Short.MAX_VALUE)
                        .add(vincularMercadoriaAoFreteContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(button2)
                            .add(button1))
                        .add(51, 51, 51))
            );
            vincularMercadoriaAoFrete.pack();
            vincularMercadoriaAoFrete.setLocationRelativeTo(vincularMercadoriaAoFrete.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
    private JFrame vincularMercadoriaAoFrete;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JList list1;
    private JScrollPane scrollPane2;
    private JList list2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
