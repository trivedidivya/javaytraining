package incremental;

import java.util.Scanner;

public class FlashCard extends Card {
	private String subject;
	private String question;
	private String answer;
	public FlashCard() {
		super();
	}
	public FlashCard(String subject, String question, String answer) {
		super();
		this.subject = subject;
		this.question = question;
		this.answer = answer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "FlashCard [subject=" + subject + ", question=" + question + ", answer=" + answer + "]";
	}
	public void sort(FlashCard arr[])
	{
		for(int i = 0; i<arr.length-1; i++) {
	         for (int j = i+1; j<arr.length; j++) {
	            if(arr[i].getSubject().compareTo(arr[j].getSubject())>0) {
	               FlashCard temp = arr[i];
	             
	              arr[i] = arr[j];
	             
	              arr[j] = temp;
	            
	            }
	         }
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void display(Card d)
	{
		
		System.out.println(d);
	}


}
