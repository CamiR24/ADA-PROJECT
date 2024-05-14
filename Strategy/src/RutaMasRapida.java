public class RutaMasRapida implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        // Simulación de cálculo de la ruta más rápida (considerando velocidad constante)
        double distancia = calcularDistancia(puntoA, puntoB);
        double tiempo = distancia / 100; // Supongamos 100 km/h de velocidad constante
        return "Ruta más rápida entre " + puntoA + " y " + puntoB + ". Tiempo estimado: " + tiempo + " horas.";
    }

    private double calcularDistancia(String puntoA, String puntoB) {
        // Simulación de cálculo de distancia en línea recta
        return Math.sqrt(Math.pow(2, puntoA.length()) + Math.pow(2, puntoB.length()));
    }
}