package com.broadway.corejavaassignment.MultipleProgram;

import java.util.Scanner;

/*
multiplication table of given input number
 */
public class Multiplication {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number to get its multiplication table : ");
        int a = sn.nextInt();
        multiplicationTable(a);
    }
    public static void multiplicationTable(int a){
        for (int i= 1; i <= 10; i++){
            System.out.println(a + " * "+i +" = "+a*i);
        }
    }
}
