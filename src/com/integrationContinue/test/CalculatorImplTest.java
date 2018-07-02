package com.integrationContinue.test;

import static org.junit.Assert.*;

import com.integrationContinue.main.Calculator;
import com.integrationContinue.main.CalculatorImpl;
import org.junit.Test;

public class CalculatorImplTest {

    @Test
    public final void testMultiply() {

    }

    @Test
    public final void testDivide() {
        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b  = 5;
        res = a / b;
        assertTrue("a et b positifs", calc.divide(a, b) == res);
        a = 0;
        b  = 5;
        res = a / b;
        assertTrue("a nul", calc.divide(a, b) == res);
        a = -5;
        b  = 5;
        res = a / b;
        assertTrue("a negatif", calc.divide(a, b) == res);
        a = 5;
        b  = -5;
        res = a / b;
        assertTrue("b négatif", calc.divide(a, b) == res);
        a = -5;
        b  = -5;
        res = a / b;
        assertTrue("a et b négatifs", calc.divide(a, b) == res);

    }

    @Test (expected = ArithmeticException.class)
    public final void testDivideByZero() {
        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b  = 0;
        res = 0;
        if (calc.divide(a, b) != res) {
            fail("b nul");
        }
        a = 0;
        b  = 0;
        res = 0;
        if (calc.divide(a, b) != res) {
            fail("a et b nuls");
        }
    }

    @Test
    public final void testAdd() {
        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b  = 5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a et b positif");
        }
        a = 0;
        b  = 5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a nul");
        }
        a = 5;
        b  = 0;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("b nul");
        }
        a = 0;
        b  = 0;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a et b nuls");
        }
        a = -5;
        b  = 5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a negatif");
        }
        a = 5;
        b  = -5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("b negatif");
        }
        a = -5;
        b  = -5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a et b negatif");
        }

        a = 5;
        b  = 5;
        res = a + b;
        assertTrue("a et b positif", calc.add(a, b) == res);
        a = 0;
        b  = 5;
        res = a + b;
        assertTrue("a nul", calc.add(a, b) == res);
        a = 5;
        b  = 0;
        res = a + b;
        assertTrue("b nul", calc.add(a, b) == res);
        a = 0;
        b  = 0;
        res = a + b;
        assertTrue("a et b nuls", calc.add(a, b) == res);
        a = -5;
        b  = 5;
        res = a+ b;
        assertTrue("a negatif", calc.add(a, b) == res);
        a = 5;
        b  = -5;
        res = a + b;
        assertTrue("b negatif", calc.add(a, b) == res);
        a = -5;
        b  = -5;
        res = a + b;
        assertTrue("a et b negatif", calc.add(a, b) == res);
    }

    @Test
    public final void testSubstract() {

    }

}
