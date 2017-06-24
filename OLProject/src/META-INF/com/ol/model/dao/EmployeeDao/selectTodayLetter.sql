SELECT T1.sEmpID, T2.sFullname, T3.iDayNo, T3.sReason, T3.dFromday
FROM OL_LoaLetter T1, OL_Employee T2, OL_LoaDetail T3
WHERE T1.sEmpID = T2.sID 
AND T1.iID = T3.iLoaID
AND T2.iStatus = 1
AND T1.iStatus = 3
AND CONVERT(VARCHAR, T3.dFromday, 23) = CONVERT(VARCHAR,getdate(),23)