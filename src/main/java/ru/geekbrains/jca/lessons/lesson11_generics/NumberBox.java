package ru.geekbrains.jca.lessons.lesson11_generics;

import java.util.List;

public class NumberBox<N extends Number> {
    private N[] numbers;

    public NumberBox(N... numbers) {
        this.numbers = numbers;
    }

//    public boolean equalsByAvg(NumberBox another) {
    public boolean equalsByAvg(NumberBox<?> another) {
        return Math.abs(avg() - another.avg()) < 0.0000001;
    }

    public boolean equalsByAvg(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return Math.abs(avg() - sum / list.size()) < 0.0000001;
    }

    public double avg() {
        return sum() / numbers.length;
    }

    public double sum() {
        double sum = 0;
        for (N number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public N[] getNumbers() {
        return numbers;
    }
}
