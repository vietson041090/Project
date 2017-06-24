declare @all_out varchar(8000)
execute dbo.ol_get_allnextmanid  /*sEmpID*/'001Bo',0, @all_out OUTPUT 
select @all_out
