/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import Clases.ClsGlobales;
import Clases.ClsVehiculos;
import DB.ClsDB;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juand
 */
public class FrmVehiculos extends javax.swing.JInternalFrame {
    
    ClsVehiculos MisVehiculos = new ClsVehiculos();
    FrmAgregarVehiculo fAgregarVehiculo = new FrmAgregarVehiculo();
    
    public int IdEditar = -1;
    
    /**
     * Creates new form FrmVehiculos
     */
    public FrmVehiculos() {
        initComponents();
        MisVehiculos.ObtenerDatosMemoria();
        LlenarLista("");
    }
    
    public void LlenarLista(String buscar){
        
        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
        
        modelo.setRowCount(0);
        
        for (ClsVehiculos MiVehiculo : ClsDB.jsonVehiculos) {
            Object[] row = new Object[]{MiVehiculo.IdVehiculo,
                                        MiVehiculo.Placa,
                                        MiVehiculo.descuento,
                                        MiVehiculo.duenno,
                                        MiVehiculo.entrada,
                                        MiVehiculo.Tipo};
            
            if (buscar.equals("")) {
                modelo.addRow(row);
            }else if (MiVehiculo.Placa.toLowerCase().contains(buscar) ||
                      MiVehiculo.descuento.toLowerCase().contains(buscar) ||
                      MiVehiculo.duenno.toLowerCase().contains(buscar) ||
                      MiVehiculo.Tipo.toLowerCase().contains(buscar)) {
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Buscar vehículo");

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Placa", "Descuento", "Dueño", "Entrada", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVehiculos.setRowHeight(25);
        tblVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);
        if (tblVehiculos.getColumnModel().getColumnCount() > 0) {
            tblVehiculos.getColumnModel().getColumn(0).setMinWidth(40);
            tblVehiculos.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblVehiculos.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Vehículos parqueados");

        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
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

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
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

        btnCobrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cobrar.png"))); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.setToolTipText("");
        btnCobrar.setBorder(null);
        btnCobrar.setBorderPainted(false);
        btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        if (!fAgregarVehiculo.isShowing()) {
            
            IdEditar = -1;
            fAgregarVehiculo.IdEditar = -1;
            fAgregarVehiculo.txtPlaca.setText("");
            fAgregarVehiculo.txtDescuento.setText("");
            fAgregarVehiculo.txtDuenno.setText("");
            fAgregarVehiculo.txtHoras.setText("");
            fAgregarVehiculo.btnGuardar.setText("GUARDAR VEHÍCULO");
        
            fAgregarVehiculo.show();
            ClsGlobales.formPrincipal.enable(false);
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        LlenarLista(txtBuscar.getText().toLowerCase());
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (IdEditar > 0 && IdEditar <= ClsDB.jsonVehiculos.size()) {

            if (!fAgregarVehiculo.isShowing()) {
                int Contador = 0;
                
                for (ClsVehiculos MiVehiculo : ClsDB.jsonVehiculos) {
                    if (MiVehiculo.IdVehiculo == IdEditar) {
                        IdEditar = Contador;
                        break;
                    }
                    Contador++;
                }
                
                fAgregarVehiculo.IdEditar = IdEditar;
                
                fAgregarVehiculo.txtPlaca.setText(ClsDB.jsonVehiculos.get(IdEditar).Placa);
                fAgregarVehiculo.txtDescuento.setText(ClsDB.jsonVehiculos.get(IdEditar).descuento);
                fAgregarVehiculo.txtDuenno.setText(ClsDB.jsonVehiculos.get(IdEditar).duenno);
                fAgregarVehiculo.txtHoras.setText(ClsDB.jsonVehiculos.get(IdEditar).entrada.toString());
                fAgregarVehiculo.cmbTipo.setSelectedItem(ClsDB.jsonVehiculos.get(IdEditar).Tipo);
                fAgregarVehiculo.btnGuardar.setText("EDITAR VEHÍCULO");
                
                fAgregarVehiculo.show();
                ClsGlobales.formPrincipal.enable(false);
            }

        }else{
            JOptionPane.showMessageDialog(null,
                "Por favor seleccione un vehículo para editar",
                "Editar",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private double calcularMontoCobrado(ClsVehiculos vehiculo) {
    // Realizar el cálculo del monto a cobrar para el vehículo
    // Puedes implementar aquí tu lógica personalizada para el cálculo
    
    // Ejemplo de cálculo: monto = horas estacionadas * tarifa por hora
    double horasEstacionadas = obtenerHorasEstacionadas(vehiculo);
    double tarifaPorHora = obtenerTarifaPorHora(vehiculo);
        System.out.println(horasEstacionadas);
    double montoCobrado = horasEstacionadas * tarifaPorHora;
    
    return montoCobrado;
}

    private double obtenerHorasEstacionadas(ClsVehiculos vehiculo) {
        String patron = "dd/MM/yyyy HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(patron);
        LocalDateTime fechaHora = LocalDateTime.parse(vehiculo.entrada, formatter);

        // Implementar la lógica para obtener las horas estacionadas del vehículo
        // Puedes utilizar el campo 'entrada' del vehículo y la fecha/hora actual
    
     // Ejemplo de obtención de horas estacionadas:
        LocalDateTime horaActual = LocalDateTime.now();
        
        Duration duracion = Duration.between(fechaHora, horaActual);
        long horasEstacionadas = duracion.toHours();
    
        return horasEstacionadas;
    }

    private double obtenerTarifaPorHora(ClsVehiculos vehiculo) {
        // Implementar la lógica para obtener la tarifa por hora según el tipo de vehículo
        // Puedes utilizar el campo 'Tipo' del vehículo para determinar la tarifa

        // Ejemplo de obtención de tarifa por hora según el tipo de vehículo:
        double tarifa = 0.0;

        switch (vehiculo.Tipo) {
            case "Automóvil":
                tarifa = 10.0; // Tarifa para automóviles
                break;
            case "Motocicleta":
                tarifa = 5.0; // Tarifa para motocicletas
                break;
            case "PickUp":
                tarifa = 15.0;
            case "Camión":
                tarifa = 20.0;
            default:
                tarifa = 25.0; // Tarifa para otros tipos de vehículo
                break;
        }
        return tarifa;
    }

    private void tblVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculosMouseClicked
        int fila = evt.getY()/tblVehiculos.getRowHeight();
        IdEditar =  Integer.parseInt(tblVehiculos.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tblVehiculosMouseClicked

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        // TODO add your handling code here:
         System.out.println(IdEditar);
        if (IdEditar > 0 && IdEditar <= ClsDB.jsonVehiculos.size()) {
            ClsVehiculos vehiculo = ClsDB.jsonVehiculos.get(IdEditar-1);

            // Realizar el cálculo del monto a cobrar para el vehículo seleccionado
            double montoCobrado = calcularMontoCobrado(vehiculo) - Float.parseFloat(ClsDB.jsonVehiculos.get(IdEditar-1).descuento);

            // Mostrar un mensaje con el monto cobrado
            JOptionPane.showMessageDialog(null, "Monto cobrado: $" + montoCobrado, "Cobro exitoso", JOptionPane.INFORMATION_MESSAGE);
            ClsDB.jsonVehiculosRetirados.add(ClsDB.jsonVehiculos.get(IdEditar-1));
            ClsDB.jsonVehiculosRetirados.get(IdEditar-1).GuardarDatosMemoriaRetirados();
            ClsDB.jsonVehiculos.remove(IdEditar-1);
            ClsDB.jsonVehiculos.get(0).ObtenerDatosMemoria();
            

        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un vehículo para cobrar", "Cobro", JOptionPane.ERROR_MESSAGE);
        }                           
    }//GEN-LAST:event_btnCobrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
