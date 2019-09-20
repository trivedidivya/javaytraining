package com.allstate.training.dao;

import java.util.List;

import com.allstate.training.entities.Student;

public interface StudentDao {
public void addStudent(Student st);
public void updateStudent(int id,int marks);
public void deleteId(int id);
public Student getStudentById(int id);
public List<Student> getAll();

}
