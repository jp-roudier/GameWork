package game;

import java.util.List;
import java.util.Map;
import board.Board;
import controller.Rule;

public abstract class Game {
	
	// liste des joueurs
	private List<Player> players;
	
	// joueur courant
	private Player currentPlayer;
	
	// map des règles
	private Map<String, Rule> rules;
	
	// plateau de jeu
	private Board board;
	
	// template method pattern
	public final void launch() {
		init();
		start();
		while (!finished()) {
			nextRound();
		}
		end();
	}
	
	// initialisation du jeu
	protected abstract void init();
	
	// démarrage du jeu
	protected abstract void start();
	
	// est-ce que le jeu est terminé ?
	protected abstract boolean finished();
	
	// fin du jeu
	protected abstract void end();
	
	// démarrage du prochain round
	protected abstract void nextRound();
	
	protected void addPlayer(Player p) {
		players.add(p);
	}
	
	protected void removePlayer(Player p) {
		players.remove(p);
	}
	
	protected List<Player> getPlayers() {
		return players;
	}
	
	protected void addRule(String lib, Rule r) {
		rules.put(lib, r);
	}
	
	Rule getRule(String lib) {
		return rules.get(lib);
	}
	
	protected void setCurrentPlayer(Player p) {
		this.currentPlayer = p;
	}
	
	protected Player getCurrentPlayer() {
		return this.currentPlayer;
	}
	

}
