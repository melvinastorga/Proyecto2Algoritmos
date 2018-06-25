/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Bodega;
import Domain.Categoria;
import Domain.Lote;
import Domain.ProductoMayorista;
import Domain.Usuario;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * Clase donde se observa el historial de productos
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class HistorialProductos extends javax.swing.JFrame {

    LoginPanel login = new LoginPanel();

    /**
     * Creates new form HistorialProductos
     */
    public HistorialProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();

        ArrayList listaLotes = login.lotes();

        for (Object i : listaLotes) {

            cb_Lote.addItem(i + "");
        }
        ArrayList<Categoria> listaCategoria = login.CategoriaCompleta();
        // ArrayList<Categoria> listaCategoria=login.;

        for (Categoria j : listaCategoria) {

            cb_Categia.addItem(j.getNombre() + "");
        }

        for (Usuario u : LoginPanel.usuario) {

            if (!u.getAdministrador()) {
                cb_Usuario.addItem(u.getNombre());
            }
        }

        LinkedList<Bodega> listaBodegas = LoginPanel.bodega.recorreGraph();

        for (Bodega b : listaBodegas) {

            cb_Bodega.addItem(b.getNombre());
        }

        //Aqui trato de meterle productos a la tabla
         LinkedList listaProductos = LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root());
        cargaTablaProductos(tabla_Historial,listaProductos);

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
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Historial = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cb_Categia = new javax.swing.JComboBox<>();
        cb_Lote = new javax.swing.JComboBox<>();
        cb_Usuario = new javax.swing.JComboBox<>();
        cb_Bodega = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cb_Filtrado = new javax.swing.JComboBox<>();
        lbl_Mensaje = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Historial de productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 0, 295, 51));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 136, 50));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 710, 160, 120));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 76, 25));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Lote");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 60, 25));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Usuario Operador");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 150, -1));

        tabla_Historial.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tabla_Historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bodega", "Fecha Orden", "Producto", "Categoria", "Lote", "Operador"
            }
        ));
        jScrollPane1.setViewportView(tabla_Historial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 183, 987, 515));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Filtrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 120, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Digite el nombre de la bodega");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 68, 240, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        cb_Categia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null" }));
        getContentPane().add(cb_Categia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        cb_Lote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null" }));
        getContentPane().add(cb_Lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        cb_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null" }));
        getContentPane().add(cb_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        cb_Bodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null" }));
        getContentPane().add(cb_Bodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        cb_Filtrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "Bodega", "Categoria", "Lote", "Usuario" }));
        getContentPane().add(cb_Filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, -1, -1));

        lbl_Mensaje.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lbl_Mensaje.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 740, 60));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Seleccione el tipo de filtrado");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 220, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel9.setText("jLabel8");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargaTablaProductos(JTable tabla ,LinkedList list) {
        String nombreCategoria = "";
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        Object O[] = null;
        // Arraylist listaProductos = LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root();
       
        for (int i = 0; i < list.size(); i++) {
            model.addRow(O);
            ProductoMayorista producto = (ProductoMayorista) list.get(i);

            int idCategoria = producto.getIdCategoria();

            Iterator it = LoginPanel.categoria.keySet().iterator();
            while (it.hasNext()) {

                Object key = it.next();
                // listLotes.add(LoginPanel.categoria.get(key));
                Categoria cat = LoginPanel.categoria.get(key);
                if (idCategoria == cat.getId()) {
                    
                    nombreCategoria = cat.getNombre();
                }
            }
            model.setValueAt(producto.getNombre(), i, 2);
            model.setValueAt(nombreCategoria, i, 3);
            model.setValueAt(producto.getIdLote(), i, 4);

        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String filtrado = (String) cb_Filtrado.getSelectedItem();
        if(filtrado.equals("null")){
            lbl_Mensaje.setText("Escoja un filtro");
        }else{
        
        String categoriaAFiltrar = (String) cb_Categia.getSelectedItem();
       // System.out.println(categoriaAFiltrar+" HAAA");
        String loteAFiltrat = (String)  cb_Lote.getSelectedItem();
        String bodegaAFiltrar =(String) cb_Bodega.getSelectedItem();
        String usuarioAFiltrar = (String) cb_Usuario.getSelectedItem();
        String fechaInicioAFiltrar = "";
        String  fechaFinalAFiltrar = "";
        int idCategoriaAFiltrar = 0;
        LinkedList<ProductoMayorista> listaProductos = LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root());
        LinkedList listaProductosFiltrada = new LinkedList();
        
        if(!categoriaAFiltrar.equals("null")){
         ArrayList<Categoria> listCategoria = new ArrayList();
        Iterator it = LoginPanel.categoria.keySet().iterator();
        while (it.hasNext()) {
            
            Object key = it.next();
            listCategoria.add(LoginPanel.categoria.get(key));
        }
        
        for (int i = 0; i < listCategoria.size(); i++) {
            
            Categoria cat = listCategoria.get(i);
            if(cat.getNombre().equals(categoriaAFiltrar)){
                idCategoriaAFiltrar = cat.getId();
            }
        }
        
        for (int i = 0; i < listaProductos.size(); i++) {
            
            ProductoMayorista producto = listaProductos.get(i);
            
            if(producto.getIdCategoria()==  idCategoriaAFiltrar){
               listaProductosFiltrada.add(producto);

            }
        }
        cargaTablaProductos(tabla_Historial, listaProductosFiltrada);
        }else{
           cargaTablaProductos(tabla_Historial, listaProductos); 
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Bodega;
    private javax.swing.JComboBox<String> cb_Categia;
    private javax.swing.JComboBox<String> cb_Filtrado;
    private javax.swing.JComboBox<String> cb_Lote;
    private javax.swing.JComboBox<String> cb_Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTable tabla_Historial;
    // End of variables declaration//GEN-END:variables
}
