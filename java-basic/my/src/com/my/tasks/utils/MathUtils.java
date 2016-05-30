package com.my.tasks.utils;

import java.util.Random;

public final class MathUtils {

    private MathUtils() {

    }

    public static int[] generateRandomIntArray(int limit) {
        int[] array = new int[limit];
        Random random = new Random();
        for (int i = 0; i < limit; i++) {
            array[i] = random.nextInt(limit);
        }
        System.out.println();
        System.out.println("Generated array:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        return array;
    }

    public static int getRandomNumber(int limit){
        return new Random().nextInt(limit);
    }
}
