package com.company.server.exceptions;

public class NumberBiggerHundredException extends Exception {

    public NumberBiggerHundredException(int number){
        super("Stop dude, your number " + number+" is bigger than hundred!!!");
    }
}
