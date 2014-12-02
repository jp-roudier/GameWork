package unit;

import game.Player;

import java.awt.Point;
import java.util.List;
import java.util.Map;

import behaviour.action.Action;
import behaviour.move.Move;
import board.Cell;

public abstract class Unit {
	
	private Move move;
	private Map<String,Action> actions;
	private List<Cell> validCells;
	private Point position;
	private Player player;
	
	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}

	public Map<String, Action> getActions() {
		return actions;
	}

	public void setActions(Map<String, Action> actions) {
		this.actions = actions;
	}

	public List<Cell> getValidCells() {
		return validCells;
	}

	public void setValidCells(List<Cell> validCells) {
		this.validCells = validCells;
	}

	public void move(){
		move.move();
	}
	
	public void moveTo(int x, int y){
		move();
		position.move(x, y);
	}

	public void action(String action){
		actions.get(action).action();
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
