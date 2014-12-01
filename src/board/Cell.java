package board;

import java.awt.Point;

import unit.Unit;

public abstract class Cell {
	
	protected Point point;
	protected Point getPosition(){return point;};
//	protected abstract void setPosition(Point p);
	protected Unit _unit ;
	
}
