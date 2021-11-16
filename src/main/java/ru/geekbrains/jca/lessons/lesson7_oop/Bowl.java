package ru.geekbrains.jca.lessons.lesson7_oop;

public class Bowl {
    private int foodAmount;

    public void decreaseFood(int amount) {
        foodAmount -= amount;
        System.out.printf("Food decreased for %d, %d left\n", amount, foodAmount);
    }

    public void putFood(int amount) {
        foodAmount += amount;
        System.out.printf("Food increased for %d, %d now\n", amount, foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
