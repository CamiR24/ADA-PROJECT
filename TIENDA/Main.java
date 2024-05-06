public class Main {
    public static void main(String[] args) {
        // Crear 5 instancias de ArticuloInventario
        ArticuloInventario producto = new ArticuloInventario("Laptop", "Laptop de alto rendimiento", "Electrónica", "Portátil,Computadora", 1200.00, "urlFoto1.jpg");
        ArticuloInventario producto1 = new ArticuloInventario("Lámpara", "Lámpara para mesa de noche", "Electrónica", "Lámpara", 500.00, "urlFoto1.jpg");
        ArticuloInventario producto2 = new ArticuloInventario("Leche", "Leche deslactosada", "Lácteos", "Leche", 40.00, "urlFoto1.jpg");
        ArticuloInventario producto3 = new ArticuloInventario("Camisa", "Camisa de algodón", "Ropa", "Ropa mujeres", 200.00, "urlFoto1.jpg");
        ArticuloInventario producto4 = new ArticuloInventario("Queso", "Queso mozarella fresco", "Lácteos", "Queso", 30.00, "urlFoto1.jpg");

        // Mostrar detalles de cada producto
        producto.mostrarDetalles();
        producto1.mostrarDetalles();
        producto2.mostrarDetalles();
        producto3.mostrarDetalles();
        producto4.mostrarDetalles();
   
    }
}

