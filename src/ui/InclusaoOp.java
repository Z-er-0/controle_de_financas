package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import model.Despesa;
import model.Operacao;
import model.Receita;
import model.TipoReceita;
import model.TipoDespesa;
import model.Natureza;
import model.Conta;

/**
 *
 * @author 
 */
public class InclusaoOp extends javax.swing.JDialog {

    private Operacao operacao;

    private Conta conta;
    private double saldoAtual;

    /**
     * Cria uma nova instância da classe InclusaoOp.
     *
     * @param parent O Frame pai da janela.
     * @param modal Define se a janela deve ser modal ou não.
     */
    public InclusaoOp(java.awt.Frame parent, boolean modal, Conta conta, double saldoAtual) {
        super(parent, modal);
        this.conta = conta;
        this.saldoAtual = saldoAtual;
        initComponents();
        addActionListeners(conta);
        atualizarSaldo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupDespesa = new javax.swing.ButtonGroup();
        groupReceita = new javax.swing.ButtonGroup();
        pnlAdc = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        pnlNatureza = new javax.swing.JPanel();
        btnDespesa = new javax.swing.JRadioButton();
        btnReceita = new javax.swing.JRadioButton();
        btnAdc = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        pnlDespesa = new javax.swing.JPanel();
        btnOutraD = new javax.swing.JCheckBox();
        btnEnt = new javax.swing.JCheckBox();
        btnEdu = new javax.swing.JCheckBox();
        btnSau = new javax.swing.JCheckBox();
        btnRes = new javax.swing.JCheckBox();
        btnTran = new javax.swing.JCheckBox();
        btnAli = new javax.swing.JCheckBox();
        pnlReceita = new javax.swing.JPanel();
        btnOutraR = new javax.swing.JCheckBox();
        btnFer = new javax.swing.JCheckBox();
        btnDeci = new javax.swing.JCheckBox();
        btnSal = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSaldoDisp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlAdc.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Operação"));

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lblValor.setText("Valor:");

        pnlNatureza.setBorder(javax.swing.BorderFactory.createTitledBorder("Natureza"));

        btnDespesa.setText("Despesa");
        btnDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespesaActionPerformed(evt);
            }
        });

        btnReceita.setText("Receita");
        btnReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNaturezaLayout = new javax.swing.GroupLayout(pnlNatureza);
        pnlNatureza.setLayout(pnlNaturezaLayout);
        pnlNaturezaLayout.setHorizontalGroup(
            pnlNaturezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnReceita)
        );
        pnlNaturezaLayout.setVerticalGroup(
            pnlNaturezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNaturezaLayout.createSequentialGroup()
                .addComponent(btnDespesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReceita))
        );

        btnAdc.setText("Adicionar");
        btnAdc.setEnabled(false);
        btnAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcActionPerformed(evt);
            }
        });

        lblData.setText("Data:");

        txtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        txtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlDespesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Despesa"));

        groupDespesa.add(btnOutraD);
        btnOutraD.setText("Outra");
        btnOutraD.setEnabled(false);

        groupDespesa.add(btnEnt);
        btnEnt.setText("Entretenimento");
        btnEnt.setEnabled(false);

        groupDespesa.add(btnEdu);
        btnEdu.setText("Educação");
        btnEdu.setEnabled(false);

        groupDespesa.add(btnSau);
        btnSau.setText("Saúde");
        btnSau.setEnabled(false);

        groupDespesa.add(btnRes);
        btnRes.setText("Residência");
        btnRes.setEnabled(false);

        groupDespesa.add(btnTran);
        btnTran.setText("Transporte");
        btnTran.setEnabled(false);

        groupDespesa.add(btnAli);
        btnAli.setText("Alimentação");
        btnAli.setEnabled(false);

        javax.swing.GroupLayout pnlDespesaLayout = new javax.swing.GroupLayout(pnlDespesa);
        pnlDespesa.setLayout(pnlDespesaLayout);
        pnlDespesaLayout.setHorizontalGroup(
            pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAli)
                    .addComponent(btnTran)
                    .addComponent(btnRes)
                    .addComponent(btnSau)
                    .addComponent(btnEdu)
                    .addComponent(btnEnt)
                    .addComponent(btnOutraD))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlDespesaLayout.setVerticalGroup(
            pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOutraD)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlReceita.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Receita"));

        groupReceita.add(btnOutraR);
        btnOutraR.setText("Outra");
        btnOutraR.setEnabled(false);

        groupReceita.add(btnFer);
        btnFer.setText("Férias");
        btnFer.setEnabled(false);

        groupReceita.add(btnDeci);
        btnDeci.setText("Décimo");
        btnDeci.setEnabled(false);

        groupReceita.add(btnSal);
        btnSal.setText("Salário");
        btnSal.setEnabled(false);

        javax.swing.GroupLayout pnlReceitaLayout = new javax.swing.GroupLayout(pnlReceita);
        pnlReceita.setLayout(pnlReceitaLayout);
        pnlReceitaLayout.setHorizontalGroup(
            pnlReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSal)
                    .addComponent(btnDeci)
                    .addComponent(btnFer)
                    .addComponent(btnOutraR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlReceitaLayout.setVerticalGroup(
            pnlReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOutraR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Dia");

        jLabel2.setText("Mês");

        jLabel3.setText("Ano");

        javax.swing.GroupLayout pnlAdcLayout = new javax.swing.GroupLayout(pnlAdc);
        pnlAdc.setLayout(pnlAdcLayout);
        pnlAdcLayout.setHorizontalGroup(
            pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdcLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlAdcLayout.createSequentialGroup()
                            .addComponent(pnlDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnlReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlAdcLayout.createSequentialGroup()
                            .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValor)
                                .addComponent(lblData))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtValor)
                                .addGroup(pnlAdcLayout.createSequentialGroup()
                                    .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(pnlNatureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pnlAdcLayout.setVerticalGroup(
            pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdcLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(pnlNatureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdc)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        lblSaldoDisp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldoDisp.setText("Saldo Disponível: R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldoDisp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaldoDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcActionPerformed
        // TODO add your handling code here:
        //Checando o valor
        double valor;

        
        
        try {
            valor = Double.parseDouble(txtValor.getText());
            if (valor <= 0) {
                throw new IllegalArgumentException("O valor deve ser maior que zero.");
            }
            if (!verificarSaldoSuficiente(conta, valor) && btnDespesa.isSelected()) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar a despesa.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O valor deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Checando a data
        int ano, mes, dia;
        try {
            ano = Integer.parseInt(txtAno.getText());
            mes = Integer.parseInt(txtMes.getText());
            dia = Integer.parseInt(txtDia.getText());

            if (dia <= 0 || dia > 31) {
                throw new IllegalArgumentException("Dia inválido.");
            }
            if (mes <= 0 || mes > 12) {
                throw new IllegalArgumentException("Mês inválido.");
            }
            if (ano <= 0) {
                throw new IllegalArgumentException("Ano inválido.");
            }

            // Tratamento de exceções para meses com 30 dias
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                throw new IllegalArgumentException("Dia e/ou mês inválido.");
            }

            // Tratamento de exceção para o mês de fevereiro (considerando anos bissextos)
            boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
            if (mes == 2) {
                if (anoBissexto && dia > 29) {
                    throw new IllegalArgumentException("Dia e/ou mês inválido.");
                } else if (!anoBissexto && dia > 28) {
                    throw new IllegalArgumentException("Dia e/ou mês inválido.");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Os campos de data devem ser preenchidos com valores numéricos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        LocalDate data = LocalDate.of(ano, mes, dia);

        //Checando qual a Natureza e Tipo
        if (btnDespesa.isSelected()) {

            if (btnAli.isSelected()) {
                operacao = new Despesa(TipoDespesa.ALIMENTACAO, valor, data);

            } else if (btnTran.isSelected()) {
                operacao = new Despesa(TipoDespesa.TRANSPORTE, valor, data);

            } else if (btnRes.isSelected()) {
                operacao = new Despesa(TipoDespesa.RESIDENCIA, valor, data);

            } else if (btnSau.isSelected()) {
                operacao = new Despesa(TipoDespesa.SAUDE, valor, data);

            } else if (btnEdu.isSelected()) {
                operacao = new Despesa(TipoDespesa.EDUCACAO, valor, data);

            } else if (btnEnt.isSelected()) {
                operacao = new Despesa(TipoDespesa.ENTRETENIMENTO, valor, data);

            } else {
                operacao = new Despesa(TipoDespesa.OUTRA, valor, data);

            }

            operacao.setNatureza(Natureza.DESPESA);

        }

        if (btnReceita.isSelected()) {

            if (btnSal.isSelected()) {
                operacao = new Receita(TipoReceita.SALARIO, valor, data);

            } else if (btnDeci.isSelected()) {
                operacao = new Receita(TipoReceita.DECIMO, valor, data);

            } else if (btnFer.isSelected()) {
                operacao = new Receita(TipoReceita.FERIAS, valor, data);

            } else {
                operacao = new Receita(TipoReceita.OUTRA, valor, data);

            }

            operacao.setNatureza(Natureza.RECEITA);
        }

        setVisible(false); //Fecha a janela


    }//GEN-LAST:event_btnAdcActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDespesaActionPerformed

    private void btnReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReceitaActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void addActionListeners(Conta conta) {

        btnReceita.addActionListener(new ActionListener() { //Botão "Receita"
            public void actionPerformed(ActionEvent e) {
                if (btnReceita.isSelected()) {
                    btnDespesa.setSelected(false);

                    btnSal.setEnabled(true);
                    btnFer.setEnabled(true);
                    btnDeci.setEnabled(true);
                    btnOutraR.setEnabled(true);

                    groupDespesa.clearSelection();
                    
                    btnAli.setEnabled(false);
                    btnTran.setEnabled(false);
                    btnRes.setEnabled(false);
                    btnEdu.setEnabled(false);
                    btnSau.setEnabled(false);
                    btnEnt.setEnabled(false);
                    btnOutraD.setEnabled(false);

                    btnAdc.setEnabled(true);

                } else {

                    btnSal.setEnabled(false);
                    btnFer.setEnabled(false);
                    btnDeci.setEnabled(false);
                    btnOutraR.setEnabled(false);

                }
            }
        });

        btnDespesa.addActionListener(new ActionListener() { //Botão "Receita"
            public void actionPerformed(ActionEvent e) {
                if (btnDespesa.isSelected()) {
                    btnReceita.setSelected(false);

                    btnAli.setEnabled(true);
                    btnTran.setEnabled(true);
                    btnRes.setEnabled(true);
                    btnEdu.setEnabled(true);
                    btnRes.setEnabled(true);
                    btnSau.setEnabled(true);
                    btnEnt.setEnabled(true);
                    btnOutraD.setEnabled(true);

                    groupReceita.clearSelection();
                    
                    btnSal.setEnabled(false);
                    btnFer.setEnabled(false);
                    btnDeci.setEnabled(false);
                    btnOutraR.setEnabled(false);

                    btnAdc.setEnabled(true);

                } else {

                    btnAli.setEnabled(false);
                    btnTran.setEnabled(false);
                    btnRes.setEnabled(false);
                    btnEdu.setEnabled(false);
                    btnOutraD.setEnabled(false);
                    btnRes.setEnabled(false);
                    btnSau.setEnabled(false);
                    btnEnt.setEnabled(false);

                }
            }
        });
    }

    /**
     * Verifica se tem saldo o suficiente para operar a despesa
     *
     * @param valor Valor da Despesa
     * @return
     */
    private boolean verificarSaldoSuficiente(Conta conta, double valor) {
        double saldo = conta.getSaldo();
        return valor <= saldo;
    }
    
    public void atualizarSaldo() {
        conta.setSaldo(0);

        ArrayList<Operacao> operacoesData = new ArrayList<>();

        for (Operacao operacao : conta.getOperacoes()) {
            operacoesData.add(operacao);
        }
        Collections.sort(operacoesData, (op1, op2) -> op1.getData().compareTo(op2.getData()));

        double saldoAtual = 0;
        for (Operacao operacao : operacoesData) {
            if (!operacao.getData().isAfter(LocalDate.now())) {
                if (operacao.getNatureza().equals(Natureza.RECEITA)) {
                    saldoAtual += operacao.getValor();
                } else {
                    saldoAtual -= operacao.getValor();
                }
            }
        }

        conta.setSaldo(saldoAtual);
        lblSaldoDisp.setText("Saldo Disponível: R$" + saldoAtual);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdc;
    private javax.swing.JCheckBox btnAli;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox btnDeci;
    private javax.swing.JRadioButton btnDespesa;
    private javax.swing.JCheckBox btnEdu;
    private javax.swing.JCheckBox btnEnt;
    private javax.swing.JCheckBox btnFer;
    private javax.swing.JCheckBox btnOutraD;
    private javax.swing.JCheckBox btnOutraR;
    private javax.swing.JRadioButton btnReceita;
    private javax.swing.JCheckBox btnRes;
    private javax.swing.JCheckBox btnSal;
    private javax.swing.JCheckBox btnSau;
    private javax.swing.JCheckBox btnTran;
    private javax.swing.ButtonGroup groupDespesa;
    private javax.swing.ButtonGroup groupReceita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblSaldoDisp;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlAdc;
    private javax.swing.JPanel pnlDespesa;
    private javax.swing.JPanel pnlNatureza;
    private javax.swing.JPanel pnlReceita;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    Operacao getOperacao() {
        return operacao;
    }
}
