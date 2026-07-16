package com.abhinay;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(10, 4 + 6);

        assertTrue(9 > 4);

        assertFalse(2 < 1);

        assertNull(null);

        assertNotNull("hello");
    }
}