package behaviour.move;

import java.awt.Point;

import unit.Unit;

public interface Move {
	
	void move();
	void move(Unit unit, Point point);

}
