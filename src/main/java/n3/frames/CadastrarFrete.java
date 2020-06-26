/*
 * Created by JFormDesigner on Thu Jun 25 16:53:08 BRT 2020
 */

package n3.frames;

import n3.Main;
import n3.entity.FreteDemanda;
import n3.entity.FreteRegular;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author unknown
 */
public class CadastrarFrete {
    public CadastrarFrete() {
        initComponents();
    }

    private void cadastrarFrete(ActionEvent e) {

        if(!(getTipoFrete().getText().equalsIgnoreCase("sobDemanda"))){
            double distancia = Double.parseDouble(getDistancia_em_km().getText());
            Integer quantidadeOperacoes = Integer.parseInt(getQuantidade_operacoes().getText());
            Integer frequenciaOperacoes = Integer.parseInt(getFrequencia_operacoes().getText());


            FreteRegular freteRegular = new FreteRegular(getTipoFrete().getText(), getCidade_postagem().getText(), getCidade_destino().getText(), distancia,
                    getUnidadeFrequencia().getText(), quantidadeOperacoes, frequenciaOperacoes);
            Main.getController().salvarFrete(freteRegular);
        } else {
            double distancia = Double.parseDouble(getDistancia_em_km().getText());


            FreteDemanda freteDemanda = new FreteDemanda(getTipoFrete().getText(), getCidade_postagem().getText(), getCidade_destino().getText(), distancia,
                    getData_postagem().getText(), getPrevisao_entrega().getText());
            Main.getController().salvarFrete(freteDemanda);
        }

    }

    private void cancelar(ActionEvent e) {
        this.getCadastrar_frete_tela().setVisible(false);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
        cadastrar_frete_tela = new JFrame();
        label_cadastro_frete = new JLabel();
        cancelar = new JButton();
        panel1 = new JPanel();
        frete_regular = new JPanel();
        label6 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label13 = new JLabel();
        quantidade_operacoes = new JTextField();
        frequencia_operacoes = new JTextField();
        unidadeFrequencia = new JTextField();
        informacoes_basicas_frete = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label7 = new JLabel();
        cidade_destino = new JTextField();
        cidade_postagem = new JTextField();
        distancia_em_km = new JTextField();
        label5 = new JLabel();
        tipoFrete = new JTextField();
        label4 = new JLabel();
        label14 = new JLabel();
        frete_demanda = new JPanel();
        label8 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        data_postagem = new JTextField();
        previsao_entrega = new JTextField();
        cadastrar = new JButton();

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
            cancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cancelar(e);
                }
            });

            //======== panel1 ========
            {
                panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
                ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
                .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,java . awt
                . Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
                propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
                ;} } );

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGap(0, 204, Short.MAX_VALUE)
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGap(0, 453, Short.MAX_VALUE)
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
                        .addGroup(frete_regularLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(frete_regularLayout.createParallelGroup()
                                .addGroup(frete_regularLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label9)
                                    .addComponent(label10)
                                    .addGroup(frete_regularLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(quantidade_operacoes))
                                    .addGroup(frete_regularLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label13)
                                        .addComponent(label6)))
                                .addGroup(frete_regularLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(frete_regularLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(frequencia_operacoes, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(unidadeFrequencia, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                            .addContainerGap(72, Short.MAX_VALUE))
                );
                frete_regularLayout.setVerticalGroup(
                    frete_regularLayout.createParallelGroup()
                        .addGroup(frete_regularLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(label13)
                            .addGap(47, 47, 47)
                            .addComponent(label6)
                            .addGap(5, 5, 5)
                            .addComponent(quantidade_operacoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label9)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(frequencia_operacoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(label10)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(unidadeFrequencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(22, Short.MAX_VALUE))
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

                //---- label4 ----
                label4.setText("- Regular");

                //---- label14 ----
                label14.setText("- sobDemanda");

                GroupLayout informacoes_basicas_freteLayout = new GroupLayout(informacoes_basicas_frete);
                informacoes_basicas_frete.setLayout(informacoes_basicas_freteLayout);
                informacoes_basicas_freteLayout.setHorizontalGroup(
                    informacoes_basicas_freteLayout.createParallelGroup()
                        .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                            .addGroup(informacoes_basicas_freteLayout.createParallelGroup()
                                .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(informacoes_basicas_freteLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label1)
                                        .addComponent(label14)
                                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(tipoFrete, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                    .addGap(28, 28, 28)
                                    .addGroup(informacoes_basicas_freteLayout.createParallelGroup()
                                        .addComponent(label3)
                                        .addComponent(cidade_destino, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                                            .addGroup(informacoes_basicas_freteLayout.createParallelGroup()
                                                .addComponent(cidade_postagem, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label2))
                                            .addGap(18, 18, 18)
                                            .addGroup(informacoes_basicas_freteLayout.createParallelGroup()
                                                .addComponent(label7)
                                                .addComponent(distancia_em_km, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .addGap(170, 170, 170)
                                    .addComponent(label5)))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                informacoes_basicas_freteLayout.setVerticalGroup(
                    informacoes_basicas_freteLayout.createParallelGroup()
                        .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label5)
                            .addGap(15, 15, 15)
                            .addGroup(informacoes_basicas_freteLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label14))
                                .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cidade_postagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(distancia_em_km, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(informacoes_basicas_freteLayout.createParallelGroup()
                                .addGroup(informacoes_basicas_freteLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cidade_destino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addComponent(tipoFrete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(7, 7, 7))
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
                        .addGroup(frete_demandaLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(frete_demandaLayout.createParallelGroup()
                                .addComponent(label11, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                .addComponent(previsao_entrega, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                .addComponent(data_postagem, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                .addGroup(frete_demandaLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label12)
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(43, Short.MAX_VALUE))
                );
                frete_demandaLayout.setVerticalGroup(
                    frete_demandaLayout.createParallelGroup()
                        .addGroup(frete_demandaLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(label12)
                            .addGap(43, 43, 43)
                            .addComponent(label8)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(data_postagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label11)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(previsao_entrega, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(91, Short.MAX_VALUE))
                );
            }

            //---- cadastrar ----
            cadastrar.setText("Cadastrar");
            cadastrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cadastrarFrete(e);
                }
            });

            GroupLayout cadastrar_frete_telaContentPaneLayout = new GroupLayout(cadastrar_frete_telaContentPane);
            cadastrar_frete_telaContentPane.setLayout(cadastrar_frete_telaContentPaneLayout);
            cadastrar_frete_telaContentPaneLayout.setHorizontalGroup(
                cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                    .addGroup(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(cancelar)
                        .addGap(148, 148, 148)
                        .addComponent(cadastrar))
                    .addGroup(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(cadastrar_frete_telaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(informacoes_basicas_frete, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.LEADING, cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                                .addComponent(frete_regular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(frete_demanda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(761, 761, 761)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(label_cadastro_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            cadastrar_frete_telaContentPaneLayout.setVerticalGroup(
                cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                    .addGroup(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                        .addGroup(cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                            .addGroup(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(cadastrar_frete_telaContentPaneLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(label_cadastro_frete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(informacoes_basicas_frete, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadastrar_frete_telaContentPaneLayout.createParallelGroup()
                                    .addComponent(frete_regular, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frete_demanda, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastrar_frete_telaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar)
                            .addComponent(cadastrar))
                        .addGap(31, 31, 31))
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
    // Generated using JFormDesigner Evaluation license - Gabriela da Rocha
    private JFrame cadastrar_frete_tela;
    private JLabel label_cadastro_frete;
    private JButton cancelar;
    private JPanel panel1;
    private JPanel frete_regular;
    private JLabel label6;
    private JLabel label9;
    private JLabel label10;
    private JLabel label13;
    private JTextField quantidade_operacoes;
    private JTextField frequencia_operacoes;
    private JTextField unidadeFrequencia;
    private JPanel informacoes_basicas_frete;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label7;
    private JTextField cidade_destino;
    private JTextField cidade_postagem;
    private JTextField distancia_em_km;
    private JLabel label5;
    private JTextField tipoFrete;
    private JLabel label4;
    private JLabel label14;
    private JPanel frete_demanda;
    private JLabel label8;
    private JLabel label11;
    private JLabel label12;
    private JTextField data_postagem;
    private JTextField previsao_entrega;
    private JButton cadastrar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JLabel getLabel_cadastro_frete() {
        return label_cadastro_frete;
    }

    public JTextField getQuantidade_operacoes() {
        return quantidade_operacoes;
    }

    public JTextField getFrequencia_operacoes() {
        return frequencia_operacoes;
    }

    public JTextField getUnidadeFrequencia() {
        return unidadeFrequencia;
    }

    public JTextField getCidade_destino() {
        return cidade_destino;
    }

    public JTextField getCidade_postagem() {
        return cidade_postagem;
    }

    public JTextField getDistancia_em_km() {
        return distancia_em_km;
    }

    public JTextField getTipoFrete() {
        return tipoFrete;
    }

    public JTextField getData_postagem() {
        return data_postagem;
    }

    public JTextField getPrevisao_entrega() {
        return previsao_entrega;
    }
}
