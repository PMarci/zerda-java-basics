package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by posam on 2016-12-05.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
public class Player {
    private String name = "User";
    private List<Card> played = new ArrayList<Card>();
    private String playedInAString = "";
    private int sum = 0;

    public void setSum(int sum) {
        this.sum = sum;
    }


    public int getSum() {
        return sum;
    }


    public Player(String name) {
        this.name = name;
    }

    public void sumPlayedCards(Card card){
        int valueInNumber = 0;
            switch (card.getValue()) {
                case "asz" : valueInNumber = 1;
                    break;
                case "jung" : valueInNumber = 10;
                    break;
                case "dama" : valueInNumber = 10;
                    break;
                case "kiraly" : valueInNumber = 10;
                    break;
                default: valueInNumber = Integer.parseInt(card.getValue());
            }
        this.sum+= valueInNumber;
    }

    public void addPlayedCard(Deck deck) {
        Card drawnCard = deck.drawCard();
        played.add(drawnCard);
        sumPlayedCards(drawnCard);
        playedToString(drawnCard);
    }

    public void setPlayedInAString(String playedInAString) {
        this.playedInAString = playedInAString;
    }

    public void playedToString(Card card) {
        this.playedInAString+= card.toString() + " ";
    }
    public String toString() {
        return String.format("%s played: %s", name, playedInAString);
    }
}
