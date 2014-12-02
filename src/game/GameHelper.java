package game;

import board.Board;

public abstract class GameHelper {
	
	private static Board board;
	public static Board getBoard(){
		return board;
		}
	public static void setBoard(Board b){
		board = b;
	}
}
