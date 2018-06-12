
package Domain;


public class Usuario {
    
    int id;
    String nombre;
    boolean administrador; //true = administrador   false = operador
    String usuario ;
    String contraseña;

    public Usuario(int id, String nombre, boolean administrador, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.administrador = administrador;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario() {
       this.id = 0;
        this.nombre = "";
        this.administrador = false;
        this.usuario = "";
        this.contraseña = ""; 
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

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", administrador=" + administrador + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

    
    
}


