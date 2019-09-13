package oop.allstate.training.TrainingApp;

import java.io.Serializable;

public class RegularStudent extends Student implements Serializable{

	private double scores;
	Course course;
	public RegularStudent(int stid, String stname, long phno, String dob, double scores) {
		super(stid, stname, phno, dob);
		this.scores = scores;
		
	}
	public RegularStudent(int stid, String stname, long phno, String dob, double scores, Course course) {
		super(stid, stname, phno, dob);
		this.scores = scores;
		this.course = course;
	}
	public double getScores() {
		return scores;
	}
	public void setScores(double scores) {
		this.scores = scores;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "RegularStudent [scores=" + scores + ", course=" + course + "]";
	}
	public RegularStudent(int stid, String stname, long phno, String dob) {
		super(stid, stname, phno, dob);
	}
	
	
}
