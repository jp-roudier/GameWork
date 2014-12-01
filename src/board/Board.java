package board;

import java.awt.Point;

public class Board extends Cell{
	
	private Square[][] squares;

	public Square[][] getSquares() {		return squares;	}
	public void setSquares(Square[][] squares) {		this.squares = squares;	}
	@Override
	public Point getPosition() {
		
		return null;
	}

}
