
package tarea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class crud extends javax.swing.JFrame {
 Connection con;
    DefaultTableModel modelo;
    int id ;
    
    
    public crud() {
        initComponents();
        mostrarTodos();
        
    }

   void mostrarTodos(){
       String titulos []={"ID,NOMBRE,DIRECCION,TELEFONO,CORREO,FECHA DE NAC"};
       String registros []= new String[6];
       String query ="select* from persona";
       modelo = new DefaultTableModel (null,titulos);
       PreparedStatement pst;
       Statement st;
       try {
           con= conexion.Open();
           st= con.createStatement();
           ResultSet rs = st.executeQuery(query);
           while (rs.next()) {
               registros[0]=rs.getString("clave");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("domicilio");
                registros[3]=rs.getString("telefono");
                registros[4]=rs.getString("correo_electronico");
                registros[1]=rs.getString("fecha_nacimiento");
                  modelo.addRow(registros);
            }
          TablaDatos.setModel(modelo);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        bnGuarda = new javax.swing.JButton();
        bnModifica = new javax.swing.JButton();
        bnCancelar = new javax.swing.JButton();
        bnSalir = new javax.swing.JButton();
        bnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CLAVE:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("DOMICILIO");

        jLabel4.setText("TELEFONO");

        jLabel5.setText("CORREO");

        jLabel6.setText("FECHA NACIMIENTO");

        bnGuarda.setText("GUARDA");
        bnGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnGuardaActionPerformed(evt);
            }
        });

        bnModifica.setText("MODIFICA");
        bnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnModificaActionPerformed(evt);
            }
        });

        bnCancelar.setText("CANCELAR");
        bnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCancelarActionPerformed(evt);
            }
        });

        bnSalir.setText("SALIR");

        bnBuscar.setText("BUSCAR");
        bnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DIRECCION ", "TELEFONO", "CORREO", "FECHA DE NAC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaDatos);

        jLabel7.setText("BUSCAR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(bnGuarda))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(txtDomicilio)
                            .addComponent(txtNombre)
                            .addComponent(txtCorreo)
                            .addComponent(txtFecha)
                            .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bnCancelar)
                        .addGap(38, 38, 38)
                        .addComponent(bnSalir)
                        .addGap(41, 41, 41)
                        .addComponent(bnModifica)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnGuarda)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnBuscar)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnCancelar)
                    .addComponent(bnSalir)
                    .addComponent(bnModifica))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnGuardaActionPerformed
        String nom, ape, doc, cor,corr,fech;
        nom = txtclave.getText().trim();
        ape = txtNombre.getText().trim();
        doc = txtDomicilio.getText().trim();
        cor = txtTelefono.getText().trim();
        corr = txtCorreo.getText().trim();
        fech = txtFecha.getText().trim();
        if (nom.equals("") || ape.equals("") || doc.equals("") || cor.equals("")|| corr.equals("") || fech.equals("")){
            JOptionPane.showMessageDialog(this, "Los son obligatorios");
        } else {
            String query = "insert into persona(clave,nombre,domicilio,telefono,correo_electronico,fecha_nacimiento) values(?,?,?,?)";
            try {
                con=(com.mysql.jdbc.Connection) conexion.Open();
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, nom);
                pst.setString(2, ape);
                pst.setString(3, doc);
                pst.setString(4, cor);
                pst.setString(5, corr);
                pst.setString(4, fech);
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    mostrarTodos();
                } else {
                    JOptionPane.showMessageDialog(null, "Registro fallido");
                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_bnGuardaActionPerformed

    private void bnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnBuscarActionPerformed
      if (txtBuscar.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingrese el documento del aprendiz");
        } else {
            String doc = txtBuscar.getText();
            try {
                 con= conexion.Open();
                String query;
                query = "SELECT * FROM escuela.persona; where clave=?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, doc);

                ResultSet rta;
                rta= pst.executeQuery();
                rta.next();
                txtclave.setText(rta.getString("clave"));
                txtNombre.setText(rta.getString("nombre"));
                txtDomicilio.setText(rta.getString("domicilio"));
                txtTelefono.setText(rta.getString("telefono"));
                txtCorreo.setText(rta.getString("correo_electronico"));
                txtFecha.setText(rta.getString("correo_electronico"));
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        
    }    

    

    }//GEN-LAST:event_bnBuscarActionPerformed

    private void bnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnModificaActionPerformed
        String nom, ape, doc, cor,corr,fech;
        nom = txtclave.getText();
        ape = txtNombre.getText();
        doc = txtDomicilio.getText();
        cor = txtTelefono.getText();
          corr = txtCorreo.getText();
          fech = txtFecha.getText();

        String query = "update  persona set regNombre=?,regApellido=?,regDocumento=?,regCorreo=? where regId =?";
        try {
            con = conexion.Open();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nom);
            pst.setString(2, ape);
            pst.setString(3, doc);
            pst.setString(4, cor);
             pst.setString(5, corr);
              pst.setString(7, fech);
            pst.setInt(8, id);

            int rs = pst.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Actualizacion fallida");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_bnModificaActionPerformed

    private void bnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton bnBuscar;
    private javax.swing.JButton bnCancelar;
    private javax.swing.JButton bnGuarda;
    private javax.swing.JButton bnModifica;
    private javax.swing.JButton bnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtclave;
    // End of variables declaration//GEN-END:variables

   
}
