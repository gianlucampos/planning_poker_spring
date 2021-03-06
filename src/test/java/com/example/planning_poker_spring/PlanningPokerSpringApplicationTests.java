package com.example.planning_poker_spring;

import com.example.planning_poker_spring.models.Player;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PlanningPokerSpringApplicationTests {

    Player player, player2, newPlayer;
    List<Player> players;

    @BeforeEach
    void setUp() {
        player = new Player();
        player.setName("Gianluca");
        player.setVoto("PP");

        player2 = new Player();
        player2.setName("Ricardo");
        players = List.of(player, player2);

        newPlayer = new Player();
        newPlayer.setName("Gianluca");
    }

    @Test
    public void testContainsPlayer() {
        System.out.println(players.contains(newPlayer));
        System.out.println(player.equals(newPlayer));
    }


    @Test
    public void testChangeVote() {
        System.out.println(players);
        var playa = players.stream().filter(p -> p.getName().equals("Gianluca")).findFirst().orElseThrow();
        playa.setVoto("P");
        System.out.println(players);
    }
}
