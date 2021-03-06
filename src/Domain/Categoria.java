
package Domain;

/**
 * Constructor categoria
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
 */
public class Categoria {

    int id;
    String nombre;
    String descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Categoria() {
        
          this.id = 0;
        this.nombre = "";
        this.descripcion = "";
        
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
}
