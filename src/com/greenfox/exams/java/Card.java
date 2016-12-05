package com.greenfox.exams.java;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by posam on 2016-12-05.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
public class Card {
    private String color;
    private String value;
    static Random rand = new Random();
    private List<String> colors = Arrays.asList("karo", "sziv", "pikk", "treff");
    private List<String> values = Arrays.asList("1","2","3", "4", "5", "6", "7", "8", "9", "10", "jung", "dama", "kiraly", "asz");

    public Card() {
        this.color = setRandom(colors);
        this.value = setRandom(values);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    static <T> T setRandom(List<T> list) {
        return list.get(rand.nextInt(list.size()));
    }
}
