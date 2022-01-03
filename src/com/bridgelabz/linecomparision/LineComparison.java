package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line comparison program");
		lengthofLine();
	}
		public static void lengthofLine() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("enter the value of x1 = ");
	        int x1 = sc.nextInt();
	        System.out.print("enter the value of x2 = ");
	        int x2 = sc.nextInt();
	        System.out.print("enter the value of y1 = ");
	        int y1 = sc.nextInt();
	        System.out.print("enter the value of y2 = ");
	        int y2 = sc.nextInt();

	        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	        System.out.println("Distance = " + distance);
	    }
		
	}

