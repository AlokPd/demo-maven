package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void greet_withName() {
        assertEquals("Hello, Alok!", App.greet("Alok"));
    }

    @Test
    void greet_blankDefaults() {
        assertEquals("Hello!", App.greet("   "));
    }
}
