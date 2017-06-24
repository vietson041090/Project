package com.ol.helper;

/**
 * Author: 			NTNam
 * Created date: 	05/06/2014
 * Description: 	Implementing "Paging by DB"
 * Usage:			
 * 					PagingByDB xxx = new PagingByDB(PAGE_SIZE, SORT_COLUMN, SORT_DIR);
 * 					xxx.getRequestParam();
 * 					xxx.total = YYY
 * 
 * 					xxx.dataList = (List<?>)DATA_LIST;
 * 					Display:table: name = "xxx", partialList="true"				
 */

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import org.displaytag.pagination.PaginatedList;
import org.displaytag.properties.SortOrderEnum;

public class PagingByDB implements PaginatedList {
	public int total;
	public int pageSize;
	public int pageNo;
	public String sortColumn;
	public String sortDir;
	public List<?> dataList;

	public PagingByDB(int page_size, String sortC, String sortD) {
		this.pageSize = page_size;
		this.sortColumn = sortC;
		this.sortDir = sortD;
	}

	public void getRequestParam() {
		HttpServletRequest request = ServletActionContext.getRequest();

		pageNo = 0;
		try {
			pageNo = (Integer.parseInt(request.getParameter("page")));
		} catch (Exception ex) {
		}
		if (pageNo < 1)
			pageNo = 1;

		String sortC = request.getParameter("sort");
		if (sortC != null && !sortC.isEmpty())
			sortColumn = sortC;

		String sortD = request.getParameter("dir");
		if (sortD != null && !sortD.isEmpty())
			sortDir = sortD;
	}

	@Override
	public int getFullListSize() {
		return total;

	}

	@Override
	public List<?> getList() {
		return dataList;
	}

	@Override
	public int getObjectsPerPage() {
		return this.pageSize;
	}

	@Override
	public int getPageNumber() {
		return this.pageNo;
	}

	@Override
	public String getSearchId() {
		return null;
	}

	@Override
	public String getSortCriterion() {
		return sortColumn;
	}

	@Override
	public SortOrderEnum getSortDirection() {
		if ("asc".equals(sortDir)) {
			return SortOrderEnum.ASCENDING;
		} else if ("desc".equals(sortDir)) {
			return SortOrderEnum.DESCENDING;
		}
		return null;
	}

}
