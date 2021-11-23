package ru.geekbrains.jca.lessons.lesson9_exceptions;

import ru.geekbrains.jca.lessons.lesson7_oop.Bowl;
import ru.geekbrains.jca.lessons.lesson7_oop.Cat;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) {
//        generateException();
//        divideByZero();
//        throwExample();
//        tryCatchExample();
//        throwErrorExample();
//        tryWithResourcesExample();
        Cat cat = new Cat("Tom", 200);
        Bowl bowl = new Bowl();
        bowl.putFood(100);
        try {
            cat.eat(bowl);
        } catch (MadCatException e) {
            int food = cat.getAppetite() - bowl.getFoodAmount();
            bowl.putFood(food);
            cat.eat(bowl);
        }
    }

    private static void tryWithResourcesExample() {
        try (Scanner scanner = new Scanner(new File("files/some.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void throwErrorExample() {
        //Не делайте так
        try {
            throwError();
        } catch (Error e) {
            //do nothing
        }
        System.out.println("After");
    }

    private static void throwError() {
        throw new StackOverflowError();
    }

    private static void tryCatchExample() {
        try {
            scanFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//            return;
//            System.exit(0);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }
        System.out.println("AFTER");
    }

    private static void throwExample() {
//        RuntimeException e = new RuntimeException();
//        throw e;
        throw new RuntimeException("Something went wrong");
    }

    private static void scanFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files/some.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    private static void divideByZero() {
        div2(10, 0);
    }

    private static int div2(int a, int b) {
        return div1(a, b);
    }

    private static int div1(int a, int b) {
        return div0(a, b);
    }

    private static int div0(int a, int b) {
        return a / b;
    }

    private static void generateException() {
        int[] arr = {1, 2};
        System.out.println(arr[3]);
    }

    private static int safeDivide(int a, int b) {
        if (b == 0) {
            return  0;
        }
        return a / b;
//        try {
//            return a / b;
//        } catch (ArithmeticException e) {
//            return 0;
//        }
    }
}
