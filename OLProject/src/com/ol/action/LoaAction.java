package com.ol.action;

/**
 * Author: 			
 * Created date: 	
 * Description: 	Implementing 
 * Related:			Struts 2, Annotation, Log4j
 */

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.ol.model.entity.ConfigData;
import com.ol.model.entity.LetterStatus;
import com.ol.model.entity.PersonalLoaLetter;
import com.ol.model.entity.LoaLetter;
import com.ol.model.entity.LoaDetail;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.service.*;
import com.ol.helper.PagingByDB;
import com.ol.helper.Ulti;

@Namespace("/")
public class LoaAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 1L;

	int ret = 0;

	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}

	public PagingByDB pLoaList;

	List<PersonalLoaLetter> personalLoaLetters = new ArrayList<PersonalLoaLetter>();

	List<LoaDetail> loaDtl = new ArrayList<LoaDetail>();
	LoaLetter loa = new LoaLetter();

	private PagingByDB pgList;

	public PagingByDB getPgList() {
		return pgList;
	}

	public void setPgList(PagingByDB pgList) {
		this.pgList = pgList;
	}

	private List<ProjectInformation> pList;

	public List<ProjectInformation> getPList() {
		return pList;
	}

	public void setPList(List<ProjectInformation> pList) {
		this.pList = pList;
	}

	public LoaLetter getLoa() {
		return loa;
	}

	public void setLoa(LoaLetter loa) {
		this.loa = loa;
	}

	public List<LoaDetail> getLoaDtl() {
		return loaDtl;
	}

	public void setLoaDtl(List<LoaDetail> loaDtl) {
		this.loaDtl = loaDtl;
	}

	public List<PersonalLoaLetter> getPersonalLoaLetters() {
		return personalLoaLetters;
	}

	public void setPersonalLoaLetters(List<PersonalLoaLetter> personalLoaLetters) {
		this.personalLoaLetters = personalLoaLetters;
	}

	@Override
	public void prepare() throws Exception {
		pList = Ulti.getMyProjectSelectList();

	}
	
	private Map<Integer, String> types;
	
	public Map<Integer, String> getTypes() {
		return types;
	}

	public void setTypes(Map<Integer, String> types) {
		this.types = types;
	}

	// nam
	private void loadLoaType(){
		ConfigData configData = new ConfigData();
		
		configData = Ulti.parseXML();
		
		this.setTypes(configData.getType());

	}

	// nam
	@Action(value = "add_loa_form", results = { @Result(name = "success", type = "tiles", location = "add_loa") })
	public String addLoaForm() {
		try {
			//check rights
			if(Ulti.isInvalidRights(3)) return "login";
			
			//check xem con ngay phep ko, neu ko thi bao la ko the tao
			
			loadLoaType();

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}
	
	//nam
	private double calDays(Date d1, Date date){
		double ret = 0;
		try{
		long diff = date.getTime() - d1.getTime();
		ret = diff / (60 * 60 * 1000 * 24);
		ret = Math.round(ret*100.0)/100.0;
		}catch(Exception ex){
			ret = 0;
		}
		
		return ret;
	}

	// nam
	@Action(value = "add_loa", results = { @Result(name = "success", type = "tiles", location = "add_loa") })
	public String addLoa() {
		try {

			//check rights
			if(Ulti.isInvalidRights(3)) return "login";

			//check xem con ngay phep ko, neu ko thi bao la ko the tao
			
			
			java.util.Date date = new java.util.Date();
			Date nDate = new Date( date.getTime() );
			
			if (loa.getDSentday() == null || this.calDays(nDate, loa.getDSentday()) < 0) {
				addActionError("Ngay viet khong hop le, phai lon hon hoac bang ngay hien tai");
			}

			if (loa.getIPrjID() < 1) {
				addActionError("Du an khong hop le");
			}

			if (loaDtl.isEmpty()) {
				addActionError("Phai co it nhat mot ngay nghi");
			} else {
				int i = 1;
				for (LoaDetail aLoa : loaDtl) {
				
					if (i==1 && (aLoa.getDFromday() == null || this.calDays(nDate, (Date) aLoa.getDFromday()) < 0)) {
						addActionError("Tu ngay thu " + i + " khong hop le, phai lon hon hoac bang ngay hien tai");
					} else if(i>1) {
						System.out.println("[addloa]: i= " + this.calDays((Date)loaDtl.get(i-1).getDToday(), (Date) aLoa.getDFromday()));
						
						if(aLoa.getDFromday() == null || this.calDays((Date)loaDtl.get(i-1).getDToday(), (Date) aLoa.getDFromday()) < 1){
							addActionError("Tu ngay thu " + i + " khong hop le, phai lon hon ngay toi " + (i-1));
						}
					}
					
					double tmp = this.calDays((Date) aLoa.getDFromday(), (Date)aLoa.getDToday());
					double max = tmp + 1;
					double min = tmp + 0.25;
					System.out.println("[addloa]: min= " + min + ",max= "+max);

					if (aLoa.getDToday() == null || tmp < 0) {
						addActionError("Toi ngay thu " + i + " khong hop le, phai lon hon hoac bang ngay tu");
					}
					
					if(aLoa.getDToday()!=null && aLoa.getDFromday()!=null){
						Calendar cal = Calendar.getInstance();
						cal.setTime(aLoa.getDToday());
						int tmonth = cal.get(Calendar.MONTH);
						int tyear = cal.get(Calendar.YEAR);
						
						cal.setTime(aLoa.getDFromday());
						int fmonth = cal.get(Calendar.MONTH);
						int fyear = cal.get(Calendar.YEAR);
						if(fmonth!=tmonth || fyear!=tyear) addActionError("Ngay tu va ngay toi thu " + i + " phai cung thang, nam");
					}

					if (aLoa.getIDayno() <= 0 || aLoa.getIDayno()>max || aLoa.getIDayno()<min) {
						addActionError("So ngay thu " + i + " khong hop le");
					}

					if (Ulti.isInvalidStrVar(aLoa.getSReason(), 1, 100)) {
						addActionError("Ly do thu " + i + " khong hop le");
					}

					i++;
				}
			}

			// check list-loa-detail day

			if (!hasErrors()) {
				// save
				loa.setIStatus(0);
				
				
				loa.setSEmpID(ServletActionContext.getRequest().getSession().getAttribute("loggedEmpID").toString());

				LoaLetterSrv lolSrv = new LoaLetterSrv();

				if (lolSrv.saveLoa(loa, loaDtl) < 1)
					addActionError("Co loi xay ra, vui long thu lai sau");
				else {
					ret = 1;
					addActionError("Don nghi phep tao thanh cong !");
				}
			} else {
				loadLoaType();
			}

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}

	// nam
	@Action(value = "waiting_loa", results = { @Result(name = "success", type = "tiles", location = "waiting_loa") })
	public String waiting_loa() {
		try {

			if(Ulti.isInvalidRights(3)) return "login";
			
			pgList = new PagingByDB(10, "dSentDay", "DESC");
			pgList.getRequestParam();

			Map<String, Object> session = ActionContext.getContext().getSession();
			String empID = session.get("loggedEmpID").toString();
			
			LoaLetterSrv srv = new LoaLetterSrv();
			List<LoaLetter> wList = srv.getWaitingLoa(empID,pgList.pageNo,pgList.pageSize,pgList.sortColumn,pgList.sortDir);

			pgList.total = srv.getTotalWaitingLoa(empID);
			pgList.dataList = wList;

			//System.out.print("----" + wList.get(0).EmpName);

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}

	// Create by Ong Oai ViÃªm
	@Action(value = "ViewPersonalLoaLetter", results = { @Result(name = "success", type = "tiles", location = "view_loa_list") })
	public String execute1() {
		try {
			if(Ulti.isInvalidRights(3))
				return "login";
			String sEmpID = ServletActionContext.getRequest().getSession()
					.getAttribute("loggedEmpID").toString();
			pLoaList = new PagingByDB(10, "dSentday", "DESC");
			pLoaList.pageSize = 10;
			pLoaList.getRequestParam();
			LoaLetterSrv lolSrv = new LoaLetterSrv();
			personalLoaLetters = lolSrv.personalLoaLetterListPaging(sEmpID,
					pLoaList.pageNo, pLoaList.pageSize, "dSentday", "desc");
			pLoaList.total = lolSrv.SelectCountPersonalLetterByID(sEmpID);
			pLoaList.dataList = personalLoaLetters;

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}

	public String ConvertStatus(int iStatus) {
		List<LetterStatus> LetterStatus = Ulti.GetLetterStatusByXML();
		String Result = null;
		for (int i = 0; i <= LetterStatus.size(); i++) {
			if (LetterStatus.get(i).getIID() == iStatus) {
				Result = LetterStatus.get(i).getSStatus();
				break;
			}
		}
		return Result;
	}

	public PagingByDB getpLoaList() {
		return pLoaList;
	}

	public void setpLoaList(PagingByDB pLoaList) {
		this.pLoaList = pLoaList;
	}

}
