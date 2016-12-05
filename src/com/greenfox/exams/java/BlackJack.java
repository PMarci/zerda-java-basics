package com.greenfox.exams.java;

import javax.swing.*;

/**
 * Created by posam on 2016-12-05.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
public class BlackJack {
    private static JPanel BlackJack;
    private static JButton newGame;
    private static JButton drawACard;
    private static JLabel user;
    private static JLabel house;

    private BlackJack() {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJack();
            }
        });

    }


}
