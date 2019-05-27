package it.unicam.cs.pa.mastermind2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

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

	public static void main(String argv[]) throws IOException, IllegalParameterException
	{
//		Creo i due player
		PlayerFactory player1 = new PlayerFactory();
		PlayerFactory player2 = new PlayerFactory();
//		 Creo un oggetto direttore
		ConsoleGame direttore = new ConsoleGame(player1.getPlayer(prendiNome()), player2.getPlayer(prendiNome()));
//		Avvio il metodo start()
		direttore.start();
		

	}

	/**
	 * Metodo iniziale dove prendiLunghezza()
	 * 
	 * @throws IOException
	 * @throws IllegalParameterException
	 */
	private void start() throws IOException, IllegalParameterException
	{
		do
		{
//			Creo arbitro a cui passo i parametri e i 2 player
//			Prende i due valori da tastiera
			GameParameters settings = new GameParameters(prendiLunghezza(), prendiDuplicati());
			Campo terreno = new Campo(settings);
			MatchCoordinator mc = new MatchCoordinator(settings, terreno, this.uno, this.due);
			System.out.println(mc.play());

		}
		while (matchAgain());
	}

	/**
	 * 
	 * 
	 * @return
	 * @throws IOException
	 */
	private int prendiLunghezza() throws IOException
	{
		while (true)
		{
			System.out.println("Inserisci la lunghezza del codice da decifrare fra 4, 6 e 8 numeri: ");
			String s = Input.readLine();
			if (s.equals("4") || s.equals("6") || s.equals("8"))
			{
				System.out.println("Il codice da decifrare è lungo: " +
								s);
				return Integer.parseInt(s);
			}
			System.out.println("Insersci il numero 4, 6 o 8!");
		}
	}

	private boolean prendiDuplicati() throws IOException
	{
		while (true)
		{
			System.out.println("Vuoi duplicati nel codice?: (S/N)");
			String s = Input.readLine();
			if (s.equals("N"))
			{
				System.out.println("Non ci saranno duplicati");
				return false;
			}
			if (s.equals("S"))
			{
				System.out.println("Il codice potrà contenere duplicati");
				return true;
			}
			System.out.println("Inserisci S o N!");
		}
	}

	private boolean matchAgain() throws IOException
	{
		while (true)
		{
			System.out.println("Try again? (S/N)");
			String str = Input.readLine();
			if (str.equals("N"))
			{
				System.out.println("Ciao chicco");
				return false;
			}
			if (str.equals("S"))
			{
				System.out.println("Daje");
				return true;
			}
			System.out.println("Inserisci S o N!");
		}
	}

	// NON SAPPIAMO DOVE METTERLO.
	private static String prendiNome() throws IOException
	{
		System.out.println("Inserisci il tuo nome: ");
		String ciao = Input.readLine();
		if (ciao == null)
			System.out.println("ffff");
		return ciao;
	}

}
