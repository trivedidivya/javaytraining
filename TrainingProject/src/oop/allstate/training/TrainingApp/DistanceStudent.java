package oop.allstate.training.TrainingApp;

import java.io.Serializable;
import java.util.Arrays;

public class DistanceStudent extends Student implements Serializable{
	
	private Course course[]=new Course[3];

	public DistanceStudent(int stid, String stname, long phno, String dob) {
		super(stid, stname, phno, dob);
		// TODO Auto-generated constructor stub
	}

	public DistanceStudent(int stid, String stname, long phno, String dob, Course[] course) {
		super(stid, stname, phno, dob);
		this.course = course;
	}

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "DistanceStudent [course=" + Arrays.toString(course) + "]";
	}

}
