public class AppConfig {
    private static AppConfig instance; 
    private String serverUrl; 
    private int port; 
    private String username; 
    private String password; 

    private AppConfig() {
        this.serverUrl = ""; 
        this.port = 0; 
        this.username = ""; // Inicializa el nombre de usuario a un valor predeterminado si es necesario.
        this.password = ""; // Inicializa la contraseña a un valor predeterminado si es necesario.
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig(); 
        }
        return instance; 
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
