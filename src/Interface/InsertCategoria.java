/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Categoria;
import java.awt.Image;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Clase donde se inserta las categorias
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class InsertCategoria extends javax.swing.JFrame {

    int id = 0;

    /**
     * Creates new form insertCategoria
     */
    public InsertCategoria() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
        this.setLocationRelativeTo(null);
        // listaCategoria 
        id = 0;
        System.out.println(LoginPanel.categoria.size() + "AQUI");
        if (LoginPanel.categoria.isEmpty()) {
            lbl_ID2.setText("1");
        } else {

//            Iterator it =  LoginPanel.categoria.keySet().iterator();
//            while (it.hasNext()) {
//                
//                String key = "" + it.next();
//                System.out.println(LoginPanel.categoria.get(key).getId()+"JAJA");
//                id =  LoginPanel.categoria.get(key).getId() + 1;
//
//            }
//            lbl_ID2.setText(id + "");
            id = LoginPanel.categoria.size() + 1;
            lbl_ID2.setText(id + "");
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

        lbl_InsertCategoria = new javax.swing.JLabel();
        lbl_ID1 = new javax.swing.JLabel();
        lbl_ID2 = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        tft_Nombre = new javax.swing.JTextField();
        lbl_Descripcion = new javax.swing.JLabel();
        tfd_Descripcion = new javax.swing.JTextField();
        btn_InsertCategoria = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_InsertCategoria.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertCategoria.setForeground(new java.awt.Color(255, 255, 0));
        lbl_InsertCategoria.setText("Insertar Categoria");
        getContentPane().add(lbl_InsertCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 12, -1, -1));

        lbl_ID1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID1.setForeground(new java.awt.Color(255, 255, 0));
        lbl_ID1.setText("ID");
        getContentPane().add(lbl_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 84, -1, -1));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID2.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 84, -1, -1));

        lbl_Nombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 161, -1, -1));

        tft_Nombre.setBackground(new java.awt.Color(0, 0, 0));
        tft_Nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tft_Nombre.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tft_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 161, 140, -1));

        lbl_Descripcion.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Descripcion.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Descripcion.setText("Descripcion");
        getContentPane().add(lbl_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 232, -1, -1));

        tfd_Descripcion.setBackground(new java.awt.Color(0, 0, 0));
        tfd_Descripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfd_Descripcion.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 237, 140, -1));

        btn_InsertCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btn_InsertCategoria.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_InsertCategoria.setForeground(new java.awt.Color(255, 255, 0));
        btn_InsertCategoria.setText("Insertar");
        btn_InsertCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InsertCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 165, 57));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 180, 50));

        lbl_LOGO.setText("jLabel1");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 170, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertCategoriaActionPerformed
        // TODO add your handling code here:

        if (tfd_Descripcion.getText().equals("") || tft_Nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los espacios por favor");
        } else {
            try {
                Categoria categoria = new Categoria(Integer.parseInt(lbl_ID2.getText()), tft_Nombre.getText(), tfd_Descripcion.getText());
                //  System.out.println(categoria.getId()+" "+categoria.getNombre()+" "+categoria.getDescripcion());
               
                LoginPanel.categoria.put(categoria.getId(), categoria);

                
                System.out.println(LoginPanel.categoria + " " + LoginPanel.categoria.size());

//                int idPrueba = 0;
//System.out.println("ENTRE AQUI 3");
//                Iterator it =  LoginPanel.categoria.keySet().iterator();
//                while (it.hasNext()) {
//System.out.println("ENTRE AQUI 4");
//                    String key = "" + it.next();
//
//                    idPrueba =  LoginPanel.categoria.get(key).getId() + 1;
//
//                }
//System.out.println("ENTRE AQUI 5");
//                lbl_ID2.setText(idPrueba + "");
                id = LoginPanel.categoria.size() + 1;
                lbl_ID2.setText(id + "");

                tfd_Descripcion.setText("");
                tft_Nombre.setText("");
                tft_Nombre.requestFocus();
            } catch (Exception e) {
                System.out.println("Problemas");
            }
        }

    }//GEN-LAST:event_btn_InsertCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(InsertCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            // java.util.logging.Logger.getLogger(InsertCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, jLabel1      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(InsertCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InsertCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_Descripcion;
    private javax.swing.JLabel lbl_ID1;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_InsertCategoria;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JTextField tfd_Descripcion;
    private javax.swing.JTextField tft_Nombre;
    // End of variables declaration//GEN-END:variables
}
