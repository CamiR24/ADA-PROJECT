public class Main {
    public static void main(String[] args) {
        // Crear instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Crear instancias de los observadores
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        // Agregar observadores a la estación meteorológica
        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

        // Cambiar la temperatura de la estación dos veces
        weatherStation.setTemperature(25); // Primera actualización
        weatherStation.setTemperature(35); // Segunda actualización
        weatherStation.setTemperature(10); // Segunda actualización
        weatherStation.setTemperature(50); // Segunda actualización
    }
}