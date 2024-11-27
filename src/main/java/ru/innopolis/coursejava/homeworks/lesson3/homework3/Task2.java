//2.Задача про массив чисел
//● Создайте массив
//● Массив хранит 3 дробных числа.
//● Положите в массив значение чисел Пи, е и единицу
//● Дробные числа с точностью в 5 знаков после запятой

package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Task2 {

    public static void main(String[] args) {
        double [] numbers = {
                Math.round(Math.PI*100000.0) / 100000.0,
                Math.round(Math.E*100000.0) / 100000.0,
                1.0
        };
        for (double number : numbers) {
            System.out.println(number);
        }
    }
}
