SELECT DISTINCT P.*
  FROM OL_Work as W, OL_Project as P
  WHERE sEmpID=/*sEmpID*/'140014OOV' and iPrjID= P.iID and P.iStatus>0