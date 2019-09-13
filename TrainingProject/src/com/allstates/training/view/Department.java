package com.allstates.training.view;

import java.io.Serializable;

public class Department implements Serializable, Comparable<Department> {
private int dptid;
private String dname;
public Department(int deptid,String dname)
{
	this.dptid=deptid;
	this.dname=dname;
	
}
public int getDptid() {
	return dptid;
}
public void setDptid(int dptid) {
	this.dptid = dptid;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
@Override
public String toString() {
	return "Department [dptid=" + dptid + ", dname=" + dname + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dname == null) ? 0 : dname.hashCode());
	result = prime * result + dptid;
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
	Department other = (Department) obj;
	if (dname == null) {
		if (other.dname != null)
			return false;
	} else if (!dname.equals(other.dname))
		return false;
	if (dptid != other.dptid)
		return false;
	return true;
}
@Override
public int compareTo(Department o) {
	if(this.dptid>o.dptid) 
	return 1;
	else if(this.dptid<o.dptid)
		return -1;
	return 0;
}


	
}
