select TOP 30
	Au.iID,
	Au.sEmpID,
	Au.iWorkID,
	sToEmpID,
	emp.sFullname,
	dToday,
	dFromday,
	Au.iStatus,
	W.iPrjID,
	Prj.sFullname as sPrjName
from OL_Authorization as Au, OL_Employee as Emp , OL_Work as W , OL_Project as Prj
where  Au.sToEmpID= Emp.sID and Au.sEmpID=/*sEmpID*/'140014OOV' and Au.iWorkID= W.iID and W.iPrjID = Prj.iID
order by Au.iStatus desc, Au.dToday desc
