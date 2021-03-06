package back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOLoginRepository {
	
	private Connection connection;
		
	public DAOLoginRepository() {
		connection = SingleConnectionDB.getConnection();
		
	}
	 	
	public boolean validarAutenticacao(ModelLogin moeLogin) throws Exception {
		String sql = "select *from model_login where upper(login) = upper(?) and upper(senha) = upper(?) ";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, moeLogin.getLogin());
		statement.setString(2, moeLogin.getSenha());
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			return true;/*autenticado*/
			
			
		}
		
		return false; /*nao autenticado*/
		}
	
}
