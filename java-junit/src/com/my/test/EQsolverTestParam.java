package com.my.test;
import com.my.coreFunctionality.EQsolver;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by Anna_Arkhipova on 7/31/2016.
 */
@RunWith(Parameterized.class)
public class EQsolverTestParam {


    //Initialization of object testEq
    @Before
    public void createEq(){
        testEq = new EQsolver();

        Assert.assertNotNull(testEq);
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -6, 8, -2, 4}, {1, -10, -24, 2, 12}
        });
    }

    private double a, b, c, x1, x2;
    EQsolver testEq;

    public EQsolverTestParam(double a, double b, double c, double x1, double x2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;

    }

    @Test
    // 1. Test that EQSolver works and calculates results correctly
    public void testEQsolver(){
        double [] testActual = testEq.solveEQ(a,b,c);

        Assert.assertEquals(min(x1,x2), min(testActual[0],testActual[1]),0);
        Assert.assertEquals(max(x1,x2), max(testActual[0],testActual[1]),0);
    }


}
