package blackjack;

public class Card {

    private final Suit suit;
    private final CardNumber cardNumber;
    public Card(Suit suit,CardNumber cardNumber) {
        this.suit = suit;
        this.cardNumber=cardNumber;
    }

    public int getCardScore() {
        return cardNumber.getScore();
    }
}
