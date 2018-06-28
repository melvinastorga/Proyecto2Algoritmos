/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.UnidadTransporte;
import java.awt.Image;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase donde se inserta la unidad d transporte
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class InsertUnidadTransporte extends javax.swing.JFrame {

   
    int id;
    /**
     * Creates new form insertUnidadTransporte
     */
    public InsertUnidadTransporte() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
        this.setLocationRelativeTo(null);
        tfd_URLFoto.setEnabled(false);
         
        if(LoginPanel.transporte.isEmpty()){
        lbl_ID2.setText("1");
        }else{
            Iterator it = LoginPanel.transporte.keySet().iterator();
            while(it.hasNext()){
                Integer key = (Integer)it.next();
                id = LoginPanel.transporte.get(key).getId()+1;
               
            }
            lbl_ID2.setText(id+"");
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

        lbl_UnidadTransporte = new javax.swing.JLabel();
        lbl_ID1 = new javax.swing.JLabel();
        lbl_ID2 = new javax.swing.JLabel();
        lbl_Placa = new javax.swing.JLabel();
        tfd_Placa = new javax.swing.JTextField();
        lbl_Capacidad = new javax.swing.JLabel();
        cb_Capacidad = new javax.swing.JComboBox<>();
        lbl_Fotografia = new javax.swing.JLabel();
        lbl_Foto = new javax.swing.JLabel();
        btn_BuscarFoto = new javax.swing.JButton();
        tfd_URLFoto = new javax.swing.JTextField();
        btn_InsertUnidadTransporte = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_UnidadTransporte.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_UnidadTransporte.setForeground(new java.awt.Color(255, 255, 0));
        lbl_UnidadTransporte.setText("Insert Unidad Transporte");
        getContentPane().add(lbl_UnidadTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 33, -1, -1));

        lbl_ID1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID1.setForeground(new java.awt.Color(255, 255, 0));
        lbl_ID1.setText("ID");
        getContentPane().add(lbl_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 133, -1, -1));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID2.setForeground(new java.awt.Color(255, 255, 0));
        lbl_ID2.setText("jLabel3");
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 133, -1, -1));

        lbl_Placa.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Placa.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Placa.setText("Placa");
        getContentPane().add(lbl_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 205, -1, -1));

        tfd_Placa.setBackground(new java.awt.Color(0, 0, 0));
        tfd_Placa.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_Placa.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 210, 220, -1));

        lbl_Capacidad.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Capacidad.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Capacidad.setText("Capacidad Toneladas");
        getContentPane().add(lbl_Capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        cb_Capacidad.setBackground(new java.awt.Color(0, 0, 0));
        cb_Capacidad.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cb_Capacidad.setForeground(new java.awt.Color(255, 255, 0));
        cb_Capacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 -1", "1-5", "5-10", "10-30" }));
        getContentPane().add(cb_Capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 269, 145, -1));

        lbl_Fotografia.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Fotografia.setForeground(new java.awt.Color(255, 255, 0));
        lbl_Fotografia.setText("Fotografia");
        getContentPane().add(lbl_Fotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 377, -1, -1));
        getContentPane().add(lbl_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 340, 180));

        btn_BuscarFoto.setBackground(new java.awt.Color(0, 0, 0));
        btn_BuscarFoto.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_BuscarFoto.setForeground(new java.awt.Color(255, 255, 0));
        btn_BuscarFoto.setText("Buscar Foto");
        btn_BuscarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BuscarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 370, 145, 39));

        tfd_URLFoto.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_URLFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 435, 353, 37));

        btn_InsertUnidadTransporte.setBackground(new java.awt.Color(0, 0, 0));
        btn_InsertUnidadTransporte.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_InsertUnidadTransporte.setForeground(new java.awt.Color(255, 255, 0));
        btn_InsertUnidadTransporte.setText("Insertar Unidad Transporte");
        btn_InsertUnidadTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertUnidadTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InsertUnidadTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 300, 62));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 740, 170, 60));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 160, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarFotoActionPerformed
        // TODO add your handling code here:
            JFileChooser fileChooser = new JFileChooser("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Camiones");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
        fileChooser.setFileFilter(imgFilter);

        int result = fileChooser.showOpenDialog(this);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fileChooser.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                tfd_URLFoto.setText("...");
            } else {
                tfd_URLFoto.setText(fileName.getAbsolutePath());
            }
        }

        ImageIcon icon = new ImageIcon(tfd_URLFoto.getText());
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_Foto.getWidth(), lbl_Foto.getHeight(), Image.SCALE_DEFAULT));
        lbl_Foto.setIcon(icon2);
        this.repaint();
    }//GEN-LAST:event_btn_BuscarFotoActionPerformed

    private void btn_InsertUnidadTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertUnidadTransporteActionPerformed
        // TODO add your handling code here:
        
        if(tfd_Placa.getText().equals("")|| tfd_URLFoto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los espacios por favor");
        }else{
            String capacidad = "";
            if(cb_Capacidad.getSelectedIndex() == 0){
                capacidad = "0 - 1";
            }
            if(cb_Capacidad.getSelectedIndex() == 1){
                capacidad = "1 - 5";
            }
            if(cb_Capacidad.getSelectedIndex() == 2){
                capacidad = "5 - 10";
            }
            if(cb_Capacidad.getSelectedIndex() == 3){
                capacidad = "10 - 30";
            }
            UnidadTransporte transporte = new UnidadTransporte(Integer.parseInt(lbl_ID2.getText()), tfd_Placa.getText(), capacidad, tfd_URLFoto.getText());
            LoginPanel.transporte.put(Integer.parseInt(lbl_ID2.getText()), transporte);
            System.out.println(LoginPanel.transporte);
            Iterator it = LoginPanel.transporte.keySet().iterator();
            while(it.hasNext()){
                Integer key = (Integer)it.next();
                id = LoginPanel.transporte.get(key).getId()+1;
               
            }
            lbl_ID2.setText(id+"");
            tfd_Placa.setText("");
            tfd_URLFoto.setText("");
            lbl_Foto.setText("");
            lbl_Foto.setIcon(null);
        this.repaint();
            tfd_Placa.requestFocus();
        }
        
    }//GEN-LAST:event_btn_InsertUnidadTransporteActionPerformed

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
            java.util.logging.Logger.getLogger(InsertUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertUnidadTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BuscarFoto;
    private javax.swing.JButton btn_InsertUnidadTransporte;
    private javax.swing.JComboBox<String> cb_Capacidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Capacidad;
    private javax.swing.JLabel lbl_Foto;
    private javax.swing.JLabel lbl_Fotografia;
    private javax.swing.JLabel lbl_ID1;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Placa;
    private javax.swing.JLabel lbl_UnidadTransporte;
    private javax.swing.JTextField tfd_Placa;
    private javax.swing.JTextField tfd_URLFoto;
    // End of variables declaration//GEN-END:variables
}
