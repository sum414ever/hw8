package com.company.errors.stack;

public class StackOverflowErrorRun {

    public static void main(String[] args) {
        doSomeThing();
    }

    static void doSomeThing() {
        doSomeThing();
    }
}

