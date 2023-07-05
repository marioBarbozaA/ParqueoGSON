/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import static Clases.ClsGlobales.formPrincipal;
import Clases.ClsVehiculos;
import DB.ClsDB;
import java.util.ArrayList;
import javax.swing.JButton;
/**
 *
 * @author mario
 */
public class FrmParking extends javax.swing.JFrame {
    

    /**
     * Creates new form FrmParking
     */
    
    private void updateText(int i){
        ClsVehiculos vehiculo = ClsDB.arregloVehiculos[i];
        jInfo.setText(vehiculo.aString());
    }
    public FrmParking() {
        initComponents();
        setTitle("View Parqueo");
        
        
        
        JButton[] buttonArray = {
            btnEspacio, btnEspacio1, btnEspacio2, btnEspacio3, btnEspacio4,
            btnEspacio5, btnEspacio6, btnEspacio7, btnEspacio8, btnEspacio9,
            btnEspacio10, btnEspacio11
        };
        
        for (int i = 0; i < buttonArray.length; i++) {
            int index = i;
            JButton button = buttonArray[i];
            final int j = i;
            button.addActionListener(e -> {
                // Button click event handler
                updateText(j);
            });

            // Check if ClsDB.arregloVehiculos has a null reference at the index
            while (index < ClsDB.arregloVehiculos.length && ClsDB.arregloVehiculos[index] == null) {
                button.setVisible(false);
                button.setEnabled(false);
                break;
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral = new javax.swing.JPanel();
        btnEspacio = new javax.swing.JButton();
        btnEspacio1 = new javax.swing.JButton();
        btnEspacio2 = new javax.swing.JButton();
        btnEspacio3 = new javax.swing.JButton();
        btnEspacio4 = new javax.swing.JButton();
        btnEspacio5 = new javax.swing.JButton();
        btnEspacio6 = new javax.swing.JButton();
        btnEspacio7 = new javax.swing.JButton();
        btnEspacio8 = new javax.swing.JButton();
        btnEspacio9 = new javax.swing.JButton();
        btnEspacio10 = new javax.swing.JButton();
        btnEspacio11 = new javax.swing.JButton();
        lblParqueo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnRegreso = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jInfo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEspacio.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio.setBorderPainted(false);
        btnEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacioActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 40, 80));

        btnEspacio1.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio1.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio1.setBorderPainted(false);
        btnEspacio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio1ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 40, 80));

        btnEspacio2.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio2.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio2.setBorderPainted(false);
        btnEspacio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio2ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 40, 80));

        btnEspacio3.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio3.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio3.setBorderPainted(false);
        btnEspacio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio3ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 40, 80));

        btnEspacio4.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio4.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio4.setBorderPainted(false);
        btnEspacio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio4ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 40, 80));

        btnEspacio5.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio5.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio5.setBorderPainted(false);
        btnEspacio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio5ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 40, 80));

        btnEspacio6.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio6.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio6.setBorderPainted(false);
        btnEspacio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio6ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 40, 80));

        btnEspacio7.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio7.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio7.setBorderPainted(false);
        btnEspacio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio7ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 40, 80));

        btnEspacio8.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio8.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio8.setBorderPainted(false);
        btnEspacio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio8ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 40, 80));

        btnEspacio9.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio9.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio9.setBorderPainted(false);
        btnEspacio9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio9ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 40, 80));

        btnEspacio10.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio10.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio10.setBorderPainted(false);
        btnEspacio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio10ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 40, 80));

        btnEspacio11.setBackground(new java.awt.Color(32, 32, 32));
        btnEspacio11.setForeground(new java.awt.Color(20, 20, 20));
        btnEspacio11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sambucci.png"))); // NOI18N
        btnEspacio11.setBorderPainted(false);
        btnEspacio11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacio11ActionPerformed(evt);
            }
        });
        pnlCentral.add(btnEspacio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 40, 80));

        lblParqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parqueo.png"))); // NOI18N
        pnlCentral.add(lblParqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 56, -1, 563));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Información");
        pnlCentral.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 243, -1));

        btnRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });
        pnlCentral.add(btnRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 330, -1));

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo1.setText("Parqueo Salchichón");
        pnlCentral.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 6, 243, -1));

        jInfo.setEditable(false);
        jInfo.setBackground(new java.awt.Color(206, 227, 245));
        jScrollPane1.setViewportView(jInfo);

        pnlCentral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 330, 510));

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo1.setText("Parqueo Salchichón");
        pnlCentral.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 6, 243, -1));

        jScrollPane2.setViewportView(jTextPane1);

        pnlCentral.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 280, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
        formPrincipal.show();
        this.hide();
    }//GEN-LAST:event_btnRegresoActionPerformed

    private void btnEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacioActionPerformed

    private void btnEspacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio1ActionPerformed

    private void btnEspacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio2ActionPerformed

    private void btnEspacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio3ActionPerformed

    private void btnEspacio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio4ActionPerformed

    private void btnEspacio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio5ActionPerformed

    private void btnEspacio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio6ActionPerformed

    private void btnEspacio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio7ActionPerformed

    private void btnEspacio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio8ActionPerformed

    private void btnEspacio9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio9ActionPerformed

    private void btnEspacio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio10ActionPerformed

    private void btnEspacio11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacio11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspacio11ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmParking().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEspacio;
    private javax.swing.JButton btnEspacio1;
    private javax.swing.JButton btnEspacio10;
    private javax.swing.JButton btnEspacio11;
    private javax.swing.JButton btnEspacio2;
    private javax.swing.JButton btnEspacio3;
    private javax.swing.JButton btnEspacio4;
    private javax.swing.JButton btnEspacio5;
    private javax.swing.JButton btnEspacio6;
    private javax.swing.JButton btnEspacio7;
    private javax.swing.JButton btnEspacio8;
    private javax.swing.JButton btnEspacio9;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JTextPane jInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblParqueo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnlCentral;
    // End of variables declaration//GEN-END:variables



    
    

    
}
