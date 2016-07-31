package com.my;

import com.my.coreFunctionality.EQsolver;

/**
 * Created by Anna_Arkhipova on 7/31/2016.
 */
public class Main {

    public static void main(String[] args){

        EQsolver eq = new EQsolver();
        System.out.println(eq.solveEQ(1,-10,-24)[0]);

    }
}
