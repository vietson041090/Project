package com.ol.model.entity;

import java.util.Map;

public class ConfigData {
	
	private String host;
	private String port;
	private String mailFrom;
	private String passWord;
	
	private Map<Integer, String> type;
	
	private Map<Integer, String> group;
	
	private int max_loa_day;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getMailFrom() {
		return mailFrom;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	public Map<Integer, String> getType() {
		return type;
	}
	public void setType(Map<Integer, String> type) {
		this.type = type;
	}
	public int getMax_loa_day() {
		return max_loa_day;
	}
	public void setMax_loa_day(int max_loa_day) {
		this.max_loa_day = max_loa_day;
	}
	public Map<Integer, String> getGroup() {
		return group;
	}
	public void setGroup(Map<Integer, String> group) {
		this.group = group;
	}

}
