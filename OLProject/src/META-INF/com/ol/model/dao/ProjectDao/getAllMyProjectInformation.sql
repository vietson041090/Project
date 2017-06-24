select 
	p.*
from
	OL_Project p
	left join
	OL_Work m
on
	p.iID = m.iPrjID
where p.iStatus = 1	AND m.sEmpID = /* empID */'A'
