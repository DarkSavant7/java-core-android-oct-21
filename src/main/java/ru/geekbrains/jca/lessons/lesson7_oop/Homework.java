package ru.geekbrains.jca.lessons.lesson7_oop;

public class Homework {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murzik", 100),
                new Cat("Vaska", 300),
        };

        Bowl bowl = new Bowl();
        bowl.putFood(400);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
