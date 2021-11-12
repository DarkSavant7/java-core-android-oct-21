package ru.geekbrains.jca.lessons.lesson6_oop_inheritage.homework;

public class Dog extends Animal{
    private static int counter;

    Dog(String name, int maxRun, int maxSwim) {
        super("Dog", name, maxRun, maxSwim);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
