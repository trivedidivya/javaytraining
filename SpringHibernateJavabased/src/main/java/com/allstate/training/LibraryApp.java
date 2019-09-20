package com.allstate.training;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.allstate.training.conf.HibernateUtil;

import com.allstate.training.dao.StudentDao;
import com.allstate.training.dao.StudentDaoImpl;
import com.allstate.training.entities.Book;
import com.allstate.training.entities.Library;
import com.allstate.training.entities.Student;

public class LibraryApp {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Library lib=new Library();
		lib.setLname("E na");
		lib.setLibrarian("Rajath");
		
		Book book=new Book();
		book.setAuthor("xyz");
		book.setBookid("Bo12");
	    book.setBookname("hibernate in action");
	    book.setLibrary(lib);
	    
	    /*Book book1=new Book();
		book1.setAuthor("abc");
		book1.setBookid("Bo13");
	    book1.setBookname("hibernate in advance");
	    book.setLibrary(lib);
	    
	   
	    lib.getBooks().add(book1);*/
	    lib.getBooks().add(book);
	    session.beginTransaction();
	    session.save(book);
	   // session.save(book1);
	    session.getTransaction().commit();
	    session.close();
	}

}
