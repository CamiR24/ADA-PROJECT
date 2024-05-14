interface NotificacionFactoryA {
    EmailNotificacion crearEmailNotificacion();

    SMSNotificacion crearSMSNotificacion();

    AppNotificacion crearAppNotificacion();
}