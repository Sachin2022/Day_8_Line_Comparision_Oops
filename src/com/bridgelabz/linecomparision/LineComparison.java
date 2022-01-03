package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparison {
	public static int x1, x2, x3, x4, y1, y2, y3, y4;
	public static double distance1, distance2;

	public static void main(String[] args) {
		System.out.println("Welcome to Line comparison program");
		lengthofLine();
		distance();
		equality();
	}

	public static void lengthofLine() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of x1 = ");
		x1 = sc.nextInt();
		System.out.print("enter the value of x2 = ");
		x2 = sc.nextInt();
		System.out.print("enter the value of x3 = ");
		x3 = sc.nextInt();
		System.out.print("enter the value of x4 = ");
		x4 = sc.nextInt();
		System.out.print("enter the value of y1 = ");
		y1 = sc.nextInt();
		System.out.print("enter the value of y2 = ");
		y2 = sc.nextInt();
		System.out.print("enter the value of y3 = ");
		y3 = sc.nextInt();
		System.out.print("enter the value of y4 = ");
		y4 = sc.nextInt();
	}

	public static void distance() {
		distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance 1 = " + distance1);
		distance2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Distance 2 = " + distance2);

	}
	public static void equality() {
		if (distance1 == distance2)
			System.out.print("Length are same ");
		else if (distance1 > distance2)
			System.out.print(" Length of the Line One is greater ");
		else
			System.out.println(" Length of the Line Two is greater ");
	    }
}
