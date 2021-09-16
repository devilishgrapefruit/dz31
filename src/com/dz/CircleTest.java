package com.dz;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.print("Input the radius and rad of the circle: ");
        Scanner sc = new Scanner(System.in);
        Circle a1 = new Circle(sc.nextDouble());
        a1.print(sc.nextDouble());
    }
}
