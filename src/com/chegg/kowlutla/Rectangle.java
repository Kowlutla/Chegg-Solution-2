package com.chegg.kowlutla;

public class Rectangle {
	
	//attributes
	private int length;
	private int width;
	
	/*
	 * For Data validatio if length or width <=0 then set to 1
	 */
	//Constructor
	public Rectangle(int length, int width) {
		if(length<=0)
		{
			this.length=1;
		}
		else
		{
			this.length = length;
		}
		if(width<=0)
		{
			this.width=1;
		}
		else
		{
			this.width = width;
		}
	}
	//getter method for length
	public int get_length() {
		return length;
	}
	
	//Setter method for length
	public void set_length(int value) {
		if(value<=0)
		{
			this.length=1;
		}
		else
		{
			this.length = value;
		}
	}
	
	//getter method for width
	public int get_width() {
		return width;
	}
	
	//Setter method for width
	public void set_width(int value) {
		if(value<=0)
		{
			this.width=1;
		}
		else
		{
			this.width = value;
		}
	}
	
	//Method to get perimeter
	public int get_Perimeter()
	{
		return (length+width)*2;
	}
	
	//Method to get Area
	public int get_area()
	{
		return length*width;
	}
}
