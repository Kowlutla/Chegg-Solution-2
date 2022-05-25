package tictoctoe;

import java.util.Scanner;

public class TicTocToe {
	
	static char [][]board=new char[3][3];

	
	public static void printBoard() {
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void replace(char find,char replace)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j]==find)
				{
					board[i][j]=replace;
					return;
				}
			}
		}
	}
	
	public static boolean checkForWin()
	{
		return (checkRows() || checkCols() ||checkDiagonal()); 
	}
	
	public static boolean checkRows() {
		
		for(int i=0;i<3;i++)
		{
			if(check(board[i][0],board[i][1],board[i][2]))
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkCols() {
		
		for(int i=0;i<3;i++)
		{
			if(check(board[0][1],board[1][i],board[2][i]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean checkDiagonal() {
		
		if(check(board[0][0],board[1][1],board[2][2]) || check(board[2][0],board[1][1],board[0][2]))
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean check(char c1,char c2,char c3)
	{
		if((c1==c2) && c2==c3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		//1.Initialize board
		int counter=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				//board[i][j]=Character.forDigit(counter++, 10);
				board[i][j]=(char)(counter+48);
				counter++;
			}
		}
		Scanner sc=new Scanner(System.in);
		String player1,player2;
		System.out.print("Enter Player1 Name: ");
		player1=sc.nextLine();
		System.out.print("Enter Player2 Name: ");
		player2=sc.nextLine();
		
		char player1marker,player2marker;
		System.out.print(player1+" Select Marker(X or O)");
		player1marker=sc.next().charAt(0);
		while(player1marker!='X' && player1marker!='x' && player1marker!='O' && player1marker!='o')
		{
			System.out.print("InValid Maker...\nPlease choose valid marker: ");
			System.out.print(player1+" Select Marker(X or O)");
			player1marker=sc.next().charAt(0);
		}
		
		if(player1marker=='x' || player1marker=='X')
		{
			player1marker='X';
			player2marker='O';
		}
		else
		{
			player1marker='O';
			player2marker='X';
		}
		
		char choice;
		for(int i=1;i<=4;i++)
		{
			System.out.println(player1+" Turn: ");
			choice=sc.next().charAt(0);
			replace(choice,player1marker);
			printBoard();
			
			if(checkForWin())
			{
				System.out.println(player1+" WIN");
				System.exit(0);
			}
			
			System.out.println(player2+" Turn: ");
			choice=sc.next().charAt(0);
			replace(choice,player2marker);
			printBoard();
			
			if(checkForWin())
			{
				System.out.println(player2+" WIN");
				System.exit(0);
			}	
		}
		
		System.out.println(player1+" Turn: ");
		choice=sc.next().charAt(0);
		replace(choice,player1marker);
		printBoard();
		
		if(checkForWin())
		{
			System.out.println(player1+" WIN");
		}
		else
		{
			System.out.println("DRAW");
		}
	}

}
