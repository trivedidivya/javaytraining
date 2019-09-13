package oop.allstate.training.TrainingApp;

import java.io.Serializable;

public class Course implements Serializable{
	private int courseid;
	private String courseName;
	private Trainer trainer;
	
	
	public Course() {
		super();
	}
	public Course(int courseid, String courseName, Trainer trainer) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.trainer = trainer;
	}
	public Course(int courseid, String courseName) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + ", trainer=" + trainer + "]";
	}
	

}
