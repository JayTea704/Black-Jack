import java.util.ArrayList;
import java.util.*;

public class Deck {
    public  ArrayList<String[]> deck;
    private String suit;
    public Stack<String[]> deal = new Stack<>();

    //Returns Stack. First makes a shuffled ArrayList, then adds each element into stack.
    public Stack makeDeck (){
        deck = new ArrayList<String[]>();
        //adding faces for each suit to arrayList
        for(int i = 1; i<=4; i++) {
            if(i==1) {
                suit = "diamonds";
            }
            else if(i == 2){
                suit = "hearts";
            }
            else if(i == 3){
                suit = "spades";
            }
            else if(i == 4){
                suit = "clubs";
            }
            deck.add(new Card(suit, "Ace").getCard());
            for(int k = 2; k<=10; k++){
                String face = k + "";
                deck.add(new Card(suit, face).getCard());
            }
            deck.add(new Card(suit, "Jack").getCard());
            deck.add(new Card(suit, "Queen").getCard());
            deck.add(new Card(suit, "King").getCard());
        }
        //shuffles
        Collections.shuffle(deck);
        //puts elements in stack
        for(String[]cards : deck){
            deal.push(cards);
        }
        return deal;
    }
    //Prints card out in String form
    public String toString(String[]cards){
        return cards[1] + " of " + cards[0];
    }
}

