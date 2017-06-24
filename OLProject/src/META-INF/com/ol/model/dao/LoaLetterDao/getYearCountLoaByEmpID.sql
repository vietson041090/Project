SELECT SUM(iDayno) FROM OL_LoaDetail
WHERE iLoaID IN (
				SELECT iID
				FROM OL_LoaLetter
				WHERE sEmpID = /* sEmpID */'A' AND iStatus = /* iStatus */'0') AND	(YEAR(dFromday)=YEAR(GETDATE()) AND YEAR(dToday)=YEAR(GETDATE()))	