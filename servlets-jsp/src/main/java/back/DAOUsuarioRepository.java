package back;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class DAOUsuarioRepository {
	private Connection connection;
public DAOUsuarioRepository() {
	connection=SingleConnectionDB.getConnection();
	
	
	
}
public void gravarUsuario(ModelLogin objeto) throws Exception{
	String sql = "INSERT INTO model_login(login, senha, nome, nomeaut, titulob)  VALUES (?, ?, ?, ?, ?);";
	PreparedStatement preparedSql = connection.prepareStatement(sql);
	
	preparedSql.setString(1, objeto.getLogin());
	preparedSql.setString(2, objeto.getSenha());
	preparedSql.setString(3, objeto.getNome());
	preparedSql.setString(4, objeto.getNomeaut());
	preparedSql.setString(5, objeto.getTitulob());
	
	preparedSql.execute();
	connection.commit();

}

}
