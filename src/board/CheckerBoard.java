package board;

import java.awt.Point;

public class CheckerBoard extends Board {
	
	public CheckerBoard(int x, int y){
		super(x,y);
		initBoard();
	}
	private void initBoard(){
		boolean bool = false;
		for (int i = 0; i < getCells().length; i++) {
			for (int j = 0; j < getCells()[i].length; j++) {
				CheckerSquare square = new CheckerSquare(bool);
				square.setPoint(new Point(i,j));
				getCells()[i][j] = square;
				bool = !bool;
			}
			if (getCells()[0].length%2 == 0)bool=!bool; 
		}
	}
}
