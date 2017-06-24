SELECT COUNT(*) as totalRow
from OL_Employee
where sPassword = SUBSTRING(sys.fn_sqlvarbasetostr(HASHBYTES('MD5',  /* sPassWord*/'A')),3,32)
and   sID = /* sID*/'A'
