/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author Melvin
 */
public class insertUsuario extends javax.swing.JFrame {

    /**
     * Creates new form insertUsuario
     */
    public insertUsuario() {
        initComponents();
        lbl_ID2.setText("1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_InsertUsuario = new javax.swing.JLabel();
        lbl_ID1 = new javax.swing.JLabel();
        lbl_ID2 = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        tfd_Nombre = new javax.swing.JTextField();
        lbl_ROL = new javax.swing.JLabel();
        cb_ROL = new javax.swing.JComboBox<>();
        lbl_Usuario = new javax.swing.JLabel();
        tfd_Usuario = new javax.swing.JTextField();
        lbl_Contrasena = new javax.swing.JLabel();
        tfd_Contrasena = new javax.swing.JTextField();
        btn_InsertUsuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_InsertUsuario.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertUsuario.setText("Insert Usuario");
        getContentPane().add(lbl_InsertUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 33, -1, -1));

        lbl_ID1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID1.setText("ID");
        getContentPane().add(lbl_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 110, -1, -1));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID2.setText("jLabel3");
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 110, -1, -1));

        lbl_Nombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 177, -1, -1));

        tfd_Nombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 175, 110, -1));

        lbl_ROL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ROL.setText("ROL");
        getContentPane().add(lbl_ROL, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 251, -1, -1));

        cb_ROL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador" }));
        getContentPane().add(cb_ROL, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 253, 110, -1));

        lbl_Usuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Usuario.setText("Usuario");
        getContentPane().add(lbl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 323, -1, -1));

        tfd_Usuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 321, 110, -1));

        lbl_Contrasena.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Contrasena.setText("Contraseña");
        getContentPane().add(lbl_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 396, -1, -1));

        tfd_Contrasena.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 394, 110, -1));

        btn_InsertUsuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_InsertUsuario.setText("Insert Usuario");
        btn_InsertUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InsertUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 478, 185, 39));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertUsuarioActionPerformed
        // TODO add your handling code here:
        if(tfd_Contrasena.getText().equals("")||tfd_Nombre.getText().equals("")||tfd_Usuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los espacios por favor");
        }
    }//GEN-LAST:event_btn_InsertUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(insertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InsertUsuario;
    private javax.swing.JComboBox<String> cb_ROL;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_Contrasena;
    private javax.swing.JLabel lbl_ID1;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_InsertUsuario;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_ROL;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JTextField tfd_Contrasena;
    private javax.swing.JTextField tfd_Nombre;
    private javax.swing.JTextField tfd_Usuario;
    // End of variables declaration//GEN-END:variables
}
