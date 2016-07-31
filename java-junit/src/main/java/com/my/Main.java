package com.my;

import com.my.coreFunctionality.EQsolver;

/**
 * Created by Anna_Arkhipova on 7/31/2016.
 */
public class Main {

    public static void main(String[] args) {

        EQsolver eq = new EQsolver(1, -10, -24);
        System.out.println(eq.solveEQ_first() + " " + eq.solveEQ_second());

    }
}
