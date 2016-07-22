package com.my.tasks.tasks;

import com.my.tasks.utils.MathUtils;

/**
 * Created by Ania on 02.06.2016.
 */
public class MathFunction {

    public static double add(double a, double b){
        double result;
        //tried to improve calculation, so if int number are added, result was int. Didn't succeed yet:(
        if ((a+b % a+b)==0){
            result=a+b;
            int result2=(int)result;
        return result2;}
        else result=a+b;
            return result;
    }

    public static double sub(double a,double b){
        double result;
        result=a-b;
        return result;
    }
    public static double mult(double a,double b){
        double result;
        result=a*b;
        return result;
    }
    public static double div(double a,double b){
        double result;
        result=a/b;
        return result;
    }

    public void printPattern() {
        System.out.println("\n" +"6.Print pyramid pattern");

        int number;
        char asterisk = '*';

        for (int i = 1; i <= 7; i++) {
            System.out.println();

            for (int j = 1; j <= i; j++) {
                number = j;
                System.out.print(number);
            }

            for (int k = 6; k >= i; k--) {
                System.out.print(asterisk);
            }
        }
    }

        public void checkOddEven(){

        System.out.println();
        System.out.println("1. Check odd or even number");
        //Generation of random number for check
        //int number = (int) (Math.random() * 1000);

        int number = MathUtils.getRandomNumber(100);

        //Using if condition for realisation
        if(number%2!=0){

            System.out.println("Number "+number+" is Odd");
        }

        else System.out.println("Number "+number+" is Even");
    }

    public void sumAndAverage () {
        System.out.println();
        System.out.println("3.Find sum and average from 1 to 100");
        int count=0;
        int sum=0;
        double avg;

        for(int i=1; i<=100; i++){
            //Creation counter to track number of addendums
            count=count+1;
            //Counting sum
            sum = sum + i;

        }
        //Invert int division result to double
        avg = (double)sum/count;

        System.out.println("Overal sum: "+sum);
        System.out.println("Average: "+avg);


    }

    public void printNumberInWord(){
        System.out.println();
        System.out.println("2.Print number in word");

        int number = MathUtils.getRandomNumber(20);
        String numberWord;

        switch (number){
            case 1: numberWord="One";
                break;
            case 2: numberWord="Two";
                break;
            case 3: numberWord="Three";
                break;
            case 4: numberWord="Four";
                break;
            case 5: numberWord="Five";
                break;
            case 6: numberWord="Six";
                break;
            case 7: numberWord="Seven";
                break;
            case 8: numberWord="Eight";
                break;
            case 9: numberWord="Nine";
                break;
            default: numberWord="Other";
                break;
        }

        System.out.println("Number "+number+" in word:"+numberWord);

    }
    public void computePI(){
        System.out.println();
        System.out.println("4. Calculation of Pi");
        long n = 1000000;
        double pi=0;
        double sum1=0;

        //for (int i=0; i<n; i++ ){
        //  pi=((double)1/2)*(pi+((1/16^i)*((double)8/(8*i+2)+(double)4/(8*i+3)+(double)4/(8*i+4)-(double)1/(8*i+7))));
        //}

        for (double i=1; i<n; i=i+4){
            //Used Leibniz series 1/1-1/3+1/5-1/7+1/9-..=pi/4
            sum1=sum1+1/i;
            sum1=sum1-1/(i+2);
        }
        pi=(sum1)*4;

        System.out.println("Pi calculation:");
        System.out.printf("%.15f",pi);
        System.out.println();
        System.out.println("Math Pi calculation:");
        System.out.printf("%.15f",Math.PI);
        System.out.println();

    }



    public void harmonicSum(){
        System.out.println();
        System.out.println("5. Find sum of harmonic series");
        //initialising variables n- number of harmonics, harmonic - sum
        int n=50000;
        double harmonic=0;

        for(int i=1; i<=n; i++){
            //Converting int 1/i to double
            harmonic = harmonic + (double)1/i;
        }

        System.out.println("Harmonic sum: "+harmonic);
    }

}
