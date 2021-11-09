package ru.geekbrains.jca.lessons.lesson5_oop;

import java.time.Year;

public class Classwork {
    public static void main(String[] args) {
//        catWithFieldAccessExample();

        Cat murka = new Cat("Murka", "red", 3);
        Cat barsik = new Cat("Barsik", "black", 4);
        new Cat("Murzik", "white", 3).voice();
        murka.run();
        murka.voice();
        barsik.run();
        barsik.voice();
        System.out.println(murka);
        System.out.println(barsik);

        System.out.println(murka.getType());
        System.out.println(barsik.getType());

        murka.setType("kjsnkfvjknjkneb");

        System.out.println(murka.getType());
        System.out.println(barsik.getType());

        System.out.println(Cat.getType());

        SingletonClassExample single = SingletonClassExample.getInstance();

        System.out.println(Year.now());

        Cat[] cats = new Cat[5];
        cats[0] = new Cat();
    }

    private static void catWithFieldAccessExample() {
//        Cat cat1 = new Cat();
//        cat1.age = 3;
//        cat1.setName("Murka");
//        cat1.color = "red";
//
//        System.out.println(cat1);
//        System.out.printf("Cat: name - %s, color - %s, age - %d\n", cat1.name, cat1.color, cat1.age);
//
//        Cat cat2 = new Cat();
//        cat2.age = 4;
//        cat2.name = "Barsik";
//        cat2.color = "black";
//
//        cat1.run();
//        cat2.run();
//        cat1.voice();
//        cat2.voice();
//        System.out.println(cat1.countLettersInMyName());
//        System.out.println(cat2.countLettersInMyName());
    }
}
