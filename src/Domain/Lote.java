
package Domain;

import java.util.Date;


public class Lote {
    
    int id;
    String codigoLote;
    Date fechaEmpacado; //Fecha y hora
    Date fechaVencimiento; //Solo Fecha

    public Lote(int id, String codigoLote, Date fechaEmpacado, Date fechaVencimiento) {
        this.id = id;
        this.codigoLote = codigoLote;
        this.fechaEmpacado = fechaEmpacado;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Lote() {
         this.id = 0;
        this.codigoLote = "";
        this.fechaEmpacado = null;
        this.fechaVencimiento = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    public Date getFechaEmpacado() {
        return fechaEmpacado;
    }

    public void setFechaEmpacado(Date fechaEmpacado) {
        this.fechaEmpacado = fechaEmpacado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Lote{" + "id=" + id + ", codigoLote=" + codigoLote + ", fechaEmpacado=" + fechaEmpacado + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    

}
