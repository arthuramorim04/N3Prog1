/*
 * Created by JFormDesigner on Thu Jun 25 16:31:36 BRT 2020
 */

package n3.frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author unknown
 */
public class TelaMenu {
    public TelaMenu() {
        initComponents();
    }


    CadastrarFrete cadastrarFrete = new CadastrarFrete();
    CadastrarProduto cadastrarProduto = new CadastrarProduto();


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
            menuPrincipal.setFont(new Font("Dialog", Font.PLAIN, 30));
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

            //---- cad_frete ----
            cad_frete.setText("Cadastrar Frete");
            cad_frete.setForeground(Color.black);
            cad_frete.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cadastrarFrete.getCadastrar_frete_tela().setVisible(true);
                    cadastrarFrete.getCadastrar_frete_tela().setSize(660,300);
                }
            });

            //---- vincular_prod_frete ----
            vincular_prod_frete.setText("Vincular produto ao frete");
            vincular_prod_frete.setForeground(Color.black);

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
                    .add(menuPrincipalContentPaneLayout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                            .add(menuPrincipalContentPaneLayout.createSequentialGroup()
                                .add(cad_produto, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.UNRELATED)
                                .add(cad_frete, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
                            .add(vincular_prod_frete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(31, 31, 31)
                        .add(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                            .add(lista_fretes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lista_produtos, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .add(GroupLayout.TRAILING, menuPrincipalContentPaneLayout.createSequentialGroup()
                        .addContainerGap(256, Short.MAX_VALUE)
                        .add(label_menu_principal)
                        .add(231, 231, 231))
            );
            menuPrincipalContentPaneLayout.setVerticalGroup(
                menuPrincipalContentPaneLayout.createParallelGroup()
                    .add(menuPrincipalContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(label_menu_principal)
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                            .add(menuPrincipalContentPaneLayout.createSequentialGroup()
                                .add(menuPrincipalContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                    .add(cad_frete, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                    .add(cad_produto, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.RELATED)
                                .add(vincular_prod_frete, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                            .add(menuPrincipalContentPaneLayout.createSequentialGroup()
                                .add(lista_produtos, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.RELATED)
                                .add(lista_fretes, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
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
