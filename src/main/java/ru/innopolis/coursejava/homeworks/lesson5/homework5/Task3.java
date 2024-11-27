//3.Список объектов
// ● создайте класс Movie(можно использовать тот, что создавали ранее)
// ● в классе создайте поля:
// ○ название
// ○ рейтинг(от 0 до 10)
// ○ жанр
// ○ страна
// ○ есть ли оскар (да/нет)
// ● создайте в другом классе метод psvm.
// ● в этом методе объявите список films
// ● положите в список 3 любимых фильма
// ● выведите на экран информацию о фильме по индексу 1

package ru.innopolis.coursejava.homeworks.lesson5.homework5;
import java.util.ArrayList;
import java.util.List;
public class Task3 {
    public static void main(String[] args) {
        List<String> films = new ArrayList<>();
        films.add(String.valueOf(new Movie("Титаник", 8.4, "Мелодрама", "США",true)));
        films.add(String.valueOf(new Movie("Зеленая миля", 9.3, "Драма", "США",true)));
        films.add(String.valueOf(new Movie("Титаник", 8.4, "Мелодрама", "США",true)));

        if (films.size() > 1) {
            System.out.println(films.get(1));
        }
    }
}
