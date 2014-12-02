package behaviour.move;

import game.GameHelper;

import java.awt.Point;

import unit.Unit;

public class MoveTo implements Move{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(Unit unit, Point point) {
		GameHelper.getBoard().getCellAt(unit.getPosition().x, unit.getPosition().y).removeUnit(unit);
		unit.setPosition(point);
		GameHelper.getBoard().getCellAt(point.x, point.y).addUnit(unit);
	}

}
