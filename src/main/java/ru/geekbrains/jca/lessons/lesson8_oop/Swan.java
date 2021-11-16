package ru.geekbrains.jca.lessons.lesson8_oop;

public class Swan implements Flying, Moving {
    @Override
    public void fly() {
        System.out.println("The swan is flying");
    }

    @Override
    public void walk() {
        System.out.println("Walks on paws");
    }

    @Override
    public void run() {
        System.out.println("Swan is running");
    }

    @Override
    public void crawl() {
        System.out.println("Won't crawl");
    }
}
