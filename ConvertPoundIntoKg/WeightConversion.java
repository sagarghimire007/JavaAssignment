package com.broadway.corejavaassignment.ConvertPoundIntoKg;

import java.util.Scanner;

public class WeightConversion {
    static final float pound = 0.454f;
    public static void main(String[] args) {
        float p;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the weight in Pound : ");
        p = sn.nextFloat();
        System.out.println("Weight in kg : " +convertPoundsIntoKg(p));
    }
    public static float convertPoundsIntoKg(float p){
        return (p * pound);
    }
}
