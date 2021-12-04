package com.broadway.corejavaassignment.ASCII;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        int a;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter any one ASCII code from 0 to 128 : ");
        a = sn.nextInt();
        if(checkIsValidASCIICode(a)) {
            char aa = (char) a;
            System.out.println(aa);
        }
        else{
            System.out.println("Invalid ASCII code Selection");
        }
    }
    public static boolean checkIsValidASCIICode(int a){
        if(a > 0 && a <= 128){
            return true;
        }
        return false;
    }
}
