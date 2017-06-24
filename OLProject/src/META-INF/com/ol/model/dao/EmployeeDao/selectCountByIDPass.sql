SELECT COUNT(*)
FROM OL_Employee
WHERE sID = /* sID */'A' AND sPassword = SUBSTRING(sys.fn_sqlvarbasetostr(HASHBYTES('MD5',  /* sPassword*/'A')),3,32)