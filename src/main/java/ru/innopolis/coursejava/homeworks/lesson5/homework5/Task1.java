//1.data-класс
// ● Опишите класс Player(игрок)
// ● У игрока есть поля:
// ○ id(int)
// ○ nickname(String)
// ○ isOnline(boolean)
// ● Все поля должны быть приватными
// ● Переопределите для класса методы equals(),hashCode()и toString()
// ● В отдельном классе создайте двух игроков с одинаковыми значениями полей.
// ● Убедитесь,что player1==player2==>false
// ● Убедитесь,что player1.equals(player2)==>true


package ru.innopolis.coursejava.homeworks.lesson5.homework5;

public class Task1 {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Игрок1", true);
        Player player2 = new Player(1, "Игрок1", true);
        System.out.println(player1 == player2);
        System.out.println(player1.equals(player2));
        System.out.println(player1);
        System.out.println(player2);
    }
}

