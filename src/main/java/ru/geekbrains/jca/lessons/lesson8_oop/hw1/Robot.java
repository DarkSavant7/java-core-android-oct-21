package ru.geekbrains.jca.lessons.lesson8_oop.hw1;

public class Robot implements Participant {
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        return this.maxRun >= length;
    }

    @Override
    public boolean jump(int height) {
        return this.maxJump >= height;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
