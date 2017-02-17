import java.util.InputMismatchException;
import java.util.Scanner;


public class DeckOfCardsTest {

	public static void main(String[] args)
	{
		Deck myDeckOfCards = new Deck();
		myDeckOfCards.shuffle();
        int hands=getInput();
		myDeckOfCards.deal(hands);
	}
	
	public static int getInput(){
		boolean msg = true;
		while(true){
			try{
				System.out.print("Enter the number of hands: ");
		        Scanner input=new Scanner(System.in);
		        int hands=input.nextInt();
		        if(hands<2 || hands>5){
		        	throw new Exception("Plz input between 2 to 5 : ");
		        }
		        return hands;
		        // break;
		        
			}catch(Exception e){
				System.out.print("Wrong input !!!!\n");
			}
		}
	}
}
