package com.epam.multiproject.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {
    private final Utils utils = new Utils();

    @Test
    public void isAllPositiveNumbersTest1() {
        boolean actual = utils.isAllPositiveNumbers("1", "2", "3", "4", "5");
        assertTrue(actual);
    }

    @Test
    public void isAllPositiveNumbersTest2() {
        boolean actual = utils.isAllPositiveNumbers("1", "2", "-3", "4", "5");
        assertFalse(actual);
    }
}
