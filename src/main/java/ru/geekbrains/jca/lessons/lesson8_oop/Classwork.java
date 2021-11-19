package ru.geekbrains.jca.lessons.lesson8_oop;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Classwork {
    public static void main(String[] args) {
//        simplePolyInterface();
//        simpleAnonymousExample();
//        interfacesExample();
//        lambdaExample();
//        lambdasExample();

        System.out.println(Flying.SOME_TYPE_STRING);
        Swan swan = new Swan();
        swan.doSomethingDefault();
        Helicopter heli = new Helicopter();
        heli.doSomethingDefault();
        Flying.doSomethingStatic();
    }

    private static void lambdasExample() {
        String[] strings = {"January", "February", "March", "April"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
    }

    private static void lambdaExample() {
        Summator sum = new Summator();
        calc(22, 33, sum);

        calc(10, 5, new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        });

        calc(6, 14, (x, y) -> x * y);
    }

    public static void calc(int a, int b, Calculator calculator) {
        System.out.printf("Calculating....\na = %d, b = %d result = %d\n",
                a, b, calculator.calculate(a, b));
    }

    private static void interfacesExample() {
        Flying[] flyings = {
                new Balloon(),
                new Helicopter(),
                new Swan(),
                new Flying() {
                    @Override
                    public void fly() {
                        System.out.println("Anonymous fly");
                    }
                },
                () -> System.out.println("Anonymous fly"),
                () -> System.out.println("Lambda fly")
        };

        for (Flying f : flyings) {
            f.fly();
            //  object  <==> Type
            if (f instanceof Marker) {
                System.out.println("Marker found");
            }
//        System.out.println(flying instanceof Flying);
//        System.out.println(flying instanceof Helicopter);
        }

//        Marker m = new Marker(){};
//        System.out.println(m);

        Moving mov = new Moving() {
            @Override
            public void walk() {

            }

            @Override
            public void run() {

            }

            @Override
            public void crawl() {

            }
        };
    }

    private static void simpleAnonymousExample() {
        Flying anon = new Flying() {
            public static final String S = "kjnsdvkjnsfjkv";
            private String name;
            private int some;


            @Override
            public void fly() {
                doSomething();
                System.out.println();
            }

            public void doSomething() {

            }
        };
        anon.fly();
    }

    private static void simplePolyInterface() {
        Balloon b = new Balloon();
        Flying swan = new Swan();
        if (swan instanceof Moving) {
            Moving m = (Moving) swan;
            m.crawl();
            m.run();
            m.walk();
        }
    }
}
