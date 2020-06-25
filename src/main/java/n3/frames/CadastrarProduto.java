/*
 * Created by JFormDesigner on Thu Jun 25 16:53:00 BRT 2020
 */

package n3.frames;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author unknown
 */
public class CadastrarProduto {
    public CadastrarProduto() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
        cadastro_produto = new JFrame();
        button1 = new JButton();
        button2 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();

        //======== cadastro_produto ========
        {
            Container cadastro_produtoContentPane = cadastro_produto.getContentPane();

            //---- button1 ----
            button1.setText("Cancela");

            //---- button2 ----
            button2.setText("Salvar");

            //---- textField1 ----
            textField1.setText("Cadastro de Mercadoria");

            //---- textField2 ----
            textField2.setText("Descri\u00e7\u00e3o");

            //---- textField3 ----
            textField3.setText("Tipo");

            //---- textField5 ----
            textField5.setText("Data Inspe\u00e7\u00e3o");

            //---- textField6 ----
            textField6.setText("Org\u00e3o Inspetor");

            //---- textField7 ----
            textField7.setText("Peso");

            GroupLayout cadastro_produtoContentPaneLayout = new GroupLayout(cadastro_produtoContentPane);
            cadastro_produtoContentPane.setLayout(cadastro_produtoContentPaneLayout);
            cadastro_produtoContentPaneLayout.setHorizontalGroup(
                cadastro_produtoContentPaneLayout.createParallelGroup()
                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .add(171, 171, 171)
                        .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(197, Short.MAX_VALUE))
                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                            .add(textField5, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                            .add(textField7, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                            .add(textField2, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                            .add(textField3, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                            .add(textField6, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(171, Short.MAX_VALUE))
                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .add(54, 54, 54)
                        .add(button1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED, 116, Short.MAX_VALUE)
                        .add(button2, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                        .add(65, 65, 65))
            );
            cadastro_produtoContentPaneLayout.setVerticalGroup(
                cadastro_produtoContentPaneLayout.createParallelGroup()
                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(textField2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(textField3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(textField7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(textField6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(textField5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED, 92, Short.MAX_VALUE)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(button1)
                            .add(button2))
                        .add(15, 15, 15))
            );
            cadastro_produto.pack();
            cadastro_produto.setLocationRelativeTo(cadastro_produto.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
    private JFrame cadastro_produto;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
