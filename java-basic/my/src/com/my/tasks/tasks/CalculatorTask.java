package com.my.tasks.tasks;

import java.util.Scanner;

import static com.my.tasks.tasks.MathFunction.*;

/**
 * Created by Ania on 07.06.2016.
 */
public class CalculatorTask {

    public void calculatorMain() {
        System.out.println();
        System.out.println('\n' + "7. Calculator task:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        double a = sc.nextDouble();
        System.out.print("Enter action: +,-,*,/ ");
        char action = sc.next().charAt(0);
        System.out.print("Enter second number ");
        double b = sc.nextDouble();
        //convert string to char by selecting 1st char of the string
        System.out.println(calculate(a, b, action));
        sc.close();
    }

    private double calculate(double a, double b, char action) {
        System.out.print("Result: ");
        //use switch to perform correct action for certain char
        switch (action) {
            case '+':
                return add(a, b);
            case '-':
                return sub(a, b);
            case '*':
                return mult(a, b);
            case '/':
                return div(a, b);
            default:
                System.out.println("Choose correct action: +,-,*,/");
                return Double.parseDouble(null);

        }
    }

}
