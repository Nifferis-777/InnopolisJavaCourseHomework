package ru.innopolis.coursejava.homeworks.lesson5.homework5;

public class Movie {
    private String name;        // Название
    private double rating;      // Рейтинг (от 0 до 10)
    private String genre;       // Жанр
    private String country;     // Страна
    private boolean hasOscar;   // Наличие Оскара (да/нет)

    public Movie(String name, double rating, String genre, String country, boolean hasOscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }
    public boolean isHasOscar() {
        return hasOscar;

    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Рейтинг должен быть от 0 до 10");
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Фильм: " + name +
                ", Рейтинг: " + rating +
                ", Жанр: " + genre +
                ", Страна: " + country +
                ", Наличие Оскара: " + (hasOscar ? "Да" : "Нет");


    }
}
