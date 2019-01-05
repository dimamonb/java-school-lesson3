package ru.rzn.sbt.javaschool.lesson3.cards;

public class DeckImpl implements Deck {

    private CardImpl[][] cards;

    public DeckImpl(){

        cards = new CardImpl[4][9];

        for (int i = CardImpl.enumSuit.бубны.ordinal(); i <= CardImpl.enumSuit.пики.ordinal() ; i++) {
            for (int j = CardImpl.enumRank.туз.ordinal(); j <= CardImpl.enumRank.король.ordinal() ; j++) {
                cards[i][j]= new CardImpl(i,j);
            }
        }
    }

    @Override
    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}
