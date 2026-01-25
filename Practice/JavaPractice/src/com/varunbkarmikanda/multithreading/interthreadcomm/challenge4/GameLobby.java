package com.varunbkarmikanda.multithreading.interthreadcomm.challenge4;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

public class GameLobby {
    public static void main(String[] args){

        int numberOfPlayers = 6;

        CyclicBarrier barrier = new CyclicBarrier(
                numberOfPlayers,
                () -> System.out.println("--- ALL PLAYERS READY! LOADING MAP ---")
        );

        for (int i = 1; i <= numberOfPlayers; i++) {
            new Thread(new Player(ThreadLocalRandom.current().nextInt(1000, 6001), barrier), "PLAYER-" + i).start();
        }
    }
}
