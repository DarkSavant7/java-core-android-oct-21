package ru.geekbrains.jca.lessons.lesson7_oop;

public enum Operator {
    ADD{
        public int operation(int x, int y) {
            return x + y;
        }
    },
    MUL{
        public int operation(int x, int y) {
            return x * y;
        }
    };

    public abstract int operation(int x, int y);
}
