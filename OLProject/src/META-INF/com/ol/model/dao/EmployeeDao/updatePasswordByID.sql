UPDATE OL_Employee
SET    sPassword = SUBSTRING(sys.fn_sqlvarbasetostr(HASHBYTES('MD5',  /* newPassword*/'A')),3,32)
WHERE  sID = /* sID*/'A' 