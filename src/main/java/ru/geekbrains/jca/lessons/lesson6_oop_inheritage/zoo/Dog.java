package ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo;

public class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("Dog %s bark\n", name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
