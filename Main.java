import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Deck myDeck = new Deck();
        //makes deck
        myDeck.makeDeck();
        //prints out top card in Stack (first card you draw from deck).
        System.out.println(myDeck.toString(myDeck.deal.peek()));
    }
}
