package com.Chegg.polygon;

public interface RegularPolygon extends Comparable<RegularPolygon>
{
	//abstract methods
	int getNumSides();
	double getSideLength();
	
	//static method to return total sides by taking RegularPolygon array 
	public static int totalSides(RegularPolygon[] array)
	{
		int count=0;//to count total Sides
		for( RegularPolygon r:array)//Look for all RegularPolygon
		{
			count+=r.getNumSides();//add side of current RegularPolygon to count
		}
		return count;//return count
	}

	/*-----------Default methods----------------------*/
	//method to return peri meter of RegularPolygon
	default double getPerimeter()
	{
		return getNumSides()*getSideLength();
	}
	//Method to return InteriorAngle of RegularPolygon
	default double getInteriorAngle()
	{
		int n=getNumSides();
		return ((n-2)*Math.PI)/n;
	}
	//Method to place the RegularPolygon objects in array in ascending order of perimeter
	default int compareTo(RegularPolygon r)
	{
		if(this.getPerimeter()>r.getPerimeter())
		{
			return 1;
		}
		else if(this.getPerimeter()<r.getPerimeter())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
