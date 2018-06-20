/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Conexiones.Conexion;
import Conexiones.Query;
import Domain.Bodega;
import Domain.Categoria;
import Domain.Lote;
import Domain.OrdenDistribucion;
import Domain.ProductoMayorista;
import Domain.ProductoMayoristaPorOrden;
import Domain.UnidadTransporte;
import Domain.Usuario;
import Logica.BinaryTree;
import Logica.GraphAdyacency;
import Logica.GraphException;
import Logica.LinkedBinaryTree;
import Logica.TreeExceptions;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPanel extends javax.swing.JFrame {

    public static HashMap<Integer, Categoria> categoria = Query.categoria();
    public static LinkedBinaryTree binary = Query.productoMayorista();
    public static TreeMap<Integer, Lote> lote = Query.lote();
    public static LinkedHashMap<Integer, UnidadTransporte> transporte = Query.unidadTransporte();
    public static LinkedList<OrdenDistribucion> orden = Query.ordenDeDistribucion();
    public static LinkedList<Usuario> usuario = Query.usuario();
    public static GraphAdyacency bodega = Query.bodega();
    public static LinkedBinaryTree productoMayorista = Query.productoMayorista();

    public LoginPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        JB_Cancel = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 40));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 140, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 30));

        JB_Cancel.setBackground(new java.awt.Color(255, 0, 0));
        JB_Cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        JB_Cancel.setForeground(new java.awt.Color(255, 255, 0));
        JB_Cancel.setText("Cancel");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 130, 40));

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.jpg"))); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date n = null;
        try {
            n = format.parse("23-10-2018");
        } catch (ParseException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        lote.put(1, new Lote(1, "44", n, n));
        String sql = "delete from categoria\n"
                + "delete from lote\n"
                + "delete from unidadTransporte\n"
                + "delete from bodega\n"
                + "delete from ordenDistribucion\n"
                + "delete from usuario\n"
                + "delete from productoMayorista";
        try {
            Statement statement = Conexion.getConexion().createStatement();
            statement.executeUpdate(sql);
            categoria.forEach((k, v) -> {
                try {
                    statement.executeUpdate("insert categoria values(" + v.getId() + ",'" + v.getNombre() + "','" + v.getDescripcion() + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            lote.forEach((k, v) -> {
                try {
                    statement.executeUpdate("insert lote values(" + v.getId() + ",'" + v.getCodigoLote() + "','" + format.format(v.getFechaEmpacado()) + "','" + format.format(v.getFechaVencimiento()) + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            transporte.forEach((k, v) -> {
                try {
                    statement.executeUpdate("insert unidadTransporte values(" + v.getId() + ",'" + v.getPlaca() + "','" + v.getCapacidad() + "','" + v.getUrlFoto() + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            for (Usuario u : usuario) {
                try {
                    statement.executeUpdate("insert usuario values(" + u.getId() + ",'" + u.getNombre() + "','" + u.isAdministrador() + "','" + u.getUsuario() + "','" + u.getContraseña() + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (OrdenDistribucion o : orden) {
                try {
                    statement.executeUpdate("insert ordenDistribucion values(" + o.getId() + "," + o.getIdBodegaPocedencia() + "," + o.getIdBodegaDestino() + "," + o.getMontoTotal() + "," + o.getPesoTotal() + "," + o.getIdOperador() + ")");
                    for(ProductoMayoristaPorOrden p: o.getListaProductos()){
                       statement.executeUpdate("insert productoMayorista values(" + p.getId() + "," + p.getIdLote() + ",'" + p.getNombre() + "','" + p.getUnidadMedida() + "'," + p.getValorUnidad() + "," + p.getPesoTotal() + ",'" + p.getDescripcion() + "'," + p.getIdLote() + "," + p.getIdCategoria() + "," + p.getPrecioTotal() + ",'" + p.getUrlFoto() + "')"); 
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            LinkedList<ProductoMayorista> list = productoMayorista.preOrder(productoMayorista.root());
            for (ProductoMayorista p : list) {
                try {
                    statement.executeUpdate("insert productoMayorista values(" + p.getId() + ",'" + p.getNombre() + "','" + p.getUnidadMedida() + "'," + p.getValorUnidad() + "," + p.getPesoTotal() + ",'" + p.getDescripcion() + "'," + p.getIdLote() + "," + p.getIdCategoria() + "," + p.getPrecioTotal() + ",'" + p.getUrlFoto() + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            LinkedList<Bodega> list1 = bodega.recorreGraph();
            for (Bodega b : list1) {
                try {
                    statement.executeUpdate("insert bodega values("+b.getId()+",'"+b.getNombre()+"','"+b.getLatitud()+"','"+b.getLongitud()+"',"+b.getDistanciaCentroOperaciones()+",'"+b.getUrlFoto()+"')");
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.exit(0);
    }//GEN-LAST:event_JB_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
