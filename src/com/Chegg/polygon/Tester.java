package com.Chegg.polygon;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		
		//Creating RegularPolygon objects with types Square and EquilateralTriangle
		RegularPolygon r1=new Square(10);
		RegularPolygon r2=new EquilateralTriangle(8);
		RegularPolygon r3=new EquilateralTriangle(12);
		RegularPolygon r4=new Square(15);
		RegularPolygon r5=new Square(6.8);
		RegularPolygon r6=new EquilateralTriangle(9);
		RegularPolygon r7=new Square(14);
		
		//printing peri meter of r1 using default method getPerimeter() of RegularPolygon interface
		System.out.println("perimeter of r1: "+r1.getPerimeter());
		
		//printing getInteriorAngle of r2 using default method getInteriorAngle() of RegularPolygon interface
		System.out.printf("Interior Angle of r1: %.2f radians\n",r2.getInteriorAngle());
		
		//Creating RegularPolygon array that contain above created RegularPolygon objects
		RegularPolygon[] array= {r1,r2,r3,r4,r5,r6,r7};
		System.out.println("Total Number Of Sides: "+RegularPolygon.totalSides(array));
		
		System.out.println("--------------------------------------------");
		System.out.println("Before Sorting: ");
		for(RegularPolygon r:array)
		{
			System.out.println(r);
		}
		
		//Sorting array in increasing order of perimeter
		Arrays.sort(array);
		
		System.out.println("\nAfter Sorting (Increasing order of perimeters)");
		for(RegularPolygon r:array)
		{
			System.out.println(r);
		}

	}

}
