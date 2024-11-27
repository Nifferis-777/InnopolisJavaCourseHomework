//4.Задание про циклы
// ● напечатайте на экран числа от 1 до 1000000000

package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000000; i++) {
            if (i % 1000000 == 0) {
                System.out.println(i);
            }
        }
    }
}

