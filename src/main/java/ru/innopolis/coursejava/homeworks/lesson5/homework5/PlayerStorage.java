package ru.innopolis.coursejava.homeworks.lesson5.homework5;
import java.util.HashSet;
import java.util.Set;

public class PlayerStorage {
    private Set<Player> players;

    public PlayerStorage() {
        players = new HashSet<>();
    }

    public boolean addPlayer(Player player) {
        return players.add(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }
}


