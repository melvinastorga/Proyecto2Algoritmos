
package Domain;
/**
 * Contructor bodega
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */

public class Bodega {
    
    int id;
    String nombre;
    String latitud;
    String longitud;
    float distanciaCentroOperaciones;  //En Kilometros
    String urlFoto;

    public Bodega(int id, String nombre, String latitud, String longitud, float distanciaCentroOperaciones, String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.distanciaCentroOperaciones = distanciaCentroOperaciones;
        this.urlFoto = urlFoto;
    }

    public Bodega() {
     this.id = 0;
        this.nombre = "";
        this.latitud = "";
        this.longitud = "";
        this.distanciaCentroOperaciones = 0;
        this.urlFoto = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public float getDistanciaCentroOperaciones() {
        return distanciaCentroOperaciones;
    }

    public void setDistanciaCentroOperaciones(float distanciaCentroOperaciones) {
        this.distanciaCentroOperaciones = distanciaCentroOperaciones;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Bodega{" + "id=" + id + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", distanciaCentroOperaciones=" + distanciaCentroOperaciones + ", urlFoto=" + urlFoto + '}';
    }

    
    
}
