/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Logica.GraphException;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Melvin
 */
public class AdministratorPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorPanel
     */
    public AdministratorPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_ICON.getWidth(), lbl_ICON.getHeight(), Image.SCALE_DEFAULT));
        lbl_ICON.setIcon(icon2);
        this.repaint();
        
         ImageIcon icon3 = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Fondo.jpg");
        Icon icon4 = new ImageIcon(icon3.getImage().getScaledInstance(lbl_Fondo.getWidth(), lbl_Fondo.getHeight(), Image.SCALE_DEFAULT));
        lbl_Fondo.setIcon(icon4);
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_ICON = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menu_InsertProduct = new javax.swing.JMenuItem();
        menu_DeleteUpdateProduct = new javax.swing.JMenuItem();
        menu_InsertCategoria = new javax.swing.JMenuItem();
        menu_DeleteUpdateCategoria = new javax.swing.JMenuItem();
        menu_InsertLote = new javax.swing.JMenuItem();
        menu_DeleteUpdateLote = new javax.swing.JMenuItem();
        menu_InsertTransporte = new javax.swing.JMenuItem();
        menu_DeleteUpdateTransporte = new javax.swing.JMenuItem();
        menu_InsertBodega = new javax.swing.JMenuItem();
        menu_DeleteUpdateBodega = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_InsertUsuario = new javax.swing.JMenuItem();
        menu_DeleteUpdateUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_LotesAnulados = new javax.swing.JMenuItem();
        menu_HistorialProductos = new javax.swing.JMenuItem();
        menu_Graficos = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setText("Panel del administrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 61));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setText("Bienvenido Nombre Administrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 130, 50));

        lbl_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.PNG"))); // NOI18N
        getContentPane().add(lbl_ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 960, 160));
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 960, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 960, 770));

        jMenu2.setText("CRUDS");
        jMenu2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N

        menu_InsertProduct.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_InsertProduct.setText("Insert Product");
        menu_InsertProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InsertProductActionPerformed(evt);
            }
        });
        jMenu2.add(menu_InsertProduct);

        menu_DeleteUpdateProduct.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_DeleteUpdateProduct.setText("Delete/Update Product");
        menu_DeleteUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteUpdateProductActionPerformed(evt);
            }
        });
        jMenu2.add(menu_DeleteUpdateProduct);

        menu_InsertCategoria.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_InsertCategoria.setText("Insert Categoria");
        menu_InsertCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InsertCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(menu_InsertCategoria);

        menu_DeleteUpdateCategoria.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_DeleteUpdateCategoria.setText("Delete/Update Categoria");
        menu_DeleteUpdateCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteUpdateCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(menu_DeleteUpdateCategoria);

        menu_InsertLote.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_InsertLote.setText("Insert Lote");
        menu_InsertLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InsertLoteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_InsertLote);

        menu_DeleteUpdateLote.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_DeleteUpdateLote.setText("Delete/Update Lote");
        menu_DeleteUpdateLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteUpdateLoteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_DeleteUpdateLote);

        menu_InsertTransporte.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_InsertTransporte.setText("Insert Transporte");
        menu_InsertTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InsertTransporteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_InsertTransporte);

        menu_DeleteUpdateTransporte.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_DeleteUpdateTransporte.setText("Delete/Update Transporte");
        menu_DeleteUpdateTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteUpdateTransporteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_DeleteUpdateTransporte);

        menu_InsertBodega.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_InsertBodega.setText("Insert Bodega");
        menu_InsertBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InsertBodegaActionPerformed(evt);
            }
        });
        jMenu2.add(menu_InsertBodega);

        menu_DeleteUpdateBodega.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_DeleteUpdateBodega.setText("Delete/Update Bodega");
        menu_DeleteUpdateBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteUpdateBodegaActionPerformed(evt);
            }
        });
        jMenu2.add(menu_DeleteUpdateBodega);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Users");
        jMenu3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N

        menu_InsertUsuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_InsertUsuario.setText("Insert User");
        menu_InsertUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InsertUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(menu_InsertUsuario);

        menu_DeleteUpdateUsuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_DeleteUpdateUsuario.setText("Delete/Update User");
        menu_DeleteUpdateUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteUpdateUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(menu_DeleteUpdateUsuario);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Funciones");
        jMenu4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N

        menu_LotesAnulados.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_LotesAnulados.setText("Reporte de Lotes Anulados");
        menu_LotesAnulados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_LotesAnuladosActionPerformed(evt);
            }
        });
        jMenu4.add(menu_LotesAnulados);

        menu_HistorialProductos.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_HistorialProductos.setText("Historial de productos");
        menu_HistorialProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_HistorialProductosActionPerformed(evt);
            }
        });
        jMenu4.add(menu_HistorialProductos);

        menu_Graficos.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu_Graficos.setText("Graficos");
        menu_Graficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_GraficosActionPerformed(evt);
            }
        });
        jMenu4.add(menu_Graficos);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_InsertProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InsertProductActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InsertProductoMayorista insertProduct = new InsertProductoMayorista();
        insertProduct.show();
        insertProduct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_InsertProductActionPerformed

    private void menu_InsertBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InsertBodegaActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            InsertBodega insertBodega = new InsertBodega();
            insertBodega.show();
            insertBodega.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (GraphException ex) {
            Logger.getLogger(AdministratorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_InsertBodegaActionPerformed

    private void menu_InsertCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InsertCategoriaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InsertCategoria insertCategoria = new InsertCategoria();
        insertCategoria.show();
        insertCategoria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_InsertCategoriaActionPerformed

    private void menu_InsertLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InsertLoteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InsertLote insertLote = new InsertLote();
        insertLote.show();
        insertLote.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_InsertLoteActionPerformed

    private void menu_InsertTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InsertTransporteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InsertUnidadTransporte insertUnidadTransporte = new InsertUnidadTransporte();
        insertUnidadTransporte.show();
        insertUnidadTransporte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_InsertTransporteActionPerformed

    private void menu_InsertUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InsertUsuarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InsertUsuario inserUsuario = new InsertUsuario();
        inserUsuario.show();
        inserUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_InsertUsuarioActionPerformed

    private void menu_LotesAnuladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_LotesAnuladosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Lotes_Anulados lotesAnulados = new Lotes_Anulados();
        lotesAnulados.show();
        lotesAnulados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_LotesAnuladosActionPerformed

    private void menu_HistorialProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_HistorialProductosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HistorialProductos historialProductos = new HistorialProductos();
        historialProductos.show();
        historialProductos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_HistorialProductosActionPerformed

    private void menu_DeleteUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteUpdateProductActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteUpdateProductoMayorista deleteUpdateProduct = new DeleteUpdateProductoMayorista();
        deleteUpdateProduct.show();
        deleteUpdateProduct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_DeleteUpdateProductActionPerformed

    private void menu_DeleteUpdateCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteUpdateCategoriaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteUpdateCategoria deleteUpdateCategoria = new DeleteUpdateCategoria();
        deleteUpdateCategoria.show();
        deleteUpdateCategoria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_DeleteUpdateCategoriaActionPerformed

    private void menu_DeleteUpdateLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteUpdateLoteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteUpdateLote deleteUpdateLote = new DeleteUpdateLote();
        deleteUpdateLote.show();
        deleteUpdateLote.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_DeleteUpdateLoteActionPerformed

    private void menu_DeleteUpdateTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteUpdateTransporteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteUpdateUnidadTransporte deleteUpdateTransporte = new DeleteUpdateUnidadTransporte();
        deleteUpdateTransporte.show();
        deleteUpdateTransporte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_DeleteUpdateTransporteActionPerformed

    private void menu_DeleteUpdateBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteUpdateBodegaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteUpdateBodega deleteUpdateBodega = new DeleteUpdateBodega();
        deleteUpdateBodega.show();
        deleteUpdateBodega.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_DeleteUpdateBodegaActionPerformed

    private void menu_GraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_GraficosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Graficos graficos = new Graficos();
        graficos.show();
        graficos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_GraficosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menu_DeleteUpdateUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteUpdateUsuarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteUpdateUsuario deleteUpdateUsuario = new DeleteUpdateUsuario();
        deleteUpdateUsuario.show();
        deleteUpdateUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_DeleteUpdateUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_ICON;
    private javax.swing.JMenuItem menu_DeleteUpdateBodega;
    private javax.swing.JMenuItem menu_DeleteUpdateCategoria;
    private javax.swing.JMenuItem menu_DeleteUpdateLote;
    private javax.swing.JMenuItem menu_DeleteUpdateProduct;
    private javax.swing.JMenuItem menu_DeleteUpdateTransporte;
    private javax.swing.JMenuItem menu_DeleteUpdateUsuario;
    private javax.swing.JMenuItem menu_Graficos;
    private javax.swing.JMenuItem menu_HistorialProductos;
    private javax.swing.JMenuItem menu_InsertBodega;
    private javax.swing.JMenuItem menu_InsertCategoria;
    private javax.swing.JMenuItem menu_InsertLote;
    private javax.swing.JMenuItem menu_InsertProduct;
    private javax.swing.JMenuItem menu_InsertTransporte;
    private javax.swing.JMenuItem menu_InsertUsuario;
    private javax.swing.JMenuItem menu_LotesAnulados;
    // End of variables declaration//GEN-END:variables
}
