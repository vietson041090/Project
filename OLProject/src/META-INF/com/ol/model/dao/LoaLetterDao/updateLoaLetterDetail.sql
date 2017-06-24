update OL_LoaDetail 
set
  dFromday = /* loa.dFromday */'2014-05-15',
  dToday = /* loa.dToday */'2014-05-15',
  iDayno = /* loa.iDayno */1,
  sReason = /* loa.sReason */'1',
  iType = /* loa.iType */1
where
  iID = /* loa.iID */'1'