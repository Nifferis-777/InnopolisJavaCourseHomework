package ru.innopolis.coursejava.homeworks.lesson5.homework5;

public class Play {
        private int id;
        private String nickname;
        private boolean isOnline;

        public Play(int id, String nickname, boolean isOnline) {
            this.id = id;
            this.nickname = nickname;
            this.isOnline = isOnline;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Play)) return false;
            Play other = (Play) obj;
            return id == other.id && nickname.equals(other.nickname) && isOnline == other.isOnline;
        }

        @Override
        public int hashCode() {
            int result = Integer.hashCode(id);
            result = 31 * result + nickname.hashCode();
            result = 31 * result + Boolean.hashCode(isOnline);
            return result;
        }

        @Override
        public String toString() {
            return "Play{id=" + id + ", nickname='" + nickname + "', isOnline=" + isOnline + '}';
        }

        public int getId() {
            return id;
        }
    }

