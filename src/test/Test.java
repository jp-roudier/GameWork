package test;

import java.awt.Point;

import game.BoardGame;
import unit.Element;
import behaviour.move.MoveTo;
import board.Board;
import board.CheckerBoard;

public class Test {

	public static void main(String[] args) {

		
		
		CheckerBoard board = new CheckerBoard(8, 8);
		Element element = new Element();
		element.setMove(new MoveTo());
		
		BoardGame game = new BoardGame();
		game.setBoard(board);
		
		
		board.getCellAt(2, 2).addUnit(element);
		element.getMove().move(element, new Point(3,5));

		for (int i = 0; i < board.getCells().length; i++) {
			for (int j = 0; j < board.getCells()[i].length; j++) {
				System.out.print(board.getCells()[i][j]);
			}
			System.out.println();
		}
	}
}
