package test;

import unit.Element;
import behaviour.move.MoveTo;
import board.Board;
import board.CheckerBoard;

public class Test {

	public static void main(String[] args) {

		CheckerBoard board = new CheckerBoard(8, 8);
		Element element = new Element();
		element.setMove(new MoveTo());
		
		board.getCellAt(2, 2).set_unit(element);

		for (int i = 0; i < board.getCells().length; i++) {
			for (int j = 0; j < board.getCells()[i].length; j++) {
				System.out.print(board.getCells()[i][j]);
			}
			System.out.println();
		}
	}
}
