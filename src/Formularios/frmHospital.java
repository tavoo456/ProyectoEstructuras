/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;
import Entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimmy
 */
public class frmHospital extends javax.swing.JFrame {

    /**
     * Creates new form frmHospital
     */
    
    BancoDeDatos datos;            
    GestorDoctores doctores;
    DefaultTableModel modeloDoctor;
    DefaultTableModel modeloPaciente;
    SimpleDateFormat formatoFecha;
    
    public frmHospital(GestorDoctores doctores) {
        initComponents();

        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        datos = new BancoDeDatos();
        this.doctores = doctores;
        modeloDoctor = (DefaultTableModel) this.jtDoctor.getModel();
        modeloPaciente = (DefaultTableModel) this.jtPaciente.getModel(); 
        
        this.btnBuscarDoctor.setEnabled(false);
        this.btnTotalizar.setEnabled(false);
        this.btnRecargar.setEnabled(false);
        
        this.cbEstado.addItem("Leve");
        this.cbEstado.addItem("Moderado");
        this.cbEstado.addItem("Grave");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnTotalizar = new javax.swing.JButton();
        btnBuscarDoctor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarDoctor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPaciente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDoctor = new javax.swing.JTable();
        cbEstado = new javax.swing.JComboBox<>();
        lblNumPacientes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCargarDatos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnRecargar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCantidadPacientes = new javax.swing.JTextField();
        txtCantidadDoctores = new javax.swing.JTextField();
        btnAdministrarDatos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnDetallesPacientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Totalizar por estado del paciente:");

        btnTotalizar.setText("Totalizar");
        btnTotalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalizarActionPerformed(evt);
            }
        });

        btnBuscarDoctor.setText("Buscar");
        btnBuscarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDoctorActionPerformed(evt);
            }
        });

        jLabel6.setText("Buscar Doctor por ID:");

        jLabel1.setText("Doctores:");

        jLabel2.setText("Pacientes:");

        jtPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Padecimiento", "Estado", "Fecha de ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPaciente.setName("jtPaciente"); // NOI18N
        jScrollPane1.setViewportView(jtPaciente);

        jtDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDoctor.setName(""); // NOI18N
        jtDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDoctorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtDoctor);

        lblNumPacientes.setText("Pacientes");

        jLabel3.setText("Generar datos:");

        btnCargarDatos.setText("Generar");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        jLabel7.setText("Recargar tablas:");

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad doctores:");

        jLabel8.setText("Cantidad pacientes:");

        btnAdministrarDatos.setText("Administrar datos");
        btnAdministrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarDatosActionPerformed(evt);
            }
        });

        jLabel10.setText("Procesar de la máquina:");

        jLabel11.setText("Sistema operativo:");

        btnDetallesPacientes.setText("Detalles de los pacientes");
        btnDetallesPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesPacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTotalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarDoctor))
                            .addComponent(lblNumPacientes)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRecargar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDetallesPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdministrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidadDoctores)
                                    .addComponent(txtCantidadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCantidadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnCargarDatos))
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarDoctor)
                    .addComponent(txtBuscarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumPacientes)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnRecargar))
                .addGap(18, 18, 18)
                .addComponent(btnAdministrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetallesPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDoctorActionPerformed
        //TODO add your handling code here:
        this.modeloDoctor.getDataVector().removeAllElements();
        this.modeloPaciente.setRowCount(0);
        
        String busquedaDoctor = this.txtBuscarDoctor.getText().toUpperCase();
        
        for (int i = 0; i < this.doctores.obtenerListaDoctores().size(); i++){
            if(busquedaDoctor.equals(Integer.toString(this.doctores.obtenerListaDoctores().get(i).ID))){
                String[] registroDoctores = {
                   Integer.toString(this.doctores.obtenerListaDoctores().get(i).ID), 
                   this.doctores.obtenerListaDoctores().get(i).nombre, 
                   this.doctores.obtenerListaDoctores().get(i).especialidad
                };
                
                modeloDoctor.addRow(registroDoctores);
           }   
        }
        
        if(modeloDoctor.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "El ID ingresado no pertenece a ningún doctor", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Este doctor tiene " + doctores.obtenerListaDoctores().get(Integer.parseInt(busquedaDoctor) - 1).listaPacientes.size() + " pacientes", "Cantidad de pacientes", JOptionPane.INFORMATION_MESSAGE);
        }
        
        txtBuscarDoctor.setText("");
    }//GEN-LAST:event_btnBuscarDoctorActionPerformed

    private void btnTotalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalizarActionPerformed
        // TODO add your handling code here:
        int contadorPacientes = 0;
        String opcionSeleccionada = this.cbEstado.getSelectedItem().toString();
        
        for(int i = 0; i < this.doctores.obtenerListaDoctores().size(); i++){
            for(int j = 0; j < this.doctores.obtenerListaDoctores().get(i).listaPacientes.size(); j++){
                if(opcionSeleccionada.equals(this.doctores.obtenerListaDoctores().get(i).listaPacientes.get(j).estado)){
                    contadorPacientes++;
                }
            }
        }
        
        lblNumPacientes.setText("Número de pacientes en estado " + opcionSeleccionada + ": " + contadorPacientes);
    }//GEN-LAST:event_btnTotalizarActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        // TODO add your handling code here:
        
        int cantidadDoctores = Integer.parseInt(txtCantidadDoctores.getText());
        int cantidadPacientes = Integer.parseInt(txtCantidadPacientes.getText());
        int IDpacientes = 1;
        
        for(int i=0; i<cantidadDoctores; i++)
        {
            this.doctores.agregarDoctores(i+1, datos.Seleccionar(0), datos.Seleccionar(2));
            for(int j=0; j<cantidadPacientes; j++)
            {
                try {
                    this.doctores.obtenerListaDoctores().get(i).listaPacientes.add(
                            new Paciente(
                                    IDpacientes, datos.Seleccionar(0),
                                    datos.Seleccionar(1), datos.Seleccionar(3),
                                    datos.Seleccionar(4)
                            )
                    );
                    
                    IDpacientes++;
                } 
                catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Hubo un error al generar la fechas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            String[] registroDoctores = {
                Integer.toString(this.doctores.obtenerListaDoctores().get(i).ID), 
                this.doctores.obtenerListaDoctores().get(i).nombre, 
                this.doctores.obtenerListaDoctores().get(i).especialidad
            };
            
            modeloDoctor.addRow(registroDoctores);
        }
        
        this.btnRecargar.setEnabled(true);
        this.btnBuscarDoctor.setEnabled(true);
        this.btnTotalizar.setEnabled(true);
        this.btnCargarDatos.setEnabled(false);
        this.btnAdministrarDatos.setEnabled(true);
        this.btnDetallesPacientes.setEnabled(true);
        
        this.txtCantidadDoctores.setText(null);
        this.txtCantidadDoctores.setEnabled(false);
        this.txtCantidadPacientes.setText(null);
        this.txtCantidadPacientes.setEnabled(false);
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void jtDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDoctorMouseClicked
        // TODO add your handling code here:
        int indiceFila = this.jtDoctor.getSelectedRow();
        String ID = jtDoctor.getValueAt(indiceFila, 0).toString();
        int indiceDoctor = Integer.parseInt(ID) - 1;
        int cantidadPacientes = this.doctores.obtenerListaDoctores().get(indiceDoctor).listaPacientes.size();
        
        modeloPaciente.getDataVector().removeAllElements();
        
        for(int i = 0; i < cantidadPacientes; i++){
            String [] registroPacientes = {
                Integer.toString(doctores.obtenerListaDoctores().get(indiceDoctor).listaPacientes.get(i).ID),
                doctores.obtenerListaDoctores().get(indiceDoctor).listaPacientes.get(i).nombre,
                doctores.obtenerListaDoctores().get(indiceDoctor).listaPacientes.get(i).padecimiento,
                doctores.obtenerListaDoctores().get(indiceDoctor).listaPacientes.get(i).estado,
                formatoFecha.format(doctores.obtenerListaDoctores().get(indiceDoctor).listaPacientes.get(i).fechaIngreso)
            };
            
            modeloPaciente.addRow(registroPacientes);
        }        
    }//GEN-LAST:event_jtDoctorMouseClicked

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
        this.modeloDoctor.getDataVector().removeAllElements();
        this.modeloPaciente.setRowCount(0);
        
        for(int i=0; i<this.doctores.obtenerListaDoctores().size(); i++)
        {
            String[] registroDoctores = {
                Integer.toString(this.doctores.obtenerListaDoctores().get(i).ID), 
                this.doctores.obtenerListaDoctores().get(i).nombre, 
                this.doctores.obtenerListaDoctores().get(i).especialidad
            };
            modeloDoctor.addRow(registroDoctores);
        }
    }//GEN-LAST:event_btnRecargarActionPerformed

 
    private void btnAdministrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarDatosActionPerformed
        // TODO add your handling code here:
        frmAdministrar formAdministrar = new frmAdministrar(doctores);
        formAdministrar.setVisible(true);
    }//GEN-LAST:event_btnAdministrarDatosActionPerformed

    private void btnDetallesPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesPacientesActionPerformed
        // TODO add your handling code here:
        frmDetalles formDetalles = null;
        try {
            formDetalles = new frmDetalles(doctores);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a los detalles de los pacientes", "Error", JOptionPane.ERROR_MESSAGE);
        }
        formDetalles.setVisible(true);
    }//GEN-LAST:event_btnDetallesPacientesActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        GestorDoctores doctores = new GestorDoctores();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHospital(doctores).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrarDatos;
    private javax.swing.JButton btnBuscarDoctor;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnDetallesPacientes;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtDoctor;
    private javax.swing.JTable jtPaciente;
    private javax.swing.JLabel lblNumPacientes;
    private javax.swing.JTextField txtBuscarDoctor;
    private javax.swing.JTextField txtCantidadDoctores;
    private javax.swing.JTextField txtCantidadPacientes;
    // End of variables declaration//GEN-END:variables
}
