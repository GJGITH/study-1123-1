package com.example1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {
	private List someList = new ArrayList<>();

	private Map someMap = new LinkedHashMap<>();
	
	private Properties adminEmails = new Properties();
	
	private Set someSet = new HashSet<>();
	
	public List getSomeList() {
		return someList;
	}

	public void setSomeList(List someList) {
		this.someList = someList;
	}

	public Map getSomeMap() {
		return someMap;
	}

	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}


	public Properties getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	
	public Set getSomeSet() {
		return someSet;
	}

	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}

	@Override
	public String toString() {
		return "ComplexObject [someList=" + someList + ", someMap=" + someMap + ", adminEmails=" + adminEmails
				+ ", someSet=" + someSet + "]";
	}
	
	
	
}
