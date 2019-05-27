package it.unicam.cs.pa.mastermind2019;

import java.io.IOException;

/**
 * <b>Responsabilità </b>: Far partire il gioco
 * 
 * @author TeamTrustMe
 *
 */

public class ConsoleGame
{

	/**
	 * @param output Stringa in output.
	 * @param input  Stringa in input.
	 * @param uno    Primo {@link}Player della partita,
	 * @param due    Secondo {@link}Player della partita.
	 */

	private Player uno;
	private Player due;

	/**
	 * Costruttore di ConsoleGame
	 * 
	 * @param uno Primo giocatore della partita.
	 * @param due Secondo giocatore della partita.
	 */
	public ConsoleGame(	Player uno,
						Player due )
	{
		this.uno = uno;
		this.due = due;
	}

	/**
	 * Metodo iniziale
	 * 
	 * @throws IOException
	 * @throws IllegalParameterException
	 */
	private void start() throws IOException, IllegalParameterException
	{
		do
		{
			GameParameters settings = new GameParameters(Input.prendiLunghezza(), Input.prendiDuplicati());
			Campo terreno = new Campo(settings);
			MatchCoordinator mc = new MatchCoordinator(settings, terreno, this.uno, this.due);
			System.out.println(mc.play());
		}
		while (Input.matchAgain());
	}

	public static void main(String argv[]) throws IOException, IllegalParameterException
	{
		PlayerFactory player1 = new PlayerFactory();
		PlayerFactory player2 = new PlayerFactory();
		ConsoleGame direttore = new ConsoleGame(player1.getPlayer(Input.prendiNome()), player2.getPlayer(Input.prendiNome()));
		direttore.start();
	}
}
