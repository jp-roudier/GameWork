package unit;

import java.util.Map;

import behaviour.action.Action;
import behaviour.move.Move;

public abstract class Unit {
	
	private Move move;
	private Map<String,Action> actions;
	
	public void move(){
		move.move();
	}

	public void action(String action){
		actions.get(action).action();
	}
}
