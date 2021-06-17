package model;

public class Player {
	String playerName;

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
