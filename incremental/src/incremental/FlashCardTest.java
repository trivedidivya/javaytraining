package incremental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlashCardTest {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  subject ,answer and question");
	List<FlashCard> myCardList=new ArrayList<>();
	for(int i=0;i<5;i++) 
		{
		FlashCard f=new FlashCard(sc.next(),sc.next(),sc.next());
		myCardList.add(f);
		DisplayThread t=new DisplayThread();
		t.start();
		}
	FlashCardsData fcd=new FlashCardsData(myCardList);
	try
	{
		System.out.println("enter subject to be searched");
		String s=sc.next();
		Card c=fcd.searchCard(s);
		if(c==null)
		{
			throw new CardNotFoundException();
		}
		else
			System.out.println(c);
	}
	catch(CardNotFoundException ex)
		{
		System.out.println("Exception occured");
		}
	
}
}

