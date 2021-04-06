/**
 * Created By: James Saiban
 * Date Created:  Dec 12/2019
 * Description: Project
 *
 * Modification Log
 * Date		Programmer		Desc
 * 	 		SaibanJ
 */

//NOTE! I mentioned chapter references at least one example for the corresponding  concept.
//There are however, many more examples of concepts from all the chapters not specifically referenced.
//PS. i made this way more complicated than it should be... press enter twice when entering 0,1,2
//(this weird bug started as i was adding new features and i haven't been able to catch it)

//NOTE!!!

// This program is a huge mess... i applied everything i could possibly think of and in every way i could think of to do it... 
//What that basically means is, there may be some redundant code. The program runs though, the game barely works... but no problems with running it.


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//Importing interface
import finalProject_saiban.Info;
//Importing Packages (Chapter 8)
import finalProject_saiban.Player;
import finalProject_saiban.TicTacToeGame;
//Uses extends to inherit (chapter 7) from player 
public class TicTacToeDemo extends Player {
	


	public static void main(String[] args) throws IOException // (Chapter 9)
	{	
		//Instantiating/Initializing Constructors (chapter 4)
		TicTacToeGame newGame = new TicTacToeGame();
		Player p1 = new Player();
		
		
		//Interface (chapter 8)
		Info io = null;
		System.out.println("Just a random use of an interface:\n" + p1.getMessage() + "\n\n");
		randomCopyThingToFile();
		System.out.println("Copied random thing \n");
		
		//Call boardInitialization
		newGame.boardInitialization();
		String player = "X";
		//call makeNice
		makeNice(newGame, player);
		
	}//End main
	
	public static void playGame(TicTacToeGame newGame, String p) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println(newGame.displayBoard());
		System.out.println("Enter your position for row (0,1,2): ");
		int row = input.nextInt();
		System.out.println("Enter your position for column (0,1,2): ");
		int col = input.nextInt();
		newGame.setPlayPos(row, col, p); //passing arguments (chapter 6)
	
	}//End method
	
	public static void makeNice(TicTacToeGame newGame, String p) 
	{
		
		do 
		{
			playGame(newGame, p);
			if(newGame.isGameOver()) //Control statements (chapter 3)
			{
				System.out.println(newGame.displayBoard() + "\n" + p + " wins");
				break;//If the condition is true, this here will end the infinite loop!
			}
			if(p == "X") //Operators/variables (chapters,1, 2)
				p = "O";
			else
				p = "X";
			
			
		}while(true); //Infinite loop
	}
	
	
	
	public static void randomCopyThingToFile() 
	{
		
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try 
		{
			fin = new FileInputStream("/Users/jamess./eclipse_workplace/finalProject_saiban/finalProject_saiban/randomThing.txt");
			fout = new FileOutputStream("/Users/jamess./eclipse_workplace/finalProject_saiban/finalProject_saiban/copyRandomThingsHere.txt", true);
			
			do 
			{
				i  = fin.read();
				if(i != -1) fout.write(i);
				
			}while(i != -1);
		}
		catch(IOException exc) 
		{
			System.out.println("File not found error: " + exc);
		}
		
		finally 
		{
			try 
			{
				if(fin != null) fin.close();
				
			} catch(IOException exc) 
			{
				System.out.println("Error closing Input File");
			}
			try 
			{
				if(fout != null) fout.close();
			} catch(IOException exc) 
			{
				System.out.println("Error closing Output File");
			}
		}
	} 
	
		
	
}//End Class
