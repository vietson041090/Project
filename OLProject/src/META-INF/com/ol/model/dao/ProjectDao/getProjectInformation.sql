select 
	p.*,
	m.sFullName sPMName,
	(select count(*) from OL_Work where iPrjID = /* iID */'1' and iStatus > 0) iMemberCount
from
	OL_Project p
	left join
	OL_Employee m
on
	p.sPmID = m.sID
where
	p.iID = /* iID */'1'