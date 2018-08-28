package com.atguigu.bean;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@FormParam("id")
	private int id;
	
	@FormParam("name")
	private String name;

	private List<Inner> innerList;
	public List<Inner> getInnerList() {
		return innerList;
	}
	public void setInnerList(List<Inner> innerList) {
		this.innerList = innerList;
	}
	public User(){
		
	}
	public User (int id,String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
