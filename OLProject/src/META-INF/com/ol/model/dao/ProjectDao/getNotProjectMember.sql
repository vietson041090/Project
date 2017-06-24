with projectmember as
(
	select 
		e.sID, e.sFullname,
		w.iRolID, w.sManID,
		w.iID
	from
		OL_Employee e
		left join
		OL_Work w
	on
		e.sID = w.sEmpID
	where
		w.iPrjID <> /* iID */'1'
)
select
	mem.*,
	m.sFullname sManFullName
from
	projectmember mem
	left outer join
	OL_Employee m
on
	mem.sManID = m.sID