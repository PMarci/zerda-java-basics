package com.greenfox.exams.java;

import java.util.List;

/**
 * Created by posam on 2016-12-05.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
public class Deck {
    private List<Card> cards;
    private List<Card> used;

    public Deck() {
        for (int i = 0; i < 52; i++) {
            Card randomCard = new Card();
            this.cards.add(randomCard);
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getUsed() {
        return used;
    }

    public void setUsed(List<Card> used) {
        this.used = used;
    }

    public Card drawCard(){
        return null;
    };
}
