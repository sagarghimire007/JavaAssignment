package com.broadway.corejavaassignment.ShapeArea;

import java.util.Scanner;

class Triangle{
    private float base , height, area;
    public float getTriangleArea(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the base and height of a triangle : ");
        base = sn.nextFloat();
        height = sn.nextFloat();
        area = (base * height) / 2;
        return area;
    }
}

class Rectangle{
    private float length , breadth, area;
    public float getRectangleArea(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length and breadth of a rectangle : ");
        length = sn.nextFloat();
        breadth = sn.nextFloat();
        area = (length * breadth);
        return area;
    }
}

class Circle{
    private float radius , area;
    final float PI = 3.146f;
    public float getCircleArea(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the radius of a circle : ");
        radius = sn.nextFloat();
        area = PI * radius * radius;
        return area;
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        System.out.println("Area of Triangle : "+t.getTriangleArea());
        System.out.println("Area of Rectangle : "+r.getRectangleArea());
        System.out.println("Area of Circle : "+c.getCircleArea());
    }

}
