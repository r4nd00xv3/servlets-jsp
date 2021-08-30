package back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class DAOUsuarioRepository {
	
	
	private Connection connection;
	
	
	public DAOUsuarioRepository() {
		connection = SingleConnectionDB.getConnection();
	}
	
	public ModelLogin gravarUsuario(ModelLogin objeto) throws Exception {
		
		if (objeto.isNovo()) {/*Grava um novo*/
		
		String sql = "INSERT INTO model_login(login, senha, nome, nomeaut, titulob)  VALUES (?, ?, ?, ?, ?);";
		PreparedStatement preparedSql = connection.prepareStatement(sql);
		
		preparedSql.setString(1, objeto.getLogin());
		preparedSql.setString(2, objeto.getSenha());
		preparedSql.setString(3, objeto.getNome());
		preparedSql.setString(4, objeto.getNomeaut());
		preparedSql.setString(5, objeto.getTitulob());
		
		preparedSql.execute();
		
		connection.commit();
		
		}else {
			String sql = "UPDATE model_login SET login=?, senha=?, nome=?, nomeaut=?, titulob=? WHERE id =  "+objeto.getId()+";";
			
			PreparedStatement prepareSql = connection.prepareStatement(sql);
			
			prepareSql.setString(1, objeto.getLogin());
			prepareSql.setString(2, objeto.getSenha());
			prepareSql.setString(3, objeto.getNome());
			prepareSql.setString(4, objeto.getNomeaut());
			prepareSql.setString(5, objeto.getTitulob());
			
			prepareSql.executeUpdate();
			
			connection.commit();
			
		}
		
		
		return this.consultaUsuario(objeto.getLogin());
	}
	
	
	
	public List<ModelLogin> consultaUsuarioList() throws Exception {
		
		List<ModelLogin> retorno = new ArrayList<ModelLogin>();
		
		String sql = "select * from model_login ";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) { /*percorrer as linhas de resultado do SQL*/
			
			ModelLogin modelLogin = new ModelLogin();
			modelLogin.setId(resultado.getLong("id"));
			modelLogin.setNome(resultado.getString("nome"));
			modelLogin.setNomeaut(resultado.getString("nomeaut"));
			modelLogin.setTitulob(resultado.getString("titulob"));

			//modelLogin.setSenha(resultado.getString("senha"));
			
			retorno.add(modelLogin);
		}
		
		
		return retorno;
	}
	
	
	public List<ModelLogin> consultaUsuarioList(String nome) throws Exception {
		
		List<ModelLogin> retorno = new ArrayList<ModelLogin>();
		
		String sql = "select * from model_login  where upper(nome) like upper(?) ";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "%" + nome + "%");
		
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) { /*percorrer as linhas de resultado do SQL*/
			
			ModelLogin modelLogin = new ModelLogin();
			
			modelLogin.setId(resultado.getLong("id"));
			modelLogin.setNome(resultado.getString("nome"));
			modelLogin.setNomeaut(resultado.getString("nomeaut"));
			modelLogin.setTitulob(resultado.getString("titulob"));
			
			retorno.add(modelLogin);
		}
		
		
		return retorno;
	}
	
	
	public ModelLogin consultaUsuario(String login) throws Exception  {
		
		ModelLogin modelLogin = new ModelLogin();
		
		String sql = "select * from model_login where upper(login) = upper('"+login+"')";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet resutlado =  statement.executeQuery();
		
		while (resutlado.next()) /*Se tem resultado*/ {
			
			modelLogin.setId(resutlado.getLong("id"));
			modelLogin.setNome(resutlado.getString("nome"));
			modelLogin.setNomeaut(resutlado.getString("nomeaut"));
			modelLogin.setTitulob(resutlado.getString("titulob"));
			
		}
		
		
		return modelLogin;
		
	}
	
	
	public ModelLogin consultaUsuarioID(String id) throws Exception  {
		
		ModelLogin modelLogin = new ModelLogin();
		
		String sql = "select * from model_login where id = ? ";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, Long.parseLong(id));
		
		ResultSet resutlado =  statement.executeQuery();
		
		while (resutlado.next()) /*Se tem resultado*/ {
			
			modelLogin.setId(resutlado.getLong("id"));
			modelLogin.setNome(resutlado.getString("nome"));
			modelLogin.setNomeaut(resutlado.getString("nomeaut"));
			modelLogin.setTitulob(resutlado.getString("titulob"));
		}
		
		return modelLogin;
		
	}
	
	
	
	public boolean validarLogin(String login) throws Exception {
		String sql = "select count(1) > 0 as existe from model_login where upper(login) = upper('"+login+"');";
		
        PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet resutlado =  statement.executeQuery();
		
		resutlado.next();/*Pra ele entrar nos resultados do sql*/
		return resutlado.getBoolean("existe");
		
	}
	
	
	public void deletarUser(String idUser) throws Exception {
		String sql = "DELETE FROM model_login WHERE id = ?;";
		
		PreparedStatement prepareSql = connection.prepareStatement(sql);
		
		prepareSql.setLong(1, Long.parseLong(idUser));
		
		prepareSql.executeUpdate();
		
		connection.commit();
		
	}

}
