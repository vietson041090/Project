package com.ol.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.helper.Ulti;
import com.ol.model.entity.LoaHistory;
import com.ol.model.entity.LoaHistoryInfo;
import com.ol.model.service.LoaHistorySrv;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@Namespace("/")
public class LoaHistoryAction extends ActionSupport implements Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LoaHistoryInfo loaHis = new LoaHistoryInfo();
	public LoaHistoryInfo getLoaHis() {
		return loaHis;
	}

	public void setLoaHis(LoaHistoryInfo loaHis) {
		this.loaHis = loaHis;
	}

	private List<LoaHistoryInfo> lsLoaHis;

	public List<LoaHistoryInfo> getLsLoaHis() {
		return lsLoaHis;
	}

	public void setLsLoaHis(List<LoaHistoryInfo> lsLoaHis) {
		this.lsLoaHis = lsLoaHis;
	}

	@Action(value="view_loa_his", results={@Result(name="view", type="tiles", location="view_loa_history")})
	public String executeView(){
		if(Ulti.isInvalidRights(3)) return "login";
		return "view";
	}

	Map<String, Object> session = ActionContext.getContext().getSession();
	String sEmpID = session.get("loggedEmpID").toString();
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		LoaHistorySrv loaHisSrv = new LoaHistorySrv();
		List<LoaHistoryInfo> list = loaHisSrv.selectAllInfo(sEmpID);
		this.setLsLoaHis(list);
	}
}
