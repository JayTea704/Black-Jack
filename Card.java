public class Card {
    private String suit;
    private String face;

    public Card(String suit, String face) {
        this.face = face;
        this.suit = suit;


    }

    public String[] getCard() {
        String []card = new String[2];
        card[0] = suit;
        card[1] = face;
        return card;
    }
}
