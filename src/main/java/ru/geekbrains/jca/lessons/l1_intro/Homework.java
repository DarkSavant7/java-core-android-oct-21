package ru.geekbrains.jca.lessons.l1_intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(calculateExpression(5f, 25f, 3f, -4f));
        System.out.println("Task 2:");
        System.out.println(checkTwoNumbers(2, 7));
        System.out.println("Task 3:");
        isPositive(0);
        System.out.println("Task 4:");
        System.out.println(isNegative(10));
        System.out.println("Task 5:");
        welcome("Vasya");
        System.out.println("Task 6:");
        System.out.println(isYearLeap(2020));
        System.out.println(isYearLeap());
    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    static float calculateExpression(float a, float b, float c, float d) {
//        float result = a * (b + (c / d));
//        return result;
        return a * (b + (c / d));
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    static boolean checkTwoNumbers(int first, int second) {
//        int sum = first + second;
//        boolean result = sum <= 20 && sum >= 10;
//        return result;
        return first + second <= 20 && first + second >= 10;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void isPositive(int a) {
        if (a >= 0) System.out.println("Positive");
        else System.out.println("Negative");
    }

    //Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    static boolean isNegative(int a) {
        return a < 0;
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    static String welcome(String name) {
//        System.out.println("Привет, " + name + "!");
//        String result = "Привет, " + name + "!";
//        System.out.println(result);
//        return result;
        return "Привет, " + name + "!";
    }

    //*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static boolean isYearLeap(int year) {
//        if (year % 400 == 0) {
//            return true;
//        } else if(year % 100 == 0) {
//            return false;
//        } else if (year % 4 == 0) {
//            return true;
//        }
//        return false;
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    static boolean isYearLeap() {
        int year = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the year to check >>>> ");
            try {
                year = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("It's not a number. Try again");
                scanner.nextLine();
            }
        }
        return isYearLeap(year);
    }
}
