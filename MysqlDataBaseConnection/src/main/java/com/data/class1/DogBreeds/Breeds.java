package com.data.class1.DogBreeds;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dogBreeds")
public class Breeds{
	@Id
	@Column(name="bid")
	private int bid;
    private String bname;
    private String bcost;
	
  
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBcost() {
		return bcost;
	}
	public void setBcost(String bcost) {
		this.bcost = bcost;
	}
	
    
		
}
