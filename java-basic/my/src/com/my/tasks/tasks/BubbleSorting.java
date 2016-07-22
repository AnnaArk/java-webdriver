package com.my.tasks.tasks;

public class BubbleSorting {

    public int[] sortIntArray(int[] array) {

        int limit = array.length - 1;
            for (int i = 0; i < limit; i++) {
                for (int j = 0; j < limit - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int buff = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = buff;
                    }
                }

        }

        System.out.println();
        System.out.println("Sorted array:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        return array;
    }

}
