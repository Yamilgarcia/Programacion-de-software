/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosestudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
/**
 *
 * @author PC31-B5
 */
public class NewJInternalFrame extends javax.swing.JInternalFrame {
    
    ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();


    
    public NewJInternalFrame() {
        initComponents();
    }
    
    private void LimpiarCampo(){
        this.jTextFieldCarnet.setText("");
        this.jTextFieldNombre.setText("");
        this.jTextFieldApellido.setText("");
        this.jTextFieldCarrera.setText("");
        this.jTextFieldNivel.setText("");
        this.jTextAreaEstudiantes.setText("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        carnet = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        nivel = new javax.swing.JLabel();
        jTextFieldCarnet = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCarrera = new javax.swing.JTextField();
        jTextFieldNivel = new javax.swing.JTextField();
        BotAgregar = new javax.swing.JButton();
        BotLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEstudiantes = new javax.swing.JTextArea();
        VerEstudiante = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 0, 204));
        Titulo.setText("Datos Estudiante");

        carnet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        carnet.setForeground(new java.awt.Color(51, 0, 204));
        carnet.setText("Carnet");

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(51, 0, 204));
        Nombre.setText("Nombre");

        Carrera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Carrera.setForeground(new java.awt.Color(51, 0, 204));
        Carrera.setText("Carrera");

        Apellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(51, 0, 204));
        Apellido.setText("Apellido");

        nivel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nivel.setForeground(new java.awt.Color(51, 0, 204));
        nivel.setText("Nivel");

        jTextFieldCarnet.setText("jTextFieldCarnet");

        jTextFieldNombre.setText("jTextFieldNombre");

        jTextFieldApellido.setText("jTextFieldApellido");

        jTextFieldCarrera.setText("jTextFieldCarrera");

        jTextFieldNivel.setText("jTextFieldNivel");

        BotAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotAgregar.setForeground(new java.awt.Color(51, 0, 204));
        BotAgregar.setText("Agregar");
        BotAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAgregarActionPerformed(evt);
            }
        });

        BotLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotLimpiar.setForeground(new java.awt.Color(51, 0, 204));
        BotLimpiar.setText("Limpiar");
        BotLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotLimpiarActionPerformed(evt);
            }
        });

        jTextAreaEstudiantes.setColumns(20);
        jTextAreaEstudiantes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaEstudiantes);

        VerEstudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VerEstudiante.setForeground(new java.awt.Color(51, 0, 204));
        VerEstudiante.setText("Ver Estudiante");
        VerEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(carnet)
                                    .addGap(34, 34, 34)
                                    .addComponent(jTextFieldCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Apellido)
                                        .addComponent(Carrera)
                                        .addComponent(nivel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(BotAgregar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BotLimpiar))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(VerEstudiante)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carnet)
                    .addComponent(jTextFieldCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carrera)
                    .addComponent(jTextFieldCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nivel)
                    .addComponent(jTextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotAgregar)
                    .addComponent(BotLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerEstudiante)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAgregarActionPerformed
        String CarneT=this.jTextFieldCarnet.getText();
        String nombrE=this.jTextFieldNombre.getText();
        String ApellidO=this.jTextFieldApellido.getText();
        String CarrerA=this.jTextFieldCarrera.getText();
        String NiveL=this.jTextFieldNivel.getText();
        
        
        try{
            
            double car= Double.parseDouble(CarneT);
            
            Estudiante estudiante = new Estudiante(car,nombrE,apellidoS,CarreA,NiveL);
            this.LimpiarCampo();
            JOptionPane.showMessageDialog(null, "Datos Agregado Correctamente");
        }
        
        catch (Exception e)
            
            
    }//GEN-LAST:event_BotAgregarActionPerformed

    private void BotLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotLimpiarActionPerformed
        this.LimpiarCampo();
    }//GEN-LAST:event_BotLimpiarActionPerformed

    private void VerEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerEstudianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton BotAgregar;
    private javax.swing.JButton BotLimpiar;
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerEstudiante;
    private javax.swing.JLabel carnet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaEstudiantes;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCarnet;
    private javax.swing.JTextField jTextFieldCarrera;
    private javax.swing.JTextField jTextFieldNivel;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JLabel nivel;
    // End of variables declaration//GEN-END:variables
}
