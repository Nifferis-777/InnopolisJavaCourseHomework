package ru.innopolis.coursejava.homeworks.lesson6.homework6;
import java.time.Duration;
import java.time.LocalDateTime;

public interface HumanReadableTimestamp {
    String getTimestamp(LocalDateTime eventTimestamp);
}
class HumanReadableTimestampImpl implements HumanReadableTimestamp {

    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(eventTimestamp, now);

        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;

        if (days > 0) {
            if (days == 1) {
                return "Опубликовано вчера";
            } else if (days % 10 == 1 && days % 100 != 11) {
                return "Опубликовано " + days + " день назад";
            } else if (days % 10 >= 2 && days % 10 <= 4 && (days % 100 < 10 || days % 100 >= 20)) {
                return "Опубликовано " + days + " дня назад";
            } else {
                return "Опубликовано " + days + " дней назад";
            }
        } else if (hours > 0) {
            if (hours == 1 || hours % 10 == 1 && hours % 100 != 11) {
                return "Опубликовано " + hours + " час назад";
            } else if (hours % 10 >= 2 && hours % 10 <= 4 && (hours % 100 < 10 || hours % 100 >= 20)) {
                return "Опубликовано " + hours + " часа назад";
            } else {
                return "Опубликовано " + hours + " часов назад";
            }
        } else if (minutes > 0) {
            if (minutes == 1 || minutes % 10 == 1 && minutes % 100 != 11) {
                return "Опубликовано " + minutes + " минуту назад";
            } else if (minutes % 10 >= 2 && minutes % 10 <= 4 && (minutes % 100 < 10 || minutes % 100 >= 20)) {
                return "Опубликовано " + minutes + " минуты назад";
            } else {
                return "Опубликовано " + minutes + " минут назад";
            }
        }
        return "Только что опубликовано";
    }
}