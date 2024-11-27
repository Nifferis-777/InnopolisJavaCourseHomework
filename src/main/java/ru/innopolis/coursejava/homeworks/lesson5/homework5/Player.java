package ru.innopolis.coursejava.homeworks.lesson5.homework5;

public class Player {
    private int id;
    private String nickname;
    private boolean isOnline;

    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    @Override
    public boolean equals(Object obj) { //Переопределение метода equals()
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return id == player.id && isOnline == player.isOnline && nickname.equals(player.nickname);
    }

    @Override
    public int hashCode() { //Переопределение метода hashCode
        int result = id;
        result = 31 * result + nickname.hashCode(); // Вычисление hash code
        result = 31 * result + (isOnline ? 1 : 0);
        return result;
    }

    @Override
    public String toString() { // Переопределение метода toString
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}

