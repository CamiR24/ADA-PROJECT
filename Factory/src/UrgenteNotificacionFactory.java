class UrgenteNotificacionFactory implements NotificacionFactoryA {
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion();
    }

    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}