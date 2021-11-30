package ru.geekbrains.jca.lessons.lesson11_generics;

import ru.geekbrains.jca.lessons.lesson5_oop.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
//        simpleBoxExample();
//        genericExample();
//        rawUseExample();
//        multiExample();
//        comparingDoubles();
//        numberBoxExample();
        List<Integer> list1 = List.of(1,2,34,4);
        System.out.println((Integer) getFirstObjectRaw(list1) + 10);
        System.out.println(getFirstObject(list1) + 10);
//        Collections.copy();
    }

    private static <T> T getFirstObject(List<T> list) {
        return list.get(0);
    }

    private static Object getFirstObjectRaw(List<?> list) {
        return list.get(0);
    }

    private static void numberBoxExample() {
        //        NumberBox<String> str;
//        NumberBox<Cat> catNumberBox;
//        NumberBox nb = new NumberBox("jsfnjv", "jsfv");
//        NumberBox nb = new NumberBox(12, 123, 23, 4);
        NumberBox<Integer> integers = new NumberBox<>(1, 2, 3, 4, 5, 6);
        NumberBox<Integer> integers1 = new NumberBox<>(7, 0);
        System.out.println(integers.avg());
//        System.out.println(integers1.avg());
//        System.out.println(integers.equalsByAvg(integers1));
        NumberBox<Float> floats = new NumberBox<>(1f, 2f, 3f, 4f, 5f, 6f);
        System.out.println(floats.avg());
        System.out.println(integers.equalsByAvg(floats));
        List<Double> list = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        System.out.println(integers.equalsByAvg(list));
    }

    private static void comparingDoubles() {
        double a = 0.9;
        double b = 0.0;
        for (int i = 0; i < 90; i++) {
            b += 0.01;
        }

        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }

    private static void multiExample() {
        MultiGenericBox<Integer, Integer, String, Cat> multi = new MultiGenericBox<>(
                10,
                15,
                "Hello",
                new Cat());
    }

    private static void rawUseExample() {
        GenericBox boxInt1 = new GenericBox(58);
        GenericBox boxInt2 = new GenericBox(12);
        boxInt1.setObj("Hello");
        GenericBox boxString1 = new GenericBox("Hello");
        GenericBox boxString2 = new GenericBox<>(" world!");
//        boxString2.setObj(25);
        int sum = (Integer) boxInt1.getObj() + (Integer) boxInt2.getObj();
        System.out.println(sum);
    }

    private static void genericExample() {
        GenericBox<Integer> boxInt1 = new GenericBox<>(58);
        GenericBox<Integer> boxInt2 = new GenericBox<>(12);
//        boxInt1.setObj("Hello");
        GenericBox<String> boxString1 = new GenericBox<>("Hello");
        GenericBox<String> boxString2 = new GenericBox<>(" world!");
//        boxString2.setObj(25);
        int sum = boxInt1.getObj() + boxInt2.getObj();
        System.out.println(sum);
        System.out.println(boxInt1.getClass().getName());
        System.out.println(boxString1.getClass().getName());
    }

    private static void simpleBoxExample() {
        Box boxInt1 = new Box(58);
        Box boxInt2 = new Box(12);
        Box boxString1 = new Box("Hello");
        Box boxString2 = new Box(" world!");

        //... a lot of code strings
        boxInt1.setObj("Java");
        //... a lot of code strings

        if (boxInt1.getObj() instanceof Integer && boxInt2.getObj() instanceof Integer) {
            int sum = (Integer) boxInt1.getObj() + (Integer) boxInt2.getObj();
            System.out.println(sum);
        } else {
            System.out.println("Not a number in box");
        }
    }
}
