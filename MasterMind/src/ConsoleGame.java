import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.function.Function;

import it.unicam.cs.pa.battleship19.ConsoleGame;
import it.unicam.cs.pa.battleship19.ConsoleView;
import it.unicam.cs.pa.battleship19.GameParameters;
import it.unicam.cs.pa.battleship19.InteractivePlayer;
import it.unicam.cs.pa.battleship19.Player;
import it.unicam.cs.pa.battleship19.RandomPlayer;
import sun.tools.serialver.resources.serialver;

/**
 * <b>Responsabilità </b>: Far partire il gioco
 * 
 * @author TeamTrustMe
 *
 */



public class ConsoleGame
{
	
	/**
	 * @param output Stringa in output
	 * @param input  Stringa in input
	 */
	
	private PrintStream output;
	private BufferedReader input;
	private Player uno;
	private Player due;

	public ConsoleGame(Player uno,Player due)
	{
		this.uno = uno;
		this.due = due;
	}

	public static void main(String argv[]) throws IOException
	{
		PlayerFactory player1 = new PlayerFactory();
		PlayerFactory player2 = new PlayerFactory();
		ConsoleGame direttore = new ConsoleGame(player1.getPlayer(player1.prendiNome()), player2.getPlayer(player2.prendiNome()));
		direttore.start();

	}

	

	private void start() throws IOException
	{do
		{
//			Creo arbitro a cui passo i parametri e i 2 player
			GameParameters settings = new GameParameters(prendiLunghezza(),prendiDuplicati()); //Prendere i 2 valori da tastiera
			MatchCoordinator mc = new MatchCoordinator(settings, this.uno, this.due);
//			System.out.println(mc.play);
	
		}
		while (matchAgain());
	}

	}

	private int prendiLunghezza() throws IOException {
		while (true) {
			output.println("Inserisci la lunghezza del codice da decifrare fra 4, 6 e 8 numeri: ");
			String s = input.readLine();
			if (s.equals("4") || s.equals("6") || s.equals("8")) {
				output.println("Il codice da decifrare è lungo: " + s);
				return Integer.parseInt(s);
			}
			output.println("Insersci il numero 4, 6 o 8!");
		}
	}

	private boolean prendiDuplicati() throws IOException {
		while (true) {
			output.println("Vuoi duplicati nel codice?: (S/N)");
			String s = input.readLine();
			if (s.equals("N")) {
				output.println("Non ci saranno duplicati");
				return false;
			}
			if (s.equals("S")) {
				output.println("Il codice potrà contenere duplicati");
				return true;
			}
			output.println("Inserisci S o N!");
		}
	}
	private boolean matchAgain() throws IOException
	{
		while (true)
		{
			output.println("Try again? (S/N)");
			String str = input.readLine();
			if (str.equals("N"))
			{
				output.println("Ciao chicco");
				return false;
			}
			if (str.equals("S"))
			{
				output.println("Daje");
				return true;
			}
			output.println("Inserisci S o N!");
		}
	}
}
