package ru.innopolis.coursejava.homeworks.lesson2.homework2;

public class Item {
    String name; //Название товара
    String articleNumber; //Артикул товара
    double price; //Цена товара
    int quantity; //Количество
    String color; //Цвет товара
    double length; //Длина товара
    double width; //Ширина

    public Item(String  itemName, String itemArticleNumber, double itemPrice, int itemQuantity, String itemColor, double itemLength, double itemWidth) {
       name = itemName;
       articleNumber = itemArticleNumber ;
       price = itemPrice;
       quantity = itemQuantity;
       color = itemColor;
       length = itemLength;
       width = itemWidth;
    }
}
