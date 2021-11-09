package ru.geekbrains.jca.lessons.lesson5_oop;

public class SingletonClassExample {
    //.....
    //.....
    //.....
    //.....
    private static SingletonClassExample instance;

    private SingletonClassExample() {
    }

    public static SingletonClassExample getInstance() {
        if (instance == null) {
            instance = new SingletonClassExample();
        }
        return instance;
    }
}
