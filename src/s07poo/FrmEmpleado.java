/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package s07poo;

import java.util.HashSet;

/**
 *
 * @author LAB-USR-PIUR-A301
 */
public class FrmEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form FrmEmpleado
     */
    public FrmEmpleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpEmpleado = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        txtDniV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreV = new javax.swing.JTextField();
        txtApellidoV = new javax.swing.JTextField();
        txtMontoVendido = new javax.swing.JTextField();
        txtTasaComision = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taResultV = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDniP = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtSueldoP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        cboAfiliacionP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("DNI:");

        btnNew.setText("Nuevo");

        txtDniV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniVActionPerformed(evt);
            }
        });

        jLabel7.setText("NOMBRE:");

        jLabel8.setText("APELLIDO:");

        jLabel9.setText("MONTO VENDIDO:");

        jLabel10.setText("TASA COMISION:");

        taResultV.setColumns(20);
        taResultV.setRows(5);
        jScrollPane2.setViewportView(taResultV);

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreV, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtDniV)
                            .addComponent(txtApellidoV)
                            .addComponent(txtMontoVendido)
                            .addComponent(txtTasaComision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDniV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew)
                        .addComponent(txtNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtApellidoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMontoVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtTasaComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tpEmpleado.addTab("Vendedor", jPanel1);

        jLabel1.setText("DNI:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("SUELDO:");

        jLabel6.setText("AFILIACION:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        taResult.setColumns(20);
        taResult.setRows(5);
        jScrollPane1.setViewportView(taResult);

        cboAfiliacionP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AFP", "NSP" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSueldoP)
                                    .addComponent(txtApellidoP)
                                    .addComponent(txtNombreP)
                                    .addComponent(txtDniP))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNuevo)
                                    .addComponent(btnAgregar))
                                .addGap(291, 291, 291))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboAfiliacionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDniP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSueldoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cboAfiliacionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tpEmpleado.addTab("Permanente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpEmpleado)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpEmpleado)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Aporte aporte = new Aporte();
        aporte.setAfiliacion(cboAfiliacionP.getSelectedItem().toString());
        
        Empleado empleado = new Empleado(
                txtDniP.getText(), 
                txtNombreP.getText(), 
                txtApellidoP.getText(), 
                tpEmpleado.getTitleAt(1)
        );
        RemuneracionPermanente rm = new RemuneracionPermanente(aporte,
                Float.parseFloat(txtSueldoP.getText())
               );
        Reporte rp = new Reporte();
        
        taResult.append(rp.mostrarPermanente(empleado, rm));
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDniVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniVActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        float tasac=0, montov= 0;
        Empleado empleado = new Empleado(
                txtDniV.getText(), 
                txtNombreV.getText(), 
                txtApellidoV.getText(), 
                tpEmpleado.getTitleAt(0)
        );
        try {
            tasac = Float.parseFloat(txtTasaComision.getText());
        } catch (Exception e) {
            txtTasaComision.setText("");
            txtTasaComision.requestFocus();
            return;
        }
        
        try {
            montov =Float.parseFloat(txtMontoVendido.getText());
        } catch (Exception e) {
            txtMontoVendido.setText("");
            txtMontoVendido.requestFocus();
            return;
        }
        Comision cm = new Comision(
                tasac, 
                montov);
        RemuneracionVendedor rv = new RemuneracionVendedor(cm);
        Reporte rp = new Reporte();
        taResultV.append(rp.mostrarVendedor(empleado, rv));
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboAfiliacionP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextArea taResultV;
    private javax.swing.JTabbedPane tpEmpleado;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtApellidoV;
    private javax.swing.JTextField txtDniP;
    private javax.swing.JTextField txtDniV;
    private javax.swing.JTextField txtMontoVendido;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtNombreV;
    private javax.swing.JTextField txtSueldoP;
    private javax.swing.JTextField txtTasaComision;
    // End of variables declaration//GEN-END:variables
}
