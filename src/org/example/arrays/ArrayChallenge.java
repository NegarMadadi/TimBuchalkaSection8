package org.example.arrays;

//Create a program using arrays that sorts a list of integers in descending order.
//Descending order is highest value to lowest.
//In other words if the array had values in it 106, 26, 81, 5, 15 your program should ultimately have an array had the c
//values 106, 81, 26, 15, 5 in it.
//Set up the program so that the numbers to sort are read in from the keyboards.
//Implement the following methods - getIntegers, printArray, and sortIntegers
//getIntegers returns an array of entered integers from the keyboard.
//print array prints out the content of the array.
//and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figre out how to copy the array elements from the passed array onto a new
// array and sort them and return the new sorted array.


import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    private static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values.\r");
        int[] array = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}