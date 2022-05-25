package com.chegg.player;
import java.util.Scanner;
public class ComparePlayers {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		Scanner sc = new Scanner(System.in);
		// prompt for and read in information for player1
		System.out.println("Enter player 1 information: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Team: ");
		String team = sc.next();
		System.out.print("Uniform number: ");
		int uniformNumber = sc.nextInt();

		// setting player1 information using setter method
		p1.setName(name);
		p1.setTeam(team);
		p1.setUniformNumber(uniformNumber);

		// prompt for and read in information for player2
		System.out.println("Enter player 2 information: ");
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Team: ");
		team = sc.next();
		System.out.print("Uniform number: ");
		uniformNumber = sc.nextInt();

		// setting player1 information using setter method
		p2.setName(name);
		p2.setTeam(team);
		p2.setUniformNumber(uniformNumber);

		// printing player1 and player 2 information
		System.out.println("Player1:\n\t"+p1);
		System.out.println("Player2:\n\t"+p2);

		// both players having same data equals() method
		// return true because Object class equals() method
		// is overridden in Player class for content comparison
		if (p1.equals(p2)) {
			System.out.println("Same Player");
		} else {
			System.out.println("Different Players");
		}
	}
}
