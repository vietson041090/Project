package com.ol.action;

/**
 * Author: 			
 * Created date: 	
 * Description: 	Implementing 
 * Related:			Struts 2, Annotation, Log4j
 */



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.seasar.doma.In;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.ol.model.entity.LetterStatus;
import com.ol.model.entity.ConfigData;
import com.ol.model.entity.Employee;
import com.ol.model.entity.LoaLetter;
import com.ol.model.entity.LoaDetail;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.service.*;
import com.ol.helper.PagingByDB;
import com.ol.helper.Ulti;

@Namespace("/")
public class EditLoaAction extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 1L;

	private Employee loaOwner;

	int ret = 0;
	public int getRet() {
		return ret;
	}
	public void setRet(int ret) {
		this.ret = ret;
	}

	private String index;
	
	private String loaID;
	
	private int iID;
	
	private Map<Integer, String> types;
	
	public PagingByDB pLoaList;

	private String numPage;
	
	private List<LoaDetail> loaDtl;
	
	private LoaDetail detail;
	
	private LoaLetter loa;
	
	
	private String input;
	
	private String currentDate;
	
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

	public static List<ProjectInformation> prepareAllProjectInformation()
	{
		
		
		List<ProjectInformation> piList;
		ProjectSrv service = new ProjectSrv();
		piList = service.getAllProjectInfomation();
		
		return piList;
	}
	
	public static Map<Integer, String> prepareAllType()
	{
		
		ConfigData configData = new ConfigData();
		
		configData = Ulti.parseXML();
		
		return configData.getType();
	}
	
	public static LoaLetter prepareAllLoa(int loaID)
	{
		LoaLetterSrv loaService = new LoaLetterSrv();
		LoaLetter loa = new LoaLetter();
		loa = loaService.getLoaLetterByID(loaID);
		/*LoaLetterSrv loaService = new LoaLetterSrv();
		this.setLoa(loaService.getLoaLetterByID(getLoaID()));*/
		return loa;
	}
	
	public static LoaLetter prepareAllLoaDetail(int loaID)
	{
		LoaLetterSrv loaService = new LoaLetterSrv();
		LoaLetter loa = new LoaLetter();
		loa = loaService.getLoaLetterByID(loaID);
		/*LoaLetterSrv loaService = new LoaLetterSrv();
		this.setLoa(loaService.getLoaLetterByID(getLoaID()));*/
		return loa;
	}
	
	public static Employee prepareLoaOwner(String sEmpID)
	{
		EmployeeSrv empService = new EmployeeSrv();
		Employee loa = new Employee();
		loa = empService.getEmployeeById(sEmpID);
		return loa;
	}
	
	public static List<LoaDetail> prepareLoaDetail(int ID)
	{
		LoaLetterSrv loaService = new LoaLetterSrv();
		List<LoaDetail> loaDtl = new ArrayList<LoaDetail>();
		
		loaDtl = loaService.getLoaDetail(ID);
		return loaDtl;
	}
	
	
	
	private boolean isInteger(String input){
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public void prepare() throws Exception {
		
		
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		   //get current date time with Date()
		  Date date = new Date();
		currentDate = dateFormat.format(date);
	 
		System.out.println("currentDate " + currentDate);
		   //get current date time with Calendar()
		   Calendar cal = Calendar.getInstance();
		   System.out.println(dateFormat.format(cal.getTime()));
		
		input = getRequest().getParameter("loaID");
		/*int id = 0;
		try{
			System.out.print("vao try");
			id = Integer.parseInt(getRequest().getParameter("loaID"));
		}catch(Exception e){
			//id = -1;
			System.out.print("vao catch");
			input = "errorInput";
		}*/
		//if(!input.equals("errorInput")){
			this.setLoaID(input);
			int id=0;
			if(isInteger(this.getLoaID())){
				id = Integer.parseInt(this.getLoaID());
			}
			System.out.print(this.getLoaID() + "prepare");
			this.setTypes(prepareAllType());
			this.setLoa(prepareAllLoa(id));
			this.setPList(prepareAllProjectInformation());
			if(this.getLoa() != null){
				this.setLoaOwner(prepareLoaOwner(this.getLoa().getSEmpID()));
			}
			this.setLoaDtl(prepareLoaDetail(id));
			pList= Ulti.getProjectSelectList();
		//}
	}
	
	
	
	// nam
	@Action(value = "edit_loa_form", results = { @Result(name = "success", type = "tiles", location = "edit_loa"),
			@Result(name = "error", type = "tiles", location = "edit_loa")})
	public String editLoaForm() {
		
		if(Ulti.isInvalidRights(3)) return "login";
		
		String result = SUCCESS;
		
		if(isInteger(input)){
			return result;
		}else{
			addActionError("Khong tim thay du lieu voi loaID = " + input);
			
			return ERROR;
		}
	}

	protected HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
	
	
	// nam
	@Action(value = "edit_loa", results = { @Result(name = "success", type = "tiles", location = "edit_loa") })
	public String editLoa() {
		
		if(Ulti.isInvalidRights(3)) return "login";
		
		try {
			
			
			java.util.Date date = new java.util.Date();
			Date nDate = new Date( date.getTime() );
			
			/*if (loa.getDSentday() == null || this.calDays(nDate, loa.getDSentday()) < 0) {
				addActionError("Ngay viet khong hop le, phai lon hon hoac bang ngay hien tai");
			}*/
			

			if (loa.getIPrjID() < 1) {
				addActionError("Du an khong hop le");
			}

			if (loaDtl.isEmpty()) {
				addActionError("Phai co it nhat mot ngay nghi");
			} else {
				int i = 1;
				for (LoaDetail aLoa : loaDtl) {
					
					
					
					/*int yearFromday = Calendar.getInstance().get();
					System.out.println(aLoa.getDFromday().get);
					*/
					if (aLoa.getDFromday() == null || this.calDays(nDate, (Date) aLoa.getDFromday()) < 0) {
						addActionError("Tu ngay thu " + i + " khong hop le, phai lon hon hoac bang ngay hien tai");
					} /*else if(i>1) {
						System.out.println("[addloa]: i= " + this.calDays((Date)loaDtl.get(i-1).getDToday(), (Date) aLoa.getDFromday()));
						
						if(aLoa.getDFromday() == null || this.calDays((Date)loaDtl.get(i-1).getDToday(), (Date) aLoa.getDFromday()) < 1){
							addActionError("Tu ngay thu " + i + " khong hop le, phai lon hon ngay toi " + (i-1));
						}
					}*/
					
					double tmp = this.calDays((Date) aLoa.getDFromday(), (Date)aLoa.getDToday());
					double max = tmp + 1;
					double min = tmp + 0.25;
					System.out.println("[addloa]: min= " + min + ",max= "+max);

					if (aLoa.getDToday() == null || tmp < 0) {
						addActionError("Toi ngay thu " + i + " khong hop le, phai lon hon hoac bang ngay bat dau");
					}
					
					if(aLoa.getDToday()!=null && aLoa.getDFromday()!=null){
						Calendar cal = Calendar.getInstance();
						cal.setTime(aLoa.getDToday());
						int tmonth = cal.get(Calendar.MONTH);
						int yearToDay   = cal.get(Calendar.YEAR);
						
						cal.setTime(aLoa.getDFromday());
						int fmonth = cal.get(Calendar.MONTH);
						int yearFromDay   = cal.get(Calendar.YEAR);
						System.out.println(yearToDay + "-" + yearFromDay);
						System.out.println(tmonth + "-" + fmonth);
						if(yearToDay == yearFromDay){
							if(fmonth!=tmonth) addActionError("Ngay tu va ngay toi thu " + i + " phai cung thang");
						}else{
							addActionError("Ngay tu va ngay toi thu " + i + " phai cung 1 nam");
						}
						
					}

					
					System.out.println(aLoa.getIDayno());
					if (aLoa.getIDayno() <= 0 || aLoa.getIDayno()>max || aLoa.getIDayno()<min) {
						addActionError("So ngay thu " + i + " khong hop le");
					}

					if (aLoa.getSReason().trim().length() < 1) {
						addActionError("Ly do thu " + i + " khong hop le");
					}

					i++;
				}
			}
			
			//check list-loa-detail day
			
			if(!hasErrors()){
				
				System.out.print("NOT Eror 2");
				LoaLetterSrv lolSrv = new LoaLetterSrv();
				
				//if(this.getIndex() != null && this.getIndex().length() > 0){
					if(lolSrv.updateLoa(loa, loaDtl) < 1) addActionError("Co loi xay ra, vui long thu lai sau");
					else{
						ret=1;
						addActionError("Them thanh cong");
					}
				
			}else{
				System.out.print(" Eror 2");
			}

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
	
	
	@Action(value = "delete_loa", results = { @Result(name = "success", type = "tiles", 
								location="deleteLoa")})
	public String deleteLoa(){
		String loaId = getRequest().getParameter("loaID");
		String iId = getRequest().getParameter("iID");
		System.out.println("LOA :" + loaId + "- iID " + iId);
		if(loaId != null && iId != null){
			LoaLetterSrv letterSrv = new LoaLetterSrv();
			int status = letterSrv.deleteLoa(loaId, iId);
			if(status > 0){
				setActionMessages(null);
				addActionMessage("Delete thanh cong");
				return SUCCESS;
			}else{
				return SUCCESS;
			}
		}
		
		return SUCCESS;
	}
	
	
	@Action(value = "addNewLoa", results = { @Result(name = "success", type = "redirect", 
			params={"loaID", "${loaID}"}, location="/edit_loa_form"),
	 		@Result(name = "error", type = "redirect", 
			params={"loaID", "${loaID}"}, location="/edit_loa_form")}
	
			)
	public String addNewLoa(){
		System.out.println("ADD LOA");
		int id = 0;
		if(isInteger(this.getLoaID()))
		{
			id = Integer.parseInt(this.getLoaID());
		}
		detail.setILoaID(id);
		if(detail.getDFromday() == null){
			addActionError("Du lieu khong hop le");
			System.out.println("Loi du lieu");
			return ERROR;
		}else{
		
		//System.out.println(detail.getIDayno() + "-" + detail.getSReason() + "-" + detail.getDFromday());
		//System.out.println(detail.getIID() + "-" + detail.getILoaID() + "-" + detail.getIType());
		

		LoaLetterSrv letterSrv = new LoaLetterSrv();
		int status = letterSrv.newLoaDetail(detail);
		if(status == 1){
		
			return "success";
		}else{
			addActionError("Du lieu khong hop le");
			return ERROR;
			
		}
		}
	}

	public void setpLoaList(PagingByDB pLoaList) {
		this.pLoaList = pLoaList;
	}
	public String getLoaID() {
		return loaID;
	}
	public void setLoaID(String loaID) {
		this.loaID = loaID;
	}
	public Employee getLoaOwner() {
		return loaOwner;
	}
	public void setLoaOwner(Employee loaOwner) {
		this.loaOwner = loaOwner;
	}
	public Map<Integer, String> getTypes() {
		return types;
	}
	public void setTypes(Map<Integer, String> types) {
		this.types = types;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public int getiID() {
		return iID;
	}
	public void setiID(int iID) {
		this.iID = iID;
	}
	public String getNumPage() {
		return numPage;
	}
	public void setNumPage(String numPage) {
		this.numPage = numPage;
	}
	public LoaDetail getDetail() {
		return detail;
	}
	public void setDetail(LoaDetail detail) {
		this.detail = detail;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

}
