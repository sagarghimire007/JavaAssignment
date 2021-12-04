package com.broadway.corejavaassignment.Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a integer number to get its factorial : ");
        int a = sn.nextInt();
        System.out.println("Factorial of " +a+" is "+getFactorial(a));
    }
    public static int getFactorial(int a){
        int fact = 1;
        for( int i = a; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }
}
