package com.kietcbt.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.kietcbt.core.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {


    int n = 0;
    long expected;
    long actual = getFactorial(n);

    @Test
    public void testGetFactorialGivenRightArgumentRunWell() {

        assertEquals(1, getFactorial(0));
    }


}
