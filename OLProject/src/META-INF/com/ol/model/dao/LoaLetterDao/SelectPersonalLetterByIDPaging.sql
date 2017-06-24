
SELECT   AB.iID,
       sEmpID,
       iPrjID,
       dSentday,
       sFullname,
       sCode,
       sNextManID,
		AB.iStatus
FROM
(SELECT  iID,
       sEmpID,
       iPrjID,
       dSentday,
       sNextManID,
		iStatus,
      ROW_NUMBER() OVER (ORDER BY OL_LoaLetter.sEmpID) AS RowNum 
      FROM OL_LoaLetter  
      Where sEmpID= /*sEmpID*/'140014OOV'
) AS AB 
JOIN OL_Project ON AB.iPrjID=OL_Project.iID
WHERE AB.RowNum BETWEEN ((/* PageNumber */1-1)*/* RowsPerPage */10)+1
AND /* RowsPerPage */10*(/* PageNumber */1) 
AND AB.iStatus>=0
ORDER BY /*# sortColumn*/ /*# sortDir*/