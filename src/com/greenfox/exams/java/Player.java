package com.greenfox.exams.java;

import java.util.List;

/**
 * Created by posam on 2016-12-05.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
public class Player {
    private String name = "User";
    private List<Card> played;
    private String playedInAString;
    private int sum = 0;

    public void sumPlayedCards(){
        int valueInNumber;
        for (Card c: played) {
            switch (c.getValue()) {
                case "asz" : valueInNumber = 1;
                    break;
                case "jung" : valueInNumber = 10;
                    break;
                case "dama" : valueInNumber = 10;
                    break;
                case "kiraly" : valueInNumber = 10;
                    break;
                default: valueInNumber = Integer.parseInt(c.getValue());
            }

        }
    }

    public void addPlayedCard(Deck deck) {
        played.add(deck.drawCard());
    }
    public void playedToString(Card card) {
        this.playedInAString+= card.toString();
    }
    public String toString() {
        return String.format("%s played: %s", name, playedInAString);
    }
}
