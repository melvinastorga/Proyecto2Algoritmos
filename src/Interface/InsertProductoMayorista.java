/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.ProductoMayorista;
import Logica.LinkedBinaryTree;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Melvin
 */
public class InsertProductoMayorista extends javax.swing.JFrame{

    LinkedBinaryTree productTree = new LinkedBinaryTree();
    String elegido;
      LoginPanel login=new LoginPanel();
    /**
     * Creates new form insertProductoMayorista
     */
    public InsertProductoMayorista() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
        this.setLocationRelativeTo(null);
        tfd_URLFoto.setEnabled(false);
        lbl_ID2.setText("1");
      
        
         
     ArrayList lista=login.lotes();
         for (Object i: lista) {
        System.out.println (i); //Muestra cada uno de los nombres dentro de listaDeNombres
       jComboBox1.addItem((String) i);
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

        lbl_InsertProduct = new javax.swing.JLabel();
        lbl_ID1 = new javax.swing.JLabel();
        lbl_ID2 = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        tfd_Nombre = new javax.swing.JTextField();
        lbl_UnidadMedida = new javax.swing.JLabel();
        lbl_ValorUnidad = new javax.swing.JLabel();
        tfd_ValorUnidad = new javax.swing.JTextField();
        lbl_PesoTotal = new javax.swing.JLabel();
        tfd_PesoTotal = new javax.swing.JTextField();
        lbl_Descripcion = new javax.swing.JLabel();
        tfd_Descripcion = new javax.swing.JTextField();
        lbl_IDLote = new javax.swing.JLabel();
        lbl_IDCategoria = new javax.swing.JLabel();
        tfd_IDCategoria = new javax.swing.JTextField();
        lbl_PrecioTotal = new javax.swing.JLabel();
        tfd_precioTotal = new javax.swing.JTextField();
        lbl_Fotografia = new javax.swing.JLabel();
        lbl_FOTO = new javax.swing.JLabel();
        btn_BuscarFoto = new javax.swing.JButton();
        tfd_URLFoto = new javax.swing.JTextField();
        btn_InsertOProducto = new javax.swing.JButton();
        cb_UnidadMedida = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_InsertProduct.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertProduct.setForeground(new java.awt.Color(153, 0, 0));
        lbl_InsertProduct.setText("Insert Producto Mayorista");
        getContentPane().add(lbl_InsertProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 465, 51));

        lbl_ID1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID1.setForeground(new java.awt.Color(153, 0, 0));
        lbl_ID1.setText("ID");
        getContentPane().add(lbl_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 69, 45, 39));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID2.setForeground(new java.awt.Color(153, 0, 0));
        lbl_ID2.setText("jLabel3");
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 69, 73, 39));

        lbl_Nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(153, 0, 0));
        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 126, 100, 36));

        tfd_Nombre.setBackground(new java.awt.Color(0, 0, 0));
        tfd_Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfd_Nombre.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(tfd_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 137, 255, -1));

        lbl_UnidadMedida.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_UnidadMedida.setForeground(new java.awt.Color(153, 0, 0));
        lbl_UnidadMedida.setText("Unidad de Medida");
        getContentPane().add(lbl_UnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 189, -1, -1));

        lbl_ValorUnidad.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ValorUnidad.setForeground(new java.awt.Color(153, 0, 0));
        lbl_ValorUnidad.setText("Valor de Unidad");
        getContentPane().add(lbl_ValorUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 247, -1, -1));

        tfd_ValorUnidad.setBackground(new java.awt.Color(0, 0, 0));
        tfd_ValorUnidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfd_ValorUnidad.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(tfd_ValorUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 252, 255, -1));

        lbl_PesoTotal.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_PesoTotal.setForeground(new java.awt.Color(153, 0, 0));
        lbl_PesoTotal.setText("Peso Total");
        getContentPane().add(lbl_PesoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 312, 137, -1));

        tfd_PesoTotal.setBackground(new java.awt.Color(0, 0, 0));
        tfd_PesoTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfd_PesoTotal.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(tfd_PesoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 317, 255, -1));

        lbl_Descripcion.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Descripcion.setForeground(new java.awt.Color(153, 0, 0));
        lbl_Descripcion.setText("Descripcion");
        getContentPane().add(lbl_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 377, -1, -1));

        tfd_Descripcion.setBackground(new java.awt.Color(0, 0, 0));
        tfd_Descripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfd_Descripcion.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(tfd_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 382, 255, -1));

        lbl_IDLote.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_IDLote.setForeground(new java.awt.Color(153, 0, 0));
        lbl_IDLote.setText("ID Lote");
        getContentPane().add(lbl_IDLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 459, -1, -1));

        lbl_IDCategoria.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_IDCategoria.setForeground(new java.awt.Color(153, 0, 0));
        lbl_IDCategoria.setText("ID Categoria");
        getContentPane().add(lbl_IDCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 528, -1, -1));

        tfd_IDCategoria.setBackground(new java.awt.Color(0, 0, 0));
        tfd_IDCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfd_IDCategoria.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(tfd_IDCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 533, 255, -1));

        lbl_PrecioTotal.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_PrecioTotal.setForeground(new java.awt.Color(153, 0, 0));
        lbl_PrecioTotal.setText("Precio Total");
        getContentPane().add(lbl_PrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 596, -1, -1));

        tfd_precioTotal.setBackground(new java.awt.Color(0, 0, 0));
        tfd_precioTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfd_precioTotal.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(tfd_precioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 601, 255, -1));

        lbl_Fotografia.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Fotografia.setForeground(new java.awt.Color(153, 0, 0));
        lbl_Fotografia.setText("Fotografia");
        getContentPane().add(lbl_Fotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 661, -1, -1));
        getContentPane().add(lbl_FOTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 730, 210, 170));

        btn_BuscarFoto.setBackground(new java.awt.Color(153, 153, 153));
        btn_BuscarFoto.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_BuscarFoto.setForeground(new java.awt.Color(0, 102, 102));
        btn_BuscarFoto.setText("Buscar Fotografia");
        btn_BuscarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BuscarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 661, -1, -1));

        tfd_URLFoto.setBackground(new java.awt.Color(0, 0, 0));
        tfd_URLFoto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfd_URLFoto.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(tfd_URLFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, 362, 31));

        btn_InsertOProducto.setBackground(new java.awt.Color(153, 153, 153));
        btn_InsertOProducto.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_InsertOProducto.setForeground(new java.awt.Color(0, 102, 102));
        btn_InsertOProducto.setText("Insertar");
        btn_InsertOProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertOProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InsertOProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 900, 276, 63));

        cb_UnidadMedida.setBackground(new java.awt.Color(0, 0, 0));
        cb_UnidadMedida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cb_UnidadMedida.setForeground(new java.awt.Color(153, 0, 0));
        cb_UnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidades", "Paquetes", "Cajas", "Tarimas" }));
        getContentPane().add(cb_UnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 250, -1));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 970, 280, 60));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 910, 140, 120));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertOProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertOProductoActionPerformed
        // TODO add your handling code here:

        String unidadMedida = "";
        int i = cb_UnidadMedida.getSelectedIndex();

        if (i == 0) {
            unidadMedida = "unidades";
        }
        if (i == 1) {
            unidadMedida = "paquetes";
        }
        if (i == 2) {
            unidadMedida = "cajas";
        }
        if (i == 3) {
            unidadMedida = "tarimas";
        }

        if (tfd_Descripcion.getText().equals("") || tfd_IDCategoria.getText().equals("")  || tfd_Nombre.getText().equals("") || tfd_PesoTotal.getText().equals("") || tfd_URLFoto.getText().equals("") || tfd_ValorUnidad.getText().equals("") || tfd_precioTotal.getText().equals("")) {
            //  if(tfd_Descripcion.equals("")&&tfd_IDCategoria.equals("")&&tfd_IDLote.equals("")&&tfd_Nombre.equals("")&&tfd_PesoTotal.equals("")&&tfd_URLFoto.equals("")&&tfd_ValorUnidad.equals("")&&tfd_precioTotal.equals("")){

            JOptionPane.showMessageDialog(null, "Error, Complete todos los espacios por favor");
        } else {

            try {
                ProductoMayorista producto = new ProductoMayorista(Integer.parseInt(lbl_ID2.getText()), tfd_Nombre.getText(), unidadMedida, Integer.parseInt(tfd_ValorUnidad.getText()), Integer.parseInt(tfd_PesoTotal.getText()), tfd_Descripcion.getText(), Integer.parseInt(elegido), Integer.parseInt(tfd_IDCategoria.getText()), Double.parseDouble(tfd_precioTotal.getText()), tfd_URLFoto.getText());

                System.out.println(producto.getId() + " " + producto.getNombre() + " " + producto.getUnidadMedida() + " " + producto.getDescripcion());
                tfd_Descripcion.setText("");
                tfd_IDCategoria.setText("");
              //  tfd_IDLote.setText("");
                tfd_Nombre.setText("");
                tfd_PesoTotal.setText("");
                tfd_URLFoto.setText("");
                tfd_ValorUnidad.setText("");
                tfd_precioTotal.setText("");
                lbl_FOTO.setIcon(null);
                this.repaint();
                tfd_Nombre.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite numeros en los espacios (Valor de unidad, peso total, IDLote, IDCategoria");
            }

        }


    }//GEN-LAST:event_btn_InsertOProductoActionPerformed

    private void btn_BuscarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarFotoActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Productos");
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
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_FOTO.getWidth(), lbl_FOTO.getHeight(), Image.SCALE_DEFAULT));
        lbl_FOTO.setIcon(icon2);
        this.repaint();

    }//GEN-LAST:event_btn_BuscarFotoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
          
       elegido=jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

       

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
            java.util.logging.Logger.getLogger(InsertProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertProductoMayorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertProductoMayorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BuscarFoto;
    private javax.swing.JButton btn_InsertOProducto;
    private javax.swing.JComboBox<String> cb_UnidadMedida;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Descripcion;
    private javax.swing.JLabel lbl_FOTO;
    private javax.swing.JLabel lbl_Fotografia;
    private javax.swing.JLabel lbl_ID1;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_IDCategoria;
    private javax.swing.JLabel lbl_IDLote;
    private javax.swing.JLabel lbl_InsertProduct;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_PesoTotal;
    private javax.swing.JLabel lbl_PrecioTotal;
    private javax.swing.JLabel lbl_UnidadMedida;
    private javax.swing.JLabel lbl_ValorUnidad;
    private javax.swing.JTextField tfd_Descripcion;
    private javax.swing.JTextField tfd_IDCategoria;
    private javax.swing.JTextField tfd_Nombre;
    private javax.swing.JTextField tfd_PesoTotal;
    private javax.swing.JTextField tfd_URLFoto;
    private javax.swing.JTextField tfd_ValorUnidad;
    private javax.swing.JTextField tfd_precioTotal;
    // End of variables declaration//GEN-END:variables
}
