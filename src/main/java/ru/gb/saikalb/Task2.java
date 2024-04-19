package ru.gb.saikalb;

/**
 * Написать функцию, возвращающую разницу между самым большим и
 * самым маленьким элементами переданного не пустого массива.
 */

public class Task2 {
    public static void difference (int [] array ){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
//            if (array[i] > max) {
//                max = array[i];
//            }
//            if (array[i] < min) {
//                min = array[i];
//            }
        }
        System.out.println(max - min);

    }
}
