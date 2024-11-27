package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Task5 {
    public static void main(String[] args) {
        Films[] films = new Films[3];

        // Добавление фильмов в массив
        films[0] = new Films("Побег из Шоушенка", 9.3, "США", true, 1994, "Драма");
        films[1] = new Films("Миллионер из трущоб", 8.32, "США", true, 2008, "Драма, Криминал, Мелодрама");
        films[2] = new Films("Дэдпул", 7.6, "США", false,  2016, "Боевик, комедия");

        // Вывод информации о фильмах в формате "год - название - жанр - рейтинг"
        for (Films film : films) {
            System.out.println(film.getYear() + " - " + film.getTitle() + " - " + film.getGenre() + " - " + film.getRating());
        }
    }
}
