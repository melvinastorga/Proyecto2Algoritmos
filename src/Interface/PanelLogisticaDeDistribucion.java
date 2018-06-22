/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Bodega;
import Domain.ProductoMayorista;
import Domain.ProductoMayoristaPorOrden;
import static Interface.LoginPanel.bodega;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deltadragon
 */
public class PanelLogisticaDeDistribucion extends javax.swing.JFrame {

    private LinkedList<ProductoMayoristaPorOrden> listProducto = new LinkedList<>();
    int porcentaje;
    int pesoTotal;

    public PanelLogisticaDeDistribucion() {
        initComponents();
    }

    public PanelLogisticaDeDistribucion(String nombre) {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTablaProductoMayorista(this.JT_productoMayorista, LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root()));
        cargarBodega(this.JT_bodega, bodega.recorreGraph());
        this.JL_User.setText(nombre);
        this.JL_Categoria.setText("1 tonelada");
        this.JPB_peso.setMaximum(100);
        this.JPB_peso.setStringPainted(true);
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

    public void cargarTablaProductoMayoristaPorOrden(JTable producto, LinkedList<ProductoMayoristaPorOrden> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {
            model.addRow(O);
            ProductoMayoristaPorOrden getP = list.get(i);
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
        jLabel5 = new javax.swing.JLabel();
        JL_User = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JL_Max = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JL_PesoTotal = new javax.swing.JLabel();
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
        JT_productoMayorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_productoMayoristaMouseClicked(evt);
            }
        });
        JS_productoMayorista.setViewportView(JT_productoMayorista);
        if (JT_productoMayorista.getColumnModel().getColumnCount() > 0) {
            JT_productoMayorista.getColumnModel().getColumn(0).setResizable(false);
            JT_productoMayorista.getColumnModel().getColumn(1).setResizable(false);
            JT_productoMayorista.getColumnModel().getColumn(2).setResizable(false);
            JT_productoMayorista.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(JS_productoMayorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 560, 260));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, 260));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione los producto al mayoreo que desea agregar a su orden");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 470, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Orden de Compra");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 130, 30));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Monto Total a Pagar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 130, 30));

        JL_MontoAPagar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JL_MontoAPagar.setForeground(new java.awt.Color(0, 0, 0));
        JL_MontoAPagar.setText("0");
        getContentPane().add(JL_MontoAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 80, 30));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Categoria:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 70, 30));

        JL_Categoria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JL_Categoria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(JL_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 90, 30));
        getContentPane().add(JPB_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 450, 20));

        JB_Confirmacion.setText("Confirmar");
        getContentPane().add(JB_Confirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 260, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 30, 30));

        JL_User.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        getContentPane().add(JL_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 70, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1100, 10));

        JL_Max.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        JL_Max.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(JL_Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 180, 20));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total de Peso:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, -1, 20));

        JL_PesoTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        JL_PesoTotal.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(JL_PesoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 470, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_logOutActionPerformed
        LoginPanel login = new LoginPanel();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JB_logOutActionPerformed

    private void JT_productoMayoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_productoMayoristaMouseClicked
        int row = this.JT_productoMayorista.getSelectedRow();
        int id = Integer.parseInt(this.JT_productoMayorista.getValueAt(row, 0).toString());
        LinkedList<ProductoMayorista> list = LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root());
        for (ProductoMayorista p : list) {
            if (id == p.getId()) {
                if (pesoTotal < 1000) {
                    listProducto.add(new ProductoMayoristaPorOrden(p.getId(), 1, p.getNombre(), p.getUnidadMedida(), p.getValorUnidad(), p.getPesoTotal(), p.getDescripcion(), p.getIdLote(), p.getIdCategoria(), p.getPrecioTotal(), p.getUrlFoto()));
                    porcentaje += (p.getPesoTotal() * 100) / 1000;
                    this.JPB_peso.setValue(porcentaje);
                    pesoTotal += p.getPesoTotal();
                    this.JL_PesoTotal.setText(pesoTotal+"");
                } else if (pesoTotal >= 1000 && pesoTotal < 5000) {
                    listProducto.add(new ProductoMayoristaPorOrden(p.getId(), 1, p.getNombre(), p.getUnidadMedida(), p.getValorUnidad(), p.getPesoTotal(), p.getDescripcion(), p.getIdLote(), p.getIdCategoria(), p.getPrecioTotal(), p.getUrlFoto()));
                    porcentaje=0;
                    porcentaje = (pesoTotal * 100) / 5000;
                    porcentaje += (p.getPesoTotal() * 100) / 5000;
                    this.JPB_peso.setValue(porcentaje);
                    this.JL_Categoria.setText("1-5 toneladas");
                    pesoTotal += p.getPesoTotal();
                    this.JL_PesoTotal.setText(pesoTotal+"");
                } else if (pesoTotal >= 5000 && pesoTotal < 10000) {
                    porcentaje=0;
                    porcentaje = (pesoTotal * 100) / 10000;
                    listProducto.add(new ProductoMayoristaPorOrden(p.getId(), 1, p.getNombre(), p.getUnidadMedida(), p.getValorUnidad(), p.getPesoTotal(), p.getDescripcion(), p.getIdLote(), p.getIdCategoria(), p.getPrecioTotal(), p.getUrlFoto()));
                    porcentaje += (p.getPesoTotal() * 100) / 10000;
                    this.JPB_peso.setValue(porcentaje);
                    this.JL_Categoria.setText("5-10 toneladas");
                    pesoTotal += p.getPesoTotal();
                    this.JL_PesoTotal.setText(pesoTotal+"");
                } else if (pesoTotal >=10000 && pesoTotal <= 30000) {
                    porcentaje=0;
                    porcentaje = (pesoTotal * 100) / 30000;
                    listProducto.add(new ProductoMayoristaPorOrden(p.getId(), 1, p.getNombre(), p.getUnidadMedida(), p.getValorUnidad(), p.getPesoTotal(), p.getDescripcion(), p.getIdLote(), p.getIdCategoria(), p.getPrecioTotal(), p.getUrlFoto()));
                    porcentaje += (p.getPesoTotal() * 100) / 30000;
                    this.JPB_peso.setValue(porcentaje);
                    this.JL_Categoria.setText("10-30 toneladas");
                    pesoTotal += p.getPesoTotal();
                    this.JL_PesoTotal.setText(pesoTotal+"");
                } else {
                    this.JL_Max.setText("Has alcanzado el peso Maximo, no se puede ingresar mas productos");
                }
            }
        }
        cargarTablaProductoMayoristaPorOrden(this.JT_productoMayoristaOrden, listProducto);

    }//GEN-LAST:event_JT_productoMayoristaMouseClicked

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
    private javax.swing.JLabel JL_Max;
    private javax.swing.JLabel JL_MontoAPagar;
    private javax.swing.JLabel JL_PesoTotal;
    private javax.swing.JLabel JL_User;
    private javax.swing.JProgressBar JPB_peso;
    private javax.swing.JScrollPane JS_productoMayorista;
    private javax.swing.JTable JT_bodega;
    private javax.swing.JTable JT_productoMayorista;
    private javax.swing.JTable JT_productoMayoristaOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
