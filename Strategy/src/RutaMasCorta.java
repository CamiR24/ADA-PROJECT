// Estrategia Concreta: Ruta más corta
public class RutaMasCorta implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        // Simulación de cálculo de la ruta más corta (distancia en línea recta)
        double distancia = calcularDistancia(puntoA, puntoB);
        return "Ruta más corta entre " + puntoA + " y " + puntoB + ". Distancia: " + distancia + " km.";
    }

    private double calcularDistancia(String puntoA, String puntoB) {
        // Simulación de cálculo de distancia en línea recta (podría ser una fórmula más precisa)
        return Math.sqrt(Math.pow(2, puntoA.length()) + Math.pow(2, puntoB.length()));
    }
}