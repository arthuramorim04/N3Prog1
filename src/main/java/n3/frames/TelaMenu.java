/*
 * Created by JFormDesigner on Thu Jun 25 16:31:36 BRT 2020
 */

package n3.frames;

import n3.Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/**
 * @author unknown
 */
public class TelaMenu {
    public TelaMenu() {
        initComponents();
    }

    private void acessar_cadastroFrete(ActionEvent e) {
        JFrame cadastrar_frete_tela = cadastrarFrete.getCadastrar_frete_tela();
        cadastrar_frete_tela.setVisible(true);
    }

    private void cadastrarProduto(ActionEvent e) {
        cadastrarProduto.getCadastro_produto().setVisible(true);
    }

    private void vincular_prod_frete(ActionEvent e) {
    }

    private void abrirListaProdutos(ActionEvent e) {
        listarProdutos.getFrame1().setVisible(true);
    }


    CadastrarFrete cadastrarFrete = new CadastrarFrete();
    CadastrarProduto cadastrarProduto = new CadastrarProduto();
    ListarProdutos listarProdutos = new ListarProdutos();



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        menuPrincipal = new JFrame();
        label_menu_principal = new JLabel();
        cad_produto = new JButton();
        cad_frete = new JButton();
        vincular_prod_frete = new JButton();
        lista_produtos = new JButton();
        lista_fretes = new JButton();

        //======== menuPrincipal ========
        {
            menuPrincipal.setFont(new Font(Font.DIALOG, Font.PLAIN, 30));
            menuPrincipal.setBackground(Color.lightGray);
            menuPrincipal.setTitle("N3 -");
            menuPrincipal.setFocusableWindowState(false);
            menuPrincipal.setFocusable(false);
            Container menuPrincipalContentPane = menuPrincipal.getContentPane();

            //---- label_menu_principal ----
            label_menu_principal.setText("Menu Principal");
            label_menu_principal.setFont(new Font("Segoe UI", Font.PLAIN, 26));

            //---- cad_produto ----
            cad_produto.setText("Cadastrar Produto");
            cad_produto.setForeground(Color.black);
            cad_produto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cadastrarProduto(e);
                }
            });

            //---- cad_frete ----
            cad_frete.setText("Cadastrar Frete");
            cad_frete.setForeground(Color.black);
            cad_frete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    acessar_cadastroFrete(e);
                }
            });

            //---- vincular_prod_frete ----
            vincular_prod_frete.setText("Vincular produto ao frete");
            vincular_prod_frete.setForeground(Color.black);
            vincular_prod_frete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    vincular_prod_frete(e);
                }
            });

            //---- lista_produtos ----
            lista_produtos.setText("Listar Produtos");
            lista_produtos.setForeground(Color.black);

            //---- lista_fretes ----
            lista_fretes.setText("Listar Fretes");
            lista_fretes.setForeground(Color.black);

            GroupLayout menuPrincipalContentPaneLayout = new GroupLayout(menuPrincipalContentPane);
            menuPrincipalContentPane.setLayout(menuPrincipalContentPaneLayout);
            menuPrincipalContentPaneLayout.setHorizontalGroup(
                menuPrincipalContentPaneLayout.createParallelGroup()
                    .addGroup(menuPrincipalContentPaneLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(menuPrincipalContentPaneLayout.createSequentialGroup()
                                .addComponent(cad_produto, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cad_frete, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
                            .addComponent(vincular_prod_frete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lista_fretes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lista_produtos, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, menuPrincipalContentPaneLayout.createSequentialGroup()
                        .addContainerGap(256, Short.MAX_VALUE)
                        .addComponent(label_menu_principal)
                        .addGap(231, 231, 231))
            );
            menuPrincipalContentPaneLayout.setVerticalGroup(
                menuPrincipalContentPaneLayout.createParallelGroup()
                    .addGroup(menuPrincipalContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_menu_principal)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(menuPrincipalContentPaneLayout.createSequentialGroup()
                                .addGroup(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cad_frete, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cad_produto, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vincular_prod_frete, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuPrincipalContentPaneLayout.createSequentialGroup()
                                .addComponent(lista_produtos, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lista_fretes, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))
            );
            menuPrincipal.pack();
            menuPrincipal.setLocationRelativeTo(menuPrincipal.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame menuPrincipal;
    private JLabel label_menu_principal;
    private JButton cad_produto;
    private JButton cad_frete;
    private JButton vincular_prod_frete;
    private JButton lista_produtos;
    private JButton lista_fretes;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JFrame getMenuPrincipal() {
        return menuPrincipal;
    }
}
