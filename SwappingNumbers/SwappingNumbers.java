package com.broadway.corejavaassignment.SwappingNumbers;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a ,b;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter integer value for a : ");
        a = sn.nextInt();
        System.out.println("Enter integer value for b : ");
        b = sn.nextInt();
        System.out.println("Number before swapping : ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        swapWithoutUsingThirdVariable(a, b);
        swapUsingThirdVariable(a , b);
    }
    public static void swapWithoutUsingThirdVariable(int a ,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapping two numbers without using third variable");
        displaySwappingData(a , b);
    }
    public static void swapUsingThirdVariable(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping two numbers using third variable");
        displaySwappingData(a , b);
    }
    public static void displaySwappingData(int a, int b){
        System.out.println("Number after swapping : ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
