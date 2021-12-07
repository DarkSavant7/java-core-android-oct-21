package ru.geekbrains.jca.lessons.lesson13_multithreading_v2.hw;

public abstract class Stage {
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}
