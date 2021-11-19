package ru.geekbrains.jca.lessons.lesson8_oop;

public class Helicopter implements Flying {
    @Override
    public void fly() {
        System.out.println("The heli is flying");
    }

    @Override
    public void doSomethingDefault() {
//        Flying.super.doSomethingDefault();
        System.out.println("No default");
    }
}
