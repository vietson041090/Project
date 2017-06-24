UPDATE OL_Employee
SET
	sPassword = /* employee.sPassword*/'A',	
	sFullname = /* employee.sFullname*/'A',
	dBirthday = /* employee.dBirthday*/'2014-01-01',
	dStartday = /* employee.dStartday*/'2014-01-01',
	sEmail = /* employee.sEmail*/'A',
	iMaxlday = /* employee.iMaxlday*/1,
	iType = /* employee.iType*/1
WHERE sID = /* employee.sID*/'A'
