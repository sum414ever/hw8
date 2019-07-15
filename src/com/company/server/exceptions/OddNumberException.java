package com.company.server.exceptions;

public class OddNumberException extends Exception {
    public OddNumberException(int number) {
        super("Stop dude, your number " + number + " is odd!!!");
    }
}
