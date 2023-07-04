/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import Logica.Parqueo;
import Logica.Vehiculo;
import java.awt.Color;
import java.awt.Point;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author diemo
 */
public class PantallaParqueo extends javax.swing.JFrame {
    private Parqueo parqueo;
    

    public PantallaParqueo() {
        initComponents();
        parqueo = new Parqueo();

         
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        lblPLaca = new javax.swing.JLabel();
        txfPlaca = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txfDescuento = new javax.swing.JTextField();
        lblPLaca1 = new javax.swing.JLabel();
        btnActualizarDescuento = new javax.swing.JButton();
        pnlParqueo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaParqueo = new javax.swing.JTextArea();
        pnlDescuento = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        lblCon = new javax.swing.JLabel();
        pnlSeleccion = new javax.swing.JPanel();
        txfPlacaSeleccionada = new javax.swing.JTextField();
        btnFacturar = new javax.swing.JButton();
        btnRestarHora = new javax.swing.JButton();
        btnSumarHora = new javax.swing.JButton();
        txfHorasSeleccionadas = new javax.swing.JTextField();
        txfDescuentoSeleccionada = new javax.swing.JTextField();
        lblTipoSeleccionado = new javax.swing.JLabel();
        btnDuplicar = new javax.swing.JButton();
        lblPLaca2 = new javax.swing.JLabel();
        txfPlacaDuplicar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlGeneral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPLaca.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPLaca.setText("Digite la placa:");

        txfPlaca.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        txfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlaca.setText("314313");

        lblTipo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTipo.setText("Tipo:");

        cbxTipo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Motocicleta", "Camion", "Bicicleta", "Otro" }));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAgregar.setText("Agregar a parqueo");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txfDescuento.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        txfDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPLaca1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPLaca1.setText("Digite el descuento:");

        btnActualizarDescuento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnActualizarDescuento.setText("Actualizar");
        btnActualizarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGeneralLayout = new javax.swing.GroupLayout(pnlGeneral);
        pnlGeneral.setLayout(pnlGeneralLayout);
        pnlGeneralLayout.setHorizontalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlGeneralLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPLaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfPlaca)
                                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                                .addGroup(pnlGeneralLayout.createSequentialGroup()
                                    .addComponent(btnAgregar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscar))))
                        .addGroup(pnlGeneralLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblPLaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addComponent(txfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnActualizarDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPLaca, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBuscar))
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblPLaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarDescuento)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlParqueo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txaParqueo.setColumns(20);
        txaParqueo.setRows(5);
        jScrollPane1.setViewportView(txaParqueo);

        javax.swing.GroupLayout pnlParqueoLayout = new javax.swing.GroupLayout(pnlParqueo);
        pnlParqueo.setLayout(pnlParqueoLayout);
        pnlParqueoLayout.setHorizontalGroup(
            pnlParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParqueoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlParqueoLayout.setVerticalGroup(
            pnlParqueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParqueoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlDescuento.setBackground(new java.awt.Color(255, 255, 204));
        pnlDescuento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblCon.setBackground(new java.awt.Color(255, 255, 255));
        lblCon.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblCon.setForeground(new java.awt.Color(0, 0, 0));
        lblCon.setText("...");

        javax.swing.GroupLayout pnlDescuentoLayout = new javax.swing.GroupLayout(pnlDescuento);
        pnlDescuento.setLayout(pnlDescuentoLayout);
        pnlDescuentoLayout.setHorizontalGroup(
            pnlDescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescuentoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCon, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(pnlDescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDescuentoLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        pnlDescuentoLayout.setVerticalGroup(
            pnlDescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescuentoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCon)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(pnlDescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDescuentoLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(btnConsultar)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );

        pnlSeleccion.setBackground(new java.awt.Color(255, 255, 204));
        pnlSeleccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txfPlacaSeleccionada.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txfPlacaSeleccionada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFacturar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnFacturar.setText("Facturar");
        btnFacturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturarMouseExited(evt);
            }
        });
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        btnRestarHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRestarHora.setText("-");
        btnRestarHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestarHoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestarHoraMouseExited(evt);
            }
        });
        btnRestarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarHoraActionPerformed(evt);
            }
        });

        btnSumarHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSumarHora.setText("+");
        btnSumarHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumarHoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumarHoraMouseExited(evt);
            }
        });
        btnSumarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarHoraActionPerformed(evt);
            }
        });

        txfHorasSeleccionadas.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txfHorasSeleccionadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txfDescuentoSeleccionada.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txfDescuentoSeleccionada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfDescuentoSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDescuentoSeleccionadaActionPerformed(evt);
            }
        });

        lblTipoSeleccionado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        btnDuplicar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDuplicar.setText("Duplicar");
        btnDuplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDuplicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDuplicarMouseExited(evt);
            }
        });
        btnDuplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuplicarActionPerformed(evt);
            }
        });

        lblPLaca2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPLaca2.setText("Digite la placa antes de duplicar:");

        txfPlacaDuplicar.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        txfPlacaDuplicar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlacaDuplicar.setText("696969");

        javax.swing.GroupLayout pnlSeleccionLayout = new javax.swing.GroupLayout(pnlSeleccion);
        pnlSeleccion.setLayout(pnlSeleccionLayout);
        pnlSeleccionLayout.setHorizontalGroup(
            pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSeleccionLayout.createSequentialGroup()
                        .addComponent(txfPlacaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTipoSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlSeleccionLayout.createSequentialGroup()
                        .addComponent(txfHorasSeleccionadas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txfDescuentoSeleccionada)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSeleccionLayout.createSequentialGroup()
                        .addGroup(pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSeleccionLayout.createSequentialGroup()
                                .addComponent(lblPLaca2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfPlacaDuplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSeleccionLayout.createSequentialGroup()
                                .addComponent(btnFacturar)
                                .addGap(66, 66, 66)
                                .addComponent(btnDuplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRestarHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSumarHora)))
                        .addGap(32, 32, 32))))
        );
        pnlSeleccionLayout.setVerticalGroup(
            pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfPlacaSeleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(lblTipoSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfHorasSeleccionadas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfDescuentoSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfPlacaDuplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPLaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFacturar)
                    .addComponent(btnRestarHora)
                    .addComponent(btnSumarHora)
                    .addComponent(btnDuplicar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlParqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 725, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlParqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(542, Short.MAX_VALUE)
                    .addComponent(pnlDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String placa = txfPlaca.getText();
        String tipo = cbxTipo.getSelectedItem().toString();
        
        Vehiculo buscado = parqueo.buscarVehiculo(placa);
        
        if (buscado == null){
            Vehiculo nuevo = new Vehiculo(placa, tipo);
            parqueo.addVehiculo(nuevo);
            txaParqueo.setText(parqueo.toString());
            JOptionPane.showMessageDialog(this, "Vehículo agregado con éxito","Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "Vehículo placa " + placa +" ya existe en el parqueo","Error", JOptionPane.ERROR_MESSAGE);
                
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
        System.out.println("El mouse esta entre el boton");
        btnAgregar.setBackground(new Color(255, 255, 205));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        // TODO add your handling code here:
        System.out.println("mouse salio del boton");
        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnFacturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturarMouseEntered

    private void btnFacturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturarMouseExited

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        String placa = txfPlacaSeleccionada.getText();
        Vehiculo eliminado = parqueo.eliminarVehiculo(placa);
        
        if (eliminado != null){
            JOptionPane.showMessageDialog(this, eliminado.getMensajeDeSalida(), "Facturación", JOptionPane.INFORMATION_MESSAGE);
            txaParqueo.setText(parqueo.toString());
        }
        else{
            JOptionPane.showMessageDialog(this, "Vehiculo no esta en el parqueo");
        }
    }//GEN-LAST:event_btnFacturarActionPerformed

    private void btnRestarHoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarHoraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestarHoraMouseEntered

    private void btnRestarHoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarHoraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestarHoraMouseExited

    private void btnRestarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarHoraActionPerformed
       actualizarHoras(-1);
    }//GEN-LAST:event_btnRestarHoraActionPerformed

    private void btnSumarHoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarHoraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumarHoraMouseEntered

    private void btnSumarHoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarHoraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumarHoraMouseExited

    private void btnSumarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarHoraActionPerformed
        actualizarHoras(1);
    }//GEN-LAST:event_btnSumarHoraActionPerformed


    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = txfPlaca.getText();
        Vehiculo buscado = parqueo.buscarVehiculo(placa);
        
        if (buscado != null){
            txfPlacaSeleccionada.setText(placa);
            txfHorasSeleccionadas.setText(buscado.getHoras()+"");
            txfDescuentoSeleccionada.setText(buscado.getDescuento()+"");
            lblTipoSeleccionado.setText(buscado.getTipo());
            
        }else{
            JOptionPane.showMessageDialog(this, "Vehículo placa " + placa +" no está en el parqueo","Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    private void actualizarHoras (double horas){
        String placa = txfPlacaSeleccionada.getText();
        
        double horasTotales = parqueo.sumarHorasAVehiculo(placa, horas);
        
        if (horasTotales != -1)
            JOptionPane.showMessageDialog(this, "Horas actualizadas");
        else
            JOptionPane.showMessageDialog(this, "Vehiculo no encontrado");
        
        txaParqueo.setText(parqueo.toString());
    }
    
    private boolean isNumeric (String value){
        try{
            double d = Double.parseDouble(value);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    private void btnActualizarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDescuentoActionPerformed

        String strDescuento = txfDescuento.getText();
        
        if (isNumeric(strDescuento)){
            double descuento = Double.parseDouble(strDescuento);
            int cantidad = parqueo.actualizarDescuentos(descuento);
            txaParqueo.setText(parqueo.toString());
            if (cantidad == 0)
                JOptionPane.showMessageDialog(this, "No hay vehiculos para actualizar");
            else
                JOptionPane.showMessageDialog(this, "Se actualizaron " + cantidad + "vehiculos");
        }else{
            JOptionPane.showMessageDialog(this, "Error. El descuento debe ser un numero");
        }
        
        
        //parqueo.actualizarDescuentos(HEIGHT)
        
    }//GEN-LAST:event_btnActualizarDescuentoActionPerformed

    private void btnDuplicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDuplicarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDuplicarMouseEntered

    private void btnDuplicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDuplicarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDuplicarMouseExited

    private void btnDuplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuplicarActionPerformed
        try{
            String placa = txfPlacaDuplicar.getText();
            String tipo = lblTipoSeleccionado.getText();
            double descuento = Double.parseDouble(txfDescuentoSeleccionada.getText()) ;
            double horas = Double.parseDouble(txfHorasSeleccionadas.getText());
          
            Vehiculo buscado = parqueo.buscarVehiculo(placa);
            System.out.println(tipo);
            if (buscado == null){
            
                Vehiculo nuevo = new Vehiculo(placa, tipo,descuento,horas);
                parqueo.addVehiculo(nuevo);
                txaParqueo.setText(parqueo.toString());
                JOptionPane.showMessageDialog(this, "Vehículo duplicado con éxito","Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "Vehículo placa " + placa +" ya existe en el parqueo","Error", JOptionPane.ERROR_MESSAGE);}
            catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Primero Busque un vehiculo a duplicar","Error", JOptionPane.ERROR_MESSAGE);
                }
        
    }//GEN-LAST:event_btnDuplicarActionPerformed

    private void txfDescuentoSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDescuentoSeleccionadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDescuentoSeleccionadaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String str = parqueo.totalDinero();
        lblCon.setText(str);
    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaParqueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDescuento;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDuplicar;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnRestarHora;
    private javax.swing.JButton btnSumarHora;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblPLaca;
    private javax.swing.JLabel lblPLaca1;
    private javax.swing.JLabel lblPLaca2;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoSeleccionado;
    private javax.swing.JPanel pnlDescuento;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlParqueo;
    private javax.swing.JPanel pnlSeleccion;
    private javax.swing.JTextArea txaParqueo;
    private javax.swing.JTextField txfDescuento;
    private javax.swing.JTextField txfDescuentoSeleccionada;
    private javax.swing.JTextField txfHorasSeleccionadas;
    private javax.swing.JTextField txfPlaca;
    private javax.swing.JTextField txfPlacaDuplicar;
    private javax.swing.JTextField txfPlacaSeleccionada;
    // End of variables declaration//GEN-END:variables
}
