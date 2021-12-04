package com.broadway.corejavaassignment.SimpleInterest;

import java.util.Scanner;

public class SimpleInterestCalculation {
    public static void main(String[] args) {
        float principal, rate, simpleInterest;
        int period;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the principal amount :");
        principal = sn.nextFloat();
        System.out.println("Enter the rate : ");
        rate = sn.nextFloat();
        System.out.println("Enter time period : ");
        period = sn.nextInt();
        simpleInterest = principal * period * rate / 100;
        System.out.println("Simple Interest : " +simpleInterest);
    }
}
