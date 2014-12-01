package board;

import java.awt.Point;

public abstract class Board extends Cell {

	private Cell[][] cells;

	public Board() {
	}

	protected Board(int x, int y) {
		cells = new Square[y][x];
	}

	public Cell getCellAt(int x, int y) {
		return cells[x][y];
	}

	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}

	@Override
	public Point getPosition() {
		return null;
	}

}
