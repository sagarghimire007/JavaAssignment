package com.broadway.corejavaassignment.FourFunctionCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float a , b;
        char op;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter any two number for performing arithmetic operation : ");
        a = sn.nextInt();
        b = sn.nextInt();
        System.out.println("Enter the operation + , - , / , * for operation : ");
        op = sn.next().charAt(0);
        switch (op){
            case '+' :
            {
                System.out.println(a + b);
                break;
            }
            case '-' :
            {
                System.out.println(a - b);
                break;
            }
            case '/' :
            {
                System.out.println(a / b);
                break;
            }
            case '*' :
            {
                System.out.println(a * b);
                break;
            }
            default:
            {
                System.out.println("Invalid Operator");
            }
        }
    }
}
