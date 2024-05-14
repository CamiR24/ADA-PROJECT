public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("España", "Jamaica");

        // Cambiar a otra estrategia: Ruta más corta
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Nueva Zelanda", "Colombia");

        // Cambiar a otra estrategia: Ruta más económica
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Francia", "Alemania");

        gps.setRutaStrategy(new RutaMasRapida());
        gps.calcularRuta("Republica Dominicana", "Trinidad y Tobago");

        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("China", "Japon");

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Guatemala", "El Salvador ");
    }
}
