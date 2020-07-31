
public abstract class Player {
	
	private Integer playerPosition=-1;

	public Integer getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(Integer playerPosition) {
		this.playerPosition = playerPosition;
	}

	// returns player position
	Integer playerPosition() {

		return this.playerPosition;
	}

}
