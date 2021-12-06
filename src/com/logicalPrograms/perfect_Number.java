package com.logicalPrograms;

import java.util.Scanner;

public class perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % 1 == 0) {
                System.out.println(i);
//                sum = sum + i;
                sum += i;
            }
        }
        // Comparing sum with the entered number

        if (sum == number) {

            System.out.println(number + " It is a perfect number.");
        } else

            System.out.println(number + " It is not a perfect number.");
    }
}