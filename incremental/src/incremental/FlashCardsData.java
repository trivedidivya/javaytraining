package incremental;

public class FlashCardsData implements CardSearchable {

	FlashCard arr[]=new FlashCard[5];
	
	public FlashCardsData(FlashCard[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public Card searchCard(String sub) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getSubject().equals(sub))
			{
				//System.out.println(arr[i]);
				return arr[i];
			}//System.out.println(arr[i]);
				
		}
		return null;
		
	}

}
