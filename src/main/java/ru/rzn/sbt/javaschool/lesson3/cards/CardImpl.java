package ru.rzn.sbt.javaschool.lesson3.cards;

public class CardImpl implements Card {

    public enum enumSuit{бубны, трефы, червы, пики}
    public enum enumRank{туз, шестёрка, семёрка, восьмёрка, девятка, десятка, валет, дама, король}
    private int suit;
    private int rank;

    public CardImpl(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return enumRank.values()[rank] + " " + enumSuit.values()[suit];
    }
}
