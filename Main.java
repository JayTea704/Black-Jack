import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        boolean doYouWantToPlay = true;
        Deck myDeck = new Deck();
        //makes deck
        myDeck.makeDeck();
        //Plays one game of black jack. Asks to play again.
        while(doYouWantToPlay) {
            myDeck.playGame();
            System.out.println("Play again? y/n");
            if(input.next().equals("n")){
                doYouWantToPlay = false;
            }
            else{
                continue;
            }

        }
    }
}
