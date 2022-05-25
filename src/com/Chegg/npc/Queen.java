package com.Chegg.npc;

public class Queen extends NPC {

	public Queen() {

		// calling super class Constructor by passing
		// random weight between 100 and 180
		// random height between 90 and 150
		super((int) (Math.random() * (180 - 100 + 1) + 100), (int) (Math.random() * (150 - 90 + 1) + 90));

	}

	// implementation for super class abstract method
	@Override
	public void speak() {
		System.out.println("Welcome,friend of the realm!Speak with my husband the king!");
	}
}
