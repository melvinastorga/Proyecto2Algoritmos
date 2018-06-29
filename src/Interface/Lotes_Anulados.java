/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Bodega;
import Domain.Lote;
import Domain.OrdenDistribucion;
import Domain.ProductoMayorista;
import Domain.ProductoMayoristaPorOrden;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import static javax.management.Query.lt;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * Clase donde se anulan los lotes
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class Lotes_Anulados extends javax.swing.JFrame {

    SimpleDateFormat formart1 = new SimpleDateFormat("dd-MM-yyyy");
    LoginPanel login = new LoginPanel();
    
    ArrayList<OrdenDistribucion> ordenDistribucion= login.ordenDsitribucion();
     ArrayList<Bodega>bodega=login.bodega.valoresBodega();

    /**
     * Creates new form lotes_Anulados
     */
    public Lotes_Anulados() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
        this.setLocationRelativeTo(null);
        tablaLotesAnulados.setVisible(false);

        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaHora = ("" + hourdateFormat.format(date));

        // tfd_Empacado.setText(getFecha(calendar_Empacado));
        lbl_FechaActual.setText("Hoy es: " + fechaHora);
        // calendar_Empacado.get
//        ArrayList<Lote> listaLotes = login.lotes();
//        for (Object i : listaLotes) {
//
//            cb_Lotes.addItem(i + "");
//        }
          DefaultTableModel model = (DefaultTableModel) this.tablaLotesAnulados.getModel();
        model.setRowCount(0);
        Object O[] = null;

        ArrayList listLotes = new ArrayList();
        Iterator it = LoginPanel.lote.keySet().iterator();
        while (it.hasNext()) {

            Object key = it.next();
            //
           if(LoginPanel.lote.get(key).getFechaVencimiento().compareTo(date)<0){
            listLotes.add(LoginPanel.lote.get(key));
           }
        }

        cargarTablaLote(tablaLotesAnulados, listLotes);

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
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        btn_BuscarLote = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLotesAnulados = new javax.swing.JTable();
        lbl_FechaActual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Reporte de Lotes Anulados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 11, 135, 64));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 652, 115, 98));

        btn_BuscarLote.setBackground(new java.awt.Color(0, 0, 0));
        btn_BuscarLote.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_BuscarLote.setForeground(new java.awt.Color(255, 255, 0));
        btn_BuscarLote.setText("Ver");
        btn_BuscarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarLoteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BuscarLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 80, 123, 36));

        tablaLotesAnulados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Lote", "Fecha de vencimiento", "Producto"
            }
        ));
        jScrollPane1.setViewportView(tablaLotesAnulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 134, 902, 500));

        lbl_FechaActual.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lbl_FechaActual.setForeground(new java.awt.Color(255, 255, 0));
        lbl_FechaActual.setText("jLabel4");
        getContentPane().add(lbl_FechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 260, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public void cargarTablaLote(JTable producto, ArrayList<Lote> list) {
        DefaultTableModel model = (DefaultTableModel) producto.getModel();
        model.setRowCount(0);
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {

            model.addRow(O);
            Lote lote = (Lote) list.get(i);
            Lote lote1 = (Lote) list.get(i);

            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
           // String fechaEmpaque = ("" + hourdateFormat.format(lote1.getFechaEmpacado()));
            String fechaEmpaque = getFecha(lote1.getFechaEmpacado());
            String fechaVencimiento = getFecha(lote1.getFechaVencimiento());
           LinkedList<ProductoMayorista> listaProductos = LoginPanel.productoMayorista.preOrder(LoginPanel.productoMayorista.root());
          for (int j = 0; j < listaProductos.size(); j++) {
            if(listaProductos.get(j).getIdLote()== Integer.parseInt(list.get(i).getCodigoLote())){
               
              String nombreBodega= buscarBodega(listaProductos.get(j).getIdLote());
               
            model.setValueAt(lote1.getCodigoLote(), i, 0);
            model.setValueAt(lote1.getFechaVencimiento(), i, 1); 
            model.setValueAt(listaProductos.get(j).getNombre(), i, 2);
           //  model.setValueAt(nombreBodega, i, 3);
            }
        }
           
            //model.setValueAt(fechaEmpaque, i, 2);
           // model.setValueAt(fechaVencimiento, i, 3);
        }

    }

    public String getFecha(Date date) {
        if(date != null){
        return formart1.format(date);
        }
        return null;
    }
    public String buscarBodega(int valor){
        int Idbodega = 0;
        ArrayList repetidasBodegas=new ArrayList();
       String bodegaNombre="";
       for(int i=0;i<ordenDistribucion.size();i++){
                      for(int j=0;j<ordenDistribucion.get(i).getListaProductos().size();j++){
           if(ordenDistribucion.get(i).getListaProductos().get(j).getIdLote()==valor){
//               Idbodega=ordenDistribucion.get(i).getIdBodegaDestino();
                repetidasBodegas.add(BodegaNombre(ordenDistribucion.get(i).getIdBodegaDestino()));
               break;
                       }
           }
//               for (ProductoMayoristaPorOrden p : ordenDistribucion.get(i).getListaProductos()) {
//                   if(p.getIdLote()==valor){
//                     repetidasBodegas.add(BodegaNombre(ordenDistribucion.get(i).getIdBodegaDestino()));
//                     
//                     
//               }
//             
//       }
                 HashSet hs = new HashSet();
         hs.addAll(repetidasBodegas);
         repetidasBodegas.clear();
          repetidasBodegas.addAll(hs);
          for (int j = 0;j< repetidasBodegas.size(); j++) {

           bodegaNombre=bodegaNombre+","+ repetidasBodegas.get(j);

        }
               repetidasBodegas.clear();
               }
     
        
    return bodegaNombre;
    }
    public String BodegaNombre(int id){
         String nombreBodega="";
    
        for(int i=0;i<bodega.size();i++){
            if(bodega.get(i).getId()==id){
               nombreBodega=this.bodega.get(i).getNombre();
            }
    }
     return nombreBodega;  
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_BuscarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarLoteActionPerformed
        // TODO add your handling code here:
        tablaLotesAnulados.setVisible(true);
    }//GEN-LAST:event_btn_BuscarLoteActionPerformed

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
            java.util.logging.Logger.getLogger(Lotes_Anulados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lotes_Anulados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lotes_Anulados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lotes_Anulados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lotes_Anulados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BuscarLote;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_FechaActual;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JTable tablaLotesAnulados;
    // End of variables declaration//GEN-END:variables
}
