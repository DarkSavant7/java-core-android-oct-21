package ru.geekbrains.jca.lessons.lesson7_oop;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            System.out.printf("%s has ate\n", name);
            satiety = true;
        } else {
            System.out.printf("%s not enough\n", name);

        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
