package com.allstates.training.view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import oop.allstate.training.TrainingApp.Course;
import oop.allstate.training.TrainingApp.Student;

public class CourseDao {
public void addCourse(Student s)throws IOException
{
	FileOutputStream fos=new FileOutputStream("coursess.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s);
}
public Student getCourse()throws IOException, ClassNotFoundException
{
	FileInputStream fis=new FileInputStream("coursess.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Student c1=(Student)ois.readObject();
	return c1;
}
}
