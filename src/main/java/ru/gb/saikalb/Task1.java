package ru.gb.saikalb;

import java.util.Arrays;

/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */

public class Task1 {
    public static void countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                count++;
        }
        int[] newArr = new int[count];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArr[j] = nums[i];
                j++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(newArr));
    }
}
