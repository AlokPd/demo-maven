package com.example;

public class StringUtils {

    public String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return cleaned.contentEquals(new StringBuilder(cleaned).reverse());
    }
}
