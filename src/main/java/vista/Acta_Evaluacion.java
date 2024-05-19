/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.UsuarioDAO;
import controlador.Usuario;
import modelo.ActaEvaluacionDAO;
import controlador.ActaEvaluacion;
import controlador.clsUsuarioConectado;
import java.awt.HeadlessException;
import controlador.clsBitacora;

import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class Acta_Evaluacion extends javax.swing.JFrame {
    int codigoAplicacion = 4030;
    /**
     * Creates new form Login
     */
    
    public Acta_Evaluacion() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaestros = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCarrera = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        txtSeccion = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Actas de Evaluacion");

        jLabel2.setText("Maestros");

        jLabel3.setText("Carrera");

        txtMaestros.setName("txtMaestros"); // NOI18N
        txtMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaestrosActionPerformed(evt);
            }
        });

        btnAceptar.setText("Ingresar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso");

        jLabel5.setText("Seccion");

        txtCurso.setName("txtUsuario"); // NOI18N
        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnAceptar)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCurso)
                                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaestros, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(txtCarrera)))))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaestrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaestrosActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:

        if (txtMaestros.getText().trim().isEmpty() || txtCarrera.getText().trim().isEmpty() || txtCurso.getText().trim().isEmpty() || txtSeccion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDEN HABER CAMPOS VACIOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                
                ActaEvaluacion maestroAConsultar = new ActaEvaluacion();
                ActaEvaluacionDAO maestroDAO = new ActaEvaluacionDAO();
                maestroAConsultar.setCodigo_maestro(txtMaestros.getText().trim());
                maestroAConsultar = maestroDAO.query(maestroAConsultar);

                if (txtCarrera.getText().equals(maestroAConsultar.getCodigo_carrera()) && txtMaestros.getText().equals(maestroAConsultar.getCodigo_maestro()) && txtSeccion.getText().equals(maestroAConsultar.getCodigo_seccion()) && txtCurso.getText().equals(maestroAConsultar.getCodigo_curso())) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al SISTEMA\n", "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);
                    // registrando usuario conectado
                   // clsUsuarioConectado usuarioRegistrado = new clsUsuarioConectado();
                   // usuarioRegistrado.setIdUsuario(maestroAConsultar.getId_usuario());
                   // usuarioRegistrado.setNombreUsuario(maestroAConsultar.getUsername());
                    clsBitacora Auditoria = new clsBitacora();
                    Auditoria.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "LOGAUD");
                    MdiGeneral menuGeneral = new MdiGeneral();
                    //menuGeneral.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "ERROR, VALORES INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txtCarrera.setText("");
                    txtMaestros.setText("");
                    txtCurso.setText("");
                    txtSeccion.setText("");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "ERROR AVALORES INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtCarrera.setText("");
                    txtMaestros.setText("");
                    txtCurso.setText("");
                    txtSeccion.setText("");
            }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

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
            java.util.logging.Logger.getLogger(Acta_Evaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acta_Evaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acta_Evaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acta_Evaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acta_Evaluacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtCarrera;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtMaestros;
    private javax.swing.JPasswordField txtSeccion;
    // End of variables declaration//GEN-END:variables
}