package com.broadway.corejavaassignment.MyInfo;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int rollNo;
        String name, nationality;
        System.out.println("Enter your Name : ");
        name = sn.nextLine();
        System.out.println("Enter your roll number : ");
        rollNo = sn.nextInt();
        sn.nextLine();
        System.out.println("Enter your Nationality : ");
        nationality = sn.nextLine();
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNo);
        System.out.println("Nationalaity : "+nationality);
    }
}
