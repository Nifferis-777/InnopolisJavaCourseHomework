//6.Турнирная таблица
// ● В задании 1 вы создали класс Player
// ● Создайте Map<Player,Integer> points для хранения очков игроков
// ● Положите в мэпу 10игроков. У каждого 0 очков.
// ● Игроку с id=4 запишите 10 очков
// ● Игроку с id=7 – 12 очков
// ● Игроку с id=8 – 11очков
// ● Игроку с id=9 – 13очков
// ● Игроку с id=10 – 5очков
// ● Выведите на экран 3х лучших игроков турнира
// *● На первом месте должен быть игрок с максимальным результатом


package ru.innopolis.coursejava.homeworks.lesson5.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Task6 {
    public static void main(String[] args) {
        Map<Play, Integer> points = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            Play player = new Play(i, "Игрок №" + i, true);
            points.put(player, 0);
        }
        for (Play player : points.keySet()) {
            if (player.getId() == 4) {
                points.put(player, 10);
            } else if (player.getId() == 7) {
                points.put(player, 12);
            } else if (player.getId() == 8) {
                points.put(player, 11);
            } else if (player.getId() == 9) {
                points.put(player, 13);
            } else if (player.getId() == 10) {
                points.put(player, 5);
            }
        }

        List<Map.Entry<Play, Integer>> sortedPlayers = new ArrayList<>(points.entrySet());
        sortedPlayers.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Тройка лучших игроков:");
        for (int i = 0; i < 3 && i < sortedPlayers.size(); i++) {
            Map.Entry<Play, Integer> entry = sortedPlayers.get(i);
            System.out.println(entry.getKey() + " - " + entry.getValue() + " очков");
        }
    }
}

