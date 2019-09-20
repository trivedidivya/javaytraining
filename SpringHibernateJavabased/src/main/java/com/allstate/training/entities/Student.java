package com.allstate.training.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;



@Entity
@DynamicUpdate
public class Student {

	@Id
	private int studentId;
	@Column(name="sname", length=45)
	private String studentName;
	@Column(nullable=false)
	private  int marks;
	private String dob;
	@Column(unique=true)
	private long adarNum;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", dob=" + dob
				+ ", adarNum=" + adarNum + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getAdarNum() {
		return adarNum;
	}
	public void setAdarNum(long adarNum) {
		this.adarNum = adarNum;
	}
	
	
}
