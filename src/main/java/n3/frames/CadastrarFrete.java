/*
 * Created by JFormDesigner on Thu Jun 25 16:53:08 BRT 2020
 */

package n3.frames;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author unknown
 */
public class CadastrarFrete {
    public CadastrarFrete() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        cadastrar_frete_tela = new JFrame();
        label_cadastro_frete = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== cadastrar_frete_tela ========
        {
            cadastrar_frete_tela.setTitle("Cadastrar Frete");
            Container cadastrar_frete_telaContentPane = cadastrar_frete_tela.getContentPane();

            //---- label_cadastro_frete ----
            label_cadastro_frete.setText("Cadastrar Produto");
            label_cadastro_frete.setAlignmentY(0.0F);
            label_cadastro_frete.setHorizontalTextPosition(SwingConstants.CENTER);
            label_cadastro_frete.setFocusable(false);
            label_cadastro_frete.setInheritsPopupMenu(false);
            label_cadastro_frete.setMaximumSize(null);
            label_cadastro_frete.setMinimumSize(null);
            label_cadastro_frete.setPreferredSize(null);
            label_cadastro_frete.setVerifyInputWhenFocusTarget(false);
            label_cadastro_frete.setRequestFocusEnabled(false);
            label_cadastro_frete.setHorizontalAlignment(SwingConstants.CENTER);
            label_cadastro_frete.setFont(new Font("Segoe UI", Font.PLAIN, 20));

            //---- button1 ----
            button1.setText("Cadastrar");

            //---- button2 ----
            button2.setText("Cancelar");

            GroupLayout cadastrar_frete_telaContentPaneLayout = new GroupLayout(cadastrar_frete_telaContentPane);
            cadastrar_frete_telaContentPane.setLayout(cadastrar_frete_telaContentPaneLayout);
            cadastrar_frete_telaContentPaneLayout.setHorizontalGroup(
                cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                    .add(GroupLayout.TRAILING, cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .add(161, 161, 161)
                        .add(button2)
                        .addPreferredGap(LayoutStyle.RELATED, 195, Short.MAX_VALUE)
                        .add(button1)
                        .add(138, 138, 138))
                    .add(GroupLayout.TRAILING, cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .addContainerGap(265, Short.MAX_VALUE)
                        .add(label_cadastro_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(233, 233, 233))
            );
            cadastrar_frete_telaContentPaneLayout.setVerticalGroup(
                cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                    .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(label_cadastro_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.RELATED, 174, Short.MAX_VALUE)
                        .add(cadastrar_frete_telaContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(button2)
                            .add(button1))
                        .add(31, 31, 31))
            );
            cadastrar_frete_tela.pack();
            cadastrar_frete_tela.setLocationRelativeTo(cadastrar_frete_tela.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    public JFrame getCadastrar_frete_tela() {
        return cadastrar_frete_tela;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame cadastrar_frete_tela;
    private JLabel label_cadastro_frete;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
