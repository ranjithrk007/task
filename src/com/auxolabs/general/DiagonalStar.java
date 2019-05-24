package com.auxolabs.general;

import java.util.Scanner;

public class DiagonalStar {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number -> ");
        int number = s1.nextInt();
        printSquareStar(number);
    }
    public static void printSquareStar(int number){
        if (number >= 5){
            for (int i=0; i<number; i++){
                for (int j=0; j<number; j++){
                    if (i==0 || j==0 ||  i==number-1 || i==j || j==number-1 ||i+j==number-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }


        }else{
            System.out.println("Invalid Value");
        }

    }
}
