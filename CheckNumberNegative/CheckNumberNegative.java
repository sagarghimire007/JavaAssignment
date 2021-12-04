package com.broadway.corejavaassignment.CheckNumberNegative;

import java.util.Scanner;
/*
WAP to print a number entered by user only if the number entered is negative
 */
public class CheckNumberNegative {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter any integer number : ");
        int a = sn.nextInt();
        if(checkIsNumberNegative(a)){
            System.out.println("Number is Negative");
        }
    }
    public static boolean checkIsNumberNegative(int a){
        if(a < 0){
            return true;
        }
        return false;
    }
}
