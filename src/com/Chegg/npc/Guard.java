package com.Chegg.npc;

public class Guard extends NPC {

	public Guard() {

		// calling super class Constructor by passing
		// random weight between 180 and 270
		// random height between 150 and 300
		super((int) (Math.random() * (270 - 180 + 1) + 180), (int) (Math.random() * (300 - 150 + 1) + 150));
	}

	// implementation for super class abstract method
	@Override
	public void speak() {

		System.out.println("Any friend of the kingdom is a friend of mine");
	}
}
