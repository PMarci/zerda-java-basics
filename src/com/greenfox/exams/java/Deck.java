package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by posam on 2016-12-05.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
public class Deck {
    private List<Card> cards = new ArrayList<Card>();
    private List<Card> used = new ArrayList<Card>();
    private List<String> colors = Arrays.asList("karo", "sziv", "pikk", "treff");
    private List<String> values = Arrays.asList("asz","2","3", "4", "5", "6", "7", "8", "9", "10", "jung", "dama", "kiraly");


    public Deck() {
        for (int i = 0; i < colors.size(); i++) {
            for (int j = 0; j < values.size(); j++) {
            Card card = new Card();
            card.setColor(colors.get(i));
            card.setValue(values.get(j));
                cards.add(card);
            }
        }
        Collections.shuffle(this.cards);
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
        int lastCard = cards.size()-1;
        lastCard = (cards.isEmpty()) ? 0 : lastCard;
        if (!cards.isEmpty()) {
        Card drawnCard = cards.get(lastCard);
        used.add(drawnCard);
            cards.remove(lastCard);
            return drawnCard;
        } else {
            return null;
        }
    }
}
