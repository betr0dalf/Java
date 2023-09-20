package ru.mirea.lab2;

// task 9

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
    private static final int numOfCards = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = in.nextInt();

        List<String> deck = getShuffledDeck();
        distributeCards(deck, n);
    }

    public static List<String> getShuffledDeck() {
        List<String> deck = new ArrayList<>();

        // here we are adding cards to the deck
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        Collections.shuffle(deck);

        return deck;
    }

    public static void distributeCards(List<String> deck, int players) {
        int numCardsToDistribute = players * numOfCards;

        if (deck.size() < numCardsToDistribute) {
            System.out.println("Not enough cards to distribute.");
            return;
        }

        for (int i = 0; i < players; i++) {
            List<String> playerHand = deck.subList(i * numOfCards, (i + 1) * numOfCards);

            System.out.println("Player " + (i + 1) + "'s hand:");
            for (String card : playerHand) {
                System.out.println(card);
            }

            System.out.println();
        }
    }
}
