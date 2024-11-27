//2. If-else
//● Создайте переменную типа int и присвойте ей любое значение
// ●Если число четное (делится на 2 без остатка), напишите "Четное число."
//● Если число нечетное напишите "Нечетное число."
// Чтобы проверить, что число четное, нужно выяснить, делится ли оно на 2 без остатка. Для этого существует оператор%– он возвращает остаток от деления.

package ru.innopolis.coursejava.homeworks.lesson4.homework4;
public class Task2 {
    public static void main(String[] args) {
        int number = 12;
        if (number % 2 == 0) {
            System.out.println("Четное число.");
        } else {
            System.out.println("Нечетное число.");
        }
    }
}

