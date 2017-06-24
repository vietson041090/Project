select *
from OL_Employee
where sID in (
	select w.sManID
	from OL_Work w
		,OL_LoaLetter l
	where
		w.sEmpID = l.sNextManID and w.iPrjID = l.iPrjID
	and l.sNextManID = /* loa.sNextManID */'140010VQT' 
	and l.iPrjID = /* loa.iPrjID */3 and l.iID = /* loa.iID */36
)