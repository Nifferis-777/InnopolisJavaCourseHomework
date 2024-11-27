//4. Переменная String с именем password
// ● Опишите алгоритм проверки пароля. Требования к паролю:
//○ длина пароля не меньше 8 символов. Иначе написать ошибку"Пароль не менее 8символов"
//○ пароль должен содержать минимум одну цифру. Иначе написать ошибку "Пароль должен содержать минимум 1 цифру"
//○ пароль должен содержать минимум 1 из символов [!,@,#,$,%,^,&,*,No].Иначе написать ошибку "Пароль должен содержать минимум 1 спецсимвол"
// ● если пароль подходит по всем критериям, написать"пароль принят"

package ru.innopolis.coursejava.homeworks.lesson4.homework4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String password = "Password123!№";
        String result = validatePassword(password);
        System.out.println(result);
    }

    public static String validatePassword(String password) {
        if (password.length() < 8) { // Проверка длины пароля
            return "Пароль не менее 8 символов";
        }

        if (!containsDigit(password)) { // Проверка наличия хотя бы одной цифры
            return "Пароль должен содержать минимум 1 цифру";
        }

        if (!containsSpecialCharacter(password)) { // Проверка наличия хотя бы одного спец-символа
            return "Пароль должен содержать минимум 1 спецсимвол";
        }

        return "Пароль принят"; // Dсе условия выполнены
    }

    private static boolean containsDigit(String str) {  // Проверка на наличие хотя бы одной цифры
        return str.matches(".*\\d.*");
    }

    private static boolean containsSpecialCharacter(String str) { // Проверка на наличие хотя бы одного специального символа
        String specialCharacters = "[!@#$%^&*()№]";
        Pattern pattern = Pattern.compile(specialCharacters);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}

