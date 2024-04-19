package ru.gb.saikalb;

import java.util.Arrays;

/**
 * Написать функцию, возвращающую истину,
 * если в переданном массиве есть два соседних элемента, с нулевым значением.
 */

public class Task3 {

    public static boolean zero(int[] array) {
        int [] arr = new int[array.length];
        if(array.length< 2){
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] == 0) && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
