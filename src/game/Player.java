package game;

public class Player {
	
	private String name;
	private int score;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setScore(int s) {
		this.score = s;
	}
	
	public void addScore(int s) {
		this.score += s;
	}
	
	public int getScore() {
		return this.score;
	}
}
