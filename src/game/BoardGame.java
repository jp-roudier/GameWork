package game;

import java.awt.Point;

import unit.Element;
import behaviour.move.MoveTo;
import board.Board;
import board.CheckerBoard;

public class BoardGame extends Game {

	@Override
	protected void init() {
		setBoard(new CheckerBoard(8, 8));
		GameHelper.setBoard(getBoard());
	}

	@Override
	protected void start() {
		
		Element element = new Element();
		element.setMove(new MoveTo());
		
		getBoard().getCellAt(2, 2).addUnit(element);
		afficherBoard(getBoard());
		element.getMove().move(element, new Point(3,5));
		afficherBoard(getBoard());
	}

	@Override
	protected boolean finished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void nextRound() {
		// TODO Auto-generated method stub
		
	}

	static void afficherBoard(Board board){
		System.out.println("*********************************************");
		for (int i = 0; i < board.getCells().length; i++) {
			for (int j = 0; j < board.getCells()[i].length; j++) {
				System.out.print(board.getCells()[i][j]);
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}
}
