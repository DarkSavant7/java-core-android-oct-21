package ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo;

public abstract class Animal extends Object {
    public static final String TYPE = "ANimal";
    protected String name;
    protected String color;

    public Animal() {
        System.out.println("New animal born");
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void walk() {
        System.out.printf("%s walks on paws\n", name);
    }

    public abstract void voice();

    public static void doSomething() {
        System.out.println("ANIMAL STATIC");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
