package game;

import java.util.List;
import java.util.Map;
import board.Board;
import controller.Rule;

public abstract class Game {
	
	private List<Player> players;
	private Map<String, Rule> rules;
	private Board board;

}
