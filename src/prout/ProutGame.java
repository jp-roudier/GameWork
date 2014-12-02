package prout;

import java.util.Scanner;

import game.Game;
import game.Player;

public class ProutGame extends Game {
	
	// scanner input
	Scanner sc;
	
	@Override
	protected void init() {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue dans notre Jeu de Prout !");
		
		Player p1 = new Player("Joueur 1");
		addPlayer(p1);
		addPlayer(new Player("Joueur 2"));
		
		sc = new Scanner(System.in);
		
	}

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void nextRound() {
		// TODO Auto-generated method stub
		Player p = getCurrentPlayer();
		
		System.out.println("C'est au tour de "+p.getName()+" de prouter !");
		
		String prout = sc.nextLine();
		
		if (prout.equals("prout")) {
			System.out.println("Bravo "+p.getName()+" ! Tu marques 1 point !");
			p.addScore(1);
		}
		else {
			System.out.println("Oh la la "+p.getName()+" ! Tu perds 1 point !");
			p.addScore(-1);
		}

		System.out.println("Score de "+p.getName()+" : "+p.getScore());
		nextPlayer();
		
	}

	@Override
	protected boolean finished() {
		for (Player p : getPlayers()) {
			if (p.getScore()>=5) {
				System.out.println("Le joueur "+p.getName()+" a marqué 5 points !!");
				setWinner(p);
				return true;
			}
		}
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		System.out.println("Le jeu est terminé, le gagnant est "+getWinner().getName());
		
		sc.close();
	}


}
