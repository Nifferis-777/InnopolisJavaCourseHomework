//2.Список дел
// ● Создайте список строк(List)
// ● Положите в список 5 дел на день
// ● В цикле выведите список в формате:
// ○Задача1: {текст задачи}
// ○Задача2: {текст задачи}
// ○...
// ○Задача5: {текст задачи}

package ru.innopolis.coursejava.homeworks.lesson5.homework5;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        todoList.add("Сходить в магазин");
        todoList.add("Выполнить домашнее задание");
        todoList.add("Покормить домашнего питомца");
        todoList.add("Пройтись по улице");
        todoList.add("Принять душ");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": {" + todoList.get(i) + "}");
        }
    }
    }

