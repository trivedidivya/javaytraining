package com.allstates.training.view;

import java.util.ArrayList;
import java.util.List;

public class CandidateDao {
	public List<Candidate> candidates=null;

	public CandidateDao() {
		super();
		candidates = new ArrayList<>();
	}
	public List<Candidate> getAll(){
		candidates.retainAll(candidates);
		candidates.add(new Candidate("Rohit","java","pune",4));
		candidates.add(new Candidate("shubham","c++","bengaluru",5));
		candidates.add(new Candidate("shubham","c++","bengaluru",5));
		candidates.add(new Candidate("baishali","html","pune",2));
		candidates.add(new Candidate("deepti","boot","gujarat",1));
		candidates.add(new Candidate("divya","java","pune",4));
		candidates.add(new Candidate("anubha","c","benage",7));
		candidates.add(new Candidate("devseh","java","surat",8));
		return candidates;
	}

}
