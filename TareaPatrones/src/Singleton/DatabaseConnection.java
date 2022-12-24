package Singleton;

public class DatabaseConnection {
	private String usuario;
	private String password;
	private boolean valido;

	private static DatabaseConnection instance;

	private DatabaseConnection() {
		
	}
	
	//métodos de la DataBase

	public static DatabaseConnection getInstance() {
		if (DatabaseConnection.instance == null) {
	          instance = new DatabaseConnection();
			}
	          return instance;
	}

}

