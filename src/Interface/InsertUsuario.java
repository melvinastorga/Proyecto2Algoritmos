/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Usuario;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin
 */
public class InsertUsuario extends javax.swing.JFrame {

  
    
   /**
 * Clase donde se inserta el usuario
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
    public InsertUsuario() {
        initComponents();
         ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
        this.setLocationRelativeTo(null);
       
        if(LoginPanel.usuario.isEmpty()){
        lbl_ID2.setText("1");
        }else{
         lbl_ID2.setText(LoginPanel.usuario.getLast().getId()+1+"");
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
        btn_InsertUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        tfd_Contrasena = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_InsertUsuario.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertUsuario.setForeground(new java.awt.Color(255, 255, 0));
        lbl_InsertUsuario.setText("Insertar Usuario");
        getContentPane().add(lbl_InsertUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 33, -1, -1));

        lbl_ID1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID1.setForeground(new java.awt.Color(255, 255, 0));
        lbl_ID1.setText("ID");
        getContentPane().add(lbl_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 110, -1, -1));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID2.setForeground(new java.awt.Color(255, 255, 0));
        lbl_ID2.setText("jLabel3");
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 110, -1, -1));

        lbl_Nombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 177, -1, -1));

        tfd_Nombre.setBackground(new java.awt.Color(0, 0, 0));
        tfd_Nombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_Nombre.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 175, 110, -1));

        lbl_ROL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ROL.setForeground(new java.awt.Color(255, 255, 0));
        lbl_ROL.setText("ROL");
        getContentPane().add(lbl_ROL, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 251, -1, -1));

        cb_ROL.setBackground(new java.awt.Color(0, 0, 0));
        cb_ROL.setEditable(true);
        cb_ROL.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cb_ROL.setForeground(new java.awt.Color(255, 255, 0));
        cb_ROL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador" }));
        getContentPane().add(cb_ROL, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 253, 180, -1));

        lbl_Usuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Usuario.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Usuario.setText("Usuario");
        getContentPane().add(lbl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 323, -1, -1));

        tfd_Usuario.setBackground(new java.awt.Color(0, 0, 0));
        tfd_Usuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_Usuario.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 321, 150, -1));

        lbl_Contrasena.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Contrasena.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Contrasena.setText("Contraseña");
        getContentPane().add(lbl_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 396, -1, -1));

        btn_InsertUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btn_InsertUsuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_InsertUsuario.setForeground(new java.awt.Color(255, 255, 0));
        btn_InsertUsuario.setText("Insertar Usuario");
        btn_InsertUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InsertUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 185, 39));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 180, 40));

        lbl_LOGO.setText("jLabel1");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 130, 110));

        tfd_Contrasena.setBackground(new java.awt.Color(0, 0, 0));
        tfd_Contrasena.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 150, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertUsuarioActionPerformed
        // TODO add your handling code here:
        if(tfd_Contrasena.getText().equals("")||tfd_Nombre.getText().equals("")||tfd_Usuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los espacios por favor");
        }else{
            String rol = "";
            boolean admin = false;
            
            if (cb_ROL.getSelectedIndex()==0){
                rol = "administrador";
                admin = true;
            }
            if (cb_ROL.getSelectedIndex()==1){
                  rol = "operador";
                  admin = false;
            }
            
            Usuario usuario = new Usuario(Integer.parseInt(lbl_ID2.getText()), tfd_Nombre.getText(), admin, tfd_Usuario.getText(), tfd_Contrasena.getText());
            LoginPanel.usuario.add(usuario);
            lbl_ID2.setText(LoginPanel.usuario.getLast().getId()+1+"");
            tfd_Nombre.setText("");
            tfd_Contrasena.setText("");
            tfd_Usuario.setText("");
            tfd_Nombre.requestFocus();
        }
    }//GEN-LAST:event_btn_InsertUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel(AdministratorPanel.nombre);
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InsertUsuario;
    private javax.swing.JComboBox<String> cb_ROL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_Contrasena;
    private javax.swing.JLabel lbl_ID1;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_InsertUsuario;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_ROL;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JPasswordField tfd_Contrasena;
    private javax.swing.JTextField tfd_Nombre;
    private javax.swing.JTextField tfd_Usuario;
    // End of variables declaration//GEN-END:variables
}
