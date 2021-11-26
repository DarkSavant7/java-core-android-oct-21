package ru.geekbrains.jca.lessons.lesson9_exceptions.hw;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }
}
