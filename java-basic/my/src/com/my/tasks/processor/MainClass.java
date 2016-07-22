package com.my.tasks.processor;

import com.my.tasks.personTask.Person;
//import com.my.tasks.personTask.PersonCreation;
import com.my.tasks.personTask.PersonCreation;
import com.my.tasks.tasks.BinarySearching;
import com.my.tasks.tasks.BubbleSorting;
import com.my.tasks.tasks.CalculatorTask;
import com.my.tasks.tasks.MathFunction;
import com.my.tasks.utils.MathUtils;

public class MainClass {

    public static void main(String[] args) {
     /*   int[] randomArray = MathUtils.generateRandomIntArray(10);
        BubbleSorting bubbleSorting = new BubbleSorting();
        int[] sortedArray = bubbleSorting.sortIntArray(randomArray);

        BinarySearching binarySearching = new BinarySearching();
        boolean found = binarySearching.search(sortedArray, 7);

        MathFunction computePi = new MathFunction();
        MathFunction checkOddEven = new MathFunction();
        MathFunction sumAndAverage = new MathFunction();
        MathFunction harmonicSum = new MathFunction();
        MathFunction printNumberInWord = new MathFunction();
        MathFunction printPattern = new MathFunction();

        checkOddEven.checkOddEven();
        printNumberInWord.printNumberInWord();
        sumAndAverage.sumAndAverage();
        computePi.computePI();
        harmonicSum.harmonicSum();
        printPattern.printPattern();*/


      /*  CalculatorTask calculatorTask = new CalculatorTask();
        calculatorTask.calculatorMain();

        /*Calling PersonCreation class
*/
        PersonCreation newPerson = new PersonCreation();

        Person person1 = newPerson.createPerson();
        person1.personToString();

        Person person2 = newPerson.createPerson("John", "Dou", "johndou@gmail.com");
        person2.personToString();


    }
}
