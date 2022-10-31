package proyecto_final.Views;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto_final.controllers.RellenoController;
import proyecto_final.controllers.SalsaController;
import proyecto_final.controllers.TacoController;
import proyecto_final.controllers.TortillaController;


public class PedidoTacoView extends javax.swing.JFrame {

    
    public PedidoTacoView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txTilte = new javax.swing.JLabel();
        txTortilla = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txRelleno1 = new javax.swing.JLabel();
        txRelleno2 = new javax.swing.JLabel();
        txRelleno3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txSalsa = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdateDB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new CondimentsTableModel());
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        txTilte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txTilte.setText("Taco:");

        jLabel1.setText("Tortilla:");

        jLabel2.setText("Rellenos:");

        jLabel3.setText("Salaa:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tortilla", "Relleno", "Salsa" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirmar Pedido");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnClear.setText("Nuevo Taco");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdateDB.setText("Actualizar Base de Datos");
        btnUpdateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txTortilla))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txSalsa)
                            .addComponent(txRelleno1)))
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txRelleno2)
                        .addGap(36, 36, 36)
                        .addComponent(txRelleno3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnUpdateDB)))
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(228, 228, 228)
                        .addComponent(btnConfirm)
                        .addContainerGap(214, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTilte))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txTilte)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTortilla)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txRelleno1)
                    .addComponent(txRelleno2)
                    .addComponent(txRelleno3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txSalsa))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear)
                    .addComponent(btnUpdateDB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnConfirm))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String s = (String) this.jComboBox1.getSelectedItem();
        switch(s){
            case "Tortilla":{
                this.addTortilla();
                break;
            }
            case "Salsa":{
                this.addSalsa();
                break;
            }
            case "Relleno":{
                this.addRellno();
                break;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String s = (String) this.jComboBox1.getSelectedItem();
        switch(s){
            case "Tortilla":{
                this.jTable1.setModel(new CondimentsTableModel());
                this.jTable1.updateUI();
                break;
            }
            case "Salsa":{                
                this.jTable1.setModel(new SalsaTableModel());
                this.jTable1.updateUI();
                break;
            }
            case "Relleno":{
                this.jTable1.setModel(new RellenoTableModel());
                this.jTable1.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearTaco();
        this.jComboBox1ActionPerformed(evt);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if(!this.txRelleno1.getText().isEmpty()  && !this.txTortilla.getText().isEmpty() && !this.txSalsa.getText().isEmpty()){
            try {
                this.tacoController.createTaco(
                        this.tortillaController.getTortilla(idTortilla),
                        this.rellenoController.getRelleno(idsRelleno[0]),
                        this.rellenoController.getRelleno(idsRelleno[1]),
                        this.rellenoController.getRelleno(idsRelleno[2]),
                        this.salsaController.getSalsa(idSalsa));               
            } catch (Exception ex) {
                Logger.getLogger(PedidoTacoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.clearTaco();
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnUpdateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDBActionPerformed
        this.jTable1.updateUI();
    }//GEN-LAST:event_btnUpdateDBActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedidoTacoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoTacoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoTacoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoTacoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoTacoView().setVisible(true);
            }
        });
    }
    
    
    private Long[] idsRelleno={0l, 0l, 0l};
    private Long idTortilla=0l;
    private Long idSalsa=0l;
    private TacoController tacoController = new TacoController();
    private TortillaController tortillaController = new TortillaController();
    private SalsaController salsaController = new SalsaController();
    private RellenoController rellenoController= new RellenoController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnUpdateDB;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txRelleno1;
    private javax.swing.JLabel txRelleno2;
    private javax.swing.JLabel txRelleno3;
    private javax.swing.JLabel txSalsa;
    private javax.swing.JLabel txTilte;
    private javax.swing.JLabel txTortilla;
    // End of variables declaration//GEN-END:variables

    private void addTortilla(){
        int row = this.jTable1.getSelectedRow();
        idTortilla = (Long) this.jTable1.getValueAt(row, 0);
        try {
            this.txTortilla.setText(this.tortillaController.getTortilla(idTortilla).getNombre());
        } catch (Exception ex) {
            Logger.getLogger(PedidoTacoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void addRellno(){
        int row = this.jTable1.getSelectedRow();
        if(row>-1){
            if(idsRelleno[0]!=0l){
                if(idsRelleno[1]!=0l){
                    if(idsRelleno[2]==0l){
                      if(!Objects.equals(this.jTable1.getValueAt(row, 0), idsRelleno[0]) && !Objects.equals(this.jTable1.getValueAt(row, 0), idsRelleno[1])){
                        idsRelleno[2]= (Long) this.jTable1.getValueAt(row, 0);
                        try {
                            this.txRelleno3.setText(this.rellenoController.getRelleno(idsRelleno[2]).getNombre());
                        } catch (Exception ex) {
                            Logger.getLogger(PedidoTacoView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                      }
                    }                    
                }else{
                    if(!Objects.equals(this.jTable1.getValueAt(row, 0), idsRelleno[0])){
                        idsRelleno[1]= (Long) this.jTable1.getValueAt(row, 0);
                        try {
                            this.txRelleno2.setText(this.rellenoController.getRelleno(idsRelleno[1]).getNombre());
                        } catch (Exception ex) {
                            Logger.getLogger(PedidoTacoView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }else{
                idsRelleno[0]= (Long) this.jTable1.getValueAt(row, 0);
                try {
                    this.txRelleno1.setText(this.rellenoController.getRelleno(idsRelleno[0]).getNombre());
                } catch (Exception ex) {
                    Logger.getLogger(PedidoTacoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    private void addSalsa(){
        int row = this.jTable1.getSelectedRow();
        idSalsa = (Long) this.jTable1.getValueAt(row, 0);
        try {
            this.txSalsa.setText(this.salsaController.getSalsa(idSalsa).getNombre());
        } catch (Exception ex) {
            Logger.getLogger(PedidoTacoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearTaco(){
        idSalsa=0l;
        idTortilla=0l;
        idsRelleno[0]= 0l;
        idsRelleno[1]= 0l;
        idsRelleno[2]= 0l;
        this.txRelleno1.setText("");
        this.txRelleno2.setText("");
        this.txRelleno3.setText("");
        this.txTortilla.setText("");
        this.txSalsa.setText("");
    }
}
