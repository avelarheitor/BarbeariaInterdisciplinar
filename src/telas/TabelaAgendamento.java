package telas;

import Classes.Cliente;

public class TabelaAgendamento extends javax.swing.JPanel {
    private primeiratela framePai;
    private Cliente cliente;
    private ModeloTabelaAgendamento tableModel;
    
    public TabelaAgendamento(primeiratela framePai, Cliente cliente) {
        initComponents();

        this.framePai = framePai;
        this.cliente = cliente;
        
        this.tableModel = new ModeloTabelaAgendamento(this.cliente.getCpf());
        agendamentosTabela.setModel(tableModel);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        agendamentosTabela = new javax.swing.JTable();
        verAgendamentoBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("GothicG", 1, 36)); // NOI18N
        jLabel1.setText("Lista de  Agendamentos");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        agendamentosTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        agendamentosTabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(agendamentosTabela);

        verAgendamentoBtn.setText("Voltar");
        verAgendamentoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAgendamentoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verAgendamentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(verAgendamentoBtn)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verAgendamentoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAgendamentoBtnActionPerformed
        framePai.trocarPainel(new segundatelaPanel(framePai, cliente));
    }//GEN-LAST:event_verAgendamentoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable agendamentosTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton verAgendamentoBtn;
    // End of variables declaration//GEN-END:variables
}
