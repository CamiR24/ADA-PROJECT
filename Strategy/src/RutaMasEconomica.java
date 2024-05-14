// Estrategia Concreta: Ruta más económica
public class RutaMasEconomica implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        // Simulación de cálculo de la ruta más económica (considerando costo constante por km)
        double distancia = calcularDistancia(puntoA, puntoB);
        double costoPorKm = 0.1; // Un costo de 0.1 dólares por kilómetro puede ser cualquiera
        double costoTotal = distancia * costoPorKm;
        return "Ruta más económica entre " + puntoA + " y " + puntoB + ". Costo estimado: $" + costoTotal + ".";
    }

    private double calcularDistancia(String puntoA, String puntoB) {
        // Simulación de cálculo de distancia en línea recta
        return Math.sqrt(Math.pow(2, puntoA.length()) + Math.pow(2, puntoB.length()));
    }
}