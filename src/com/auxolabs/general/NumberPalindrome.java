package com.auxolabs.general;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number - ");
        int number = s1.nextInt();

        isPalindrome(number);
    }

    private static void isPalindrome(int number) {  //palindrome checking method
        int temp = number;
        int reverse = 0;
        while (number != 0) {
            int lastdigit = number % 10;
            reverse = (reverse * 10) + lastdigit;
            number = number / 10;
        }
        if (temp == reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palinrome");
        }
    }
}
