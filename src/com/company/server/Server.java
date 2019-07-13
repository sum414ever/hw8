package com.company.server;

import com.company.server.exceptions.MyOwnNullPointerException;
import com.company.server.exceptions.NumberBiggerHundredException;
import com.company.server.exceptions.OddNumberException;
import com.company.server.exceptions.StringNotPalindromeException;

public class Server {

    void checkIsPalindrome(String palindrome) throws StringNotPalindromeException {
        String removeSpaces = palindrome.replace(" ", "").toLowerCase();
        if (removeSpaces.equals(new StringBuilder(removeSpaces).reverse().toString())) {
            System.out.println("Dude, your sting " + palindrome + " is palindrome");
        } else throw new StringNotPalindromeException(palindrome);
    }

    void processNumbers(int number) throws OddNumberException, NumberBiggerHundredException {
        if (number > 100) {
            throw new NumberBiggerHundredException(number);
        } else if (number % 2 != 0) {
            throw new OddNumberException(number);
        } else
            System.out.println("Dude, your number " + number + " is les than 100 and not odd and it`s cool!!!");
    }

    void checkIsObjectNotNull(Object o) throws MyOwnNullPointerException {
        if (o == null) {
            throw new MyOwnNullPointerException(o);
        } else
            System.out.println("Dude, your object is not null");
    }

}


