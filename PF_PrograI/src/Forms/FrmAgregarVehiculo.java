/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Clases.ClsGlobales;
import Clases.ClsVehiculos;
import DB.ClsDB;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class FrmAgregarVehiculo extends javax.swing.JFrame {
    
    ClsVehiculos MisVehiculos = new ClsVehiculos();
    public int IdEditar = 0;
    /**
     * Creates new form FrmAgregarVehiculo
     */
    public FrmAgregarVehiculo() {
        initComponents();
    }
    
    private boolean ValidarDatos(){
        boolean Validado = true;
        String regex = "^\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        if (!txtHoras.getText().isEmpty()) {
            
            matcher = pattern.matcher(txtHoras.getText());
            if (!matcher.matches()) 
                Validado = false;
            
        }
        
        if (txtPlaca.getText().isEmpty() ||
            txtDescuento.getText().isEmpty() ||
            txtDuenno.getText().isEmpty() || txtHoras.getText().isEmpty()
            ) 
        {
            Validado = false;
        }
        
        return Validado;
    }
    
    private void Limpiar(){
        txtPlaca.setText("");
        txtDescuento.setText("");
        txtDuenno.setText("");
        txtHoras.setText("");
        cmbTipo.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCuerpo = new javax.swing.JPanel();
        lblHoras = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        lblADuenno = new javax.swing.JLabel();
        txtDuenno = new javax.swing.JTextField();
        lblDescuento = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        lblNombre1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        lblBarraSup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar vehículo  nuevo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHoras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblHoras.setForeground(new java.awt.Color(0, 0, 0));
        lblHoras.setText("Fecha entrada");
        pnlCuerpo.add(lblHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtDescuento.setBackground(java.awt.SystemColor.control);
        txtDescuento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtDescuento.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 30));

        lblADuenno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblADuenno.setForeground(new java.awt.Color(0, 0, 0));
        lblADuenno.setText("Dueño");
        pnlCuerpo.add(lblADuenno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        txtDuenno.setBackground(java.awt.SystemColor.control);
        txtDuenno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtDuenno.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtDuenno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 230, 30));

        lblDescuento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(0, 0, 0));
        lblDescuento.setText("Descuento");
        pnlCuerpo.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtHoras.setBackground(java.awt.SystemColor.control);
        txtHoras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtHoras.setPreferredSize(new java.awt.Dimension(3, 13));
        txtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasActionPerformed(evt);
            }
        });
        pnlCuerpo.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, 30));

        lblTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Tipo");
        pnlCuerpo.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));
        pnlCuerpo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 472, 10));

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
        pnlCuerpo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 40));

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
        pnlCuerpo.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 100, 40));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 0));
        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardar.setForeground(java.awt.SystemColor.control);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
        btnGuardar.setText("GUARDAR VEHICULO");
        btnGuardar.setActionCommand("");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlCuerpo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 191, 40));

        cmbTipo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicleta", "Automóvil", "PickUp", "Camión" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        pnlCuerpo.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 230, 30));

        lblNombre1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre1.setText("Placa");
        pnlCuerpo.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtPlaca.setBackground(java.awt.SystemColor.control);
        txtPlaca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtPlaca.setPreferredSize(new java.awt.Dimension(3, 13));
        pnlCuerpo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 30));

        getContentPane().add(pnlCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 520, 260));

        lblTitulo1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo1.setForeground(java.awt.SystemColor.control);
        lblTitulo1.setText("Agregar vehículo nuevo");
        getContentPane().add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, -1, -1));

        lblBarraSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazul.jpg"))); // NOI18N
        getContentPane().add(lblBarraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        this.setAlwaysOnTop(false);
        
        if (ValidarDatos()) {
            
            if (IdEditar > -1) {
                
                ClsDB.jsonVehiculos.get(IdEditar).Placa = txtPlaca.getText();
                ClsDB.jsonVehiculos.get(IdEditar).duenno = txtDuenno.getText();
                ClsDB.jsonVehiculos.get(IdEditar).descuento = txtDescuento.getText();
                ClsDB.jsonVehiculos.get(IdEditar).entrada = txtHoras.getText();
                ClsDB.jsonVehiculos.get(IdEditar).Tipo = cmbTipo.getSelectedItem().toString();

            }else{
                MisVehiculos.IdVehiculo = ClsDB.jsonVehiculos.size() + 1;
                MisVehiculos.Placa = txtPlaca.getText();
                MisVehiculos.duenno = txtDuenno.getText();
                MisVehiculos.descuento = txtDescuento.getText();
                MisVehiculos.entrada = txtHoras.getText();
                MisVehiculos.Tipo = cmbTipo.getSelectedItem().toString();

                ClsDB.jsonVehiculos.add(MisVehiculos);
            }
            
            if (MisVehiculos.GuardarDatosMemoria()) {

                JOptionPane.showMessageDialog(null, 
                    "Los datos del vehículo se han guardado con éxito", 
                    "Proceso exitoso", 
                JOptionPane.INFORMATION_MESSAGE);

                this.dispose();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, 
                        "Por favor ingrese toda la información solicitada", 
                        "Error de datos", 
                    JOptionPane.ERROR_MESSAGE);
            this.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ClsGlobales.fVehiculos.IdEditar = 0;
        ClsGlobales.fVehiculos.LlenarLista("");
        ClsGlobales.formPrincipal.enable(true);
        ClsGlobales.formPrincipal.show();
    }//GEN-LAST:event_formWindowClosed

    private void txtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    public javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblADuenno;
    private javax.swing.JLabel lblBarraSup;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnlCuerpo;
    public javax.swing.JTextField txtDescuento;
    public javax.swing.JTextField txtDuenno;
    public javax.swing.JTextField txtHoras;
    public javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
