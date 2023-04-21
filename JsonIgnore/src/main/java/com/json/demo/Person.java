package com.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
	private int eid;
	
	private String name;
	@JsonIgnore
	private int age;

public Person() {}

	
	public Person(int eid, String name, int age) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
