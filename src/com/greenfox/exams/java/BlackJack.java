package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by posam on 2016-12-05.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
public class BlackJack extends JFrame{
    private static JPanel BlackJack;
    private static JButton newGame;
    private static JButton drawACard;
    private static JLabel user;
    private static Player userPlayer;
    private static JLabel house;
    private static Player housePlayer;
    private static Deck deck;


    private BlackJack() {
        BlackJack = new JPanel();
        newGame = new JButton("New Game");
        drawACard = new JButton("Draw a Card");
        userPlayer = new Player("User");
        user = new JLabel(userPlayer.toString());
        housePlayer = new Player("House");
        house = new JLabel(housePlayer.toString());
        deck = new Deck();
        drawACard.addActionListener(new ButtonListener());
        newGame.addActionListener(new ButtonListener());
        BlackJack.add(user);
        BlackJack.add(house);
        BlackJack.add(drawACard);
        BlackJack.add(newGame);
        this.add(BlackJack);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            final Object source = e.getSource();
            if (source.equals(newGame)) {
                userPlayer.setPlayedInAString("");
                user.setText(userPlayer.toString());
                userPlayer.setSum(0);
                housePlayer.setPlayedInAString("");
                house.setText(userPlayer.toString());
                housePlayer.setSum(0);
                pack();

            } else if (source.equals(drawACard)) {
                userPlayer.addPlayedCard(deck);
                user.setText(userPlayer.toString());
                if (housePlayer.getSum() < 17)
                housePlayer.addPlayedCard(deck);
                house.setText(housePlayer.toString());
                pack();
            }
        }
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
