package ru.geekbrains.jca.lessons.lesson8_oop;

public class Summator implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
