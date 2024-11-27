package ru.innopolis.coursejava.homeworks.lesson2.homework2;

public class Flat {
    String address; // Адрес квартиры
    int numberOfRooms; //Кол-во комнат
    int floorLocation; //На каком этаже расположена квартира
    int numberFlat; //Номер квартиры
    double areaFlat; //Общая площадь квартиры


    public Flat(String myAddress,  int myNumberOfRooms, int myFloorLocation, int myNumberFlat, double myAreaFlat) {
        address = myAddress;
        numberOfRooms = myNumberOfRooms;
        floorLocation = myFloorLocation ;
        numberFlat = myNumberFlat;
        areaFlat = myAreaFlat;

    }
}

