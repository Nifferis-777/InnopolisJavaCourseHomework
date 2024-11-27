package ru.innopolis.coursejava.homeworks.lesson1.homework1;



public class Homework1 {
    public static void main(String[] args) {
        //1)Метод .isEmpty() проверяет, является ли объект пустым или нет
        String text1 = "";
        boolean result1 = text1.isEmpty();
        System.out.println("1.1:" + result1);

        String text2 = "Hello World";
        boolean result2 = text2.isEmpty();
        System.out.println("1.2:" + result2);

        //2)Метод .isBlank() используется для проверки, является ли строка пустой или состоит только из пробельных символов (пробелов, табуляций, новых строк и т.д.)
        String str1 = "";
        boolean result3 = str1.isBlank();
        System.out.println("2.1:" + result3);

        String str2 = "    ";
        boolean result4 = str2.isBlank();
        System.out.println("2.2:" + result4);

        String str3 = "   Программа на Java   ";
        boolean result5 = str3.isBlank();
        System.out.println("2.3:" + result5);

        //3)Метод .substring(int, int) используется для извлечения части строк
        String marka = "AVTOVAZ";
        String result6 = marka.substring(4, 7);
        System.out.println("3:" + result6);

        //4)Метод .indexOf(String str) возвращает индекс первого вхождения указанной подстроки в строке, или -1, если подстрока не найдена
        String fabric = "Рога и копыта";
        int result7 = fabric.indexOf("копыта");
        System.out.println("4.1:" + result7);

        String initials = "Иванов Борис Степанович";
        int result8 = initials.indexOf("Юрьевич");
        System.out.println("4.2:" + result8);

        //5)Метод .lastIndexOf(String str) возвращает индекс последнего вхождения указанной подстроки в строке, или -1, если подстрока не найден
        String name_of_football_club = "Манчестер Юнайтед";
        int result9 = name_of_football_club.lastIndexOf("честер");
        System.out.println("5.1:" + result9);

        String name_of_football_club1 = "Крылья Советов";
        int result10 = name_of_football_club1.lastIndexOf("Спартак");
        System.out.println("5.2:" + result10);

        //6)Метод .toLowerCase() используется для преобразования всех символов строки в нижний регистр
        String phone_brands = "XiAoMi, SAMSung, reALme, IPHONE";
        String result11 = phone_brands.toLowerCase();
        System.out.println("6:" + result11);

        //7)Метод .toUpperCase() используется для преобразования всех символов строки в верхний регистр
        String pets = "сAt, DoG, PARROT, turtle";
        String result12 = pets.toUpperCase();
        System.out.println("7:" + result12);

        //8)Метод .replace(String,String) используется для замены всех вхождений одной подстроки на другую подстроку в исходной строке
        String name_of_book = "Война и Мир";
        String result13 = name_of_book.replace("Война", "Пир");
        System.out.println("8:" + result13);

        //9)Метод .startsWith(String) проверяет, начинается ли строка с указанной подстроки (префикса)
        String hill1 = "Без труда не выловишь и рыбку из пруда";
        boolean result14 = hill1.startsWith("Без труда");
        System.out.println("9.1:" + result14);

        String hill2 = "Под лежачий камень и вода не течет";
        boolean result15 = hill2.startsWith("Вода камень точит");
        System.out.println("9.2:" + result15);

        //10)Метод .endsWith(String) проверяет заканчивается ли строка указанной подстрокой (суффиксом)
        String cartoon_name1 = "Маша и Медведь";
        boolean result16 = cartoon_name1.endsWith("ведь");
        System.out.println("10.1:" + result16);

        String cartoon_name2 = "Чип и Дейл";
        boolean result17 = cartoon_name2.endsWith("богатыря");
        System.out.println("10.2:" + result17);

        //11)Метод .repeat(int) используется для создания новой строки, повторяющей исходную строку указанное количество раз
        String car_make = "Aston Martin \t";
        String result18 = car_make.repeat(4);
        System.out.println("11:" + result18);

        //12)Метод .contains(String) используется для проверки наличия указанной подстроки в исходной строке
        String clothing_brand = "Hugo Boss";
        boolean result19 = clothing_brand.contains("ugo Bo");
        System.out.println("12:" + result19);

        //13)Метод .concat(String) используется для объединения (конкатенации) двух строк в одну
        String name = "Александр \t";
        String surname = "Иванов";
        String result20 = name.concat(surname);
        System.out.println("13:" + result20);

        //14)Метод .trim() используется для удаления пробельных символов с начала и конца строки
        String genre_of_music = "    Rock and Roll         ";
        String result21 = genre_of_music.trim();
        System.out.println("14:" + result21);

        //15)Метод .equals(String) используется для сравнения двух строк и проверки их равенства
        String country1 = "Азербайджан";
        String country2 = "Азербайджан";
        String country3 = "Великобритания";
        boolean result22 = country1.equals(country2);
        boolean result23 = country1.equals(country3);
        System.out.println("15.1:" + result22);
        System.out.println("15.2:" + result23);
    }
}
