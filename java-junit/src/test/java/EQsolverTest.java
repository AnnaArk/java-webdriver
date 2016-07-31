import com.my.coreFunctionality.EQsolver;
import org.junit.*;
import org.junit.Test;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by Anna_Arkhipova on 7/31/2016.
 */

public class EQsolverTest {

    @Test
    //Test checks that no result are returned when Discriminant is <0
    public void testNegativeDescr() {
        EQsolver equation = new EQsolver(1, -8, 72);
        Assert.assertTrue(Double.isNaN(equation.solveEQ_first()));
        Assert.assertTrue(Double.isNaN(equation.solveEQ_second()));
    }

    @Test
    //Test checks that division on Zero is processed correctly
    public void testZeroDiv() {
        EQsolver equation = new EQsolver(0, -22, 121);
        Assert.assertTrue(Double.isInfinite(equation.solveEQ_first())); //Compared with Infinite because Num/0 giving Infinite
        Assert.assertTrue(Double.isNaN(equation.solveEQ_second())); // Compared with Infinite because 0/0 giving NaN
    }


}
