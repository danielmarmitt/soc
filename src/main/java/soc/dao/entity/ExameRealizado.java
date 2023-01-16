package soc.dao.entity;

import java.io.Serializable;
import java.sql.Date;

public class ExameRealizado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long cdFuncionario;
	private Long cdExame;
	private Date dtRealizacao;
	
	public ExameRealizado() {
		super();
	}

	public Long getCdFuncionario() {
		return cdFuncionario;
	}

	public void setCdFuncionario(Long cdFuncionario) {
		this.cdFuncionario = cdFuncionario;
	}

	public Long getCdExame() {
		return cdExame;
	}

	public void setCdExame(Long cdExame) {
		this.cdExame = cdExame;
	}

	public Date getDtRealizacao() {
		return dtRealizacao;
	}

	public void setDtRealizacao(Date dtRealizacao) {
		this.dtRealizacao = dtRealizacao;
	}

}
