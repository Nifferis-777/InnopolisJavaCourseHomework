package ru.innopolis.coursejava.homeworks.lesson3.homework3;

public class Films {
    private String title;       // Название
    private double rating;      // Рейтинг (от 0 до 10)
    private String genre;       // Жанр
    private String country;     // Страна
    private boolean hasOscar;   // Наличие Оскара (да/нет)
    private int year;           // Год выпуска

    public Films(String title, double rating, String country, boolean hasOscar, int year, String genre) {
        this.title = title;
        this.rating = rating;
        this.country = country;
        this.hasOscar = hasOscar;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
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
        return "Films{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", hasOscar=" + hasOscar +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;


    }
}
