package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Movie {
    private String title;       // Название
    private double rating;      // Рейтинг (от 0 до 10)
    private String genre;       // Жанр
    private String country;     // Страна
    private boolean hasOscar;   // Наличие Оскара (да/нет)



    public Movie(String title, double rating, String genre, String country, boolean hasOscar) {   // Конструктор
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }

    public String getTitle() {  // Геттеры для доступа к полям
        return title;
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

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", hasOscar=" + hasOscar +
                '}';
    }
}
