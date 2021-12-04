package com.broadway.corejavaassignment.ShapePerimeter;

import java.util.Scanner;

class Triangles{
    private float a ,b, c, perimeter;
    public float getTrianglePerimeter(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle: ");
        a = sn.nextFloat();
        b = sn.nextFloat();
        c = sn.nextFloat();
        perimeter = a + b + c;
        return perimeter;
    }
}

class Rectangles{
    private float length , width, perimeter;
    public float getRectanglePerimeter(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length and width of a rectangle : ");
        length = sn.nextFloat();
        width = sn.nextFloat();
        perimeter = 2 * (length + width);
        return perimeter;
    }
}

class Circles{
    private float radius, perimeter;
    final float PI = 3.146f;

    public float getCirclePerimeter() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the radius of a circle : ");
        radius = sn.nextFloat();
        perimeter = 2 * PI * radius;
        return perimeter;
    }
}
public class ShapePerimeter {
    public static void main(String[] args) {
    Rectangles r = new Rectangles();
    Triangles t = new Triangles();
    Circles c = new Circles();

    System.out.println("Perimeter of a Rectangle : " +r.getRectanglePerimeter());
    System.out.println("Perimeter of a Triangle : " +t.getTrianglePerimeter());
    System.out.println("Perimeter of a Circle : " +c.getCirclePerimeter());
    }
}
