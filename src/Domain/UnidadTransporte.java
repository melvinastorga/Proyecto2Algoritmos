
package Domain;

/**
 * contructor unidad de transporte
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class UnidadTransporte {
    
    int id;
    String placa;
    String capacidad;
    String urlFoto;

    public UnidadTransporte(int id, String placa, String capacidad, String urlFoto) {
        this.id = id;
        this.placa = placa;
        this.capacidad = capacidad;
        this.urlFoto = urlFoto;
    }

    public UnidadTransporte() {
        this.id = 0;
        this.placa = "";
        this.capacidad = "";
        this.urlFoto = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "UnidadTransporte{" + "id=" + id + ", placa=" + placa + ", capacidad=" + capacidad + ", urlFoto=" + urlFoto + '}';
    }

    
    
}
