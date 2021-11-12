package ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo;

public class Parrot extends Bird{

    public Parrot(String name, String color) {
        super(name, color);
    }

    public void speak() {
        System.out.printf("%s say: 'Hello'\n", name);
    }

}
