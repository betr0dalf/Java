package ru.mirea.lab31;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void testIsValidString() {
        assertTrue(Task3.isValidString("127.0.0.1")); // ожидается true
        assertTrue(Task3.isValidString("255.255.255.0")); // ожидается true
        assertFalse(Task3.isValidString("1300.6.7.8")); // ожидается false
        assertFalse(Task3.isValidString("abc.def.gha.bcd")); // ожидается false
    }
}
