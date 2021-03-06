package ru.geekbrains.jca.lessons.lesson7_oop;

import ru.geekbrains.jca.lessons.lesson9_exceptions.BowlOverflowException;

public class Bowl {
    private static final int MAX_CAPACITY = 300;
    private int foodAmount;

    public boolean decreaseFood(int amount) {
        if (foodAmount < amount || amount < 0) {
            return false;
        }
        foodAmount -= amount;
        System.out.printf("Food decreased for %d, %d left\n", amount, foodAmount);
        return true;
    }

    public void putFood(int amount) {
        if (amount < 0) {
            return;
        }
        if (foodAmount + amount > MAX_CAPACITY) {
            throw new BowlOverflowException("Too much food");
        }
        foodAmount += amount;
        System.out.printf("Food increased for %d, %d now\n", amount, foodAmount);

    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
