package ru.geekbrains.jca.lessons.lesson9_exceptions;

public class MadCatException extends RuntimeException {
    public MadCatException() {
    }

    public MadCatException(String message) {
        super(message);
    }
}
