
public class Cell implements Comparable<Cell> {

	private Cell nextCell;
	
	private boolean isBlocked;
	
	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public Cell(boolean isBlocked, int cellValue) {
		super();
		this.isBlocked = isBlocked;
		this.cellValue = cellValue;
	}

	public Cell getNextCell() {
		return nextCell;
	}

	private final int cellValue;
	
	public int getCellValue() {
		return cellValue;
	}

	public Cell( int cellValue) {
		this.cellValue = cellValue;
	}

	public Cell(Cell nextCell, int cellValue) {
		super();
		this.nextCell = nextCell;
		this.cellValue = cellValue;
	}

	@Override
	public int compareTo(Cell o) {
		return this.cellValue-o.cellValue;
	}
	
	
}
