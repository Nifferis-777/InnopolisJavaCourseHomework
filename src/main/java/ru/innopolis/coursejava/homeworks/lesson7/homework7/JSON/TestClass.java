package ru.innopolis.coursejava.homeworks.lesson7.homework7.JSON;

import java.util.Collection;

public class TestClass {
    public static void main(String[] args) {
        PlayerService service = new PlayerServiceJSON();

        // Создание игрока
        int playerId = service.createPlayer("WinMaster_777");

        // Добавление очков
        service.addPoints(playerId, 100);

        // Получение списка игроков и вывод информации о них
        Collection<Player> players = service.getPlayers();

        for (Player player : players) {
            System.out.println(player);
        }

        // Удаление игрока
        Player deletedPlayer = service.deletePlayer(playerId);
        System.out.println("Удалённый игрок: " + deletedPlayer);
    }
}
