package com.company.server.exceptions;

public class StringNotPalindromeException extends Exception {
    public StringNotPalindromeException(String palindrome) {
        super("Stop dude, your string <" + palindrome+"> is not a palindrome!!!");
    }
}
