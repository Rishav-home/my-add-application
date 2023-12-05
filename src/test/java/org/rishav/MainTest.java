package org.rishav;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void addNumbers() {
        Main main_object = new Main();
        int result = main_object.addNumbers(2,3);
        Assertions.assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    void subtractNumbers() {
        Main main_object = new Main();
        int result = main_object.subtractNumbers(5,4);
        Assertions.assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void compareNumbers() {
        Main main_object = new Main();
        boolean result = main_object.compareNumbers(31,30);
        Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void compareNumbers_elseBlock() {
        Main main_object = new Main();
        boolean result = main_object.compareNumbers(29,30);
        Assertions.assertFalse(result);
    }
}