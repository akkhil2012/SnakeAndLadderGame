
public final class GameValidator {
	
	public static void validator(boolean blocked,Cell cell,Player p) {
		
		if(blocked) { // check if the cell is already taken by other player
			 // invalid move
			System.out.println("Invalid Move..........");
		}
		//if(Board.getSnakes().contains(cell)) {
		if(Board.getSnakeMap().containsKey(cell.getCellValue())) {	
			p.setPlayerPosition(Board.getSnakeMap().get(cell.getCellValue()));
			
			// go to tail
		}/*else if(Board.getLadderMap().containsKey(cell)) {*/
		else if(Board.getLadderMap().containsKey(cell.getCellValue())) {
			p.setPlayerPosition(Board.getLadderMap().get(cell.getCellValue()));
			// go to ladder
		}	
			
	}

}
