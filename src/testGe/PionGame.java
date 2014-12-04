package testGe;

import game.Game;
import game.GameHelper;
import game.Player;

import java.awt.Point;
import java.util.Scanner;

import unit.Element;
import behaviour.move.MoveTo;
import board.Board;
import board.Cell;
import board.CheckerBoard;

public class PionGame extends Game{
	
	static PionGame instance;
	private Scanner scan;
	
	private PionGame(){
		super();
	}

	@Override
	protected void init() {
		scan = new Scanner(System.in);
		
		System.out.print("Combien de joueur ? --> ");
		int nbJoueurs = scan.nextInt();
		System.out.print("Largeur du plateau : ");
		int largeur = scan.nextInt();
		System.out.print("Longueur du plateau : ");
		int longueur = scan.nextInt();
		setBoard(new CheckerBoard(largeur, longueur));
		
		for (int i = 1; i <= nbJoueurs ; i++) {
			System.out.print("Joueur "+i+" entrez votre nom : ");
			addPlayer(new Player(scan.next()));
		}
		
		GameHelper.setBoard(getBoard());		
	}

	@Override
	protected void start() {
		
		for (int i = 0; i < getPlayers().size(); i++) {
			int x,y;
			System.out.print(getPlayers().get(i).getName()+" position x de votre pion : ");
			x=scan.nextInt();
			System.out.print(getPlayers().get(i).getName()+" position y de votre pion : ");
			y=scan.nextInt();
			Element element = new Element();
			element.setPlayer(getPlayers().get(i));
			element.setMove(new MoveTo());
			getBoard().getCellAt(x-1, y-1).addUnit(element);
		}
		getBoard().afficherBoard();
	}

	@Override
	protected boolean finished() {
		if (getPlayers().size() > 1)
			return false;
		else
			System.out.println(getPlayers().get(0).getName()+", vous avez gagné!!!");
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void nextRound() {
		Player p = getCurrentPlayer();
		int x,y;
		System.out.print(p.getName()+" nouvelle position x de votre pion : ");
		x=scan.nextInt();
		System.out.print(p.getName()+" nouvelle position y de votre pion : ");
		y=scan.nextInt();
		verif(x,y);
		getPlayerElement(p).getMove().move(getPlayerElement(p), new Point(x-1,y-1));
		getBoard().afficherBoard();
		nextPlayer();
	}
	/* TODO  supprimer cette methode horrible qui parcours 15 fois la carte pour retrouver
	 * le pion du joueur en cours*/
	private Element getPlayerElement(Player player){
		for (Cell[] cells : getBoard().getCells()) {
			for (Cell cell : cells) {
				if (cell.getUnits().size() != 0 &&    cell.getUnits().get(0).getPlayer().equals(player))
					return (Element) cell.getUnits().get(0);
			}
		}
		return null;
	}
	/* TODO */
	private void verif(int x, int y) {
		if (getBoard().getCellAt(x-1, y-1).getUnits().size()==1){
			System.out.println(getBoard().getCellAt(x-1, y-1).getUnits().get(0).getPlayer().getName()+" , vous êtes mort, désolé...");
			getPlayers().remove(getBoard().getCellAt(x-1, y-1).getUnits().get(0).getPlayer());
			getBoard().getCellAt(x-1, y-1).getUnits().remove(0);
		}
	}
	public static synchronized PionGame getInstance(){
		return (instance != null)? instance : (instance=new PionGame());
	}

}
