INSERT INTO OL_Employee

(
	sID,
	sPassword,
	sFullname,
	dBirthday,
	dStartday,
	sEmail,
	iMaxlday,
	iType,
	iStatus
)
VALUES
(
	/* employee.sID*/'A',
	SUBSTRING(sys.fn_sqlvarbasetostr(HASHBYTES('MD5',  /* employee.sPassword*/'A')),3,32),
	/* employee.sFullname*/'A',
	/* employee.dBirthday*/'1991-10-12',
	/* employee.dStartday*/'1991-10-12',
	/* employee.sEmail*/'A',
	/* employee.iMaxlday*/'1',
	/* employee.iType*/'1',
	1
)
