package ru.geekbrains.jca.lessons.lesson10_collections;

import ru.geekbrains.jca.lessons.lesson5_oop.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.UnaryOperator;

public class CollectionsExample {
//        Byte b = 10;
//        Short s = 22;
//        Integer i = 555;
//        Long l = 5454L;
//        Float f = .03f;
//        Double d = .00044;
//        Boolean bool = true;
//        Character c = 'i';
    public static void main(String[] args) {
//        listsExample();
//        setExample();
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
//        map.put("A", 4);
        map.putIfAbsent("A", 4);

        System.out.println(map.get("C"));
        System.out.println(map.get("W"));
        System.out.println(map.getOrDefault("W", 99));
        System.out.println(map.get("A"));
//        System.out.println(map);
//        map.forEach((k, v) -> System.out.println(k + ": " + v));
//        for (Integer value : map.values()) {
//            System.out.println(value);
//        }
//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void setExample() {
        //        Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("January");
        set.add("February");
//        set.add(null);
        set.add("March");
        set.add("February");
        System.out.println(set);

//        for (int i = 0; i < ; i++) {
//
//        }
//        for (String s : set) {
//            System.out.println(s);
//        }
//        set.forEach(s -> System.out.println(s));
//        Iterator iter = set.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//        Set<Box> boxes = new HashSet<>();
//        Set<Box> boxes = new TreeSet<>(new Comparator<Box>() {
//            @Override
//            public int compare(Box o1, Box o2) {
//                return o1.height - o2.height;
//            }
//        });
        Set<Box> boxes = new TreeSet<>();
        boxes.add(new Box(1,1));
        boxes.add(new Box(2,2));
        boxes.add(new Box(3,3));
        boxes.add(new Box(1,1));

        System.out.println(boxes);
    }

    private static void listsExample() {
        //        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
//        List<String> list = new Vector<>();
        list.add("January");
        list.add("February");
        list.add(null);
        list.add("March");
        list.add("February");
        list.add(null);

        list.add(2, "April");
        list.addAll(Arrays.asList("May", "June"));
        list.remove(3);
        list.remove("February");
        list.set(4, "September");
        System.out.println(list.get(5));
        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s + " month";
            }
        });

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String s : list) {
//            System.out.println(s);
//        }

//        Iterator iter = list.iterator();
//
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//            iter.remove();
//        }
//        ListIterator iter = list.listIterator();
//
//        while (iter.hasNext()) {
//            iter.next();
//            iter.set("SSSS");
//        }
        list.forEach(System.out::println);

        System.out.println(list);
//        List<Cat> cats = new ArrayList<>();
//        cats.add(new Cat());
    }

    public static class Box implements Comparable<Box> {
        private int width;
        private int height;
        private int flag;

        public Box(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public Box(int width, int height, int flag) {
            this.width = width;
            this.height = height;
            this.flag = flag;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "width=" + width +
                    ", height=" + height +
                    ", flag=" + flag +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box box = (Box) o;
            return width == box.width && height == box.height;
        }

        @Override
        public int hashCode() {
            return Objects.hash(width, height);
        }

        @Override
        public int compareTo(Box o) {
            return this.height * this.width - o.height * o.width;
        }
    }
}
