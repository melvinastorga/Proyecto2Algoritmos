/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Categoria;
import Domain.Lote;
import Domain.UnidadTransporte;
import Domain.Usuario;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import static javafx.scene.input.KeyCode.O;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * Clase donde se borra y modifica la unidad de transporte
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class DeleteUpdateUnidadTransporte extends javax.swing.JFrame {

    /**
     * Creates new form deleteUpdateUnidadTransporte
     */
    public DeleteUpdateUnidadTransporte() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();

        ArrayList listTransportes = new ArrayList();
        Iterator it = LoginPanel.transporte.keySet().iterator();
        while (it.hasNext()) {
            System.out.println("ENTRE AL WHILE MEN");
            Object key = it.next();
            listTransportes.add(LoginPanel.transporte.get(key));

            System.out.println(LoginPanel.transporte.get(key).getId());
        }

        cargarTablaTransporte(tabla_Transporte, listTransportes);
        tfd_IDTransporteAEliminar.setEnabled(false);
        tfd_IDCamionAActualizar.setEnabled(false);
        tfd_FotoActualizada.setEnabled(false);
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
        tabla_Transporte = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfd_IDTransporteAEliminar = new javax.swing.JTextField();
        lbl_Mensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfd_IDCamionAActualizar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfd_PlacaAActualizar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_CapacidadActualizada = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        tfd_FotoActualizada = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lbl_FotoActualizada = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Delete or Update Unidad de Transporte");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 24, -1, -1));

        tabla_Transporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Placa", "Capacidad", "Fotografia"
            }
        ));
        tabla_Transporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_TransporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Transporte);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 834, 507));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 125, 61));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 687, 150, 130));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 670, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("La ID del camion a eliminar es: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        tfd_IDTransporteAEliminar.setBackground(new java.awt.Color(0, 0, 0));
        tfd_IDTransporteAEliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDTransporteAEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, 140, -1));

        lbl_Mensaje.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lbl_Mensaje.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 650, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("ID Camion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, -1, -1));

        tfd_IDCamionAActualizar.setBackground(new java.awt.Color(0, 0, 0));
        tfd_IDCamionAActualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDCamionAActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 120, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Placa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, -1, -1));

        tfd_PlacaAActualizar.setBackground(new java.awt.Color(0, 0, 0));
        tfd_PlacaAActualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_PlacaAActualizar.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_PlacaAActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 120, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Capacidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, -1, -1));

        cb_CapacidadActualizada.setBackground(new java.awt.Color(0, 0, 0));
        cb_CapacidadActualizada.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cb_CapacidadActualizada.setForeground(new java.awt.Color(255, 255, 0));
        cb_CapacidadActualizada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 -1", "1-5", "5-10", "10-30" }));
        getContentPane().add(cb_CapacidadActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 130, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Imagen");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, -1, -1));
        getContentPane().add(tfd_FotoActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 180, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, -1, -1));

        lbl_FotoActualizada.setText("jLabel8");
        getContentPane().add(lbl_FotoActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 180, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo que carga una tabla con una lista de unidades de transporte
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
    public void cargarTablaTransporte(JTable producto, ArrayList<UnidadTransporte> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {

            model.addRow(O);
            UnidadTransporte transporte = (UnidadTransporte) list.get(i);
            UnidadTransporte transporte1 = (UnidadTransporte) list.get(i);
            model.setValueAt(transporte1.getId(), i, 0);
            model.setValueAt(transporte1.getPlaca(), i, 1);
            model.setValueAt(transporte1.getCapacidad(), i, 2);
            model.setValueAt(transporte1.getUrlFoto(), i, 3);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel(AdministratorPanel.nombre);
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_TransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_TransporteMouseClicked
        // TODO add your handling code here:
        this.lbl_Mensaje.setText("");
        int row = this.tabla_Transporte.getSelectedRow();
        int id = Integer.parseInt(this.tabla_Transporte.getValueAt(row, 0).toString());
        tfd_IDTransporteAEliminar.setText(id + "");
        tfd_IDCamionAActualizar.setText(id + "");

        ArrayList listTransportes = new ArrayList();
        Iterator it = LoginPanel.transporte.keySet().iterator();
        while (it.hasNext()) {
            Object key = it.next();
            listTransportes.add(LoginPanel.transporte.get(key));
        }

        for (int i = 0; i < listTransportes.size(); i++) {
            UnidadTransporte transporte = (UnidadTransporte) listTransportes.get(i);
            if (transporte.getId() == Integer.parseInt(tfd_IDCamionAActualizar.getText())) {
                tfd_PlacaAActualizar.setText(transporte.getPlaca());
                tfd_FotoActualizada.setText(transporte.getUrlFoto());
                ImageIcon icon = new ImageIcon(tfd_FotoActualizada.getText());
                Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_FotoActualizada.getWidth(), lbl_FotoActualizada.getHeight(), Image.SCALE_DEFAULT));
                lbl_FotoActualizada.setIcon(icon2);
                this.repaint();
                break;
            }
        }

    }//GEN-LAST:event_tabla_TransporteMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Iterator it = LoginPanel.transporte.keySet().iterator();
        while (it.hasNext()) {

            Object key = it.next();
            // listLotes.add(LoginPanel.categoria.get(key));
            UnidadTransporte transporte = LoginPanel.transporte.get(key);
            if (Integer.parseInt(tfd_IDTransporteAEliminar.getText()) == transporte.getId()) {
                LoginPanel.transporte.remove(key);
                lbl_Mensaje.setText("Transporte eliminado con exito");
                break;
            }
        }

        ArrayList listTransportes2 = new ArrayList();
        Iterator it2 = LoginPanel.transporte.keySet().iterator();
        while (it2.hasNext()) {

            Object key = it2.next();
            listTransportes2.add(LoginPanel.transporte.get(key));
        }

        cargarTablaTransporte(tabla_Transporte, listTransportes2);
        tfd_FotoActualizada.setText("");
        tfd_IDCamionAActualizar.setText("");
        tfd_IDTransporteAEliminar.setText("");
        tfd_PlacaAActualizar.setText("");
        lbl_FotoActualizada.setIcon(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Camiones");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (tfd_FotoActualizada.getText().equals("") || tfd_PlacaAActualizar.getText().equals("")) {
            lbl_Mensaje.setText("Llene todos los espacios para actualizar");
        } else {

            Iterator it = LoginPanel.transporte.keySet().iterator();
            while (it.hasNext()) {

                Object key = it.next();
                // listLotes.add(LoginPanel.categoria.get(key));
                UnidadTransporte transporte = LoginPanel.transporte.get(key);
                if (Integer.parseInt(tfd_IDTransporteAEliminar.getText()) == transporte.getId()) {

                    String capacidad = "";
                    if (cb_CapacidadActualizada.getSelectedIndex() == 0) {
                        capacidad = "0 - 1";
                    }
                    if (cb_CapacidadActualizada.getSelectedIndex() == 1) {
                        capacidad = "1 - 5";
                    }
                    if (cb_CapacidadActualizada.getSelectedIndex() == 2) {
                        capacidad = "5 - 10";
                    }
                    if (cb_CapacidadActualizada.getSelectedIndex() == 3) {
                        capacidad = "10 - 30";
                    }

                    LoginPanel.transporte.get(key).setPlaca(tfd_PlacaAActualizar.getText());
                    LoginPanel.transporte.get(key).setUrlFoto(tfd_FotoActualizada.getText());
                    LoginPanel.transporte.get(key).setCapacidad(capacidad);
                    lbl_Mensaje.setText("Transporte actualizado con exito");
                    break;
                }
            }

            ArrayList listTransportes2 = new ArrayList();
            Iterator it2 = LoginPanel.transporte.keySet().iterator();
            while (it2.hasNext()) {

                Object key = it2.next();
                listTransportes2.add(LoginPanel.transporte.get(key));
            }

            cargarTablaTransporte(tabla_Transporte, listTransportes2);

        }
        tfd_FotoActualizada.setText("");
        tfd_IDCamionAActualizar.setText("");
        tfd_IDTransporteAEliminar.setText("");
        tfd_PlacaAActualizar.setText("");
        lbl_FotoActualizada.setIcon(null);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUpdateUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateUnidadTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUpdateUnidadTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_CapacidadActualizada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_FotoActualizada;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTable tabla_Transporte;
    private javax.swing.JTextField tfd_FotoActualizada;
    private javax.swing.JTextField tfd_IDCamionAActualizar;
    private javax.swing.JTextField tfd_IDTransporteAEliminar;
    private javax.swing.JTextField tfd_PlacaAActualizar;
    // End of variables declaration//GEN-END:variables
}
