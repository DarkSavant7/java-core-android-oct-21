package ru.geekbrains.jca.lessons.lesson8_oop;

public class Balloon implements Flying, Marker {
    @Override
    public void fly() {
        System.out.println("The balloon is flying");
    }
}
