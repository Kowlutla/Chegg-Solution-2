package com.Chegg.npc;

public class King extends NPC {

	public King() {

		// calling super class Constructor by passing
		// random weight between 160 and 250
		// random height between 100 and 180
		super((int) (Math.random() * (250 - 160 + 1) + 160), (int) (Math.random() * (180 - 100 + 1) + 100));
	}

	// implementation for super class abstract method
	@Override
	public void speak() {

		System.out.println("Hello traveler!Welcom to my kingdom!");

	}
}
