package com.allstate.training.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int libid;
	
private String lname;
private String librarian;
@OneToMany(mappedBy="library" , fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private List<Book> books=new ArrayList<Book>();
public int getLibid() {
	return libid;
}
public void setLibid(int libid) {
	this.libid = libid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getLibrarian() {
	return librarian;
}
public void setLibrarian(String librarian) {
	this.librarian = librarian;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
@Override
public String toString() {
	return "Library [libid=" + libid + ", lname=" + lname + ", librarian=" + librarian + "]";
}

}
