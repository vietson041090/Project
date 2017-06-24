update OL_LoaLetter 
set
  sEmpID = /* loa.sEmpID */'A',
  iPrjID = /* loa.iPrjID */'1',
  dSentday = /* loa.dSentday */'2014-05-05',
  sNextManID = /* loa.sNextManID */'1',
  iStatus = /* loa.iStatus */'1'
where
  iID = /* loa.iID */'1'