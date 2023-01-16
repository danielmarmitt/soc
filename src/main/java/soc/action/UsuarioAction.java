package soc.action;

import soc.dao.Usuario;

import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport {

	private static final long serialVersionUID = 2139116285823340125L;
	private String nmlogin, dssenha;
	private String msg = "";
	Usuario uDao = null;
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		uDao = new Usuario();

		try {
			
			ctr = uDao.salvarUsuario(nmlogin, dssenha);
			if (ctr > 0) {
				msg = "Usuário incluído";
			} else {
				msg = " ....";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "USUARIO";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

	public String getNmlogin() {
		return nmlogin;
	}

	public void setNmlogin(String nmlogin) {
		this.nmlogin = nmlogin;
	}

	public String getDssenha() {
		return dssenha;
	}

	public void setDssenha(String dssenha) {
		this.dssenha = dssenha;
	}

}
