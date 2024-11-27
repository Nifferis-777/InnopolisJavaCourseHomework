// 1. Задача про массив строк:
// ● Создайте массив
// ● Массив хранит 5строк.
// ● Массив должен называться todoList
// ● Положите в массив 5 дел на день

package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Task1 {
    public static void main(String[] args) {
        String[] todoList = {
                "Почистить зубы",
                "Сделать уборку",
                "Сходить в магазин",
                "Погулять с собакой",
                "Почитать книгу"
        };
        for (String todo : todoList) {
            System.out.println(todo);
        }
    }
}


//
