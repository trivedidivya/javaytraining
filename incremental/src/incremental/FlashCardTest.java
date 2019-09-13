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

