package com.jm.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest {
	private static App a;
	@BeforeAll
	public static void setupOnce() {
		a = new App();
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
    @AfterAll
    public static void teardownOnce() {
    	a = null;
    }
}
