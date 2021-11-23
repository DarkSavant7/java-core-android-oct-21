package ru.geekbrains.jca.lessons.lesson9_exceptions.hw;


public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String message) {
        super(message);
    }
}
