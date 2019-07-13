package com.company.server.exceptions;

public class MyOwnNullPointerException extends Exception {

    public MyOwnNullPointerException(Object o) {
        super("Stop, dude, your object is null");
    }
}
