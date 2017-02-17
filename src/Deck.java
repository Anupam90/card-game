import java.security.SecureRandom;
import java.util.ArrayList;


public class Deck {
	
	private Card[] deck; // array of Card objects
	private int currentCard = 0; // index of next Card to be dealt (0-51)
	private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
	private static final SecureRandom randomNumbers = new SecureRandom();
	static	final String[] FACES = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
		"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
	static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
	
	
	public Deck()
	{
		deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
		// populate deck with Card objects
		for (int count = 0; count < deck.length; count++)
		{
			deck[count] = new Card(FACES[count % 13], SUITS[count / 13]);
		}
	}
	
	/*
	public void shuffle()
	{	
		for (int first = 0; first < deck.length; first++)
		{
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// swap current Card with randomly selected Card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}*/
	
	public ArrayList shuffle()
	{	
                ArrayList<Card>shuffledCard=new ArrayList<Card>();
		for (int first = 0; first < deck.length; first++)
		{
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// swap current Card with randomly selected Card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
        for (int count = 0; count < deck.length; count++)
		{
			shuffledCard.add(deck[count]);
		}
        return shuffledCard;
	}
	
	public void deal(int hands)
	{
		for (int i = 1; i <= hands*5; i++)
		{
			System.out.printf("%-30s",deck[currentCard++]);
		      if(i%hands==0)
		    	  System.out.println();
		}
	}
}
