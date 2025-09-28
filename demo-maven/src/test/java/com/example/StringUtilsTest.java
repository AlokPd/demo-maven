package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @Test
    void reverse_basic() {
        assertEquals("cba", utils.reverse("abc"));
    }

    @Test
    void reverse_null() {
        assertNull(utils.reverse(null));
    }

    @Test
    void palindrome_true() {
        assertTrue(utils.isPalindrome("Able was I ere I saw Elba"));
    }

    @Test
    void palindrome_false() {
        assertFalse(utils.isPalindrome("ChatGPT"));
    }
}
