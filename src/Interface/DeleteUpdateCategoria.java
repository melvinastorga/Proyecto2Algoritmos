/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Bodega;
import Domain.Categoria;
import Domain.UnidadTransporte;
import static Interface.LoginPanel.categoria;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melvin
 */
public class DeleteUpdateCategoria extends javax.swing.JFrame {

    

    /**
     * Creates new form deleteUpdateCategoria
     */
    public DeleteUpdateCategoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
        
        ArrayList listLotes = new ArrayList();
        Iterator it = LoginPanel.categoria.keySet().iterator();
        while (it.hasNext()) {
            
            Object key = it.next();
            listLotes.add(LoginPanel.categoria.get(key));
        }
        
        cargarTablaCategorias(tabla_Categoria, listLotes);
        tfd_IDCategoriaAEliminar.setEnabled(false);
        tfd_IDCategoriaAActualizar.setEnabled(false);
        
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
        tabla_Categoria = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfd_IDCategoriaAEliminar = new javax.swing.JTextField();
        lbl_Mensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfd_IDCategoriaAActualizar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfd_NombreActualizado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfd_DescripcionActualizada = new javax.swing.JTextField();
        btn_Actualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Delete or Update Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        tabla_Categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion"
            }
        ));
        tabla_Categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_CategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Categoria);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 710, 536));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 130, 57));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 140, 140));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 770, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ID de la categoria a eliminar: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 680, -1, -1));

        tfd_IDCategoriaAEliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDCategoriaAEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 720, 130, -1));

        lbl_Mensaje.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lbl_Mensaje.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 620, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("ID Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));

        tfd_IDCategoriaAActualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDCategoriaAActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 140, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        tfd_NombreActualizado.setBackground(new java.awt.Color(0, 0, 0));
        tfd_NombreActualizado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_NombreActualizado.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_NombreActualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 130, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Descripcion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        tfd_DescripcionActualizada.setBackground(new java.awt.Color(0, 0, 0));
        tfd_DescripcionActualizada.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_DescripcionActualizada.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_DescripcionActualizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 260, -1));

        btn_Actualizar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Actualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_Actualizar.setForeground(new java.awt.Color(255, 255, 0));
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarTablaCategorias(JTable producto, ArrayList<Categoria> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {
            
            model.addRow(O);
            Categoria categoria = (Categoria) list.get(i);
            Categoria categoria1 = (Categoria) list.get(i);
            model.setValueAt(categoria1.getId(), i, 0);
            model.setValueAt(categoria1.getNombre(), i, 1);
            model.setValueAt(categoria1.getDescripcion(), i, 2);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_CategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_CategoriaMouseClicked
        // TODO add your handling code here:
        this.lbl_Mensaje.setText("");
        int row = this.tabla_Categoria.getSelectedRow();
        int id = Integer.parseInt(this.tabla_Categoria.getValueAt(row, 0).toString());
        tfd_IDCategoriaAEliminar.setText(id + "");        
        tfd_IDCategoriaAActualizar.setText(id + "");
        
        Iterator it = LoginPanel.categoria.keySet().iterator();
        while (it.hasNext()) {
            
            Object key = it.next();
            // listLotes.add(LoginPanel.categoria.get(key));
            Categoria cat = LoginPanel.categoria.get(key);
            if (Integer.parseInt(tfd_IDCategoriaAEliminar.getText()) == cat.getId()) {
                tfd_NombreActualizado.setText(LoginPanel.categoria.get(key).getNombre());;
                tfd_DescripcionActualizada.setText(LoginPanel.categoria.get(key).getDescripcion());
                
                break;
            }
        }
        
    }//GEN-LAST:event_tabla_CategoriaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Iterator it = LoginPanel.categoria.keySet().iterator();
        while (it.hasNext()) {
            
            Object key = it.next();
            // listLotes.add(LoginPanel.categoria.get(key));
            Categoria cat = LoginPanel.categoria.get(key);
            if (Integer.parseInt(tfd_IDCategoriaAEliminar.getText()) == cat.getId()) {
                LoginPanel.categoria.remove(key);
                lbl_Mensaje.setText("Categoria eliminada con exito");
                tfd_IDCategoriaAEliminar.setText("");
                tfd_IDCategoriaAActualizar.setText("");
                tfd_DescripcionActualizada.setText("");
                tfd_NombreActualizado.setText("");
                break;
            }
        }
        
        ArrayList listLotes2 = new ArrayList();
        Iterator it2 = LoginPanel.categoria.keySet().iterator();
        while (it2.hasNext()) {
            
            Object key = it2.next();
            listLotes2.add(LoginPanel.categoria.get(key));
        }
        
        cargarTablaCategorias(tabla_Categoria, listLotes2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        // TODO add your handling code here:
        if (tfd_NombreActualizado.getText().equals("") || tfd_DescripcionActualizada.getText().equals("") || tfd_IDCategoriaAActualizar.getText().equals("")) {
            lbl_Mensaje.setText("Llene todos los espacios para actualizar");
        } else {
            
            Iterator it = LoginPanel.categoria.keySet().iterator();
            while (it.hasNext()) {
                
                Object key = it.next();
                // listLotes.add(LoginPanel.categoria.get(key));
                Categoria categoria = LoginPanel.categoria.get(key);
                if (Integer.parseInt(tfd_IDCategoriaAActualizar.getText()) == categoria.getId()) {
                    
                    LoginPanel.categoria.get(key).setNombre(tfd_NombreActualizado.getText());
                    LoginPanel.categoria.get(key).setDescripcion(tfd_DescripcionActualizada.getText());
                    lbl_Mensaje.setText("La categoria ha sido actualizada");
                    break;
                }
            }
            
            ArrayList listCategorias = new ArrayList();
            Iterator it2 = LoginPanel.categoria.keySet().iterator();
            while (it2.hasNext()) {
                
                Object key = it2.next();
                listCategorias.add(LoginPanel.categoria.get(key));
            }
            
            cargarTablaCategorias(tabla_Categoria, listCategorias);
            tfd_IDCategoriaAActualizar.setText("");
            tfd_NombreActualizado.setText("");
            tfd_DescripcionActualizada.setText("");
        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUpdateCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUpdateCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTable tabla_Categoria;
    private javax.swing.JTextField tfd_DescripcionActualizada;
    private javax.swing.JTextField tfd_IDCategoriaAActualizar;
    private javax.swing.JTextField tfd_IDCategoriaAEliminar;
    private javax.swing.JTextField tfd_NombreActualizado;
    // End of variables declaration//GEN-END:variables
}
