package com.auxolabs.general;

import java.util.Scanner;

public class FlourPacker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of 5 kilos pack, 1 kilos pack and goal");
        int bigCount = s1.nextInt();
        int smallCount = s1.nextInt();
        int goal = s1.nextInt();
        canPack(bigCount, smallCount, goal);
    }
    private static void canPack(int bigCount, int smallCount, int goal){
        if (bigCount >= 0 && smallCount >= 0 && goal >=0 ){
            int sum  = bigCount * 5;
            if (sum  <= goal){
                if (sum + smallCount >= goal) {
                System.out.println("true");
                }
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }
    }
}
