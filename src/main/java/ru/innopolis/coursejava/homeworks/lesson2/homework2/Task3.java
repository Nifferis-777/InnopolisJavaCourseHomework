package ru.innopolis.coursejava.homeworks.lesson2.homework2;

public class Task3 {
    public static void main(String[] args) {
        Item myItem1 = new Item("Smartphone", "12378943671441", 12.555, 1, "black",17.3, 7.3);
        System.out.println("Информация о товаре № 1: ");
        System.out.println("Название: " + myItem1.name);
        System.out.println("Артикул: " + myItem1.articleNumber);
        System.out.println("Цена (тыс. руб.): " + myItem1.price);
        System.out.println("Количество: " + myItem1.quantity);
        System.out.println("Цвет: " + myItem1.color);
        System.out.println("Длина (cм): " + myItem1.length);
        System.out.println("Ширина (см): " + myItem1.width);
        System.out.println();

        Item myItem2 = new Item("Notebook", "99975347896", 49.999, 2, "bronze",42.3, 29.9);
        System.out.println("Информация о товаре № 2: ");
        System.out.println("Название: " + myItem2.name);
        System.out.println("Артикул: " + myItem2.articleNumber);
        System.out.println("Цена (тыс. руб.): " + myItem2.price);
        System.out.println("Количество: " + myItem2.quantity);
        System.out.println("Цвет: " + myItem2.color);
        System.out.println("Длина (cм): " + myItem2.length);
        System.out.println("Ширина (см): " + myItem2.width);
        System.out.println();

        Item myItem3 = new Item("TabletPC", "12378qbty945617qwt", 21.799, 5, "red",29.1, 19.1);
        System.out.println("Информация о товаре № 3: ");
        System.out.println("Название: " + myItem3.name);
        System.out.println("Артикул: " + myItem3.articleNumber);
        System.out.println("Количество: " + myItem3.quantity);
        System.out.println("Цвет: " + myItem3.color);
        System.out.println("Длина (cм): " + myItem3.length);
        System.out.println("Ширина (см): " + myItem3.width);
        System.out.println();

        Item myItem4 = new Item("Keyboard", "1298594561t", 7.799, 3, "white",49.3, 12.2);
        System.out.println("Информация о товаре № 4: ");
        System.out.println("Название: " + myItem4.name);
        System.out.println("Артикул: " + myItem4.articleNumber);
        System.out.println("Количество: " + myItem4.quantity);
        System.out.println("Цвет: " + myItem4.color);
        System.out.println("Длина (cм): " + myItem4.length);
        System.out.println("Ширина (см): " + myItem4.width);
        System.out.println();

        Item myItem5 = new Item("Printer", "1ast23343454ttgd3332", 12.875, 1, "brown",37.3, 35.7);
        System.out.println("Информация о товаре № 5: ");
        System.out.println("Название: " + myItem5.name);
        System.out.println("Артикул: " + myItem5.articleNumber);
        System.out.println("Количество: " + myItem5.quantity);
        System.out.println("Цвет: " + myItem5.color);
        System.out.println("Длина (cм): " + myItem5.length);
        System.out.println("Ширина (см): " + myItem5.width);
    }
}
