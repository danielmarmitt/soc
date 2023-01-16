package soc.negocio;

import java.sql.ResultSet;

public class Exames {
	soc.dao.Exames exameDao = new soc.dao.Exames();
	
	public Exames() {
		super();
	}
	
	/**
	 * @returnar um resultSet não é comum nas arquiteturas mais novas,
	 * isso é apenas demonstração do que acontecia no passado.
	 * 
	 */
	public ResultSet listarExamesRes() {
		return exameDao.listarExamesRes(50L);
	}

}
