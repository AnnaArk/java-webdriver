package com.my.coreFunctionality;
import static java.lang.Math.sqrt;

/**
 * Created by Anna_Arkhipova on 7/31/2016.
 */
public class EQsolver {

    public double[] solveEQ(double a, double b, double c) {

        double x1, x2;
        double [] resultArr=new double[2];

        x1 = (-b + sqrt(b * b - 4 * a * c)) / (2 * a);

        x2 = (b + sqrt(b * b - 4 * a * c)) / (2 * a);

        resultArr[0]=x1;
        resultArr[1]=x2;

        return resultArr;

    }
}
