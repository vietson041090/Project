DECLARE @fdate date, @tdate date, @empid as varchar(50), @prjid int, @sql varchar(8000)
IF LEN(/* fdate */'2014-12-30')>0
BEGIN
	SET @fdate = /* fdate */'2014-12-30'
END

IF LEN(/* tdate */'2014-12-30')>0
BEGIN
	SET @tdate = /* tdate */'2014-12-30'
END

IF LEN(/* empID */'A')>0
BEGIN
	SET @empid = /* empID */'A'
END

IF /* prjID */'1'>0
BEGIN
	SET @prjid = /* prjID */'1'
END

DECLARE @scol as varchar(100), @dcol varchar(100)
SET @scol = /* sortColumn */'A'
SET @dcol = /* sortDir */'A'

SET @sql ='SELECT iTotal AS AllLoaDay, (SELECT TOP(1) Y.sFullname FROM OL_Employee Y WHERE Y.sID=sEmpID) AS EmpName, (SELECT TOP(1) Z.sFullname FROM OL_Project Z WHERE Z.iID=X.iPrjID) AS ProjectName FROM (Select *,
(Select SUM(iDayno) iTotal
from OL_LoaLetter l join OL_LoaDetail d 
on l.iID = d.iLoaID
where l.iStatus=3 AND l.sEmpID = A.sEmpID and l.iPrjID = A.iPrjID'

IF @fdate IS NOT NULL
BEGIN
SET @sql = @sql + ' AND d.dFromday >= ''' + CAST(@fdate AS varchar(20))+ ''''
END

IF @tdate IS NOT NULL
BEGIN
SET @sql = @sql + ' AND d.dToday <= ''' + CAST(@tdate AS varchar(20))+ ''''
END

SET @sql = @sql + ' group by sEmpID ) AS iTotal from (SELECT sEmpID, iPrjID from OL_LoaLetter where iStatus=3 group by sEmpID, iPrjID) A WHERE 1=1'


IF @empid IS NOT NULL
BEGIN
SET @sql = @sql + ' AND A.sEmpID = ''' + @empid+ ''''
END

IF @prjid > 0
BEGIN
SET @sql = @sql + ' AND A.iPrjID = ' + CAST(@prjid AS varchar(10))
END

SET @sql = @sql + ') X'

EXEC(@sql)