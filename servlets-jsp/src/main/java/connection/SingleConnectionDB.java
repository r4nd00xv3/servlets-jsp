package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionDB {
	private static  String banco = "jdbc:postgresql://localhost:5432/jsp-project?autoReconnect=true";
	private static String user = "postgres";
	private static String senha = "admin";
	private static Connection connection = null;
	
	
	
	public static Connection getConnection() {
		return connection;
		
	}
	static {
		conectar();
	}
	
	/**/
	
	public SingleConnectionDB() {/*quando tiver uma instancia vai conectar*/
		conectar();
	}
	
	private static void conectar() {
		try {
			if (connection == null) {
				Class.forName("org.postgresql.Driver");	/*carrega o drive de conexão do banco*/
				connection = DriverManager.getConnection(banco, user, senha);
				connection.setAutoCommit(false);/*nao efetuar alt no banco*/
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();/*mostra qualquer erro ao conectar*/
		}
		
	}

	
		
	}
		
	
		
	


