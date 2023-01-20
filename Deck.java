import java.util.ArrayList;

public class Deck {

    public ArrayList<Card> makeDeck (){ //Creates an array of a deck of cards
       ArrayList<Card> deck = new ArrayList<Card>();
       String suit;
       String face;

       for( int i = 1; i <= 4; i++) {
           for( int j = 1; j <= 13; j++) {
               if (i == 1) {
                   suit = "Clubs";
                   deck.add(new Card(suit,"A"));
                   for(int k = 2; k<=10; i++){
                       deck.add(new Card(suit,k+""));
                   }
                   deck.add(new Card(suit, "Jack"));
                   deck.add(new Card(suit,"Queen"));
                   deck.add(new Card(suit,"King"));


               }
               if(i == 2) {
                   suit = "Diamonds";
                   deck.add(new Card(suit,"A"));
                   for(int k = 2; k<=10; i++){
                       deck.add(new Card(suit,k+""));
                   }
                   deck.add(new Card(suit, "Jack"));
                   deck.add(new Card(suit,"Queen"));
                   deck.add(new Card(suit,"King"));

               }
               if(i == 3) {
                   suit = "Hearts";
                   deck.add(new Card(suit,"A"));
                   for(int k = 2; k<=10; i++){
                       deck.add(new Card(suit,k+""));
                   }
                   deck.add(new Card(suit, "Jack"));
                   deck.add(new Card(suit,"Queen"));
                   deck.add(new Card(suit,"King"));

               }
               if(i == 4){
                   suit = "Spades";
                   deck.add(new Card(suit,"A"));
                   for(int k = 2; k<=10; i++){
                       deck.add(new Card(suit,k+""));
                   }
                   deck.add(new Card(suit, "Jack"));
                   deck.add(new Card(suit,"Queen"));
                   deck.add(new Card(suit,"King"));

               }
           }
       }
       return deck;
    }
}
