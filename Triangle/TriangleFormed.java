package com.broadway.corejavaassignment.Triangle;

import java.util.Scanner;

public class TriangleFormed {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle which  are of Integer value :  ");
        a = sn.nextInt();
        b= sn.nextInt();
        c = sn.nextInt();
        kindOfTriangle(a, b, c);
    }

    public static void kindOfTriangle(int a, int b, int c){
        if((a != b) && (a !=c) && (b != c)){
            System.out.println("Scalene Triangle (Three Sides of a triangle are different)");
        }
        else if((a == b) && (b == c)){
            System.out.println("Equilateral Triangle (Thrree Sides of a triangle are equal) ");
        }
        else{
            System.out.println("Isoscles Triangle (Any two sides of a triangle are equal)");
        }
    }
}
