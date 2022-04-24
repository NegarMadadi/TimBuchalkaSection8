package org.example.arrays.MinimumElementChallengee;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinimumElementChallenge minimumElementChallenge = new MinimumElementChallenge();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = minimumElementChallenge.readIntegers(count);
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = minimumElementChallenge.findMin(returnedArray);
        System.out.println(returnedMin);
    }
}
