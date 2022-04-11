package org.launchcode.studios.areaofacircle;
import org.launchcode.studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = input.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("The area of a circle of radius " + r + " is: " + Circle.getArea(r));

    }
}
