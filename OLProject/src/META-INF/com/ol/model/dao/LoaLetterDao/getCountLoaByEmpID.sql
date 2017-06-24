SELECT SUM(iDayno) FROM OL_LoaDetail
WHERE iLoaID IN (
				SELECT iID
				FROM OL_LoaLetter
				WHERE sEmpID = /* sEmpID */'A' AND iStatus = /* iStatus */'0') AND	(MONTH(dFromday)=MONTH(GETDATE()) OR MONTH(dToday)=MONTH(GETDATE()))	