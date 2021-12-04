package com.broadway.corejavaassignment.CheckLeapYear;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int a = sn.nextInt();
        if(checkLeapYear(a)){
            System.out.println("Year "+ a + " is a leap year");
        }
        else{
            System.out.println("Year "+ a + " is not a leap year");
        }
    }

    public static boolean checkLeapYear(int a){
        if(a % 400 == 0){
            return true;
        }
        else if(a % 100 == 0){
            return false;
        }
        else if(a % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
