package ru.geekbrains.jca.lessons.lesson14_log_test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Year;

@Getter
//@Setter
@ToString
@NoArgsConstructor
public class Cat {
    private static String type = "CAT";
   @Setter private String name;
    private String color;
    private int birthYear;
    private boolean happy;

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



}