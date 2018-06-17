
package Domain;

import java.util.LinkedList;


public class OrdenDistribucion {
    
    int id;
    int idBodegaPocedencia;
    int idBodegaDestino;
    double montoTotal;
    float pesoTotal; //En Kilogramos
    LinkedList<ProductoMayorista> listaProductos;
    int idOperador;

    public OrdenDistribucion(int id, int idBodegaPocedencia, int idBodegaDestino, double montoTotal, float pesoTotal, LinkedList<ProductoMayorista> listaProductos, int idOperador) {
        this.id = id;
        this.idBodegaPocedencia = idBodegaPocedencia;
        this.idBodegaDestino = idBodegaDestino;
        this.montoTotal = montoTotal;
        this.pesoTotal = pesoTotal;
        this.listaProductos = listaProductos;
        this.idOperador = idOperador;
    }

    public OrdenDistribucion() {
        this.id = 0;
        this.idBodegaPocedencia = 0;
        this.idBodegaDestino = 0;
        this.montoTotal = 0;
        this.pesoTotal = 0;
        this.listaProductos = null;
        this.idOperador = 0;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBodegaPocedencia() {
        return idBodegaPocedencia;
    }

    public void setIdBodegaPocedencia(int idBodegaPocedencia) {
        this.idBodegaPocedencia = idBodegaPocedencia;
    }

    public int getIdBodegaDestino() {
        return idBodegaDestino;
    }

    public void setIdBodegaDestino(int idBodegaDestino) {
        this.idBodegaDestino = idBodegaDestino;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public float getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(float pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public LinkedList<ProductoMayorista> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<ProductoMayorista> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    @Override
    public String toString() {
        return "ordenDistribucion{" + "id=" + id + ", idBodegaPocedencia=" + idBodegaPocedencia + ", idBodegaDestino=" + idBodegaDestino + ", montoTotal=" + montoTotal + ", pesoTotal=" + pesoTotal + ", listaProductos=" + listaProductos + ", idOperador=" + idOperador + '}';
    }
    
    

}
