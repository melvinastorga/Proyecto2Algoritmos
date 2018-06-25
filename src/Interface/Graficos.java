/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Domain.Bodega;
import Domain.OrdenDistribucion;
import Domain.ProductoMayoristaPorOrden;
import Logica.creatorPdf;
import java.util.ArrayList;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Clase donde se crea los graficos que muestran la cantidad de pr3oductos entregados a cada bodega
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class Graficos extends javax.swing.JFrame {
    LoginPanel login=new LoginPanel();
    ArrayList<OrdenDistribucion> a= login.ordenDsitribucion();
    ArrayList<Bodega>bodega=login.bodega.valoresBodega();
     ChartPanel panel ;
    /**
     * Creates new form Graficos
     */
    public Graficos() {
        initComponents();
      grafic();
      bodega.toString();
       
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
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jLabel3.setText("Gráfico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 210, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 700, 400));

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 100, 30));

        jButton2.setText("Exportar PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 100, 30));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jButton4.setText("Regresar");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 720, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
        CategoryPlot plot = new CategoryPlot();

        // Add the first dataset and render as bar
        CategoryItemRenderer lineRenderer = new LineAndShapeRenderer();
        plot.setDataset(0, createDataset());
        plot.setRenderer(0, lineRenderer);
      
      


//         Add the second dataset and render as lines
        CategoryItemRenderer baRenderer = new BarRenderer();
        plot.setDataset(1, createDataset());
        plot.setRenderer(1, baRenderer);

        // Set Axis
        plot.setDomainAxis(new CategoryAxis("Bodegas de procedencia "));
        plot.setRangeAxis(new NumberAxis("cantidad de productos"));
        
        JFreeChart chart = new JFreeChart(plot);
        chart.setTitle("Bodegas");

         panel = new ChartPanel(chart);
 
        jPanel1.setLayout(new java.awt.BorderLayout());
         
        jPanel1.add(panel);
        jPanel1.validate();
        scrollPane1.add(panel);
        scrollPane1.validate();
    
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Logica.creatorPdf pdf=new creatorPdf();
        pdf.pdfCreator(panel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         AdministratorPanel administradorPanel = new AdministratorPanel();
        this.dispose();
        administradorPanel.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
 /**
 * Metodo que utiliza la libreia freechart,para mostrar los datos en una grafica
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 * @return DefaultCategoryDataset
 */
    private DefaultCategoryDataset createDataset() {

     
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      try {
             ArrayList<OrdenDistribucion> list = grafic();
              String nombreBodegaDestino="";
              String nombreBodegaProcedencia="";
             int contador=0;
             int suma=0;
             int igual = -1;
             int bodegaProcedencia=-1;
              for(int i=0;i<list.size();i++){
                  if(list.get(i).getIdBodegaDestino()==igual&&list.get(i).getIdBodegaPocedencia()==bodegaProcedencia||igual==-1){
                     igual=list.get(i+1).getIdBodegaDestino();
                     bodegaProcedencia=list.get(i+1).getIdBodegaPocedencia();
                 //System.out.println("llego "+list.get(i).getAmount());
                      for (ProductoMayoristaPorOrden s : list.get(i).getListaProductos()) {
                          contador++;
                      }
                       for (Bodega s : bodega) 
                       {
                        if (list.get(i).getIdBodegaDestino()==s.getId()){
                          nombreBodegaDestino=s.getNombre();
                        break;
                        }
                      }
                         for (Bodega s : bodega) 
                       {
                        if (list.get(i).getIdBodegaPocedencia()==s.getId()){
                          nombreBodegaProcedencia=s.getNombre();
                        break;
                        }
                      }
                      

                 suma=contador;
                dataset.addValue(suma, nombreBodegaDestino+"",nombreBodegaProcedencia);
              }else{
                      contador=0;
                       suma=0;
                      
                       for (ProductoMayoristaPorOrden s : list.get(i).getListaProductos()) {
                          contador++;
                      }
                       for (Bodega s : bodega) 
                       {
                        if (list.get(i).getIdBodegaDestino()==s.getId()){
                          nombreBodegaDestino=s.getNombre();
                        break;
                        }
                      }
                        for (Bodega s : bodega) 
                       {
                        if (list.get(i).getIdBodegaPocedencia()==s.getId()){
                          nombreBodegaProcedencia=s.getNombre();
                        break;
                        }
                      }
                       suma=contador;
                       dataset.addValue(suma, nombreBodegaDestino+"",nombreBodegaProcedencia);
                        suma=0;
                        contador=0;
                        igual=list.get(i+1).getIdBodegaDestino();
                        bodegaProcedencia=list.get(i+1).getIdBodegaPocedencia();
                  }
                        
              }
         } catch (Exception ex) {
            
         }

      return dataset;
   }
    /**
 * Metodo que ordena el ArrayList de orden de distribucion
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 * @return ArrayList
 */
   public ArrayList grafic(){
     
        for (int i = 0; i < a.size(); i++) {
           for (int j = 0; j < a.size() - i - 1; j++) {
               if (a.get(j).getIdBodegaDestino()<=a.get(j + 1).getIdBodegaDestino()&&a.get(j).getIdBodegaPocedencia()<=a.get(j + 1).getIdBodegaPocedencia()) {
                  OrdenDistribucion temp = (OrdenDistribucion) a.get(j);
                  a.set(j, a.get(j + 1));
                  a.set(j + 1, temp);
               }
           }
           
       }
       System.err.println(a.toString());
       
  return  a;     
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
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
