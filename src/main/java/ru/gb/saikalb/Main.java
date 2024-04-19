package ru.gb.saikalb;

import static ru.gb.saikalb.Task1.countEvens;
import static ru.gb.saikalb.Task2.difference;
import static ru.gb.saikalb.Task3.zero;


public class Main {
    public static void main(String[] args) {
        int[] even = new int[]{2, 4, 5, 7, 8, 9, 10, 11};
        System.out.print("Task1: count of evenNum:  ");
        countEvens(even); //Task1
        System.out.print("Task2: ");
        difference(even); //Task2);
        System.out.println("Task3: " + zero(even)); //Task3

    }
}