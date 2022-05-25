package com.Chegg.Ring;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
	
	private String libraryName;
	private String[]bookList;
	private String[]rentedBooks;
	private String[]patrons;
	private int currentRentedQuantity;
	private int currentPatronCount;
	private int currentBookQuantity;
	
	public Library(String libraryName,int maximumBookCount,int maxPatronCount)
	{
		this.libraryName=libraryName;
		this.bookList=new String[maximumBookCount];
		this.patrons=new String[maxPatronCount];
		this.currentBookQuantity=0;
		this.currentRentedQuantity=0;
	}
	
	public Library(String libraryName,String[]bookList,int maxPatronCount)
	{
		this.libraryName=libraryName;
		this.currentBookQuantity+=bookList.length;
		int start=0;
		for(int i=currentBookQuantity;i<bookList.length ;i++)
		{
			this.bookList[i]=bookList[start];
			start++;
		}
		this.patrons=new String[maxPatronCount];
				
	}
	
	public String[] getBookCollection()
	{
		return bookList;
	}
	
	public String[] getRentedBooks()
	{
		return rentedBooks;
	}

	public int isPatronRegistered(String name)
	{
		for(int i=0;i<patrons.length;i++)
		{
			if(patrons[i].equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean registerPatron(String name)
	{
		if(patrons==null)
		{
			patrons[currentPatronCount++]=name;
			return true;
		}
		else
		{
			for(int i=0;i<patrons.length;i++)
			{
				if(patrons[i].equals(name))
				{
					return false;
				}
			}
			patrons[currentPatronCount++]=name;
			return true;
		}
	}
	
	public boolean unregerterPatron(String name)
	{
		if(patrons==null)
		{
			return false;
		}
		
		int index=-1;
		for(int i=0;i<patrons.length;i++)
		{
			if(patrons[i].equals(name))
			{
				index=i;
				break;
			}
		}
		
		if(index!=-1)
		{
			for(int i=index;i<currentPatronCount-1;i++)
			{
				patrons[i]=patrons[i+1];
			}
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean addBookToCollection(String bookTitle)
	{
		if(bookList==null)
		{
			bookList[currentBookQuantity++]=bookTitle;
			return true;
		}
		else
		{
			for(int i=0;i<currentBookQuantity;i++)
			{
				if(bookList[i].equals(bookTitle))
				{
					return false;
				}
			}
			bookList[currentBookQuantity++]=bookTitle;
			return true;
		}
	}
	
	
	
	
	
	
	
	
}
