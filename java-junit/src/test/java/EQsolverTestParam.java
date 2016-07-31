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

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //Adding 2 different sets of parameters
                {1, -6, 8, -2, 4}, {1, -10, -24, 2, 12}
        });
    }

    private double a, b, c, x1, x2;

    public EQsolverTestParam(double a, double b, double c, double x1, double x2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;

    }

    @Test
    // Test checks that EQSolver works and calculates results correctly for first root
    public void testEQsolver_check_first() {
        EQsolver equation = new EQsolver(a, b, c);

        Assert.assertTrue(x1 == equation.solveEQ_first() || x1 == equation.solveEQ_second());
    }

    @Test
    // Test checks that EQSolver works and calculates results correctly for second root
    public void testEQsolver_check_second() {
        EQsolver equation = new EQsolver(a, b, c);
        Assert.assertTrue(x2 == equation.solveEQ_first() || x2 == equation.solveEQ_second());
    }


}
