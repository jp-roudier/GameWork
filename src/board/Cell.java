package board;

import java.awt.Point;

import unit.Unit;

public abstract class Cell {
	
	protected Point point;
	public void setPoint(Point point) {
		this.point = point;
	}
	protected Point getPosition(){return point;};
	protected Unit _unit ;
	public Unit get_unit() {
		return _unit;
	}
	public void set_unit(Unit _unit) {
		this._unit = _unit;
		_unit.setPosition(point);
	}
	
	
}
