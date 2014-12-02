package game;

import board.Board;

public abstract class GameHelper {
	
	private static Board board;
	public static Board getBoard(){
		return board;
		}
	public void setBoard(Board board){
		this.board = board;
	}
}
