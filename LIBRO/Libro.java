public class Libro {
    // Atributos
    String titulo;
    String autor;
    String ISBN;
    double precio;

    // Constructor sin parámetros
    public Libro() {
        String titulo = "The hunger games";
        String autor = "Susan Collins";
        String ISBN = "ACB123";
        double precio = 320.5;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        System.out.println("Detalles del Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Precio: $" + precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El precio del libro se ha actualizado a: $" + this.precio);
    }
}