package board;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import unit.Unit;

public abstract class Cell {
	
	protected Point point;
	
	Cell() {
		units = new ArrayList<Unit>();
	}
	
	public void setPoint(Point point) {
		this.point = point;
	}
	protected Point getPosition(){return point;};
	protected List<Unit> units ;
	
	public List<Unit> getUnits() {
		return units;
	}
	public void addUnit(Unit unit) {
		this.units.add(unit);
		unit.setPosition(point);
	}
	
	public void removeUnit(Unit unit) {
		this.units.remove(unit);
	}
	
	public void clearUnits() {
		this.units.clear();
	}
	
	
}
