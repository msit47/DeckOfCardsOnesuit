package packbalaji;
import java.util.LinkedList;
import java.util.ListIterator;

public class Cards {
	String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	 LinkedList<String> deck = new LinkedList<String>();
	 private void prepareDeck()
	 {
		 for(String cardValue:cardValues)
		 {
			 deck.add(cardValue);
		 }
	 }
	 private void printDeckElements()
	 {
		 ListIterator<String>cards=deck.listIterator();
		 System.out.println("The Cards present in the deck are:");
		 while (cards.hasNext())

	        {

	            System.out.print(cards.next() + "  ");

	        }
	        System.out.println();


	}
	private void checksum(Card c1,Card c2)
	{
		if(c1.getCardValue()+c2.getCardValue()==13)
		{
		   System.out.println("The given Cards resultant Sum is 13" );
		   deck.remove(c1.getValue());
		   deck.remove(c2.getValue());
		   System.out.println("The Cards are removed from the System");
		   
		}
		else
		{
			System.out.println("The given Cards resulant is not 13 and They are present in the system");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards c=new Cards();
		c.prepareDeck();
		c.printDeckElements();
		Card c1=new Card("A");
		Card c2=new Card("Q");
		
		c.checksum(c1,c2);
		c.printDeckElements();
		Card c3=new Card("4");
		Card c4=new Card("5");
		c.checksum(c3,c4);
		

		
		

	}

}
