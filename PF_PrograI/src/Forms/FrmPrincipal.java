/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Forms;
import Clases.ClsGlobales;
import Forms.FrmLogin;
import Forms.FrmAcerca;
import Forms.FrmUsuarios;
/**
 *
 * @author juand
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    FrmLogin fLogin = new FrmLogin();
    FrmAcerca fAcerca = new FrmAcerca();
    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        
        FrmUsuarios fUsuarios = new FrmUsuarios();
        
        desktopPane.add(fUsuarios);
        fUsuarios.setVisible(true);

        try{
            fUsuarios.setMaximum(true);
        }catch(Exception e){}
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnAccesos = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVehiculos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mnuPrincipal = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuClientes = new javax.swing.JMenuItem();
        mnuVehiculos = new javax.swing.JMenuItem();
        mnuEnvios = new javax.swing.JMenuItem();
        mnuInfo = new javax.swing.JMenu();
        mnuAcerca = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenuItem();
        mnuCerrar = new javax.swing.JMenuItem();

        setTitle("PARQUEO SALCHICHON");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 890, 460));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAccesos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAccesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.png"))); // NOI18N
        btnAccesos.setText("Accesos");
        btnAccesos.setToolTipText("");
        btnAccesos.setBorder(null);
        btnAccesos.setBorderPainted(false);
        btnAccesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccesos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccesos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, 70));

        btnView.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eyes.png"))); // NOI18N
        btnView.setText("Vista");
        btnView.setToolTipText("");
        btnView.setBorder(null);
        btnView.setBorderPainted(false);
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnView.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 70));

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/detener.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazul.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 90));

        btnVehiculos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vehiculo.png"))); // NOI18N
        btnVehiculos.setText("Vehículos");
        btnVehiculos.setToolTipText("");
        btnVehiculos.setBorder(null);
        btnVehiculos.setBorderPainted(false);
        btnVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehiculos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVehiculos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazul.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 90));

        mnuArchivo.setMnemonic('f');
        mnuArchivo.setText("Sistema");

        mnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuClientes.setMnemonic('s');
        mnuClientes.setText("vista");
        mnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClientesActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuClientes);

        mnuVehiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuVehiculos.setText("Mis vehículos");
        mnuVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVehiculosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuVehiculos);

        mnuEnvios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuEnvios.setMnemonic('a');
        mnuEnvios.setText("Mi cierre");
        mnuEnvios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEnviosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuEnvios);

        mnuPrincipal.add(mnuArchivo);

        mnuInfo.setMnemonic('e');
        mnuInfo.setText("Información");

        mnuAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuAcerca.setMnemonic('t');
        mnuAcerca.setText("Acerca");
        mnuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaActionPerformed(evt);
            }
        });
        mnuInfo.add(mnuAcerca);

        mnuPrincipal.add(mnuInfo);

        mnuSalir.setMnemonic('h');
        mnuSalir.setText("Salir");

        mnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuUsuarios.setMnemonic('o');
        mnuUsuarios.setText("Mis accesos");
        mnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuariosActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuUsuarios);

        mnuCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuCerrar.setMnemonic('c');
        mnuCerrar.setText("Cerrar sesión");
        mnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuCerrar);

        mnuPrincipal.add(mnuSalir);

        setJMenuBar(mnuPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarActionPerformed
        btnSalirActionPerformed(null);
    }//GEN-LAST:event_mnuCerrarActionPerformed

    private void mnuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaActionPerformed
        
        if (!fAcerca.isShowing()) {
            fAcerca.show();
            fAcerca.setAlwaysOnTop( true );
            this.enable(false);
        }
        
    }//GEN-LAST:event_mnuAcercaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        fLogin.show();
        this.hide();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAccesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesosActionPerformed
        
        FrmUsuarios fUsuarios = new FrmUsuarios();
        
        desktopPane.removeAll();

        desktopPane.add(fUsuarios);
        fUsuarios.setVisible(true);
        try{
            fUsuarios.setMaximum(true);
        }catch(Exception e){}
        
    }//GEN-LAST:event_btnAccesosActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        
        desktopPane.removeAll();
            
        desktopPane.add(ClsGlobales.fVehiculos);
        ClsGlobales.fVehiculos.setVisible(true);
        try{
            ClsGlobales.fVehiculos.setMaximum(true);
        }catch(Exception e){}
        
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void mnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClientesActionPerformed
    }//GEN-LAST:event_mnuClientesActionPerformed

    private void mnuVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVehiculosActionPerformed
        btnVehiculosActionPerformed(null);
    }//GEN-LAST:event_mnuVehiculosActionPerformed

    private void mnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuariosActionPerformed
        btnAccesosActionPerformed(null);
    }//GEN-LAST:event_mnuUsuariosActionPerformed

    private void mnuEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEnviosActionPerformed
    }//GEN-LAST:event_mnuEnviosActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        FrmParking fParking = new FrmParking();
        fParking.show();
        this.dispose();
    }//GEN-LAST:event_btnViewActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccesos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JButton btnView;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuAcerca;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuCerrar;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenuItem mnuEnvios;
    private javax.swing.JMenu mnuInfo;
    private javax.swing.JMenuBar mnuPrincipal;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenuItem mnuUsuarios;
    private javax.swing.JMenuItem mnuVehiculos;
    // End of variables declaration//GEN-END:variables

}
