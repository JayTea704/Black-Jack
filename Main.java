import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Deck myDeck = new Deck();
        for(int i = 0; i < myDeck.makeDeck().size(); i++) {
            System.out.print(myDeck.makeDeck().get(i));
        }
    }
}
