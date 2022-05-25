package boats;

import java.util.ArrayList;

public abstract class Boat {
	
	protected ArrayList<CrewMember>crew;
	private int length;
	private Material meterial;
	private String name;
	public Boat(int length, Material meterial, String name) {
		this.length = length;
		this.meterial = meterial;
		this.name = name;
	}
	
	
	
}
