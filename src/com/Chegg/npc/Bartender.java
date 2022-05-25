package com.Chegg.npc;

public class Bartender extends NPC {

	public Bartender() {

		// calling super class Constructor by passing
		// random weight between 100 and 150
		// random height between 150 and 200
		super((int) (Math.random() * (150 - 100 + 1) + 100), (int) (Math.random() * (200 - 150 + 1) + 150));
	}

	// implementation for super class abstract method
	@Override
	public void speak() {
		System.out.println("What'll ya have,mate?");

	}

}
