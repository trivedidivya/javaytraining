package incremental;

import java.util.Scanner;

public class FlashCardTest {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  subject ,answer and question");
	FlashCard arr[]=new FlashCard[5];
	for(int i=0;i<5;i++) 
		{
		arr[i]=new FlashCard(sc.next(),sc.next(),sc.next());
		
		}
	FlashCardsData fcd=new FlashCardsData(arr);
	System.out.println("enter subject to be searched");
	String s=sc.next();
	System.out.println(fcd.searchCard(s));
	
}
}
