package ru.innopolis.coursejava.homeworks.lesson2.homework2;

public class Room {
    String name; // Название комнаты
    double roomArea; // Площадь комнаты
    int numberOfWindows; // Количество окон;

    public Room(String rname, double myroomArea, int mynumberOfWindows) {
        name = rname;
        roomArea = myroomArea;
        numberOfWindows = mynumberOfWindows;
    }
}
