package soc.dao;

import java.sql.PreparedStatement;

import soc.dao.bd.ConnectionBD;

public class Usuario {
	
	
	String query = "INSERT INTO usuario (nm_login, qt_tempo_inatividade, ds_senha) values (?, ?, ?)";
	
	
	public int salvarUsuario(String login, String senha) throws Exception {
		int retorno = 0;
		try {
			
			PreparedStatement ps = ConnectionBD.getConnection().prepareStatement(query);
			ps.setString(1, login);
			ps.setInt(2, 1);
			ps.setString(3, senha);
			retorno = ps.executeUpdate();
			return retorno;
		} catch (Exception e) {
			e.printStackTrace();
			return retorno;
		} finally {
			//if (ConnectionBD.getConnection() != null) {
			//	ConnectionBD.getConnection().close();
			//}
		}
	}


}
