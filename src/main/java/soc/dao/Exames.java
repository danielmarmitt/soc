package soc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import soc.dao.bd.ConnectionBD;
import soc.dao.entity.Exame;

public class Exames implements IExame {
	
	String query = "Select * from exame where cd_exame<?";
	Exame exame=null;
	Boolean ativo= false;

	/**
	 * @author daniel.marmitt
	 * Esse parâmetro no método foi incluso apenas para evidênciar no teste
	 * que é sábido se trabalhar com passagens de pârametros.
	 * 
	 * Informação adicional, via jdbc a pelo menos 3 inteligentes formas de se passar parâmetros, inclusive commitar ou 
	 * dar roolback uma transação.
	 */
	@Override
	public List<Exame> listarExames(Long numLimite) {
		
		List<Exame> listReturn = new ArrayList<>();
		
		try {
			Connection con = ConnectionBD.getConnection();
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setLong(1, numLimite);
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				this.exame = new Exame();
				this.exame.setCdExame(rs.getLong("cd_Exame"));
				this.exame.setNmExame(rs.getString("nm_exame"));
				ativo = rs.getBoolean("ic_ativo");
				this.exame.setIcAtivo(ativo!=null?ativo : false);
				listReturn.add(this.exame);
			}
			
			
		} catch (SQLException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		
		
		return listReturn;
	}

	@Override
	public ResultSet listarExamesRes(Long qtdReg) {
		try {
			Connection con = ConnectionBD.getConnection();
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setLong(1, qtdReg);
			
			ResultSet rs = pstm.executeQuery();
			
			return rs;
			
		} catch (SQLException e) {
			return null;
		}
		
	}

}
