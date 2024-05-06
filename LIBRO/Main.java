public class Main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();

        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "XYZ789", 450.75);

        // Llama al método 'mostrarDetalles' para 'libro2'
        libro1.mostrarDetalles();
        libro2.mostrarDetalles();

        // Llama al método 'actualizarPrecio' para 'libro2'
        libro2.actualizarPrecio(500.0);
    }
}
