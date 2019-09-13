package oop.allstate.training.TrainingApp;

import java.io.Serializable;

public class Trainer implements Serializable {
	private int trainerid;
	private String trainerName;
	
	public Trainer() {
		super();
	}
	public Trainer(int trainerid, String trainerName) {
		super();
		this.trainerid = trainerid;
		this.trainerName = trainerName;
	}
	@Override
	public String toString() {
		return "Trainer [trainerid=" + trainerid + ", trainerName=" + trainerName + "]";
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTarinerName() {
		return trainerName;
	}
	public void setTarinerName(String trainerName) {
		this.trainerName = trainerName;
	}
	

}
