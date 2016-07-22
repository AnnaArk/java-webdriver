package com.my.tasks.tasks;

import javax.xml.bind.SchemaOutputResolver;

public class BinarySearching {
    public boolean search(int[] arrayToSearch, int searchedInt) {
        int left = 0;
        int right = arrayToSearch.length;
        boolean elementExist = false;
        while(left < right) {
            int var8 = (left + right) / 2;
            if(arrayToSearch[var8] == searchedInt) {
                elementExist = true;
                break;
            }

            if(arrayToSearch[var8] > searchedInt) {
                right = var8;
            } else {
                left = var8 + 1;
            }
        }

        System.out.println();
        System.out.println("Is "+ searchedInt+" present in array? "+elementExist);
        return elementExist;

    }
}
