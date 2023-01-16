package soc.dao;

import java.sql.ResultSet;
import java.util.List;

import soc.dao.entity.Exame;

public interface IExame {
	
	public List<Exame> listarExames(Long qtdReg);
	public ResultSet listarExamesRes(Long qtdReg);
	

}
