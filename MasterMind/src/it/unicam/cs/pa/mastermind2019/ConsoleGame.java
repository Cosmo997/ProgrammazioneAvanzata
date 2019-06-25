package it.unicam.cs.pa.mastermind2019;

import java.io.IOException;

/**
 * <b>Responsabilità </b>: Far partire il gioco (direttore)
 * 
 * @author TeamTrustMe
 *
 */

public class ConsoleGame {

	/**
	 * @param output     Stringa in output.
	 * @param input      Stringa in input.
	 * @param giocatore1 Primo {@link}Player della partita,
	 * @param giocatore2 Secondo {@link}Player della partita.
	 */

	private Player giocatore1;
	private Player giocatore2;

	/**
	 * Costruttore di ConsoleGame
	 * 
	 * @param p1 Primo giocatore della partita.
	 * @param p2 Secondo giocatore della partita.
	 */
	public ConsoleGame(Player p1, Player p2) {
		this.giocatore1 = p1;
		this.giocatore2 = p2;
	}

	/**
	 * Metodo iniziale
	 * 
	 * @throws IOException
	 * @throws IllegalParameterException
	 */
	private void start() throws IOException, IllegalParameterException {
		do {
			GameParameters settings = new GameParameters(Input.prendiLunghezza(), Input.prendiDuplicati());
			Campo terreno = new Campo(settings);
			MatchCoordinator arbitro = new MatchCoordinator(settings, terreno, this.giocatore1, this.giocatore2);
			System.out.println(arbitro.play());
		} while (Input.matchAgain());
	}

	public static void main(String argv[]) throws IOException, IllegalParameterException {
		PlayerFactory player1 = new PlayerFactory();
		PlayerFactory player2 = new PlayerFactory();
		ConsoleGame direttore = new ConsoleGame(player1.getPlayer(Input.typePlayer()),player2.getPlayer(Input.typePlayer()));
		direttore.start();
	}
}
