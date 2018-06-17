package Domain;

public class ProductoMayorista {

    int id;
    int idOrden;
    String nombre;
    //unidadMedida =
    String unidadMedida;
    int valorUnidad;
    int pesoTotal;
    String descripcion;
    int idLote;
    int idCategoria;
    double precioTotal;
    String urlFoto;

    public ProductoMayorista(int id, int idOrden, String nombre, String unidadMedida, int valorUnidad, int pesoTotal, String descripcion, int idLote, int idCategoria, double precioTotal, String urlFoto) {
        this.id = id;
        this.idOrden = idOrden;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.valorUnidad = valorUnidad;
        this.pesoTotal = pesoTotal;
        this.descripcion = descripcion;
        this.idLote = idLote;
        this.idCategoria = idCategoria;
        this.precioTotal = precioTotal;
        this.urlFoto = urlFoto;
    }

    public ProductoMayorista() {

        this.id = 0;
        this.idOrden = 0;
        this.nombre = "";
        this.unidadMedida = "";
        this.valorUnidad = 0;
        this.pesoTotal = 0;
        this.descripcion = "";
        this.idLote = 0;
        this.idCategoria = 0;
        this.precioTotal = 0;
        this.urlFoto = "";

    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
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

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "ProductoMayorista{" + "id=" + id + ", nombre=" + nombre + ", unidadMedida=" + unidadMedida + ", valorUnidad=" + valorUnidad + ", pesoTotal=" + pesoTotal + ", descripcion=" + descripcion + ", idLote=" + idLote + ", idCategoria=" + idCategoria + ", precioTotal=" + precioTotal + ", urlFoto=" + urlFoto + '}';
    }

}
