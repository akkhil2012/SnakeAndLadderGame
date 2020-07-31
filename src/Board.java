import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
	
	private static int BOARD_SIZE = 10;
	private static  Cell[][] board;
	



	public static List<Cell> getSnakes() {
		return snakes;
	}

	
	public static List<Cell> getLadder() {
		return ladder;
	}

	


	private  static List<Cell> snakes; 
	private static List<Cell> ladder; 
	
	// source is the Key and Target is the Value
	private static Map<Integer,Integer> ladderMap;
	private static Map<Integer,Integer> snakeMap;
	
	public static Cell[][] getBoard() {
		return board;
	}

	


	private void addSnakeAndLadders() {
		
		/*snakeMap.put(board[0][1], board[0][0]);
		snakeMap.put(board[0][7], board[0][2]);
		snakeMap.put(board[2][0], board[1][1]);
		snakeMap.put(board[7][1], board[5][1]);
		snakeMap.put(board[9][9], board[0][3]);*/
		
		/*snakes.add(board[0][1]);
		snakes.add(board[0][7]);
		snakes.add(board[2][0]);
		snakes.add(board[7][1]);
		snakes.add(board[9][9]);*/
		//ladderMap.put(board[0][2], board[9][9]);
		ladderMap.put(02, 99);
		
		snakeMap.put(99, 03);
		
		/*ladder.add(board[0][2]);
		ladder.add(board[0][5]);
		ladder.add(board[1][5]);
		ladder.add(board[4][0]);
		ladder.add(board[8][0]);*/
	}

	public static Map<Integer, Integer> getSnakeMap() {
		return snakeMap;
	}


	public static void setSnakeMap(Map<Integer, Integer> snakeMap) {
		Board.snakeMap = snakeMap;
	}


	public static void setLadderMap(Map<Integer, Integer> ladderMap) {
		Board.ladderMap = ladderMap;
	}


	Board() {
		snakes = new ArrayList<Cell>();
		ladder = new ArrayList<Cell>();
		
		snakeMap = new HashMap<Integer, Integer>();
		ladderMap = new HashMap<>();
		int k = 0;
		board = new Cell[BOARD_SIZE][BOARD_SIZE];
		// create board with simple values NOT snake and ladder yet defined for cell
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				// System.out.print(" --> " + k);
				Cell nextCell = new Cell(k + 1);
				board[i][j] = new Cell(nextCell, k);
				k++;
			}

		}
		
		addSnakeAndLadders();

	}
	
	
	

	public static int getBOARD_SIZE() {
		return BOARD_SIZE;
	}


	public static void setBOARD_SIZE(int bOARD_SIZE) {
		BOARD_SIZE = bOARD_SIZE;
	}


	public static Map<Integer, Integer> getLadderMap() {
		return ladderMap;
	}


	public void setUpGame() {
		Player p1 = new Player1();
		
	}

}
