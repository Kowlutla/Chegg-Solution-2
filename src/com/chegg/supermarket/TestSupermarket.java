package com.chegg.supermarket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class TestSupermarket {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = null;
		FileReader fr = null;
		BufferedReader br = null;
		//file path to read data from file
		String inFile = "/home/apiiit-rkv/eclipse-workspace/Chegg1/ItemInventory.txt";
		//file path to write data into file
		String outFile="/home/apiiit-rkv/eclipse-workspace/Chegg1/items.out";
		try {
			//create PrintWriter Object with given outFile
			pw = new PrintWriter(outFile);
			//Create FileReader and BufferedReader Objects to read data from inFile
			fr = new FileReader(inFile);
			br = new BufferedReader(fr);
			String line;//to hold the each line in ItemInventory.txt file
			double totalProfit = 0;//to hold the total profit or loss of the day
			
			//read all lines from ItemInventory.txt file
			while ((line = br.readLine()) != null) {
				
				//split the line using delimeter tab(/t)
				String[] temp = line.split("\t");
				
				//get the itemNumber from 0th position in temp array
				String itemNumber = temp[0];
				//get the numberOfItemsSold from 1st position in temp array
				int numberOfItemsSold = Integer.parseInt(temp[1]);
				//get the purchasePrice from 2nd position in temp array
				double purchasePrice = Double.parseDouble(temp[2]);
				//get the sellingPrice from 3rd position in temp array
				double sellingPrice = Double.parseDouble(temp[3]);
				
				//Create new Instance Of Item with above attributes
				Item item = new Item(itemNumber, numberOfItemsSold, purchasePrice, sellingPrice);
				
				//calculate profit or loss for current Item
				double profit = item.getSellingPrice() - item.getPurchasePrice();
				//add the profit/loss to totalProfit
				totalProfit += profit;
				//write the current item to 'items.out' file
				pw.print(item);
				//append profit or loss at beside item in 'items.out' file
				pw.println("\t" + profit);
			}
			//if profil write profit to 'items.out' file
			if (totalProfit > 0)
				pw.println("Today Profit is: " + totalProfit);
			//if loss write loss to 'items.out' file
			else
				pw.println("Today Loss is: " + totalProfit);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//Close the all resources
			if (br != null) {
				br.close();
				fr.close();
			}
			if (pw != null) {
				pw.close();
			}
		}
	}
}
