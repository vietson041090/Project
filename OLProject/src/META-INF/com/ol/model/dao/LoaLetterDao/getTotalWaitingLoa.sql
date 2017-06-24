declare @all_out varchar(8000)
execute dbo.ol_get_allnextmanid  /* empID */'A',0, @all_out OUTPUT

SELECT COUNT(*)
FROM OL_LoaLetter A
WHERE iStatus=1 AND sNextManID = /* empID */'A' OR sNextManID IN ( SELECT itm FROM dbo.funcListToIN(@all_out,','))