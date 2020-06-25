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
        cancelar = new JButton();
        panel1 = new JPanel();
        frete_regular = new JPanel();
        label6 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        list_unidades_operacoes = new JComboBox();
        label13 = new JLabel();
        quantidade_operacoes = new JTextField();
        frequencia_operacoes = new JTextField();
        informacoes_basicas_frete = new JPanel();
        label1 = new JLabel();
        list_tipos_de_fretes = new JComboBox();
        label2 = new JLabel();
        label3 = new JLabel();
        label7 = new JLabel();
        cidade_destino = new JTextField();
        cidade_postagem = new JTextField();
        distancia_em_km = new JTextField();
        label5 = new JLabel();
        frete_demanda = new JPanel();
        label8 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        data_postagem = new JTextField();
        previsao_entrega = new JTextField();
        cadastrar = new JButton();

        list_unidades_operacoes.addItem("D");
        list_unidades_operacoes.addItem("M");
        list_unidades_operacoes.addItem("A");
        list_tipos_de_fretes.addItem("regular");
        list_tipos_de_fretes.addItem("demanda");
        //======== cadastrar_frete_tela ========
        {
            cadastrar_frete_tela.setTitle("Cadastrar Frete");
            Container cadastrar_frete_telaContentPane = cadastrar_frete_tela.getContentPane();

            //---- label_cadastro_frete ----
            label_cadastro_frete.setText("Cadastrar Frete");
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

            //---- cancelar ----
            cancelar.setText("Cancelar");

            //======== panel1 ========
            {
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
                . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
                . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
                12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
                . PropertyChangeListener( ){ public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
                getPropertyName () )) throw new RuntimeException( ); }} );

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .add(0, 204, Short.MAX_VALUE)
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .add(0, 453, Short.MAX_VALUE)
                );
            }

            //======== frete_regular ========
            {

                //---- label6 ----
                label6.setText("Quantidade Operacoes");

                //---- label9 ----
                label9.setText("Frequencia das Operacoes");

                //---- label10 ----
                label10.setText("Unidade das Operacoes");

                //---- label13 ----
                label13.setText("Frete Regular");

                GroupLayout frete_regularLayout = new GroupLayout(frete_regular);
                frete_regular.setLayout(frete_regularLayout);
                frete_regularLayout.setHorizontalGroup(
                    frete_regularLayout.createParallelGroup()
                        .add(frete_regularLayout.createSequentialGroup()
                            .addContainerGap()
                            .add(frete_regularLayout.createParallelGroup()
                                .add(frete_regularLayout.createSequentialGroup()
                                    .add(6, 6, 6)
                                    .add(frequencia_operacoes, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                .add(frete_regularLayout.createParallelGroup(GroupLayout.LEADING, false)
                                    .add(label9)
                                    .add(label10)
                                    .add(frete_regularLayout.createSequentialGroup()
                                        .add(6, 6, 6)
                                        .add(frete_regularLayout.createParallelGroup()
                                            .add(list_unidades_operacoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .add(quantidade_operacoes)))
                                    .add(frete_regularLayout.createParallelGroup(GroupLayout.TRAILING)
                                        .add(label13)
                                        .add(label6))))
                            .addContainerGap(72, Short.MAX_VALUE))
                );
                frete_regularLayout.setVerticalGroup(
                    frete_regularLayout.createParallelGroup()
                        .add(frete_regularLayout.createSequentialGroup()
                            .add(20, 20, 20)
                            .add(label13)
                            .add(47, 47, 47)
                            .add(label6)
                            .add(5, 5, 5)
                            .add(quantidade_operacoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(18, 18, 18)
                            .add(label9)
                            .addPreferredGap(LayoutStyle.UNRELATED)
                            .add(frequencia_operacoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(4, 4, 4)
                            .add(label10)
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(list_unidades_operacoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(28, Short.MAX_VALUE))
                );
            }

            //======== informacoes_basicas_frete ========
            {

                //---- label1 ----
                label1.setText("Tipo de Frete");

                //---- label2 ----
                label2.setText("Cidade de Origem");

                //---- label3 ----
                label3.setText("Cidade de Destino");

                //---- label7 ----
                label7.setText("Distancia em KM");

                //---- label5 ----
                label5.setText("Campos Basicos");

                GroupLayout informacoes_basicas_freteLayout = new GroupLayout(informacoes_basicas_frete);
                informacoes_basicas_frete.setLayout(informacoes_basicas_freteLayout);
                informacoes_basicas_freteLayout.setHorizontalGroup(
                    informacoes_basicas_freteLayout.createParallelGroup()
                        .add(informacoes_basicas_freteLayout.createSequentialGroup()
                            .add(informacoes_basicas_freteLayout.createParallelGroup()
                                .add(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .add(28, 28, 28)
                                    .add(informacoes_basicas_freteLayout.createParallelGroup()
                                        .add(label1)
                                        .add(list_tipos_de_fretes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .add(26, 26, 26)
                                    .add(informacoes_basicas_freteLayout.createParallelGroup()
                                        .add(label3)
                                        .add(cidade_destino, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                        .add(informacoes_basicas_freteLayout.createSequentialGroup()
                                            .add(informacoes_basicas_freteLayout.createParallelGroup()
                                                .add(cidade_postagem, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                .add(label2))
                                            .add(18, 18, 18)
                                            .add(informacoes_basicas_freteLayout.createParallelGroup()
                                                .add(label7)
                                                .add(distancia_em_km, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))))
                                .add(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .add(170, 170, 170)
                                    .add(label5)))
                            .addContainerGap(16, Short.MAX_VALUE))
                );
                informacoes_basicas_freteLayout.setVerticalGroup(
                    informacoes_basicas_freteLayout.createParallelGroup()
                        .add(informacoes_basicas_freteLayout.createSequentialGroup()
                            .addContainerGap()
                            .add(label5)
                            .add(5, 5, 5)
                            .add(informacoes_basicas_freteLayout.createParallelGroup()
                                .add(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .add(informacoes_basicas_freteLayout.createParallelGroup(GroupLayout.TRAILING)
                                        .add(informacoes_basicas_freteLayout.createSequentialGroup()
                                            .add(label2)
                                            .addPreferredGap(LayoutStyle.UNRELATED)
                                            .add(cidade_postagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .add(informacoes_basicas_freteLayout.createSequentialGroup()
                                            .add(label7)
                                            .addPreferredGap(LayoutStyle.UNRELATED)
                                            .add(distancia_em_km, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.RELATED, 17, Short.MAX_VALUE)
                                    .add(label3)
                                    .addPreferredGap(LayoutStyle.RELATED)
                                    .add(cidade_destino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .add(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .add(label1)
                                    .addPreferredGap(LayoutStyle.UNRELATED)
                                    .add(list_tipos_de_fretes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .add(7, 7, 7))
                );
            }

            //======== frete_demanda ========
            {

                //---- label8 ----
                label8.setText("Data Postagem");

                //---- label11 ----
                label11.setText("Previsao de Entrega");

                //---- label12 ----
                label12.setText("Frete Demanda");

                GroupLayout frete_demandaLayout = new GroupLayout(frete_demanda);
                frete_demanda.setLayout(frete_demandaLayout);
                frete_demandaLayout.setHorizontalGroup(
                    frete_demandaLayout.createParallelGroup()
                        .add(frete_demandaLayout.createSequentialGroup()
                            .add(frete_demandaLayout.createParallelGroup()
                                .add(frete_demandaLayout.createSequentialGroup()
                                    .add(34, 34, 34)
                                    .add(frete_demandaLayout.createParallelGroup()
                                        .add(label11, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                        .add(label8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                        .add(previsao_entrega, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                        .add(data_postagem, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
                                .add(frete_demandaLayout.createSequentialGroup()
                                    .add(64, 64, 64)
                                    .add(label12)))
                            .addContainerGap(43, Short.MAX_VALUE))
                );
                frete_demandaLayout.setVerticalGroup(
                    frete_demandaLayout.createParallelGroup()
                        .add(frete_demandaLayout.createSequentialGroup()
                            .addContainerGap()
                            .add(label12)
                            .add(53, 53, 53)
                            .add(label8)
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(data_postagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(18, 18, 18)
                            .add(label11)
                            .addPreferredGap(LayoutStyle.UNRELATED)
                            .add(previsao_entrega, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(65, Short.MAX_VALUE))
                );
            }

            //---- cadastrar ----
            cadastrar.setText("Cadastrar");

            GroupLayout cadastrar_frete_telaContentPaneLayout = new GroupLayout(cadastrar_frete_telaContentPane);
            cadastrar_frete_telaContentPane.setLayout(cadastrar_frete_telaContentPaneLayout);
            cadastrar_frete_telaContentPaneLayout.setHorizontalGroup(
                cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                    .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .add(59, 59, 59)
                        .add(cancelar)
                        .add(148, 148, 148)
                        .add(cadastrar))
                    .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(cadastrar_frete_telaContentPaneLayout.createParallelGroup(GroupLayout.TRAILING, false)
                            .add(GroupLayout.LEADING, informacoes_basicas_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(GroupLayout.LEADING, cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                                .add(frete_regular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.RELATED)
                                .add(frete_demanda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .add(761, 761, 761)
                        .add(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .add(171, 171, 171)
                        .add(label_cadastro_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            cadastrar_frete_telaContentPaneLayout.setVerticalGroup(
                cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                    .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .add(cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                            .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                                .add(53, 53, 53)
                                .add(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                                .add(12, 12, 12)
                                .add(label_cadastro_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.RELATED)
                                .add(informacoes_basicas_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.RELATED)
                                .add(cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                                    .add(frete_regular, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                                        .add(0, 26, Short.MAX_VALUE)
                                        .add(frete_demanda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(cadastrar_frete_telaContentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                            .add(cancelar)
                            .add(cadastrar))
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
    private JButton cancelar;
    private JPanel panel1;
    private JPanel frete_regular;
    private JLabel label6;
    private JLabel label9;
    private JLabel label10;
    private JComboBox list_unidades_operacoes;
    private JLabel label13;
    private JTextField quantidade_operacoes;
    private JTextField frequencia_operacoes;
    private JPanel informacoes_basicas_frete;
    private JLabel label1;
    private JComboBox list_tipos_de_fretes;
    private JLabel label2;
    private JLabel label3;
    private JLabel label7;
    private JTextField cidade_destino;
    private JTextField cidade_postagem;
    private JTextField distancia_em_km;
    private JLabel label5;
    private JPanel frete_demanda;
    private JLabel label8;
    private JLabel label11;
    private JLabel label12;
    private JTextField data_postagem;
    private JTextField previsao_entrega;
    private JButton cadastrar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
