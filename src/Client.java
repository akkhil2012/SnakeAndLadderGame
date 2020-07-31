import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.text.MaskFormatter;

public class Client {
	
	/*
	 * Enter the values for player 1 and player 2
	 * 
	 */
	
	
	private static void setUpSnakeLadderBoard() {
		Board b = new Board();
		b.setUpGame();
		Cell[][] c = b.getBoard();

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println(" i= " + i + " j= " + j + " " + c[i][j].getCellValue() + "-> "
						+ c[i][j].getNextCell().getCellValue());
			}

		}

	}
	
	
	private static void makeMove(int first_palyer_move,Cell cellChoosen,Player p) {
		 //Gane starts here: Validate the move
	    if(first_palyer_move<10)
	    	first_palyer_move =0+first_palyer_move;
	   
	    
	    GameValidator.validator(true,cellChoosen,p);
	}
	
	public static void main(String args[]) {
		
		Player p1 = new Player1();
		
		Player p2 = new Player2();

		setUpSnakeLadderBoard();
		
		System.out.println("Start Game");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Player1 : Move");
		
		int first_palyer_move = in.nextInt();// Read user input
	    System.out.println("Palyer1 move is: " + first_palyer_move);  
		
	    Cell cellChoosen = new Cell(true,first_palyer_move);
	     makeMove(first_palyer_move,cellChoosen,p1);
	    
	     System.out.println(" Player new position is ==>" + p1.getPlayerPosition());
		if(p1.playerPosition()==99) {
			System.out.println(" Player1 won the game " );
			return;
		}
		
		
		System.out.println("=========================Player2 : Move=================================");
		
		int sec_palyer_move = in.nextInt();// Read user input
	    System.out.println("Palyer2 move is: " + first_palyer_move); 
	    
	     cellChoosen = new Cell(true,sec_palyer_move);
	     makeMove(first_palyer_move,cellChoosen,p2);
	    
		/*if(p2.getPlayerPosition().getNextCell().getCellValue()==100) {
			System.out.println(" Player2 won the game " );
		}*/
	    
		System.out.println("Want to continue...................???");
		
		
		/*
		 * Stream.of(c) .flatMap(Stream::of) .forEach(System.out::println); }
		 */
	}
}

