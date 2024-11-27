//3.Задача про массив объектов
// ● создайте класс Movie
// ● в классе создайте поля :
// ○ название
// ○ рейтинг(от 0 до 10)
// ○ жанр
// ○ страна
// ○ есть ли оскар(да/нет)
// ● создайте в другом классе метод psvm.
// ● в этом методе объявите массив films
// ● положите в массив 3 любимых фильма

package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Task3 {
    public static void main(String[] args) {


    Movie[] films = new Movie[3]; // Объявляю массив

        //Добавляю фильмы в массив
   films[0] = new Movie ("Побег из Шоушнка", 9.3, "Драма", "США", true);
   films[1] = new Movie ("Миллионер из трущоб", 8.32, "Драма, Криминал, Мелодрама", "США", true);
   films[2] = new Movie ("Дэдпул", 7.6, "Боевик, комедия", "США", false);

   for (Movie film : films) { // Вывод информации о фильмах
       System.out.println(film);
   }
}
}
