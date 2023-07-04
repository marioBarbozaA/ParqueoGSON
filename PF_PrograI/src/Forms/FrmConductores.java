/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms;

import Clases.ClsClientes;
import Clases.ClsConductores;
import Clases.ClsGlobales;
import DB.ClsDB;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juand
 */
public class FrmConductores extends javax.swing.JInternalFrame {
    
    ClsConductores MisConductores = new ClsConductores();
    FrmAgregarConductor fAgregarConductor = new FrmAgregarConductor();
    
    public int IdEditar = -1;
    /**
     * Creates new form FrmConductores
     */
    public FrmConductores() {
        initComponents();
        MisConductores.ObtenerDatosMemoria();
        LlenarLista("");
    }
    
    public void LlenarLista(String buscar){
        
        DefaultTableModel modelo = (DefaultTableModel) tblConductores.getModel();
        
        modelo.setRowCount(0);
        
        for (ClsConductores MiConductor : ClsDB.jsonConductores) {
            Object[] row = new Object[]{MiConductor.IdConductor,
                                        MiConductor.Cedula,
                                        MiConductor.Nombre,
                                        MiConductor.Apellidos,
                                        MiConductor.Telefono,
                                        MiConductor.Correo,
                                        MiConductor.Cuenta};
            
            if (buscar.equals("")) {
                modelo.addRow(row);
            }else if (MiConductor.Cedula.toLowerCase().contains(buscar) ||
                      MiConductor.Nombre.toLowerCase().contains(buscar) ||
                      MiConductor.Apellidos.toLowerCase().contains(buscar) ||
                      MiConductor.Telefono.toLowerCase().contains(buscar) ||
                      MiConductor.Correo.toLowerCase().contains(buscar) ||
                      MiConductor.Cuenta.toLowerCase().contains(buscar)) {
                      modelo.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblConductores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        tblConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cédula", "Nombre", "Apellidos", "Teléfono", "Correo", "Cuenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConductores.setRowHeight(25);
        tblConductores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConductoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConductores);
        if (tblConductores.getColumnModel().getColumnCount() > 0) {
            tblConductores.getColumnModel().getColumn(0).setMinWidth(40);
            tblConductores.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblConductores.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Listado de conductores");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Buscar conductor");

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText("Editar conductor seleccionado");
        btnEditar.setToolTipText("");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar un nuevo conductor");
        btnAgregar.setToolTipText("");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (!fAgregarConductor.isShowing()) {

            IdEditar = -1;
            fAgregarConductor.IdEditar = -1;
            fAgregarConductor.txtCedula.setText("");
            fAgregarConductor.txtNombre.setText("");
            fAgregarConductor.txtApellidos.setText("");
            fAgregarConductor.txtCorreo.setText("");
            fAgregarConductor.txtTelefono.setText("");
            fAgregarConductor.txtCuenta.setText("");
            fAgregarConductor.btnGuardar.setText("GUARDAR CONDUCTOR");

            fAgregarConductor.show();
            ClsGlobales.formPrincipal.enable(false);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (IdEditar > 0 && IdEditar <= ClsDB.jsonConductores.size()) {
            
            if (!fAgregarConductor.isShowing()) {
                
                int Contador = 0;
                
                for (ClsConductores MiConductor : ClsDB.jsonConductores) {
                    if (MiConductor.IdConductor == IdEditar) {
                        IdEditar = Contador;
                        break;
                    }
                    Contador++;
                }
                
                fAgregarConductor.IdEditar = IdEditar;

                fAgregarConductor.txtCedula.setText(ClsDB.jsonConductores.get(IdEditar).Cedula);
                fAgregarConductor.txtNombre.setText(ClsDB.jsonConductores.get(IdEditar).Nombre);
                fAgregarConductor.txtApellidos.setText(ClsDB.jsonConductores.get(IdEditar).Apellidos);
                fAgregarConductor.txtCorreo.setText(ClsDB.jsonConductores.get(IdEditar).Correo);
                fAgregarConductor.txtTelefono.setText(ClsDB.jsonConductores.get(IdEditar).Telefono);
                fAgregarConductor.txtCuenta.setText(ClsDB.jsonConductores.get(IdEditar).Cuenta);
                fAgregarConductor.btnGuardar.setText("EDITAR CONDUCTOR");
                
                fAgregarConductor.show();
                ClsGlobales.formPrincipal.enable(false);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Por favor seleccione un conductor para editar", 
                    "Editar", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        LlenarLista(txtBuscar.getText().toLowerCase());
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tblConductoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConductoresMouseClicked
        int fila = evt.getY()/tblConductores.getRowHeight();
        IdEditar =  Integer.parseInt(tblConductores.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tblConductoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConductores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
