//5. Задание со звездочкой.
// FizzBuzz Это – классическое задание с собеседования.
// ● выведите на экран числа от 1 до 100. При этом:
// ○ если число кратно 3,напечатайте Fizz
// ○ если число кратно 5, напечатайте Buzz
// ○ если число кратно и 3, и 5, напечатайте FizzBuzz

package ru.innopolis.coursejava.homeworks.lesson4.homework4;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
