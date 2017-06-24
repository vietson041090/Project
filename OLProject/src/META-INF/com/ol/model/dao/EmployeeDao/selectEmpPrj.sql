SELECT [sID], sFullname, 
	(CASE iType WHEN 1 THEN 'Admin'
				  WHEN 2 THEN 'BO'
				  WHEN 3 THEN 'User' 
				  END) AS sType
FROM OL_Employee
WHERE iStatus = 1