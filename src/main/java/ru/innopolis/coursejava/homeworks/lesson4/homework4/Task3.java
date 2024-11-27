//3. If-else + If
//Доработайте решение второго задания:
// ○если число четное И делится на 4 без остатка, напишите "Четное число. Кратно четырем"
// ○если число нечетное И делится на 3 без остатка, напишите "Нечетное число. Кратно трем."

package ru.innopolis.coursejava.homeworks.lesson4.homework4;

public class Task3 {
    public static void main(String[] args) {
        int number = 15;

        if (number % 2 == 0) {
            System.out.println("Четное число.");
            if (number % 4 == 0) {
                System.out.println("Кратно четырем.");
            }
        } else {
            System.out.println("Нечетное число.");
            // Дополнительная проверка на кратность 3
            if (number % 3 == 0) {
                System.out.println("Кратно трем.");
            }
        }
    }
}
