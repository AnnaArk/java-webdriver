package com.my.coreFunctionality;

import static java.lang.Math.sqrt;

public class EQsolver {

    double a;
    double b;
    double c;

    // Create constructor. It's required to pass parameters for 2 methods once
    public EQsolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//Method for calculating first root of quadratic equation
    public double solveEQ_first() {
        double x1;
        x1 = (-b + sqrt(b * b - 4 * a * c)) / (2 * a);
        return x1;

    }

    //Method for calculating second root of quadratic equation
    public double solveEQ_second() {

        double x2;
        x2 = (b + sqrt(b * b - 4 * a * c)) / (2 * a);
        return x2;
    }
}
