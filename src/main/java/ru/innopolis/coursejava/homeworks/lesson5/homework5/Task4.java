//4.Вложенный список
// ● создайте класс Company(кинокомпания)
// ● в классе создайте поля:
//○название
//○ год основания
//○ список фильмов, которые компания выпустила (по 3 штуки)
// ● создайте в другом классе метод psvm.
// ● в этом методе объявите список companies
// ● положите в список 3 кинокомпании
// ● каждой кинокомпании запишите в портфолио по 3фильма
// ● напечатайте информацию о всех компаниях в формате {название компании} : {названия всех фильмов}

package ru.innopolis.coursejava.homeworks.lesson5.homework5;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("DC", 1934));
        companies.add(new Company("Marvel", 1939));
        companies.add(new Company("Miramax", 1979));

        List<String> dcFilms = companies.get(0).getFilms();
        dcFilms.add("Отряд самоубийц");
        dcFilms.add("Тёмный рыцарь");
        dcFilms.add("Аквамен");

        List<String> marvelFilms = companies.get(1).getFilms();
        marvelFilms.add("Человек паук");
        marvelFilms.add("Человек муравей");
        marvelFilms.add("Дэдпул");

        List<String> miramaxFilms = companies.get(2).getFilms();
        miramaxFilms.add("Крик");
        miramaxFilms.add("Ярды");
        miramaxFilms.add("Дети шпионов");

        for (Company company : companies) {
            System.out.println(company.getName() + ": " + company.getFilms());
        }
    }
}


