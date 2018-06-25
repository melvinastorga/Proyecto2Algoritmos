/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.ProductoMayorista;
import Domain.ProductoMayoristaPorOrden;
import Domain.Usuario;
import Logica.BinaryTree;
import Logica.LinkedBinaryTree;
import Logica.TreeExceptions;
import java.awt.Image;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Clase donde se  borra y modifica los productos mayorista
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class DeleteUpdateProductoMayorista extends javax.swing.JFrame {

    /**
     * Creates new form deleteUpdateProductoMayorista
     */
    public DeleteUpdateProductoMayorista() {
        initComponents();
        this.setLocationRelativeTo(null);
         ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
 cargarTablaProductoMayorista(this.tabla_Productos, LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root()));
        LinkedBinaryTree newTree = new LinkedBinaryTree();
 //LoginPanel.productoMayorista = newTree;
 tfd_IDProductoAEliminar.setEnabled(false);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Productos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfd_IDProductoAEliminar = new javax.swing.JTextField();
        lbl_Mensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Delete or Update Producto Mayorista");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 26, -1, -1));

        tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidad de medida", "Valor Unidad", "Peso Total", "Descripcion", "ID Lote", "ID Categoria", "Precio Total", "Fotografia"
            }
        ));
        tabla_Productos.setRowHeight(20);
        tabla_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 83, 852, 564));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 136, 58));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 665, 125, 116));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 730, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("El ID del Producto a eliminar es: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        tfd_IDProductoAEliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDProductoAEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 740, 170, -1));

        lbl_Mensaje.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Mensaje.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 480, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ProductosMouseClicked
        // TODO add your handling code here:
        this.lbl_Mensaje.setText("");
        int row = this.tabla_Productos.getSelectedRow();
        int id = Integer.parseInt(this.tabla_Productos.getValueAt(row, 0).toString());
        tfd_IDProductoAEliminar.setText(id+""); 
    }//GEN-LAST:event_tabla_ProductosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        LinkedList<ProductoMayorista> listaProductos = LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root());
        
         String idBuscada = tfd_IDProductoAEliminar.getText();
        String miID = "no lo borraste";
        for (int i = 0; i < listaProductos.size(); i++) {
  
            ProductoMayorista producto = (ProductoMayorista) listaProductos.get(i);
            if(producto.getId()== Integer.parseInt(idBuscada)){
                listaProductos.remove(producto);
                miID = "LO BORRASTE";
                tfd_IDProductoAEliminar.setText("");
                lbl_Mensaje.setText("El producto ha sido eliminado con exito");
                break;
            }
            
         }
        
        LinkedBinaryTree arbolNuevo = new LinkedBinaryTree();
        for (int i = 0; i < listaProductos.size(); i++) {
            try {
                ProductoMayorista producto = (ProductoMayorista) listaProductos.get(i);
                arbolNuevo.insert(producto);
            } catch (TreeExceptions ex) {
                Logger.getLogger(DeleteUpdateProductoMayorista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        LoginPanel.productoMayorista = arbolNuevo;
        
        System.out.println(miID);
         cargarTablaProductoMayorista(tabla_Productos, listaProductos);
        
    }//GEN-LAST:event_jButton2ActionPerformed
/**
 * Metodo que carga una tabla con una lista de productos Mayoristas
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
    public void cargarTablaProductoMayorista(JTable producto, LinkedList<ProductoMayorista> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {
            model.addRow(O);
            ProductoMayorista getP = list.get(i);
            model.setValueAt(getP.getId(), i, 0);
            model.setValueAt(getP.getNombre(), i, 1);
            model.setValueAt(getP.getUnidadMedida(), i, 2);
            model.setValueAt(getP.getValorUnidad(), i, 3);
            model.setValueAt(getP.getPesoTotal(), i, 4);
            model.setValueAt(getP.getDescripcion(), i, 5);
            model.setValueAt(getP.getIdLote(), i, 6);
            model.setValueAt(getP.getIdCategoria(), i, 7);
            model.setValueAt(getP.getPrecioTotal(), i, 8);
            model.setValueAt(getP.getUrlFoto(), i, 9);

        }
    }
    
    
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
            java.util.logging.Logger.getLogger(DeleteUpdateProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUpdateProductoMayorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTable tabla_Productos;
    private javax.swing.JTextField tfd_IDProductoAEliminar;
    // End of variables declaration//GEN-END:variables
}
