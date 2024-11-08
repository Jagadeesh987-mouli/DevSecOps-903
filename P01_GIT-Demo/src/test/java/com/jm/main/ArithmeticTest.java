package com.jm.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {
	private static Arithmetic a;
	@BeforeAll
	public static void setupOnce() {
		a = new Arithmetic();
	}
    @Test
    public void testSumWithPositiveValues() {
        int x = 100;
        int y =200;
        int expected = 300;
        int actual = a.sum(x, y);
        assertEquals(expected, actual);
    }
    @Test
    public void testSumWithNegativeValues() {
        int x = -100;
        int y = -200;
        int expected = -300;
        int actual = a.sum(x, y);
        assertEquals(expected, actual);
    }
    @Test
    public void testSumWithMixedValues() {
        int x = 100;
        int y = -200;
        int expected = -100;
        int actual = a.sum(x, y);
        assertEquals(expected, actual);
    }
    @Test
    public void testSumWithZeroes() {
        int x = 0;
        int y = 0;
        int expected = 0;
        int actual = a.sum(x, y);
        assertEquals(expected, actual);
    }
    @AfterAll
    public static void teardownOnce() {
    	a = null;
    }
}
