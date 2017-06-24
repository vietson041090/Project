SELECT T1.iLoaID, T1.sManID, (CASE T1.iStatus
							WHEN -1 THEN N'Bị xóa'
							WHEN 0 THEN N'Mới'
							WHEN 1 THEN N'Đã gởi'
							WHEN 2 THEN N'Chờ duyệt'
							WHEN 3 THEN N'Đã duyệt'
							WHEN 4 THEN N'Đã từ chối'
							END) AS sKetqua, T1.dChgDate, T2.sFullname
FROM OL_LoaHistory T1, OL_Employee T2
WHERE T1.sManID = T2.sID