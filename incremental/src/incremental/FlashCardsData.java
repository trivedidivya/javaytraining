package incremental;

import java.util.ArrayList;
import java.util.List;

public class FlashCardsData implements CardSearchable {

	List<FlashCard> myCardsList=new ArrayList<>();
	
	public FlashCardsData(List<FlashCard> myCardsList) {
		super();
		this.myCardsList = myCardsList;
	}

	@Override
	public Card searchCard(String sub) {
		for(int i=0;i<myCardsList.size();i++)
		{
			if(myCardsList.get(i).getSubject().equals(sub))
			{
				//System.out.println(arr[i]);
				return myCardsList.get(i);
			}
				
		}
		return null;
		
	}

}
