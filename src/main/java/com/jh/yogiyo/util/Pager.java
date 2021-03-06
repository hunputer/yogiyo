package com.jh.yogiyo.util;

import lombok.Data;

@Data
public class Pager {
	private long curPage;
	private long perPage; // 한페이지에 보여줄 글의 갯수
	
	private long startRow;
	
	private long startNum;
	private long lastNum;
	private boolean isBefore;
	private boolean isAfter;
	
	private String kind;
	private String search;
	
	public Pager() {
		this.perPage = 20;
	}
	
	public void setCurPage(long curPage) {
		if(curPage == 0) {
			this.curPage=1;
		}else {
			this.curPage=curPage;
		}
	}
	
	public long getCurPage() {
		if(this.curPage==0) {
			this.curPage=1;
		}
		return this.curPage;
	}
	
	public String getSearch() {
		if(this.search == null) {
			this.search = "";
		}
		return this.search;
	}
	
	public void makeRow() {
		startRow = ((this.getCurPage()-1) * perPage);//현재 페이지 처음 시작 번호
	}
	
	public void makePage(long totalCount) {
		//전체 페이지의 갯수
		long totalPage = totalCount / this.getPerPage(); //페이지 전체 수
		if(totalCount % this.getPerPage() != 0) {
			totalPage++;
		}
	}
}
