package ru.innopolis.coursejava.homeworks.lesson7.homework7.JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PlayerServiceJSON implements PlayerService {
    private final Map<Integer, Player> players = new HashMap<>();
    private int nextId = 1; // Счетчик для генерации уникальных идентификаторов
    private final String filePath = "players.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public PlayerServiceJSON() {
        loadPlayers(); // Загружаем игроков из файла при инициализации
    }

    @Override
    public Player getPlayerById(int id) {
        return players.get(id);
    }

    @Override
    public Collection<Player> getPlayers() {
        return players.values();
    }

    @Override
    public int createPlayer(String nickname) {
        Player player = new Player(nextId, nickname, 0, false);
        players.put(nextId, player);
        nextId++;
        savePlayers(); // Сохраняем изменения в файл
        return player.getId();
    }

    @Override
    public Player deletePlayer(int id) {
        Player removedPlayer = players.remove(id);
        savePlayers(); // Сохраняем изменения в файл
        return removedPlayer;
    }

    @Override
    public int addPoints(int playerId, int points) {
        Player player = players.get(playerId);
        if (player != null) {
            player.setPoints(player.getPoints() + points);
            savePlayers(); // Сохраняем изменения в файл
            return player.getPoints();
        }
        return 0; // Если игрок не найден, возвращаем 0
    }

    // Метод для загрузки игроков из файла
    private void loadPlayers() {
        try (Reader reader = new FileReader(filePath)) {
            TypeToken<Map<Integer, Player>> token = new TypeToken<Map<Integer, Player>>() {};
            Map<Integer, Player> loadedPlayers = gson.fromJson(reader, token.getType());
            if (loadedPlayers != null) {
                players.putAll(loadedPlayers);
                // Устанавливаем следующий ID
                nextId = players.keySet().stream().max(Integer::compare).orElse(0) + 1;
            }
        } catch (FileNotFoundException e) {
            // Файл не найден, это нормально, просто создадим его позже
        } catch (IOException e) {
            throw new RuntimeException("Error loading players", e);
        }
    }

    // Метод для сохранения игроков в файл
    private void savePlayers() {
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(players, writer);
        } catch (IOException e) {
            throw new RuntimeException("Error saving players", e);
        }
    }
}

