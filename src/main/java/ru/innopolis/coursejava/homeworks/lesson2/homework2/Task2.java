package ru.innopolis.coursejava.homeworks.lesson2.homework2;

public class Task2 {
    public static void main(String[] args) {
        Flat myFlat = new Flat ("Moscow, Amursky Lane 187", 2,16, 78,65.2);
        System.out.println("Общая информация о квартире: ");
        System.out.println("1) Расположена по адресу: " + myFlat.address);
        System.out.println("2) Имеет общую площадь (кв.м): " + myFlat.areaFlat);
        System.out.println("3) Расположена на этаже №: " + myFlat.floorLocation);
        System.out.println("4) Имеет номер: " + myFlat.numberFlat);
        System.out.println("5) В квартире следующее кол-во комнат: " + myFlat.numberOfRooms);

        Room myRoom1 = new Room("Гостиная",26.3, 2);
        System.out.println("В квартире имеется комната: " + myRoom1.name);
        System.out.println("Общая площадь данной комнаты (м.кв): " + myRoom1.roomArea);
        System.out.println("Кол-во окон в комнате: " + myRoom1.numberOfWindows);

        Room myRoom2 = new Room("Спальня",20.2, 1);
        System.out.println("В квартире имеется комната: " + myRoom2.name);
        System.out.println("Общая площадь данной комнаты (м.кв): " + myRoom2.roomArea);
        System.out.println("Кол-во окон в комнате: " + myRoom2.numberOfWindows);
    }
}

