package ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo;

public class Bird extends Animal{

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("Bird %s chik chirik\n", name);
    }

    public void fly() {
        System.out.printf("Bird %s is flying\n", name);
    }

}
