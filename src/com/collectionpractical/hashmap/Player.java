package com.collectionpractical.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Player {
  Map<String, Integer> player = new HashMap<>();

  public Map<String, Integer> add() {
    player.put("Sachin Tendulkar", 10);
    player.put("Virat kohli", 18);
    player.put("MS Dhoni", 7);
    return player;
  }

  public void display() {
    for (Map.Entry<String, Integer> player : player.entrySet()) {
      System.out.println("\nName of the Player :" + player.getKey() + " \nJersey Number: " + player.getValue());
    }
  }
}
