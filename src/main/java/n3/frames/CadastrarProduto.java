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
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField5 = new JTextField();
        label7 = new JLabel();
        textField6 = new JTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        textField7 = new JTextField();
        label10 = new JLabel();
        textField8 = new JTextField();

        //======== cadastro_produto ========
        {
            cadastro_produto.setTitle("Cadastro de Mercadoria");
            Container cadastro_produtoContentPane = cadastro_produto.getContentPane();

            //---- button1 ----
            button1.setText("Cancela");

            //---- button2 ----
            button2.setText("Cadastrar");

            //---- textField1 ----
            textField1.setText("Cadastro de Mercadoria");

            //---- label1 ----
            label1.setText("Auditado");

            //---- label2 ----
            label2.setText("Campos B\u00e1sicos");

            //---- label3 ----
            label3.setText("Tipo da Mercadoria");

            //---- label4 ----
            label4.setText("Nota Fiscal");

            //---- label5 ----
            label5.setText("Peso");

            //---- label6 ----
            label6.setText("Id");

            //---- label7 ----
            label7.setText("Descri\u00e7\u00e3o");

            //---- label8 ----
            label8.setText("Campos para Auditoria");

            //---- label9 ----
            label9.setText("Org\u00e3o Inspetor");

            //---- label10 ----
            label10.setText("Data da Inspe\u00e7\u00e3o");

            GroupLayout cadastro_produtoContentPaneLayout = new GroupLayout(cadastro_produtoContentPane);
            cadastro_produtoContentPane.setLayout(cadastro_produtoContentPaneLayout);
            cadastro_produtoContentPaneLayout.setHorizontalGroup(
                cadastro_produtoContentPaneLayout.createParallelGroup()
                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .add(140, 140, 140)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                            .add(label2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                            .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(GroupLayout.TRAILING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(label8, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                        .add(123, 123, 123))
                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .add(54, 54, 54)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup()
                            .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                .add(cadastro_produtoContentPaneLayout.createParallelGroup()
                                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .add(button1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(button2, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .add(cadastro_produtoContentPaneLayout.createParallelGroup()
                                            .add(comboBox1)
                                            .add(GroupLayout.TRAILING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                                                .add(0, 0, Short.MAX_VALUE)
                                                .add(label1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(LayoutStyle.UNRELATED)
                                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                                            .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                                .add(label3)
                                                .add(31, 31, 31))
                                            .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                                .add(textField2)
                                                .add(25, 25, 25)))
                                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                                            .add(label4, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .add(textField3))
                                        .add(12, 12, 12)))
                                .add(65, 65, 65))
                            .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                .add(label9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(GroupLayout.TRAILING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                                .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .add(textField7, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(textField8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .add(0, 0, Short.MAX_VALUE)
                                        .add(label10, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                    .add(GroupLayout.LEADING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .add(label5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.UNRELATED)
                                        .add(label6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.RELATED)
                                        .add(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(GroupLayout.LEADING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .add(textField4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.UNRELATED)
                                        .add(textField5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.RELATED)
                                        .add(textField6, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
                                        .add(0, 0, Short.MAX_VALUE)))
                                .add(64, 64, 64))))
            );
            cadastro_produtoContentPaneLayout.setVerticalGroup(
                cadastro_produtoContentPaneLayout.createParallelGroup()
                    .add(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(label2)
                        .add(14, 14, 14)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label4)
                            .add(label3)
                            .add(label1))
                        .add(6, 6, 6)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(29, 29, 29)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label5)
                            .add(label6)
                            .add(label7))
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(42, 42, 42)
                        .add(label8)
                        .addPreferredGap(LayoutStyle.RELATED, 30, Short.MAX_VALUE)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label9)
                            .add(label10))
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(47, 47, 47)
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
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField5;
    private JLabel label7;
    private JTextField textField6;
    private JLabel label8;
    private JLabel label9;
    private JTextField textField7;
    private JLabel label10;
    private JTextField textField8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
