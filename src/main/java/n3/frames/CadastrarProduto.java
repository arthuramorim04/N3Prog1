/*
 * Created by JFormDesigner on Thu Jun 25 16:53:00 BRT 2020
 */

package n3.frames;

import n3.entity.Mercadoria;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author unknown
 */
public class CadastrarProduto {
    public CadastrarProduto() {
        initComponents();
    }

    private void cadastrarMercadoria(ActionEvent e) {
        if(!(getAuditado().getText().equalsIgnoreCase("sim"))) {

            double peso = Double.parseDouble(getPeso().getText());

            Mercadoria mercadoria = new Mercadoria(getDescricao().getText(), getTipo().getText(), peso, getNfs().getText(), false);
            System.out.println(mercadoria.toString());

        } else {
            double peso = Double.parseDouble(getPeso().getText());
            Mercadoria mercadoria = new Mercadoria(getDescricao().getText(), getTipo().getText(), peso, getNfs().getText(), true, getOrgaoInspetor().getText(), getDataInspecao().getText());
            System.out.println(mercadoria.toString());
        }

    }

    private void botaoCancelar(ActionEvent e) {
        this.getCadastro_produto().setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
        cadastro_produto = new JFrame();
        cancelar = new JButton();
        cadastrar = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        tipo = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        nfs = new JTextField();
        label5 = new JLabel();
        peso = new JTextField();
        label7 = new JLabel();
        descricao = new JTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        orgaoInspetor = new JTextField();
        label10 = new JLabel();
        dataInspecao = new JTextField();
        auditado = new JTextField();

        //======== cadastro_produto ========
        {
            cadastro_produto.setTitle("Cadastro de Mercadoria");
            Container cadastro_produtoContentPane = cadastro_produto.getContentPane();

            //---- cancelar ----
            cancelar.setText("Cancela");
            cancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    botaoCancelar(e);
                }
            });

            //---- cadastrar ----
            cadastrar.setText("Cadastrar");
            cadastrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cadastrarMercadoria(e);
                }
            });

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
                    .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup()
                            .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup()
                                    .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cadastrar, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(auditado, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                                .addComponent(label3)
                                                .addGap(31, 31, 31))
                                            .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                                .addComponent(tipo)
                                                .addGap(25, 25, 25)))
                                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label4, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(nfs))
                                        .addGap(12, 12, 12)))
                                .addGap(65, 65, 65))
                            .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                                .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .addComponent(orgaoInspetor, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dataInspecao, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .addComponent(peso, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(descricao, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.LEADING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(64, 64, 64))))
                    .addGroup(GroupLayout.Alignment.TRAILING, cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
            );
            cadastro_produtoContentPaneLayout.setVerticalGroup(
                cadastro_produtoContentPaneLayout.createParallelGroup()
                    .addGroup(cadastro_produtoContentPaneLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(label2)
                        .addGap(14, 14, 14)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(label3)
                            .addComponent(label1))
                        .addGap(6, 6, 6)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nfs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(auditado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(label7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(peso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(label8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(label10))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(orgaoInspetor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataInspecao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(cadastro_produtoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar)
                            .addComponent(cadastrar))
                        .addGap(15, 15, 15))
            );
            cadastro_produto.pack();
            cadastro_produto.setLocationRelativeTo(cadastro_produto.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
    private JFrame cadastro_produto;
    private JButton cancelar;
    private JButton cadastrar;
    private JLabel label1;
    private JLabel label2;
    private JTextField tipo;
    private JLabel label3;
    private JLabel label4;
    private JTextField nfs;
    private JLabel label5;
    private JTextField peso;
    private JLabel label7;
    private JTextField descricao;
    private JLabel label8;
    private JLabel label9;
    private JTextField orgaoInspetor;
    private JLabel label10;
    private JTextField dataInspecao;
    private JTextField auditado;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    

    public JFrame getCadastro_produto() {
        return cadastro_produto;
    }

    public JTextField getAuditado() {
        return auditado;
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public JTextField getTipo() {
        return tipo;
    }

    public JTextField getNfs() {
        return nfs;
    }

    public JTextField getPeso() {
        return peso;
    }

    public JTextField getDescricao() {
        return descricao;
    }

    public JTextField getOrgaoInspetor() {
        return orgaoInspetor;
    }

    public JTextField getDataInspecao() {
        return dataInspecao;
    }
}
