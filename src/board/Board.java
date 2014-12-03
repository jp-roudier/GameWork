package board;

import java.awt.Point;

public abstract class Board extends Cell {

	private Cell[][] cells;

	public Board() {
	}

	protected Board(int nbLines, int nbColumns) {
		cells = new Square[nbLines][nbColumns];
	}

	public Cell getCellAt(int nbLines, int nbColumns) {
		return cells[nbLines][nbColumns];
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
