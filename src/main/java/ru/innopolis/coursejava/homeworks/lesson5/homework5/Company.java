package ru.innopolis.coursejava.homeworks.lesson5.homework5;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int foundationYear;

    private List<String> films;

    public Company(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.films = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}

