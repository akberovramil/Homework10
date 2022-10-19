import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String abbreviation = "ФИО сотрудника - ";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(abbreviation + fullName);
        System.out.println("Задание 2");
        fullName = fullName.toUpperCase();
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameNew = fullName.replace('ё', 'е');
        System.out.println(abbreviation + fullNameNew);
        System.out.println("Задание 4");
        fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.indexOf("Ivanov"));
        System.out.println(fullName.indexOf(" Ivan"));
        System.out.println(fullName.indexOf(" Ivanovich"));
        System.out.println(fullName.lastIndexOf("h"));
        System.out.println("Фамилия сотрудника - " + fullName.substring(0, 6));
        System.out.println("Имя сотрудника - " + fullName.substring(7, 11));
        System.out.println("Отчество сотрудника - " + fullName.substring(11, 21));
    }
}
