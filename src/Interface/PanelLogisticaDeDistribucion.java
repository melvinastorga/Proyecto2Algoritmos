/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Bodega;
import Domain.ProductoMayorista;
import static Interface.LoginPanel.bodega;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deltadragon
 */
public class PanelLogisticaDeDistribucion extends javax.swing.JFrame {

    /**
     * Creates new form PanelLogisticaDeDistribucion
     */
    public PanelLogisticaDeDistribucion() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTablaProductoMayorista(this.JT_productoMayorista, LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root()));
        cargarBodega(this.JT_bodega, bodega.recorreGraph());
    }

    public void cargarTablaProductoMayorista(JTable producto, LinkedList<ProductoMayorista> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {
            model.addRow(O);
            ProductoMayorista getP = list.get(i);
            model.setValueAt(getP.getId(), i, 0);
            model.setValueAt(getP.getNombre(), i, 1);
            model.setValueAt(getP.getPesoTotal(), i, 2);
            model.setValueAt(getP.getPrecioTotal(), i, 3);
            model.setValueAt(getP.getDescripcion(), i, 4);

        }
    }

    public void cargarBodega(JTable producto, LinkedList<Bodega> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {
            model.addRow(O);
            Bodega getP = list.get(i);
            model.setValueAt(getP.getNombre(), i, 0);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JS_productoMayorista = new javax.swing.JScrollPane();
        JT_productoMayorista = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_productoMayoristaOrden = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JL_MontoAPagar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JL_Categoria = new javax.swing.JLabel();
        JPB_peso = new javax.swing.JProgressBar();
        JB_Confirmacion = new javax.swing.JButton();
        JB_logOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_bodega = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_productoMayorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Peso Total", "Precio Total", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JS_productoMayorista.setViewportView(JT_productoMayorista);
        if (JT_productoMayorista.getColumnModel().getColumnCount() > 0) {
            JT_productoMayorista.getColumnModel().getColumn(0).setResizable(false);
            JT_productoMayorista.getColumnModel().getColumn(1).setResizable(false);
            JT_productoMayorista.getColumnModel().getColumn(2).setResizable(false);
            JT_productoMayorista.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(JS_productoMayorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 560, 260));

        JT_productoMayoristaOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Peso Total", "Precio Total", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(JT_productoMayoristaOrden);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, 260));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Productos Mayoristas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Productos Agregados a la Orden");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 230, 30));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Monto Total a Pagar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 130, 30));

        JL_MontoAPagar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JL_MontoAPagar.setForeground(new java.awt.Color(0, 0, 0));
        JL_MontoAPagar.setText("0");
        getContentPane().add(JL_MontoAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 80, 30));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Categoria:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 70, 30));

        JL_Categoria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JL_Categoria.setForeground(new java.awt.Color(0, 0, 0));
        JL_Categoria.setText("0-10 toneladas");
        getContentPane().add(JL_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, 90, 30));
        getContentPane().add(JPB_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 450, 20));

        JB_Confirmacion.setText("Confirmar");
        getContentPane().add(JB_Confirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, -1, -1));

        JB_logOut.setText("Log out");
        JB_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_logOutActionPerformed(evt);
            }
        });
        getContentPane().add(JB_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        JT_bodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Bodega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JT_bodega);
        if (JT_bodega.getColumnModel().getColumnCount() > 0) {
            JT_bodega.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_logOutActionPerformed
        LoginPanel login = new LoginPanel();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JB_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(PanelLogisticaDeDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelLogisticaDeDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelLogisticaDeDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelLogisticaDeDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelLogisticaDeDistribucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Confirmacion;
    private javax.swing.JButton JB_logOut;
    private javax.swing.JLabel JL_Categoria;
    private javax.swing.JLabel JL_MontoAPagar;
    private javax.swing.JProgressBar JPB_peso;
    private javax.swing.JScrollPane JS_productoMayorista;
    private javax.swing.JTable JT_bodega;
    private javax.swing.JTable JT_productoMayorista;
    private javax.swing.JTable JT_productoMayoristaOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
