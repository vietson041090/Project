INSERT INTO OL_LoaLetter (dSentday, iPrjID, iStatus, sEmpID, sNextManID)
VALUES (/* loa.dSentday */'2014-05-14', /* loa.iPrjID */'0',/* loa.iStatus */'0', /* loa.sEmpID */'A', (SELECT TOP(1) sManID FROM OL_Work WHERE sEmpID=/* loa.sEmpID */'A' AND iPrjID=/* loa.iPrjID */'0'))