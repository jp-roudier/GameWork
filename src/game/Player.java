package game;

import java.util.Properties;

public class Player extends Properties {
	
	public Player(String name) {
		this.setProperty("name", name);
	}
	
	/* @Deprecated Use getProperty("name") instead */
	public String getName() {
		return this.getProperty("name");
	}
	
	/* @Deprecated Use setProperty("score") instead */
	public void setScore(int s) {
		this.setProperty("score", String.valueOf(s));
	}
	
	public void addScore(int s) {
		int score = Integer.valueOf(this.getProperty("score")) + s;
		this.setProperty("score", String.valueOf(score));
	}
	
	/* @Deprecated Use getProperty("name") instead */
	public int getScore() {
		return Integer.valueOf(this.getProperty("score"));
	}
}
