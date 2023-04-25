package com.Books.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
@Id
private int id;
private String bname;
private int price;
private int rating;
private int pages;
private int NoOfVolumes;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public int getNoOfVolumes() {
	return NoOfVolumes;
}
public void setNoOfVolumes(int noOfVolumes) {
	NoOfVolumes = noOfVolumes;
}
}
