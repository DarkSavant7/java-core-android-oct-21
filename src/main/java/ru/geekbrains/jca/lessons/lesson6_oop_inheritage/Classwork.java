package ru.geekbrains.jca.lessons.lesson6_oop_inheritage;

import ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo.Animal;
import ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo.Bird;
import ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo.Cat;
import ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo.Dog;
import ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo.Parrot;
import ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo.Snake;

public class Classwork {
    public static void main(String[] args) {
//        simpleZoo();
//        simplePolymorph();

        Animal[] animals = {
                new Cat("Barsik", "black"),
                new Dog("Bobik", "brown"),
                new Bird("Chizhik", "yellow"),
                new Snake("Kaa", "green"),
                new Parrot("Kesha", "blue"),
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].walk();
            animals[i].voice();
            System.out.println(animals[i].getName());
//            System.out.println(animals[i].TYPE);
//            animals[i].fly();
//            if (i == 3) {
//                Bird b = (Bird) animals[i];
//                b.fly();
//            }
//            if (animals[i] instanceof Bird b) {
//                b.fly();
//            }
            if (animals[i] instanceof Bird) {
                ((Bird) animals[i]).fly();
            }
            if (animals[i] instanceof Parrot) {
                ((Parrot) animals[i]).speak();
            }
        }
//        ((Snake) animals[3]).useParentWalk();

        System.out.println(Animal.TYPE);
        System.out.println(Bird.TYPE);
        System.out.println(Snake.TYPE);
        Animal.doSomething();
        Bird.doSomething();
        Snake.doSomething();
    }

    private static void simplePolymorph() {
//        Animal animal1 = new Animal();
        Animal animal = new Cat("Murzik", "red");
        System.out.println(animal.getClass().getName());
        System.out.println(animal instanceof Cat);
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Object);
        System.out.println(animal instanceof Dog);
    }

    private static void simpleZoo() {
        Cat cat = new Cat("Barsik", "black");
        Dog dog = new Dog("Bobik", "brown");
        Bird bird = new Bird("Chizhik", "yellow");
//        Bird bird = new Bird();
//        bird.setName("Chizhik" );
//        bird.setColor("yellow");

        cat.voice();
        cat.walk();
        dog.voice();
        dog.walk();
        bird.voice();
        bird.walk();
    }
}
