public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance(); 

        config.setServerUrl("http://miapi.com"); 
        config.setPort(8080); 
        config.setUsername("usuario123"); // Establece el nombre de usuario.
        config.setPassword("contraseña123"); // Establece la contraseña.

        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto: " + config.getPort());
        System.out.println("Nombre de Usuario: " + config.getUsername()); // Imprime el nombre de usuario.
        System.out.println("Contraseña: " + config.getPassword()); // Imprime la contraseña.
    }
}
