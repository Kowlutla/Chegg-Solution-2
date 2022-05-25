package com.chegg.player;

public class Player {
	// Attributes
	private String name;
	private String team;
	private int uniformNumber;
	public Player() {
	}
	// Setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setUniformNumber(int uniformNumber) {
		this.uniformNumber = uniformNumber;
	}
	
	// Getter methods
	public String getName() {
		return name;
	}
	public String getTeam() {
		return team;
	}
	public int getUniformNumber() {
		return uniformNumber;
	}

	// toString method to return Player object as String
	public String toString() {
		return this.name + " " + this.team + " " + this.uniformNumber;
	}
	
	//Overriding version of equals() for content comparison
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (uniformNumber != other.uniformNumber)
			return false;
		return true;
	}	
}
