package ru.geekbrains.jca.lessons.lesson9_exceptions;

public class BowlOverflowException extends RuntimeException {
    public BowlOverflowException() {
    }

    public BowlOverflowException(String message) {
        super(message);
    }
}
