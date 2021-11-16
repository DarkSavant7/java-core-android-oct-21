package ru.geekbrains.jca.lessons.lesson7_oop;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Classwork {
    public static void main(String[] args) {
//        stringBuilderExample();
//        bigNumbers();
//        catsBowls();
//        fightExample();
//        simpleEnumExample();
//        enumExample();
//        localInnerAndNestedExample();
    }

    private static void localInnerAndNestedExample() {
        Frog frog = new Frog();
        Frog.Head head1 = frog.getHead();
//        Frog.Head head2 = new Frog.Head();
        Frog.Head head3 = frog.new Head();
        Frog.Head head4 = new Frog().new Head();
        Frog.Paw paw = frog.getPaw4();
//        Frog.Paw paw2 = frog.new Paw();

        Frog.NestedClassExample nested = new Frog.NestedClassExample("SOME");
        nested.doSomething(frog);

        class LocalClassExample {
            private String name;
        }

        LocalClassExample lce = new LocalClassExample();
        lce.name = "knsvknfv";
        System.out.println(lce.name);
    }

    private static void enumExample() {
        Operator op = Operator.ADD;
        System.out.println(op.operation(20, 55));
        op = Operator.MUL;
        System.out.println(op.operation(5, 9));
    }

    private static void simpleEnumExample() {
        WeekDay day = WeekDay.FRIDAY;
        System.out.println(day);
        System.out.println(day.ordinal());
        WeekDay day2 = WeekDay.FRIDAY;
        System.out.println(day == day2);
        System.out.println(day.getDayNumber());
        System.out.println(day.getRussianName());
    }

    private static void fightExample() {
        Fighter subZero = new Fighter("Sub Zero", 100, 10);
        Fighter scorpion = new Fighter("Scorpion", 120, 8);

        while (true) {
            scorpion.hit(subZero);
            if (!subZero.isAlive()) {
                System.out.println("Sub Zero dead");
                break;
            }
            subZero.hit(scorpion);
            if (!scorpion.isAlive()) {
                System.out.println("Scorpion dead");
                break;
            }
        }
    }

    private static void catsBowls() {
        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murzik", 100),
                new Cat("Vaska", 300),
        };
//        var bowl = new Bowl();
        Bowl bowl = new Bowl();
        bowl.putFood(500);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
    }

    private static void bigNumbers() {
        BigInteger bi = new BigInteger("100500");
        BigDecimal bd = new BigDecimal("1005000.55");
//        bd.setScale()
    }

    private static void stringBuilderExample() {
        String s1 = "Example";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++) {
            s1 += i;
        }
        long delta = System.currentTimeMillis() - startTime;
        System.out.println("String time: " + delta);

        StringBuilder sb = new StringBuilder("Example");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++) {
            sb.append(i);
        }
        delta = System.currentTimeMillis() - startTime;
        System.out.println("SB time: " + delta);
        System.out.println(s1.equals(sb.toString()));

        StringBuffer stringBuffer = new StringBuffer("Example");
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300_000; i++) {
            sb.append(i);
        }

        delta = System.currentTimeMillis() - startTime;
        System.out.println("StringBuffer time: " + delta);
    }
}
