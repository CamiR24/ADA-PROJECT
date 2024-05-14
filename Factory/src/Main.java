public class Main {
    public static void main(String[] args) {
        // Factory Method
        NotificacionFactory factory = new NotificacionFactory();
        Notificacion emailNotificacion = factory.crearNotificacion("email");
        emailNotificacion.enviarMensaje("Hola desde el Factory Method");

        // Abstract Factory
        NotificacionFactoryA urgentFactory = new UrgenteNotificacionFactory();
        EmailNotificacion urgentEmail = urgentFactory.crearEmailNotificacion();
        urgentEmail.enviarMensaje("¡Urgente! Esto es una notificación de email desde Abstract Factory");

        // Comparación con creación directa de objetos
        EmailNotificacion directEmail = new EmailNotificacion();
        directEmail.enviarMensaje("Esta es una notificación de email creada directamente");
    }
}