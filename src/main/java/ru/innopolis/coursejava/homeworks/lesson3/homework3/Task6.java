//6.Топ-3 игроков
// ● создайте массив строк (размер10)
// ● запишите в него 10 имен
// ● в цикле выведите на экран только первых трех игроков

package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Task6 {
    public static void main(String[] args) {
        String[] players = new String[10];
        // Заполняю массив именами игроков
        players[0] = "Игрок 1 - Антонина";
        players[1] = "Игрок 2 - Егор";
        players[2] = "Игрок 3 - Регина";
        players[3] = "Игрок 4 - Вячеслав";
        players[4] = "Игрок 5 - Зульфия";
        players[5] = "Игрок 6 - Алексей";
        players[6] = "Игрок 7 - Маргарита";
        players[7] = "Игрок 8 - Леонид";
        players[8] = "Игрок 9 - Станислав";
        players[9] = "Игрок 10 - Надежда";
        // Вывод только первых трех игроков
        for (int i = 0; i < 3; i++) {
            System.out.println(players[i]);
        }
    }
}

