package com.allstates.training.view;

import java.io.Serializable;

public class Candidate implements Serializable , Comparable<Candidate>{
	private String name;
	private String technicalExpertise;
	private String city;
	private int yoe;
	public Candidate(String name, String technicalExpertise, String city, int yoe) {
		super();
		this.name = name;
		this.technicalExpertise = technicalExpertise;
		this.city = city;
		this.yoe = yoe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnicalExpertise() {
		return technicalExpertise;
	}
	public void setTechnicalExpertise(String technicalExpertise) {
		this.technicalExpertise = technicalExpertise;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((technicalExpertise == null) ? 0 : technicalExpertise.hashCode());
		result = prime * result + yoe;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (technicalExpertise == null) {
			if (other.technicalExpertise != null)
				return false;
		} else if (!technicalExpertise.equals(other.technicalExpertise))
			return false;
		if (yoe != other.yoe)
			return false;
		return true;
	}
	@Override
	public int compareTo(Candidate o) {
	
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", technicalExpertise=" + technicalExpertise + ", city=" + city + ", yoe="
				+ yoe + "]";
	}
	

}
