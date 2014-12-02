package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.Board;
import controller.Rule;

public abstract class Game {
	
	// liste des joueurs
	private List<Player> players = new ArrayList<Player>();
	
	// joueur courant
	private Player currentPlayer;
	
	// gagnant
	private Player winner;
	
	// map des règles
	private Map<String, Rule> rules = new HashMap<String, Rule>();
	
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
		if (currentPlayer==null) {
			if (players.size()>0)
				setCurrentPlayer(players.get(0));
		}
		return this.currentPlayer;
	}
	public void setBoard(Board board){
		this.board = board;
	}
	
	protected void nextPlayer() {
		if (currentPlayer==null)
			getCurrentPlayer();
		else {
			int pIndex = players.indexOf(currentPlayer);
			if (pIndex<players.size()-1) {
				setCurrentPlayer(players.get(pIndex+1));
			} else {
				setCurrentPlayer(players.get(0));
			}
		}
	}
	
	protected void setWinner(Player p) {
		this.winner = p;
	}
	
	protected Player getWinner() {
		return this.winner;
	}


}
