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
    private int sum;

    public void sumPlayedCards(){

    }

    public void addPlayedCard() {

    }
    public String toString() {
        return String.format("%s played: %s", name, playedInAString);
    }
}
