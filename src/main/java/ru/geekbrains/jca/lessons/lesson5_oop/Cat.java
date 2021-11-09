package ru.geekbrains.jca.lessons.lesson5_oop;

import java.time.Year;

public class Cat {
    private static String type = "CAT";
    private String name;
    private String color;
    private int birthYear;
    private boolean happy;

    public Cat() {
        System.out.println("Cat born");
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat(String name, String color, int age) {
        this(name);
        this.color = color;
        this.birthYear = Year.now().getValue() - age;
    }

    //not a constructor
    public String Cat(int age) {
        return  "";
    }

    public void run() {
        System.out.printf("Cat %s running\n", name);
    }

    public void voice() {
        System.out.printf("%s meaw\n", name);
    }

    public int countLettersInMyName() {
        return name.length();
    }

    public static void someStaticMethod(Cat cat) {
//        System.out.println(name);
//        run();
//        voice();
        System.out.println(cat.name);
        cat.run();
        cat.voice();
    }

    public Cat bornCat() {
        return new Cat("unknown", "white", 0);
    }

    @Override
    public String toString() {
        return String.format("Cat: name - %s, color - %s, age - %d",
                name, color, getAge());
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Cat.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}