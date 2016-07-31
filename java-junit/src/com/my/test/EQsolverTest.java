package com.my.test;

import com.my.coreFunctionality.EQsolver;
import org.junit.*;
import org.junit.Test;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by Anna_Arkhipova on 7/31/2016.
 */

public class EQsolverTest {


    //Initialization of object testEq
    @Before
    public void createEq() {
        testEq = new EQsolver();

        Assert.assertNotNull(testEq);
    }

    EQsolver testEq;

    @Test
    //2. Test that no result are returned when Descriminant is <0
    public void testNegativeDescr() {
        double[] testDescrActual = testEq.solveEQ(1, -8, 72);
        Assert.assertTrue(Double.isNaN(testDescrActual[0]));
        Assert.assertTrue(Double.isNaN(testDescrActual[1]));
    }

    @Test
    //Test to check that division on Zero is processed correctry
    public void testZeroDiv() {
        double[] testZeroDivActual = testEq.solveEQ(0, -22, 121);
        //Assert.assertTrue(Double.isInfinite(testZeroDivActual[0])||Double.isInfinite(testZeroDivActual[1]));
        Assert.assertTrue(Double.isInfinite(testZeroDivActual[0])); //Compared with Infinite because Num/0 giving Infinite
        Assert.assertTrue(Double.isNaN(testZeroDivActual[1])); // Compared with Infinite because 0/0 giving NaN
    }


}
