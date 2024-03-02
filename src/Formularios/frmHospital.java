/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;
import Entidades.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimmy
 */
public class frmHospital extends javax.swing.JFrame {

    /**
     * Creates new form frmHospital
     */
            
    ArrayList<Doctor> listadoDoctores;
    DefaultTableModel modeloDoctor;
    DefaultTableModel modeloPaciente;
    DefaultTableModel modeloPacienteVacio; 
    
    public frmHospital() {
        initComponents();
        
        listadoDoctores = new ArrayList<>();
        modeloDoctor = (DefaultTableModel) this.jtDoctor.getModel();
        modeloPaciente = (DefaultTableModel) this.jtPaciente.getModel(); 
        
        this.btnBuscarDoctor.setEnabled(false);
        this.btnBuscarPaciente.setEnabled(false);
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

        btnBuscarPaciente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnTotalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarDoctor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarPaciente = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Totalizar por estado del paciente:");

        btnTotalizar.setText("Totalizar");
        btnTotalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar Paciente:");

        btnBuscarDoctor.setText("Buscar");
        btnBuscarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDoctorActionPerformed(evt);
            }
        });

        jLabel6.setText("Buscar Doctor:");

        jLabel1.setText("Doctores:");

        jLabel2.setText("Pacientes:");

        jtPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Padecimiento", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
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
                false, true, false
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

        jLabel3.setText("Cargar datos:");

        btnCargarDatos.setText("Datos");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtBuscarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscarDoctor))
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscarPaciente)))
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnTotalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblNumPacientes))
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargarDatos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRecargar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(347, 633, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 630, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTotalizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumPacientes)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarDoctor)
                            .addComponent(txtBuscarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarPaciente))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnCargarDatos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnRecargar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDoctorActionPerformed
        //TODO add your handling code here:
        this.modeloDoctor.getDataVector().removeAllElements();
        this.modeloPaciente.setRowCount(0);
        this.btnBuscarPaciente.setEnabled(false);
        
        String busquedaDoctor = this.txtBuscarDoctor.getText().toUpperCase();
        
        for (int i = 0; i < this.listadoDoctores.size(); i++){
            if(busquedaDoctor.equals(listadoDoctores.get(i).GetNombre().toUpperCase())){
                String[] registroDoctores = {
                    this.listadoDoctores.get(i).GetID(), 
                    this.listadoDoctores.get(i).GetNombre(), 
                    this.listadoDoctores.get(i).GetEspecialidad()
                };
                modeloDoctor.addRow(registroDoctores);
            }            
        }
        btnBuscarPaciente.setEnabled(false);
    }//GEN-LAST:event_btnBuscarDoctorActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        // TODO add your handling code here:
        int indiceListaDoctor = this.jtDoctor.getSelectedRow();
        this.modeloPaciente.getDataVector().removeAllElements();
        
        String busquedaPaciente = this.txtBuscarPaciente.getText().toUpperCase();
        
        for(int i = 0; i < listadoDoctores.get(indiceListaDoctor).GetListaPacientes().size(); i++){
            if(busquedaPaciente.equals(listadoDoctores.get(indiceListaDoctor).GetListaPacientes().get(i).GetNombre().toUpperCase())){
                String[] registroPacientes = {
                    this.listadoDoctores.get(indiceListaDoctor).GetListaPacientes().get(i).GetID(),
                    this.listadoDoctores.get(indiceListaDoctor).GetListaPacientes().get(i).GetNombre(),
                    this.listadoDoctores.get(indiceListaDoctor).GetListaPacientes().get(i).GetPadecimiento(),
                    this.listadoDoctores.get(indiceListaDoctor).GetListaPacientes().get(i).GetPadecimiento()
                }; 
                modeloPaciente.addRow(registroPacientes);
            }            
        }
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnTotalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalizarActionPerformed
        // TODO add your handling code here:
        int contadorPacientes = 0;
        String opcionSeleccionada = this.cbEstado.getSelectedItem().toString();
        
        for(int i = 0; i < this.listadoDoctores.size(); i++){
            for(int j = 0; j < this.listadoDoctores.get(i).GetListaPacientes().size(); j++){
                if(opcionSeleccionada.equals(this.listadoDoctores.get(i).GetListaPacientes().get(j).GetEstado())){
                    contadorPacientes++;
                }
            }
        }
        
        lblNumPacientes.setText("Número de pacientes en estado " + opcionSeleccionada.toLowerCase() + ": " + contadorPacientes);
    }//GEN-LAST:event_btnTotalizarActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        // TODO add your handling code here:
        this.listadoDoctores.add(new Doctor("2015-DS-566", "Pedro Alejandro Duarte Suarez", "Cirujano"));
        this.listadoDoctores.get(0).SetListaPacientes(new Paciente("2018-Ru-1003", "Rubén Ernesto García Sánchez", "Diabetes Tipo 2", "Moderado"));
        this.listadoDoctores.get(0).SetListaPacientes(new Paciente("2023-QA-4890", "Quetzalli Anabel Rodríguez Aquino", "Dolor de Espalda", "Moderado"));
        this.listadoDoctores.get(0).SetListaPacientes(new Paciente("2016-AO-6478", "Ana Olivia Orozco Olivares", "Dolor de Oídos", "Moderado"));
        this.listadoDoctores.get(0).SetListaPacientes(new Paciente("2017-JM-2359", "Juan Manuel Martínez Juárez", "Fiebre", "Leve"));
        this.listadoDoctores.get(0).SetListaPacientes(new Paciente("2018-PV-7612", "Pedro Valdez Pérez Villanueva", "Ansiedad", "Moderado"));
                
        this.listadoDoctores.add(new Doctor("2017-GT-8943", "Raul Gustavo Téllez Galindo", "Pediatra"));
        this.listadoDoctores.get(1).SetListaPacientes(new Paciente("2016-AO-6478", "Ana Olivia Orozco Olivares", "Dolor de Oídos", "Moderado"));
        this.listadoDoctores.get(1).SetListaPacientes(new Paciente("2022-VB-2351", "Víctor Benito Vega Barrientos", "Gripe", "Moderado"));
        this.listadoDoctores.get(1).SetListaPacientes(new Paciente("2019-EV-7810", "Elena Victoria Esquivel Villanueva", "Fiebre", "Leve"));
        this.listadoDoctores.get(1).SetListaPacientes(new Paciente("2020-PB-1845", "Patricia Belén Pacheco Bravo", "Bronquitis", "Moderado"));         
        this.listadoDoctores.get(1).SetListaPacientes(new Paciente("2015-GH-3204", "Gloria Hilda Gutiérrez Hernández", "Insomnio", "Leve"));
        
        this.listadoDoctores.add(new Doctor("2022-MG-1102", "Miguel Ángel González Mendoza", "Gastroenterólogo"));
        this.listadoDoctores.get(2).SetListaPacientes(new Paciente("2018-JC-4529", "José Carlos Juárez Cordero", "Acidez Estomacal", "Moderado"));
        this.listadoDoctores.get(2).SetListaPacientes(new Paciente("2016-AR-5987", "Ana Rosa Álvarez Ramos", "Indigestión", "Leve"));
        this.listadoDoctores.get(2).SetListaPacientes(new Paciente("2024-OC-3094", "Omar Cruz Ortiz", "Úlcera Péptica", "Grave"));
        this.listadoDoctores.get(2).SetListaPacientes(new Paciente("2017-LR-7012", "Luis Ricardo León Ramírez", "Dolor Abdominal", "Leve"));
        
        this.listadoDoctores.add(new Doctor("2015-RP-6713", "Ricardo Pablo Rodríguez Pacheco", "Neurólogo"));
        this.listadoDoctores.get(3).SetListaPacientes(new Paciente("2019-AP-5432", "Ana Paula Álvarez Pérez", "Migraña", "Moderado"));
        this.listadoDoctores.get(3).SetListaPacientes(new Paciente("2021-EC-8765", "Eduardo Carlos Escobedo Castillo", "Epilepsia", "Moderado"));
        this.listadoDoctores.get(3).SetListaPacientes(new Paciente("2018-JR-2345", "Juan Ramón Juárez Ramírez", "Parkinson", "Moderado"));
        this.listadoDoctores.get(3).SetListaPacientes(new Paciente("2020-OM-9087", "Oscar Manuel Ortiz Medina", "Esclerosis Múltiple", "Moderado"));
        
        this.listadoDoctores.add(new Doctor("2015-DS-564", "Pedro Alejandro Duarte Suarez", "Gastroenterólogo"));        
        this.listadoDoctores.get(4).SetListaPacientes(new Paciente("2016-JC-4544", "Juan Carlos Juárez Cordero", "Acidez Estomacal", "Moderado"));
        
        for(int i=0; i<this.listadoDoctores.size(); i++)
        {
            String[] registroDoctores = {
                this.listadoDoctores.get(i).GetID(), 
                this.listadoDoctores.get(i).GetNombre(), 
                this.listadoDoctores.get(i).GetEspecialidad()
            };
            modeloDoctor.addRow(registroDoctores);
        }       
        
        this.btnCargarDatos.setEnabled(false);
        this.btnBuscarDoctor.setEnabled(true);
        this.btnTotalizar.setEnabled(true);
        this.btnRecargar.setEnabled(true);
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void jtDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDoctorMouseClicked
        // TODO add your handling code here:
        int indiceDoctor = this.jtDoctor.getSelectedRow();
        int cantidadPacientes = this.listadoDoctores.get(indiceDoctor).GetListaPacientes().size();
        modeloPaciente.getDataVector().removeAllElements();
        
        for(int i = 0; i<cantidadPacientes; i++){
            String [] registroPacientes = {
                this.listadoDoctores.get(indiceDoctor).GetListaPacientes().get(i).GetID(), 
                this.listadoDoctores.get(indiceDoctor).GetListaPacientes().get(i).GetNombre(),            
                this.listadoDoctores.get(indiceDoctor).GetListaPacientes().get(i).GetPadecimiento(), 
                this.listadoDoctores.get(indiceDoctor).GetListaPacientes().get(i).GetEstado()
            };
            modeloPaciente.addRow(registroPacientes);
        }
        
        btnBuscarPaciente.setEnabled(true);
    }//GEN-LAST:event_jtDoctorMouseClicked

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
        this.modeloDoctor.getDataVector().removeAllElements();
        this.modeloPaciente.setRowCount(0);
        
        for(int i=0; i<this.listadoDoctores.size(); i++)
        {
            String[] registroDoctores = {
                this.listadoDoctores.get(i).GetID(), 
                this.listadoDoctores.get(i).GetNombre(), 
                this.listadoDoctores.get(i).GetEspecialidad()
            };
            modeloDoctor.addRow(registroDoctores);
        }
        
        btnBuscarPaciente.setEnabled(false);
        txtBuscarDoctor.setText("");
        txtBuscarPaciente.setText("");
    }//GEN-LAST:event_btnRecargarActionPerformed

    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDoctor;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtDoctor;
    private javax.swing.JTable jtPaciente;
    private javax.swing.JLabel lblNumPacientes;
    private javax.swing.JTextField txtBuscarDoctor;
    private javax.swing.JTextField txtBuscarPaciente;
    // End of variables declaration//GEN-END:variables
}