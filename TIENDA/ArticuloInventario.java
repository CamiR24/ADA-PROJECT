public class ArticuloInventario {
    // Atributos privados
    private String nombre;
    private String descripcion;
    private String categoría;
    private String etiquetas;
    private double precio;
    private String urlFoto;

    // Constructor
    public ArticuloInventario(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto) {
        this.nombre = nombre; 
        this.descripcion = descripcion;
        this.categoría = categoria;
        this.etiquetas = etiquetas; 
        this.precio = precio; 
        this.urlFoto = urlFoto; 
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoría;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoría = categoria;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles del artículo:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoría);
        System.out.println("Etiquetas: " + etiquetas);
        System.out.println("Precio: " + precio);
        System.out.println("URL de la foto: " + urlFoto);
    }
}
