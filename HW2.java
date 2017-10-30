import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author TODO: Student ID:B0344108 Name:鄭亞欣（ChengYaHsin）
 * Try to write some comments for your codes (methods, 15 points)
 */
public class HW2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input N (deck of cards):");
		String testn= sc.nextLine(); 
        
		int nDeck=Integer.parseInt(testn);
		Deck deck=new Deck(nDeck);
		//TODO: please check your output, make sure that you print all cards on your screen (10 points)
		deck.printDeck();
		
		if(isAllCardsCorrect(deck.getAllCards(),nDeck)){
			System.out.println("Well done!");
		}else{
			System.out.println("Error, please check your source code");
		}
	}
	/**
	 * This method is used for checking your result, not a part of your HW2
	 * @param allCards 所有的牌
	 * @param nDeck 總共有幾副牌
	 * @return
	 */
	private static boolean isAllCardsCorrect(ArrayList<Card> allCards,int nDeck){
		//check the output 
		boolean isCorrect=true;;
		HashMap <String,Integer> checkHash=new HashMap<String,Integer>();
		for(Card card:allCards){
			int suit= card.getSuit();
			int rank = card.getRank();
			if(suit>4||suit<1||rank>13||rank<1){
				isCorrect=false;
				break;
			}
			if(checkHash.containsKey(suit+","+rank)){
				checkHash.put(suit+","+rank, 
						checkHash.get(suit+","+rank)+1);
			}else{
				checkHash.put(suit+","+rank, 1);
			}

		}
		if(checkHash.keySet().size()==52){
			for(int value:checkHash.values()){
				if(value!=nDeck){
					isCorrect=false;
					break;
				}
			}
		}else{
			isCorrect=false;
		}
		return isCorrect;
	}

}
/**
 * Description: TODO: please add description here
 */
class Deck{
	private ArrayList<Card> cards;
	//TODO: Please implement the constructor (30 points)
	public Deck(int nDeck){
		cards = new ArrayList<Card>(); // Create a new ArrayList
		
		//Use for loop to input data in the ArrayList<Card>
		for (int a = 0 ; a < nDeck ; a++) //Determine how many decks that the player need
		{
			for (int i = 1 ; i < 5 ; i++) //Input the suit data
			{
				for (int j = 1; j < 14 ; j++) //Input the rank data
				{
					Card card = new Card(i,j); 
					cards.add(card); //Build each card
				}
			}
		}
		//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		//Hint: Use new Card(x,y) and 3 for loops to add card into deck
		//Sample code start
		//Card card=new Card(1,1); ->means new card as clubs ace
		//cards.add(card);
		//Sample code end

	}	
	//TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck(){
		
		//Card allCards = new Card();
		for ( int i = 0 ; i < cards.size() ; i++ )
		{
			cards.get(i).printCard(); //Print out every single card from the ArrayList<Card>
		}
		
		
		//Hint: print all items in ArrayList<Card> cards, 
		//TODO: please implement and reuse printCard method in Card class (5 points)

	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}
/**
 * Description: TODO: please add description here	
 */
class Card{
	private int suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; //1~13
	/**
	 * @param s suit
	 * @param r rank
	 */
	public Card(int s,int r){
		suit=s;
		rank=r;
		
	}	
	//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
	public void printCard(){
		
		//Use if-else conditional expressions to sort the suits
		if (suit == 1 )
		{
			//Use if-else conditional expressions to sort the rank numbers and names
			if ( rank == 1 )
			{
				System.out.println("Clubs Ace");
			}
			else if ( rank == 11 )
			{
				System.out.println("Clubs Jake");
			}
			else if( rank == 12 )
			{
				System.out.println("Clubs Queen");
			}
			else if( rank == 13 )
			{
				System.out.println("Clubs King");
			}
			else
			{
				System.out.println("Clubs " + rank);
			}
		}
		
		//Use if-else conditional expressions to sort the suits
		else if ( suit == 2 )
		{
			//Use if-else conditional expressions to sort the rank numbers and names
			if ( rank == 1 )
			{
				System.out.println("Diamonds Ace");
			}
			else if ( rank == 11 )
			{
				System.out.println("Diamonds Jake");
			}
			else if( rank == 12 )
			{
				System.out.println("Diamonds Queen");
			}
			else if( rank == 13 )
			{
				System.out.println("Diamonds King");
			}
			else
			{
				System.out.println("Diamonds " + rank);
			}
		}
		
		//Use if-else conditional expressions to sort the suits
		else if ( suit == 3 )
		{
			//Use if-else conditional expressions to sort the rank numbers and names
			if ( rank == 1 )
			{
				System.out.println("Hearts Ace");
			}
			else if ( rank == 11 )
			{
				System.out.println("Hearts Jake");
			}
			else if( rank == 12 )
			{
				System.out.println("Hearts Queen");
			}
			else if( rank == 13 )
			{
				System.out.println("Hearts King");
			}
			else
			{
				System.out.println("Hearts " + rank);
			}
		}
		
		//Use if-else conditional expressions to sort the suits
		else if ( suit == 4 )
		{
			//Use if-else conditional expressions to sort the rank numbers and names
			if ( rank == 1 )
			{
				System.out.println("Spades Ace");
			}
			else if ( rank == 11 )
			{
				System.out.println("Spades Jake");
			}
			else if( rank == 12 )
			{
				System.out.println("Spades Queen");
			}
			else if( rank == 13 )
			{
				System.out.println("Spades King");
			}
			else
			{
				System.out.println("Spades " + rank);
			}
		}
		
		//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace

	}
	public int getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}
