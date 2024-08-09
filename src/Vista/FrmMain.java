
package Vista;

import Modelo.EstudianteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brand
 */
public class FrmMain extends javax.swing.JFrame {
    
    EstudianteDAO estudiante = new EstudianteDAO();
    
    public FrmMain() {
        initComponents ();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblParcial1 = new javax.swing.JLabel();
        lblParcial2 = new javax.swing.JLabel();
        lblParcial3 = new javax.swing.JLabel();
        spnParcial1 = new javax.swing.JSpinner();
        spnParcial2 = new javax.swing.JSpinner();
        spnParcial3 = new javax.swing.JSpinner();
        lblNotaFinal = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtNotaFinal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        spnEdad = new javax.swing.JSpinner();
        btnCancelar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del estudiante:"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1453, 688));
        setPreferredSize(new java.awt.Dimension(1453, 688));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 962, 10));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 90, 36, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 846, 1712, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE CALIFICACIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 690, 50));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Calificaciones:"));

        lblParcial1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParcial1.setText("I PARCIAL (20%):");
        lblParcial1.setToolTipText("");

        lblParcial2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParcial2.setText("II PARCIAL (30%):");
        lblParcial2.setToolTipText("");

        lblParcial3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParcial3.setText("III PARCIAL (50%):");
        lblParcial3.setToolTipText("");

        spnParcial1.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        spnParcial2.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        spnParcial3.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        lblNotaFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNotaFinal.setText("NOTA FINAL:");
        lblNotaFinal.setToolTipText("");

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtNotaFinal.setEditable(false);
        txtNotaFinal.setEnabled(false);
        txtNotaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblParcial3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnParcial3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblParcial2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblParcial1)
                                .addGap(42, 42, 42)
                                .addComponent(spnParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblNotaFinal)
                        .addGap(67, 67, 67)
                        .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParcial1)
                    .addComponent(spnParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParcial2)
                    .addComponent(spnParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParcial3)
                    .addComponent(spnParcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNotaFinal)
                    .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lblParcial1.getAccessibleContext().setAccessibleName("lblParcial1");
        lblParcial2.getAccessibleContext().setAccessibleName("lblParcial2");
        lblParcial3.getAccessibleContext().setAccessibleName("lblParcial3");
        spnParcial1.getAccessibleContext().setAccessibleName("spnParcial1");
        spnParcial2.getAccessibleContext().setAccessibleName("spnParcial2");
        spnParcial3.getAccessibleContext().setAccessibleName("spnParcial3");
        spnParcial3.getAccessibleContext().setAccessibleDescription("");
        lblNotaFinal.getAccessibleContext().setAccessibleName("lblNotaFinal");
        btnCalcular.getAccessibleContext().setAccessibleName("btnCalcular");
        txtNotaFinal.getAccessibleContext().setAccessibleName("txtNotaFinal");

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 490, 220));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle:"));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("BUSCAR POR NOMBRE: ");
        jLabel9.setToolTipText("");

        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "EDAD", "I PARCIAL", "II PARCIAL", "III PARCIAL", "NOTA FINAL", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstudiantes);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRefrescar.setText("REFRESCAR");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel9.getAccessibleContext().setAccessibleName("lblBuscarNombre");
        txtBuscarNombre.getAccessibleContext().setAccessibleName("txtBuscarNombre");
        btnBuscar.getAccessibleContext().setAccessibleName("btnBuscar");

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 820, 540));

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del estudiante:"));

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID.setText("ID:");
        lblID.setToolTipText("");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("NOMBRE:");
        lblNombre.setToolTipText("");

        lblEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEdad.setText("EDAD:");
        lblEdad.setToolTipText("");

        txtID.setEditable(false);
        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 150, 1));

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addComponent(lblNombre)
                    .addComponent(lblEdad))
                .addGap(38, 38, 38)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(txtID)
                    .addComponent(spnEdad))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        lblID.getAccessibleContext().setAccessibleName("lblID");
        lblNombre.getAccessibleContext().setAccessibleName("lblNombre");
        lblEdad.getAccessibleContext().setAccessibleName("lblEdad");
        txtID.getAccessibleContext().setAccessibleName("txtID");
        txtNombre.getAccessibleContext().setAccessibleName("txtNombre");
        spnEdad.getAccessibleContext().setAccessibleName("spnEdad");

        getContentPane().add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 100, 30));

        btnGuardar1.setText("GUARDAR");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 100, 30));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 100, 30));

        getAccessibleContext().setAccessibleName("frmMain");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    // calcular las notas de txtParcial1, txtParcial2, txtParcial3
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       double Parcial1 = ((Double) spnParcial1.getValue()).doubleValue();
       double Parcial2 = ((Double) spnParcial2.getValue()).doubleValue();
       double Parcial3 = ((Double) spnParcial3.getValue()).doubleValue();
       
       double notaFinal = (Parcial1 + Parcial2 + Parcial3)/3;
       txtNotaFinal.setText(String.valueOf(notaFinal));
       
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNotaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaFinalActionPerformed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
    
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    
    // buscar y popular por nombre
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String filtroNombre = txtBuscarNombre.getText();
        
    DefaultTableModel tabla = (DefaultTableModel) tblEstudiantes.getModel();
    tabla.setRowCount(0);

    List<Object[]> notas = estudiante.leerNotasNombre(filtroNombre);

    for (Object[] nota : notas) {
            tabla.addRow(nota);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        
        String nombreEstudiante = " ";
        int Edad = 0;
        double Parcial1 = 0.0;
       double Parcial2 = 0.0;
       double Parcial3 = 0.0;

        // obtenemos y verificamos el nombre
        try{
            nombreEstudiante = txtNombre.getText();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "El nombre del estudiante es incorrecto / vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos la edad
        try{
            Edad = ((Integer) spnEdad.getValue()).intValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La edad del estudiante es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos el parcial 1
        try{
            Parcial1 = ((Double) spnParcial1.getValue()).doubleValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La nota del pacial 1 es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos el parcial 2
        try{
            Parcial2 = ((Double) spnParcial2.getValue()).doubleValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La nota del pacial 2 es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos el parcial 3
        try{
            Parcial3 = ((Double) spnParcial3.getValue()).doubleValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La nota del pacial 3 es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // llamamos a dao para subir el report a la DB
        try{
            estudiante.agregarNota(nombreEstudiante, Edad, Parcial1, Parcial2, Parcial3);
            JOptionPane.showMessageDialog(null, "Cambios guardados con exito, refresque para ver los cambios !");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error al subir la entrada a la base de datos, revise e intente nuevamente...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
        llenarTabla();
        txtBuscarNombre.setText("");
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtID.setText("");
        txtNombre.setText("");
        spnEdad.setValue(1);
        spnParcial1.setValue(1);
        spnParcial2.setValue(1);
        spnParcial3.setValue(1);
        txtNotaFinal.setText("0");
    }//GEN-LAST:event_btnCancelarActionPerformed

    // rellenar txtFields cuando clickeamos en el registro de la tabla
    private void tblEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstudiantesMouseClicked
        int fila = tblEstudiantes.rowAtPoint(evt.getPoint());
        if(fila>=0) {
            Object idNota = tblEstudiantes.getValueAt(fila, 0);
            System.out.println("ID Nota: " + idNota);
            
            List<Object[]> datosNota = estudiante.leerNotasID(String.valueOf(idNota));
            
            if(!datosNota.isEmpty()) {
                Object[] registro = datosNota.get(0);
                
                txtID.setText(String.valueOf(registro[0]));
                txtNombre.setText(String.valueOf(registro[1]));
                spnEdad.setValue(Integer.parseInt(String.valueOf(registro[2])));
                spnParcial1.setValue(Double.parseDouble(String.valueOf(registro[3])));
                spnParcial2.setValue(Double.parseDouble(String.valueOf(registro[4])));
                spnParcial3.setValue(Double.parseDouble(String.valueOf(registro[5])));
                txtNotaFinal.setText(String.valueOf(registro[6]));
            }
        }
    }//GEN-LAST:event_tblEstudiantesMouseClicked

    // guardar nuevos datos de estudainte y notas
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String nombreEstudiante = " ";
        int Edad = 0;
        double Parcial1 = 0.0;
       double Parcial2 = 0.0;
       double Parcial3 = 0.0;
       String idNota = txtID.getText();

        // obtenemos y verificamos el nombre
        try{
            nombreEstudiante = txtNombre.getText();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "El nombre del estudiante es incorrecto / vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos la edad
        try{
            Edad = ((Integer) spnEdad.getValue()).intValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La edad del estudiante es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos el parcial 1
        try{
            Parcial1 = ((Double) spnParcial1.getValue()).doubleValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La nota del pacial 1 es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos el parcial 2
        try{
            Parcial2 = ((Double) spnParcial2.getValue()).doubleValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La nota del pacial 2 es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // obtenemos y verificamos el parcial 3
        try{
            Parcial3 = ((Double) spnParcial3.getValue()).doubleValue();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "La nota del pacial 3 es incorrecta / vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // llamamos a dao para subir el report a la DB
        try{
            estudiante.actualizarNotaEstudiante(nombreEstudiante, Edad, idNota, Parcial1, Parcial2, Parcial3);
            JOptionPane.showMessageDialog(null, "Cambios guardados con exito, refresque para ver los cambios !");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error al subir la entrada a la base de datos, revise e intente nuevamente...", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnEditarActionPerformed

    // eliminar por ID, osea, la linea seleccionada de la tabla
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idNota = txtID.getText();
        
        try {
            estudiante.eliminarNota(idNota);
            JOptionPane.showMessageDialog(null, "Cambios guardados con exito, refresque para ver los cambios !");
            txtID.setText("");
        txtNombre.setText("");
        spnEdad.setValue(1);
        spnParcial1.setValue(1);
        spnParcial2.setValue(1);
        spnParcial3.setValue(1);
        txtNotaFinal.setText("0");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al eliminar la entrada en la base de datos, revise e intente nuevamente...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    // metodo para popular la tabla
    public void llenarTabla() {
    DefaultTableModel tabla = (DefaultTableModel) tblEstudiantes.getModel();
    tabla.setRowCount(0);

    List<Object[]> notas = estudiante.leerNotas();

    for (Object[] nota : notas) {
            tabla.addRow(nota);
    }
}
    
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNotaFinal;
    private javax.swing.JLabel lblParcial1;
    private javax.swing.JLabel lblParcial2;
    private javax.swing.JLabel lblParcial3;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnParcial1;
    private javax.swing.JSpinner spnParcial2;
    private javax.swing.JSpinner spnParcial3;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNotaFinal;
    // End of variables declaration//GEN-END:variables
}
