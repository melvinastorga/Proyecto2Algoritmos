/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Domain.Lote;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin
 */
public class InsertLote extends javax.swing.JFrame {

   public static TreeMap<Integer, Lote> listaLotes;
     SimpleDateFormat formart1 = new SimpleDateFormat("dd-MM-yyyy");
     int id = 0;
    /**
     * Creates new form insertLote
     */
    public InsertLote() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\Melvin\\Desktop\\RepositorioProyecto2Algoritmos\\src\\Imagenes\\Logo.PNG");
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_LOGO.getWidth(), lbl_LOGO.getHeight(), Image.SCALE_DEFAULT));
        lbl_LOGO.setIcon(icon2);
        this.repaint();
        this.setLocationRelativeTo(null);
        tfd_Empacado.setEnabled(false);
        tfd_Vencimiento.setEnabled(false);
        listaLotes = new TreeMap<>();
        id = 0;
        if(listaLotes.isEmpty()){
             lbl_ID2.setText("1");
        }else{
            Iterator it = listaLotes.keySet().iterator();
            while(it.hasNext()){
                Integer key = (Integer)it.next();
                id = listaLotes.get(key).getId()+1;
               
            }
            lbl_ID2.setText(id+"");
        }
  
        
      
        
//        if(listaTransporte.isEmpty()){
//        lbl_ID2.setText("1");
//        }else{
//            Iterator it = listaTransporte.keySet().iterator();
//            while(it.hasNext()){
//                Integer key = (Integer)it.next();
//                id = listaTransporte.get(key).getId()+1;
//               
//            }
//            lbl_ID2.setText(id+"");
        //}
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_InsertLote = new javax.swing.JLabel();
        lbl_ID1 = new javax.swing.JLabel();
        lbl_ID2 = new javax.swing.JLabel();
        lbl_CodigoLote = new javax.swing.JLabel();
        tfd_CodigoLote = new javax.swing.JTextField();
        lbl_FechaEmpacado = new javax.swing.JLabel();
        lbl_FechaVencimiento = new javax.swing.JLabel();
        btn_InsertLote = new javax.swing.JButton();
        calendar_Vencimiento = new com.toedter.calendar.JDateChooser();
        tfd_Empacado = new javax.swing.JTextField();
        tfd_Vencimiento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_LOGO = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_InsertLote.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertLote.setText("Insert Lote");
        getContentPane().add(lbl_InsertLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 39, 215, -1));

        lbl_ID1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID1.setText("ID");
        getContentPane().add(lbl_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 123, -1, -1));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID2.setText("jLabel3");
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 123, -1, -1));

        lbl_CodigoLote.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_CodigoLote.setText("Codigo Lote ");
        getContentPane().add(lbl_CodigoLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));
        getContentPane().add(tfd_CodigoLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 162, -1));

        lbl_FechaEmpacado.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_FechaEmpacado.setText("Fecha Empacado");
        getContentPane().add(lbl_FechaEmpacado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        lbl_FechaVencimiento.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_FechaVencimiento.setText("Fecha de Vencimiento");
        getContentPane().add(lbl_FechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        btn_InsertLote.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_InsertLote.setText("Insert Lote");
        btn_InsertLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertLoteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InsertLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 240, 70));
        getContentPane().add(calendar_Vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));
        getContentPane().add(tfd_Empacado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, -1));
        getContentPane().add(tfd_Vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 160, -1));

        jButton1.setText("Obtener Fechas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 150, 50));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 190, 70));

        lbl_LOGO.setText("jLabel1");
        getContentPane().add(lbl_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 120, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertLoteActionPerformed
        // TODO add your handling code here:
        
        if(tfd_CodigoLote.getText().equals("")||tfd_Empacado.getText().equals("")||tfd_Vencimiento.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los espacios por favor");
        }else{
            Date date = new Date();
            Lote lote = new Lote(Integer.parseInt(lbl_ID2.getText()) , tfd_CodigoLote.getText(), date, calendar_Vencimiento.getDate());
            listaLotes.put(Integer.parseInt(lbl_ID2.getText()), lote);
            //System.out.println(listaLotes);
            
            Iterator it = listaLotes.keySet().iterator();
            while(it.hasNext()){
                Integer key = (Integer)it.next();
                id = listaLotes.get(key).getId()+1;
               
            }
                  
            lbl_ID2.setText(id+"");
            tfd_CodigoLote.setText("");
            tfd_Empacado.setText("");
            tfd_Vencimiento.setText("");
            calendar_Vencimiento.setDate(null);
            tfd_CodigoLote.requestFocus();
        }
        
    }//GEN-LAST:event_btn_InsertLoteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
String fechaHora = (""+hourdateFormat.format(date));
        
       // tfd_Empacado.setText(getFecha(calendar_Empacado));
       tfd_Empacado.setText(fechaHora);
       // calendar_Empacado.get
        tfd_Vencimiento.setText(getFecha(calendar_Vencimiento));
        System.out.println(date);
        System.out.println(calendar_Vencimiento.getDate());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public String getFecha(JDateChooser jd){
        if(jd.getDate()!=null){
            return formart1.format(jd.getDate());
        }else{
            return null;
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
            java.util.logging.Logger.getLogger(InsertLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertLote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InsertLote;
    private com.toedter.calendar.JDateChooser calendar_Vencimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_CodigoLote;
    private javax.swing.JLabel lbl_FechaEmpacado;
    private javax.swing.JLabel lbl_FechaVencimiento;
    private javax.swing.JLabel lbl_ID1;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_InsertLote;
    private javax.swing.JLabel lbl_LOGO;
    private javax.swing.JTextField tfd_CodigoLote;
    private javax.swing.JTextField tfd_Empacado;
    private javax.swing.JTextField tfd_Vencimiento;
    // End of variables declaration//GEN-END:variables
}
