package soc.dao.entity;

import java.io.Serializable;

public class Exame implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long cdExame;
	private String nmExame;
	private Boolean icAtivo;
	private String dsDetalheExame;
	private String dsDetalheExameb;
	
	
	public Exame() {
		super();
	}


	public long getCdExame() {
		return cdExame;
	}


	public void setCdExame(long cdExame) {
		this.cdExame = cdExame;
	}


	public String getNmExame() {
		return nmExame;
	}


	public void setNmExame(String nmExame) {
		this.nmExame = nmExame;
	}


	public Boolean getIcAtivo() {
		return icAtivo;
	}


	public void setIcAtivo(Boolean icAtivo) {
		this.icAtivo = icAtivo;
	}


	public String getDsDetalheExame() {
		return dsDetalheExame;
	}


	public void setDsDetalheExame(String dsDetalheExame) {
		this.dsDetalheExame = dsDetalheExame;
	}


	public String getDsDetalheExameb() {
		return dsDetalheExameb;
	}


	public void setDsDetalheExameb(String dsDetalheExameb) {
		this.dsDetalheExameb = dsDetalheExameb;
	}

}
