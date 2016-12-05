package com.greenfox.exams.java;

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

    public String toString() {
        return color + " " + value;
    }
}
