package com.company.stackOverflowError;

public class StackOverflowErrorRun {

    public static void main(String[] args) {
        doSomeThing();
    }

    static void doSomeThing() {
        doSomeThing();
    }
}

