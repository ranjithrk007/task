package com.auxolabs.general;

import java.util.Scanner;

public class SharedDigit{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number");
            int number1=scanner.nextInt();
            int number2=scanner.nextInt();
            System.out.println(hasSharedDigit(number1,number2));
        }
        public static  boolean  hasSharedDigit(int number1,int number2)
        {
            if (isRange(number1) && isRange(number2)) {
                String no= String.valueOf(number1);
                String no1= String.valueOf(number2);
                System.out.println(no)
                ;
                System.out.println(no1);
                for(int i=0;i<no.length();i++)
                {
                    if(no1.indexOf(String.valueOf(no.charAt(i)))>=0)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
        public static boolean isRange(int number)
        {
            if(number>=10 && number <=99)
            {
                return true;
            }
            return false;
        }
}
