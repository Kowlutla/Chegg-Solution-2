package com.Chegg.A4;

public class TestDemo {
	
	public static void main(String[] args)
	{
		//creating Department Objects using different constructors
		Department d1=new Department("Finance");
		Department d2=new Department("Human Resources",20);
		Department d3=new Department("IT",100);
		//printing departments
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		//setting d1 size to 15
		d1.setSize(15);
		//getting d1 size
		System.out.println("D1 Size: "+d1.getSize());
		//getting d2 name
		System.out.println("D2 Name: "+d2.getName());
		
		System.out.println("----------------------------------------");
		//creating Department array 
		Department[]departments= {d1,d2,d3};
		//Creating Company by passing above department array
		Company c=new Company(departments);
		//setting name to company using setName() method
		c.setName("Infosys");
		//setting address of company using setAddress() method
		c.setAddress("Bangolore");
		
		//getting companyName using getName() method
		System.out.println("Company name: "+c.getName());
		//getting company Address using getAddress() method
		System.out.println("Company Address: "+c.getAddress());
		
		//printing company details(Internally by calling toString())
		System.out.println(c);
	}
	
}
