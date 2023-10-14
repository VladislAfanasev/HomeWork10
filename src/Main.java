public class Main {
    public static void main(String[] args) {

// Задача №1. Вывести в консоль имя сотрудника
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" " + firstName+" " + middleName;
        System.out.println("Ф. И. О. сотрудника — "+ fullName);
        System.out.println();

// Задача №2. Вывести в консоль имя сотрудника заглавными буквами
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());
        System.out.println();

// Задача №3. Написать программу, которая выводит имя сотрудника заменяя символ "ё" на "е"
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName.replace('ё', 'е'));

    }
}