package com.company.server;

import com.company.server.exceptions.CustomNullPointerException;
import com.company.server.exceptions.NumberBiggerHundredException;
import com.company.server.exceptions.OddNumberException;
import com.company.server.exceptions.StringNotPalindromeException;

public class ServerRunner {
    Server server = new Server();

    void appRunner() {
        try {
            server.checkIsPalindrome("Я И КОНЬ НОКИЯ");
            server.checkIsPalindrome("exceptions is cool");
        } catch (StringNotPalindromeException e) {
            System.out.println(e);
        }

        try {
            server.processNumbers(13);
        } catch (NumberBiggerHundredException | OddNumberException e) {
            System.out.println(e);
        }

        try {
            server.processNumbers(113);
        } catch (NumberBiggerHundredException | OddNumberException e) {
            System.out.println(e);
        }

        try {
            server.processNumbers(88);
        } catch (NumberBiggerHundredException | OddNumberException e) {
            System.out.println(e);
        }

        Object o = null;
        try {
            server.checkIsObjectNotNull(o);
        } catch (CustomNullPointerException e) {
            System.out.println(e);
        }
    }
}
