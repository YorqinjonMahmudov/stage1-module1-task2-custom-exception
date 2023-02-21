package com.epam.mjc;

public class MyException extends IllegalArgumentException {
    public MyException(long id) {
        super("Could not find student with ID " + id);
    }
}
