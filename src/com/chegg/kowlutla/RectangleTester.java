package com.chegg.kowlutla;

public class RectangleTester {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10, 20);

		// getting length and width using getters
		System.out.println("Length: " + r1.get_length());
		System.out.println("Width: " + r1.get_width());
		// getting perimeter and area using methods
		System.out.println("Perimiter: " + r1.get_Perimeter());
		System.out.println("Area: " + r1.get_area());
		// Setting length and width using setters
		r1.set_length(15);
		r1.set_width(10);

		System.out.println("* * * After Changing length and width using setters * * *");
		// getting length and width using getters
		System.out.println("Length: " + r1.get_length());
		System.out.println("Width: " + r1.get_width());
		// getting perimeter and area using methods
		System.out.println("Perimiter: " + r1.get_Perimeter());
		System.out.println("Area: " + r1.get_area());
	}

}
