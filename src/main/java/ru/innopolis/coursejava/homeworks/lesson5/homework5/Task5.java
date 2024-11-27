//5. В задании 1 вы создали класс Player
// ● Создайте хранилище игроков.
// Его будет использовать программа, которая описывает турнир.
// Требования:
// ○ Количество игроков неизвестно заранее. Может быть 2,а может 100
// ○ В турнир каждый игрок может записаться только 1 раз (не может быть дублей)
// ●создайте 10 игроков и поместите их в хранилище.
// ● убедитесь, что если один игрок помещен в хранилище дважды, дубликат не запишется

package ru.innopolis.coursejava.homeworks.lesson5.homework5;
public class Task5 {
    public static void main(String[] args) {
        PlayerStorage storage = new PlayerStorage();

        // Создание 10ти уникальных игроков
        for (int i = 1; i <= 10; i++) {
            Player player = new Player(i, "Gamer" + i, true);
            storage.addPlayer(player);
        }

        // Попытка добавить дубликаты
        Player duplicatePlayer = new Player(1, "Gamer1", true);
        boolean isAddedDuplicate = storage.addPlayer(duplicatePlayer);

        // Вывод информации
        System.out.println("Пробуем добавить дубликат: " + isAddedDuplicate);
        System.out.println("Количество игроков в хранилище: " + storage.getPlayers().size());
    }
}
