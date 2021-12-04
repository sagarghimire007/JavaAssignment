package com.broadway.corejavaassignment.LargestNumber;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a ,b, c;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the Integer value for a, ,b  and c : ");
        a = sn.nextInt();
        b = sn.nextInt();
        c= sn.nextInt();
        System.out.println("Largest Number is : "+findLargestNumber(a, b, c));
    }
    public static int findLargestNumber(int a, int b, int c){
        if((a > b) && (a > c)){
            return a;
        }
        else if((b > a) && (b > c)){
            return b;
        }
        else{
            return c;
        }
    }
}
