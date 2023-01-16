package soc.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import soc.bean.ExameBean;
import soc.negocio.Exames;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author daniel
 *
 */
public class RelatorioAction extends ActionSupport {

	private static final long serialVersionUID = 6329394260276112660L;
	ResultSet rs = null;
	ExameBean bean = null;
	List<ExameBean> beanList = null;
	Exames exameNeg = new Exames();
	private boolean semDados = false;

	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<ExameBean>();
			rs = exameNeg.listarExamesRes();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					bean = new ExameBean();
					bean.setCdExame(rs.getLong("cd_exame"));
					bean.setNmExame(rs.getString("nm_exame"));
					bean.setDetalheExame(rs.getString("ds_detalhe_exame"));
					beanList.add(bean);
				}
			}
			if (i == 0) {
				semDados = false;
			} else {
				semDados = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "RELATORIO";
	}

	public boolean isNoData() {
		return semDados;
	}

	public void setNoData(boolean noData) {
		this.semDados = noData;
	}

	public List<ExameBean> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<ExameBean> beanList) {
		this.beanList = beanList;
	}

}
