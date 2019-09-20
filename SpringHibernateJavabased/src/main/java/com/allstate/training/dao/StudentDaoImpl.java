package com.allstate.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.allstate.training.entities.Student;

public class StudentDaoImpl implements StudentDao{
SessionFactory sessionFactory;
public StudentDaoImpl()
{
	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
	 sessionFactory=con.buildSessionFactory();
}
public void addStudent(Student st) {
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(st);//insert statement
	session.getTransaction().commit();//to commit
	session.close();
	
}
public void updateStudent(int id ,int marks) {
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	Student s1=(Student)session.get(Student.class,id);
	s1.setMarks(marks);
	session.update(s1);//udpate stdent set sname=?.........
	session.getTransaction().commit();//to commit
	session.close();
	

	
}
public void deleteId(int id) {
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	Student st=(Student)session.get(Student.class,id);//select * from student where stidentid=?
	session.delete(st);//delete from student where studentid=?
	session.getTransaction().commit();//to commit
	session.close();
	
}
public Student getStudentById(int id) {
	
	Session session=sessionFactory.openSession();
	Student st1=(Student)session.get(Student.class, id);
	System.out.println(st1);
	session.close();
	return st1;
}
public List<Student> getAll() {
	Session session=sessionFactory.openSession();
	List<Student> s=session.createCriteria(Student.class).list();
	System.out.println(s);
	return s;
}

}
