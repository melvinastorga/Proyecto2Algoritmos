/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Bodega;
import Domain.Categoria;
import Domain.ProductoMayorista;
import Domain.UnidadTransporte;
import Logica.GraphAdyacency;
import Logica.GraphException;
import Logica.LinkedBinaryTree;
import Logica.TreeExceptions;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
/**
 * Clase donde se modifica y borra bodegas
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class DeleteUpdateBodega extends javax.swing.JFrame {

    /**
     * Creates new form deleteUpdateBodega
     */
    public DeleteUpdateBodega() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_ICON.getWidth(), lbl_ICON.getHeight(), Image.SCALE_DEFAULT));
        lbl_ICON.setIcon(icon2);
        this.repaint();
        
        
        
         DefaultTableModel model = (DefaultTableModel) this.table_Bodega.getModel();
        model.setRowCount(0);
        Object O[] = null;
        
             LinkedList<Bodega> listBodega = LoginPanel.bodega.recorreGraph();
        cargarTablaBodegas(table_Bodega, listBodega);
        tfd_IDBodegaAEliminar.setEnabled(false);
        tfd_IDBodegaAActualizar.setEnabled(false);
      tfd_FotoActualizada.setEnabled(false);
      
      try
{
   MaskFormatter mascara = new MaskFormatter("##.##");
   JFormattedTextField textField = new JFormattedTextField(mascara);
   textField.setValue(new Float("12.34"));
}
catch (Exception e)
{
  //
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Bodega = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_ICON = new javax.swing.JLabel();
        btn_BorrarBodega = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfd_IDBodegaAEliminar = new javax.swing.JTextField();
        lbl_Mensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfd_IDBodegaAActualizar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfd_NombreActualizado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfd_latitudActualizada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfd_longitudActualizada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lbl_FotoActualizada = new javax.swing.JLabel();
        tfd_FotoActualizada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfd_DistanciaActualizada = new javax.swing.JTextField();
        btn_ActualizaBodega = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Delete or Update Bodega");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        table_Bodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Latitud", "Longitud", "Distancia", "Fotografia"
            }
        ));
        table_Bodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_BodegaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Bodega);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 530));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 143, 59));

        lbl_ICON.setText("jLabel2");
        getContentPane().add(lbl_ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 130, 120));

        btn_BorrarBodega.setBackground(new java.awt.Color(0, 0, 0));
        btn_BorrarBodega.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_BorrarBodega.setForeground(new java.awt.Color(255, 255, 0));
        btn_BorrarBodega.setText("Eliminar");
        btn_BorrarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarBodegaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BorrarBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 750, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("La ID de la bodega a eliminar es:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 660, 310, -1));

        tfd_IDBodegaAEliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDBodegaAEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 700, 200, 30));

        lbl_Mensaje.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Mensaje.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 530, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("ID Bodega");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));

        tfd_IDBodegaAActualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDBodegaAActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 120, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, -1));

        tfd_NombreActualizado.setBackground(new java.awt.Color(0, 0, 0));
        tfd_NombreActualizado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_NombreActualizado.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_NombreActualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 180, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Latitud");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, -1, -1));

        tfd_latitudActualizada.setBackground(new java.awt.Color(0, 0, 0));
        tfd_latitudActualizada.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_latitudActualizada.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_latitudActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 150, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Longitud");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, -1, -1));

        tfd_longitudActualizada.setBackground(new java.awt.Color(0, 0, 0));
        tfd_longitudActualizada.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_longitudActualizada.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_longitudActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 160, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Imagen");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        lbl_FotoActualizada.setText("jLabel9");
        getContentPane().add(lbl_FotoActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 150, 90));

        tfd_FotoActualizada.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        getContentPane().add(tfd_FotoActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 720, 160, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Distancia");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        tfd_DistanciaActualizada.setBackground(new java.awt.Color(0, 0, 0));
        tfd_DistanciaActualizada.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_DistanciaActualizada.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_DistanciaActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 120, -1));

        btn_ActualizaBodega.setBackground(new java.awt.Color(0, 0, 0));
        btn_ActualizaBodega.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_ActualizaBodega.setForeground(new java.awt.Color(255, 255, 0));
        btn_ActualizaBodega.setText("Actualizar");
        btn_ActualizaBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizaBodegaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ActualizaBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 760, 160, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * se carga una tabla con las bodegas y los productos
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
      public void cargarTablaBodegas(JTable producto, LinkedList<Bodega> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {
  
            model.addRow(O);
            Bodega bodega = (Bodega) list.get(i);
          Bodega bodega1 = (Bodega) list.get(i);
            model.setValueAt(bodega1.getId(), i, 0);
            model.setValueAt(bodega1.getNombre(), i, 1);
            model.setValueAt(bodega1.getLatitud(), i, 2);
            model.setValueAt(bodega1.getLongitud(), i, 3);
             model.setValueAt(bodega1.getDistanciaCentroOperaciones(), i, 4);
            model.setValueAt(bodega1.getUrlFoto(), i, 5);

        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table_BodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_BodegaMouseClicked
        // TODO add your handling code here:
        this.lbl_Mensaje.setText("");
        int row = this.table_Bodega.getSelectedRow();
        int id = Integer.parseInt(this.table_Bodega.getValueAt(row, 0).toString());
        tfd_IDBodegaAEliminar.setText(id+"");
        tfd_IDBodegaAActualizar.setText(id+"");
        
        //aqui mae
        LinkedList<Bodega> listBodegas = LoginPanel.bodega.recorreGraph();
        

        for (int i = 0; i < listBodegas.size(); i++) {
            Bodega bodega = (Bodega) listBodegas.get(i);
            if (bodega.getId() == Integer.parseInt(tfd_IDBodegaAActualizar.getText())) {
                tfd_NombreActualizado.setText(bodega.getNombre());
                tfd_latitudActualizada.setText(bodega.getLatitud());
                tfd_longitudActualizada.setText(bodega.getLongitud());
                tfd_DistanciaActualizada.setText(bodega.getDistanciaCentroOperaciones()+"");
                tfd_FotoActualizada.setText(bodega.getUrlFoto());
                ImageIcon icon = new ImageIcon(tfd_FotoActualizada.getText());
                Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_FotoActualizada.getWidth(), lbl_FotoActualizada.getHeight(), Image.SCALE_DEFAULT));
                lbl_FotoActualizada.setIcon(icon2);
                this.repaint();
                break;
            }
        }
    }//GEN-LAST:event_table_BodegaMouseClicked

    private void btn_BorrarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarBodegaActionPerformed
        // TODO add your handling code here:
        
            LinkedList<Bodega> listaBodegas = LoginPanel.bodega.recorreGraph();
        
         String idBuscada = tfd_IDBodegaAEliminar.getText();
        String miID = "no lo borraste";
        for (int i = 0; i < listaBodegas.size(); i++) {
  
            Bodega bodega = (Bodega) listaBodegas.get(i);
            if(bodega.getId()== Integer.parseInt(idBuscada)){
                listaBodegas.remove(bodega);
                miID = "LO BORRASTE";
                tfd_IDBodegaAEliminar.setText("");
                lbl_Mensaje.setText("La bodega ha sido eliminado con exito");
                break;
            }
            
         }
        
        GraphAdyacency grafoNuevo = new GraphAdyacency(100);
       // LinkedBinaryTree arbolNuevo = new LinkedBinaryTree();
        for (int i = 0; i < listaBodegas.size(); i++) {
            try {
                Bodega bodega = (Bodega) listaBodegas.get(i);
                grafoNuevo.insertVertex(bodega);
            }   catch (GraphException ex) {
                    Logger.getLogger(DeleteUpdateBodega.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        LoginPanel.bodega = grafoNuevo;
        
        System.out.println(miID);
         cargarTablaBodegas(table_Bodega, listaBodegas);
        
    }//GEN-LAST:event_btn_BorrarBodegaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                      JFileChooser fileChooser = new JFileChooser("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Bodegas");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png","jpeg");
        fileChooser.setFileFilter(imgFilter);

        int result = fileChooser.showOpenDialog(this);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fileChooser.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                tfd_FotoActualizada.setText("...");
            } else {
                tfd_FotoActualizada.setText(fileName.getAbsolutePath());
            }
        }

        ImageIcon icon = new ImageIcon(tfd_FotoActualizada.getText());
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_FotoActualizada.getWidth(), lbl_FotoActualizada.getHeight(), Image.SCALE_DEFAULT));
        lbl_FotoActualizada.setIcon(icon2);
        this.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_ActualizaBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizaBodegaActionPerformed
        // TODO add your handling code here:
        
        
            LinkedList<Bodega> listaBodegas = LoginPanel.bodega.recorreGraph();
        
         String idBuscada = tfd_IDBodegaAEliminar.getText();
        String miID = "no lo borraste";
        for (int i = 0; i < listaBodegas.size(); i++) {
  
            Bodega bodega = (Bodega) listaBodegas.get(i);
            if(bodega.getId()== Integer.parseInt(idBuscada)){
                listaBodegas.get(i).setNombre(tfd_NombreActualizado.getText());
                listaBodegas.get(i).setLatitud(tfd_latitudActualizada.getText());
                listaBodegas.get(i).setLongitud(tfd_longitudActualizada.getText());
                listaBodegas.get(i).setDistanciaCentroOperaciones( Float.parseFloat(tfd_DistanciaActualizada.getText()));
                listaBodegas.get(i).setUrlFoto(tfd_FotoActualizada.getText());
                
                miID = "LO BORRASTE";
                tfd_IDBodegaAActualizar.setText("");
                lbl_Mensaje.setText("La bodega ha sido actualizada con exito");
                break;
            }
            
         }
        
        GraphAdyacency grafoNuevo = new GraphAdyacency(100);
       // LinkedBinaryTree arbolNuevo = new LinkedBinaryTree();
        for (int i = 0; i < listaBodegas.size(); i++) {
            try {
                Bodega bodega = (Bodega) listaBodegas.get(i);
                grafoNuevo.insertVertex(bodega);
            }   catch (GraphException ex) {
                    Logger.getLogger(DeleteUpdateBodega.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        LoginPanel.bodega = grafoNuevo;
        
        System.out.println(miID);
         cargarTablaBodegas(table_Bodega, listaBodegas);
        tfd_DistanciaActualizada.setText("");
        tfd_FotoActualizada.setText("");
        tfd_NombreActualizado.setText("");
        tfd_latitudActualizada.setText("");
        tfd_longitudActualizada.setText("");
        lbl_FotoActualizada.setIcon(null);
    }//GEN-LAST:event_btn_ActualizaBodegaActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUpdateBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUpdateBodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ActualizaBodega;
    private javax.swing.JButton btn_BorrarBodega;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_FotoActualizada;
    private javax.swing.JLabel lbl_ICON;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTable table_Bodega;
    private javax.swing.JTextField tfd_DistanciaActualizada;
    private javax.swing.JTextField tfd_FotoActualizada;
    private javax.swing.JTextField tfd_IDBodegaAActualizar;
    private javax.swing.JTextField tfd_IDBodegaAEliminar;
    private javax.swing.JTextField tfd_NombreActualizado;
    private javax.swing.JTextField tfd_latitudActualizada;
    private javax.swing.JTextField tfd_longitudActualizada;
    // End of variables declaration//GEN-END:variables
}
