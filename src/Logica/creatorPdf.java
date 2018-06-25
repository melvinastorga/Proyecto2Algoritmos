/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Graphics2D;
import java.awt.ScrollPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartPanel;
/**
 * Clase donde se encuentra el metodo para exportar datos a PDF
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class creatorPdf {
   /**
 * Metodo que exporta datos a PDF
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
    public void pdfCreator( ChartPanel jPanel_graphics){
    JFileChooser fileChooser = new JFileChooser(new File("c:\\"));
        fileChooser.setDialogTitle("Save pdf");

        FileNameExtensionFilter filtroExtension = new FileNameExtensionFilter("Documento(*.pdf)", "pdf");//filtra archivos de tipo jpg
        fileChooser.setFileFilter(filtroExtension);

        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = new File(fileChooser.getSelectedFile() + ".pdf");//crea el archivo file con la extencion jpg

        Document document = new Document(PageSize._11X17.rotate());
    PdfWriter writer = null;

         try {
             writer = PdfWriter.getInstance(document, new FileOutputStream(file));
         } catch (FileNotFoundException ex) {
            
         } catch (DocumentException ex) {
            
         }


    document.open();
    PdfContentByte cb = writer.getDirectContent();

    PdfTemplate tp = cb.createTemplate(1000,1000);
    Graphics2D g2;

    g2 = tp.createGraphicsShapes(4000, 500);

    // g2 = tp.createGraphics(500, 500);
    jPanel_graphics.print(g2);
    g2.dispose();
    cb.addTemplate(tp, 30, 300);

    // step 5: we close the document
    document.close();
  
    } 
    }
}
