package ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo;

public class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("Cat %s meaw\n", name);
    }

}
