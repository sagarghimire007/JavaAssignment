package com.broadway.corejavaassignment.SumNumbers;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        float a ,b ,sum ,avg;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of two numbers : ");
        a = sn.nextInt();
        b = sn.nextInt();
        sum = a + b;
        avg = sum / 2;
        System.out.println("Sum of "+ a + " and "+ b +" is " + sum);
        System.out.println("Average is "+avg);
    }
}
