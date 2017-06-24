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

DECLARE @cpage int, @spage int, @scol as varchar(100), @dcol varchar(100)
SET @cpage = /* PageNumber */'0'
SET @spage = /* RowsPerPage */'0'
SET @scol = /* sortColumn */'A'
SET @dcol = /* sortDir */'A'

SET @sql = 'SELECT LoaID,EmpName,SentDay,FromDay,ToDay FROM (SELECT LoaID,EmpName,SentDay,C.dFromday AS FromDay,C.dToday AS ToDay,ROW_NUMBER() OVER (ORDER BY '+@scol+' '+@dcol+') AS RowNum
FROM OL_LoaDetail C 
	JOIN 
	(SELECT iID AS LoaID,sEmpID, B.iPrjID AS  iPrjID, (SELECT TOP(1) sFullname FROM OL_Employee A WHERE A.sID=B.sEmpID ) AS EmpName, dSentday AS SentDay
	FROM OL_LoaLetter B WHERE iStatus=3) ALLB ON (C.iLoaID = ALLB.LoaID)

WHERE 1=1'

IF @fdate IS NOT NULL
BEGIN
SET @sql = @sql + ' AND C.dFromday >= ''' + CAST(@fdate AS varchar(20))+ ''''
END

IF @tdate IS NOT NULL
BEGIN
SET @sql = @sql + ' AND C.dToday <= ''' + CAST(@tdate AS varchar(20))+ ''''
END

IF @empid IS NOT NULL
BEGIN
SET @sql = @sql + ' AND ALLB.sEmpID = ''' + @empid+ ''''
END

IF @prjid > 0
BEGIN
SET @sql = @sql + ' AND ALLB.iPrjID = ' + CAST(@prjid AS varchar(10))
END

SET @sql = @sql + ') AB WHERE AB.RowNum BETWEEN (('+CAST(@cpage AS varchar(10))+'-1)*'+CAST(@spage AS varchar(10))+')+1 AND ('+CAST(@spage AS varchar(10))+'*'+CAST(@cpage AS varchar(10))+') ORDER BY '+@scol+' '+@dcol


EXEC(@sql)