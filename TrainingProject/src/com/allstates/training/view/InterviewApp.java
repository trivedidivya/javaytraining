package com.allstates.training.view;

import java.util.List;
import java.util.stream.Collectors;

public class InterviewApp {
public static void main(String[] args) {
	System.out.println("list candidates based on experience");
CandidateDao candidateDao=new CandidateDao();


//candidates.forEach((c)->System.out.println(c));
List<Candidate> puneCandidates=candidateDao.getAll()
.stream()
.filter((can)->can.getCity().equals("pune")).collect(Collectors.toList());
puneCandidates.forEach((c)->System.out.println(c));
}
}
