import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.function.Function;


/**
 * <b>Responsabilità </b>: Far partire il gioco
 * 
 * @author TeamTrustMe
 *
 */
public class ConsoleGame
{
	// DA FASSELO SPIEGA
	private Function<GameParameters, Player> playerFactory1;
	private Function<GameParameters, Player> playerFactory2;
	/**
	 * @param output Stringa in output
	 * @param input  Stringa in input
	 */
	private PrintStream output;
	private BufferedReader input;

	public ConsoleGame(	Function<GameParameters, Player> playerFactory1,
						Function<GameParameters, Player> playerFactory2 )
	{
		this(new BufferedReader(new InputStreamReader(System.in)), System.out, playerFactory1, playerFactory2);
	}

	public ConsoleGame(	BufferedReader input,
						PrintStream output,
						Function<GameParameters, Player> playerFactory1,
						Function<GameParameters, Player> playerFactory2 )
	{
		this.input = input;
		this.output = output;
		this.playerFactory1 = playerFactory1;
		this.playerFactory2 = playerFactory2;
	}



	public static void main(String argv[]) throws IOException
	{

		ConsoleGame direttore = new ConsoleGame(getPlayerFactory(argv[0]), getPlayerFactory(argv[1]) );
		direttore.start();

	}

	private static Function<GameParameters, Player> getPlayerFactory(String string)
	{
		if (string.equals("bot"))
		{
			return p -> new Bot(string);
		}
		return p -> new Human(string);

	}

	private void start() throws IOException
	{do
		{
		//Creo arbitro a cui passo i parametri e i 2 player
		GameParameters settings = new GameParameters(); //Prendere i 2 valori da tastiera
			MatchCoordinator mc = new MatchCoordinator(settings, playerFactory1, playerFactory2);
			System.out.println(mc.play());
	
		}
		while (matchAgain());
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
