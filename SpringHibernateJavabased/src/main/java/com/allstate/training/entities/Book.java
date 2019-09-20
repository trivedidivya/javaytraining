package com.allstate.training.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Book {
@Id
private String bookid;
private String bookname;
private String Author;
@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private Library library=new Library();
public String getBookid() {
	return bookid;
}
public void setBookid(String bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", Author=" + Author + ", library=" + library + "]";
}
public Library getLibrary() {
	return library;
}
public void setLibrary(Library library) {
	this.library = library;
}


}
