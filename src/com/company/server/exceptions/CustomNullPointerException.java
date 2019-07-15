package com.company.server.exceptions;

public class CustomNullPointerException extends Exception {

    public CustomNullPointerException(Object obj) {
        super("Stop, dude, your object " + obj + " is null");
    }
}
