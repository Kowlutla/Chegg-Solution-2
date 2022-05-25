package com.Chegg.npc;

import java.util.ArrayList;
import java.util.Random;
//tester for all classes
public class NPCDemo {
	public static void main(String[] args) {
		Random rand = new Random();
		// creating ArrayList to hold Type NPC
		ArrayList<NPC> list = new ArrayList<NPC>();
		// to generate 100 different NPC's Objects
		for (int i = 0; i < 100; i++) {
			// getting random choice from 1-4 inclusive
			int choice = rand.nextInt(4) + 1;
			// reference to hold NPC type Objects
			NPC obj = null;
			switch (choice) 
			{
				case 1:// if random choice is 1 create King Object
				{
					obj = new King();
					break;
				}
				case 2:// if random choice is 2 create Queen Object
				{
					obj = new Queen();
					break;
				}
				case 3:// if random choice is 3 create Guard Object
				{
					obj = new Guard();
					break;
				}
				case 4:// if random choice is 4 create Bartender Object
				{
					obj = new Bartender();
					break;
				}
			}
			// add above created object to list
			list.add(obj);
		}
		// Loop through array list and printing messages by calling speak method
		for (int i = 0; i < 100; i++) {
			NPC obj = list.get(i);
			obj.speak();
			System.out.println(obj.getHeight()+" "+obj.getWeight());
		}
	}
}
