package ru.innopolis.coursejava.homeworks.lesson2.homework2;

public class Task1 {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456"; //Вариант работы программы когда номер карты указан с пробелами
        String editedCardNumber = cardNumber.replace("1234 5678 9012 ", "**** **** **** ");
        System.out.println("Номер карты: " +  editedCardNumber );

        String cardNumber1 = "1234567890123456"; //Вариант работы программы когда номер карты будет передан без пробелов
        if (cardNumber1.length() == 16) {
            String formattedCardNumber = "************" + cardNumber1.substring(12);
            System.out.println("Номер карты: " + formattedCardNumber);
        }
        else {
            System.out.println("Неверный формат карты");
        }

    }
}
