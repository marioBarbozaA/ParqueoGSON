/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Clases.ClsConductores;
import Clases.ClsGlobales;
import DB.ClsDB;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class FrmAgregarConductor extends javax.swing.JFrame {
    
    ClsConductores MisConductores = new ClsConductores();
    public int IdEditar = 0;
    /**
     * Creates new form FrmAgregarConductor
     */
    public FrmAgregarConductor() {
        initComponents();
    }
    
    private boolean ValidarDatos(){
        
        boolean Validado = true;
        
        if (txtCedula.getText().isEmpty() ||
            txtNombre.getText().isEmpty() ||
            txtApellidos.getText().isEmpty() ||
            txtCorreo.getText().isEmpty() ||
            txtTelefono.getText().isEmpty()
            ) 
        {
            Validado = false;
        }
        
        return Validado;
    }
    
    private void Limpiar(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        pnlCuerpo = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblCorreo1 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblBarraSup = new javax.swing.JLabel();

        btnCerrar1.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar1.setForeground(java.awt.SystemColor.control);
        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnCerrar1.setText("CERRAR");
        btnCerrar1.setActionCommand("");
        btnCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar conductor nuevo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo.setForeground(java.awt.SystemColor.control);
        lblTitulo.setText("Agregar conductor nuevo");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        pnlCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 0, 0));
        lblCedula.setText("Cédula");
        pnlCuerpo.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 12, -1, -1));

        txtCedula.setBackground(java.awt.SystemColor.control);
        txtCedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtCedula.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 32, 230, 30));
        pnlCuerpo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 81, 472, 10));

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");
        pnlCuerpo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 97, -1, -1));

        txtNombre.setBackground(java.awt.SystemColor.control);
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtNombre.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 30));

        lblApellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setText("Apellidos");
        pnlCuerpo.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 97, -1, -1));

        txtApellidos.setBackground(java.awt.SystemColor.control);
        txtApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtApellidos.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 230, 30));

        lblCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Correo electrónico");
        pnlCuerpo.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 159, -1, -1));

        txtCorreo.setBackground(java.awt.SystemColor.control);
        txtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtCorreo.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 30));

        lblTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Número de teléfono");
        pnlCuerpo.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 159, -1, -1));

        txtTelefono.setBackground(java.awt.SystemColor.control);
        txtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtTelefono.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 230, 30));
        pnlCuerpo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 227, 472, 10));

        btnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCerrar.setForeground(java.awt.SystemColor.control);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setActionCommand("");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlCuerpo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 40));

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnLimpiar.setForeground(java.awt.SystemColor.control);
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setActionCommand("");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlCuerpo.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 100, 40));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 0));
        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardar.setForeground(java.awt.SystemColor.control);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
        btnGuardar.setText("GUARDAR CONDUCTOR");
        btnGuardar.setActionCommand("");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlCuerpo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 220, 40));

        lblCorreo1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo1.setText("Cuenta bancaria");
        pnlCuerpo.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtCuenta.setBackground(java.awt.SystemColor.control);
        txtCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtCuenta.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 480, 30));
        pnlCuerpo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 472, 10));

        getContentPane().add(pnlCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 520, 380));

        lblBarraSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazul.jpg"))); // NOI18N
        getContentPane().add(lblBarraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        this.setAlwaysOnTop(false);

        if (ValidarDatos()) {

            if (ClsGlobales.ValidarMail(txtCorreo.getText())) {

                if (IdEditar > -1) {

                    ClsDB.jsonConductores.get(IdEditar).Cedula = txtCedula.getText();
                    ClsDB.jsonConductores.get(IdEditar).Nombre = txtNombre.getText();
                    ClsDB.jsonConductores.get(IdEditar).Apellidos = txtApellidos.getText();
                    ClsDB.jsonConductores.get(IdEditar).Correo = txtCorreo.getText();
                    ClsDB.jsonConductores.get(IdEditar).Telefono = txtTelefono.getText();
                    ClsDB.jsonConductores.get(IdEditar).Cuenta = txtCuenta.getText();

                }else{
                    MisConductores.IdConductor = ClsDB.jsonConductores.size() + 1;
                    MisConductores.Cedula = txtCedula.getText();
                    MisConductores.Nombre = txtNombre.getText();
                    MisConductores.Apellidos = txtApellidos.getText();
                    MisConductores.Correo = txtCorreo.getText();
                    MisConductores.Telefono = txtTelefono.getText();
                    MisConductores.Cuenta = txtCuenta.getText();

                    ClsDB.jsonConductores.add(MisConductores);
                }

                if (MisConductores.GuardarDatosMemoria()) {

                    JOptionPane.showMessageDialog(null,
                        "Los datos del cliente se han guardado con éxito",
                        "Proceso exitoso",
                        JOptionPane.INFORMATION_MESSAGE);

                    this.dispose();
                }

            }else{
                JOptionPane.showMessageDialog(null,
                    "Ingrese un correo electrónico válido",
                    "Error de datos",
                    JOptionPane.ERROR_MESSAGE);
                this.setAlwaysOnTop(true);
            }

        }else{
            JOptionPane.showMessageDialog(null,
                "Por favor ingrese toda la información solicitada",
                "Error de datos",
                JOptionPane.ERROR_MESSAGE);
            this.setAlwaysOnTop(true);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ClsGlobales.fConductores.IdEditar = 0;
        ClsGlobales.fConductores.LlenarLista("");
        ClsGlobales.formPrincipal.enable(true);
        ClsGlobales.formPrincipal.show();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(FrmAgregarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarConductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrar1;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblBarraSup;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCuerpo;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtCuenta;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
