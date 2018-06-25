/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Categoria;
import Domain.Lote;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * Clase donde se modifica y se borra los lotes de productos
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class DeleteUpdateLote extends javax.swing.JFrame {

    SimpleDateFormat formart1 = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * Creates new form deleteUpdateLote
     */
    public DeleteUpdateLote() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();

        DefaultTableModel model = (DefaultTableModel) this.tabla_Lote.getModel();
        model.setRowCount(0);
        Object O[] = null;

        ArrayList listLotes = new ArrayList();
        Iterator it = LoginPanel.lote.keySet().iterator();
        while (it.hasNext()) {

            Object key = it.next();
            listLotes.add(LoginPanel.lote.get(key));

        }

        cargarTablaLote(tabla_Lote, listLotes);
        tfd_IDLoteAEliminar.setEnabled(false);
        tfd_IDLoteAActualizar.setEnabled(false);
        tfd_EmpaqueActualizado.setEnabled(false);
        tfd_VencimientoActualizado.setEnabled(false);
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
        tabla_Lote = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfd_IDLoteAEliminar = new javax.swing.JTextField();
        lbl_Mensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfd_IDLoteAActualizar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfd_CodigoActualizado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        calendario_ActualizarEmpacado = new com.toedter.calendar.JDateChooser();
        tfd_EmpaqueActualizado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        calendario_VencimientoActualizado = new com.toedter.calendar.JDateChooser();
        tfd_VencimientoActualizado = new javax.swing.JTextField();
        btn_Actualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Delete or Update Lote");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 21, -1, -1));

        tabla_Lote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Codigo Lote", "Fecha Empacado", "Fecha Vencimiento"
            }
        ));
        tabla_Lote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_LoteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Lote);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 774, 529));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 132, 61));

        lbl_LOGO.setText("jLabel2");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 700, 150, 120));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 760, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("La ID del Lote a eliminar es:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, -1, -1));

        tfd_IDLoteAEliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDLoteAEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 720, 160, -1));

        lbl_Mensaje.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_Mensaje.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lbl_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, 360, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("ID Lote");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        tfd_IDLoteAActualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_IDLoteAActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 110, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Codigo Lote");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, -1, -1));

        tfd_CodigoActualizado.setBackground(new java.awt.Color(0, 0, 0));
        tfd_CodigoActualizado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        tfd_CodigoActualizado.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(tfd_CodigoActualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 220, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Fecha de empacado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 190, 20));

        calendario_ActualizarEmpacado.setBackground(new java.awt.Color(0, 0, 0));
        calendario_ActualizarEmpacado.setForeground(new java.awt.Color(255, 255, 0));
        calendario_ActualizarEmpacado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(calendario_ActualizarEmpacado, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 330, 230, -1));

        tfd_EmpaqueActualizado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_EmpaqueActualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 220, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Fecha de vencimiento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, -1, -1));

        calendario_VencimientoActualizado.setBackground(new java.awt.Color(0, 0, 0));
        calendario_VencimientoActualizado.setForeground(new java.awt.Color(255, 255, 0));
        calendario_VencimientoActualizado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(calendario_VencimientoActualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 220, -1));

        tfd_VencimientoActualizado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        getContentPane().add(tfd_VencimientoActualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 220, -1));

        btn_Actualizar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Actualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_Actualizar.setForeground(new java.awt.Color(255, 255, 0));
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Obtener Fechas Nuevas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo  donde se carga una tabla con los productos con su respectivos lotes
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
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

            model.setValueAt(lote1.getId(), i, 0);
            model.setValueAt(lote1.getCodigoLote(), i, 1);
            model.setValueAt(fechaEmpaque, i, 2);
            model.setValueAt(fechaVencimiento, i, 3);
        }

    }

    public String getFecha(Date date) {
        if(date != null){
        return formart1.format(date);
        }
        return null;
    }
    //fin loqueras
    //}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_LoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_LoteMouseClicked
        // TODO add your handling code here:
        this.lbl_Mensaje.setText("");
        int row = this.tabla_Lote.getSelectedRow();
        int id = Integer.parseInt(this.tabla_Lote.getValueAt(row, 0).toString());
        tfd_IDLoteAEliminar.setText(id + "");
        tfd_IDLoteAActualizar.setText(id + "");

        Iterator it = LoginPanel.lote.keySet().iterator();
        while (it.hasNext()) {

            Object key = it.next();
            // listLotes.add(LoginPanel.categoria.get(key));
            Lote lote = LoginPanel.lote.get(key);
            if (Integer.parseInt(tfd_IDLoteAEliminar.getText()) == lote.getId()) {
                DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                String fechaEmpaque = ("" + hourdateFormat.format(lote.getFechaEmpacado()));
                String fechaVencimiento = getFecha(lote.getFechaVencimiento());
                tfd_CodigoActualizado.setText(lote.getCodigoLote());
                tfd_EmpaqueActualizado.setText(fechaEmpaque);
                tfd_VencimientoActualizado.setText(fechaVencimiento);
                break;
            }
        }
    }//GEN-LAST:event_tabla_LoteMouseClicked

    public String getFecha2(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formart1.format(jd.getDate());
        } else {
            return null;
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Iterator it = LoginPanel.lote.keySet().iterator();
        while (it.hasNext()) {

            Object key = it.next();
            // listLotes.add(LoginPanel.categoria.get(key));
            Lote lote = LoginPanel.lote.get(key);
            if (Integer.parseInt(tfd_IDLoteAEliminar.getText()) == lote.getId()) {
                LoginPanel.lote.remove(key);
                lbl_Mensaje.setText("Lote eliminado con exito");
                break;
            }
        }

        ArrayList listLotes2 = new ArrayList();
        Iterator it2 = LoginPanel.lote.keySet().iterator();
        while (it2.hasNext()) {

            Object key = it2.next();
            listLotes2.add(LoginPanel.lote.get(key));
        }

        cargarTablaLote(tabla_Lote, listLotes2);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static Date convierteStringADate(String stringFecha, String formato) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            Date fecha = sdf.parse(stringFecha);
            return fecha;
        } catch (Exception e) {
//logger.error("convierteStringADate -- Ha ocurrido un error en la conversion de fechas" + e);
            System.out.println("ENTRE AL ELSE QUE DEVUELVE UN NULL CUANDO CONVIERTO STRING A DATE");
            return null;
        }
    }

//En el parámetro "formato" le pasas por ejemplo "dd/MM/yyyy"

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        // TODO add your handling code here:
        if (tfd_IDLoteAActualizar.getText().equals("") || tfd_CodigoActualizado.getText().equals("") || tfd_EmpaqueActualizado.getText().equals("") || tfd_VencimientoActualizado.getText().equals("")) {
            lbl_Mensaje.setText("Llene todos los espacios para actualizar");
        } else {

            Iterator it = LoginPanel.lote.keySet().iterator();
            while (it.hasNext()) {

                Object key = it.next();
                // listLotes.add(LoginPanel.categoria.get(key));
                Lote lote = LoginPanel.lote.get(key);
                if (Integer.parseInt(tfd_IDLoteAActualizar.getText()) == lote.getId()) {

                    LoginPanel.lote.get(key).setCodigoLote(tfd_CodigoActualizado.getText());
                    LoginPanel.lote.get(key).setFechaEmpacado(convierteStringADate(tfd_EmpaqueActualizado.getText(), "dd/MM/yyyy"));
                    LoginPanel.lote.get(key).setFechaVencimiento(convierteStringADate(tfd_VencimientoActualizado.getText(), "dd/MM/yyyy"));
                    lbl_Mensaje.setText("El lote ha sido actualizado");
                    break;
                }
            }

            ArrayList listLotes = new ArrayList();
            Iterator it2 = LoginPanel.lote.keySet().iterator();
            while (it2.hasNext()) {

                Object key = it2.next();
                listLotes.add(LoginPanel.lote.get(key));
            }

            cargarTablaLote(tabla_Lote, listLotes);
            tfd_IDLoteAActualizar.setText("");
            tfd_CodigoActualizado.setText("");
            tfd_EmpaqueActualizado.setText("");
            tfd_VencimientoActualizado.setText("");

        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tfd_EmpaqueActualizado.setText(getFecha2(calendario_ActualizarEmpacado));
        tfd_VencimientoActualizado.setText(getFecha2(calendario_VencimientoActualizado));
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
            java.util.logging.Logger.getLogger(DeleteUpdateLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUpdateLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUpdateLote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private com.toedter.calendar.JDateChooser calendario_ActualizarEmpacado;
    private com.toedter.calendar.JDateChooser calendario_VencimientoActualizado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JTable tabla_Lote;
    private javax.swing.JTextField tfd_CodigoActualizado;
    private javax.swing.JTextField tfd_EmpaqueActualizado;
    private javax.swing.JTextField tfd_IDLoteAActualizar;
    private javax.swing.JTextField tfd_IDLoteAEliminar;
    private javax.swing.JTextField tfd_VencimientoActualizado;
    // End of variables declaration//GEN-END:variables
}
