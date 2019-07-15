package com.company.errors.memory;

public class OutOfMemoryError {

    public static void main(String args[]) {
        Integer[] array = new Integer[100000 * 100000];
    }
}