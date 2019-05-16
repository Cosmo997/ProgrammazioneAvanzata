import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.function.Function;



/**
 * 
 */

/**
 * @author TeamTrustMe
 *
 */
public class ConsoleGame {

	/**
	 * @param args
	 */
	private PrintStream output;	
	private BufferedReader input;
	private Function<GameParameters, Player> playerFactory2;
	private Function<GameParameters, Player> playerFactory1;
	
	public ConsoleGame( 			
			Function<GameParameters, Player> playerFactory1,
			Function<GameParameters, Player> playerFactory2
	) {
		this(new BufferedReader(new InputStreamReader(System.in)),System.out,playerFactory1,playerFactory2);
	}
	public ConsoleGame(BufferedReader input, 
			PrintStream output,
			Function<GameParameters, Player> playerFactory1,
			Function<GameParameters, Player> playerFactory2
			) {
		this.input = input;
		this.output = output;
		this.playerFactory1 = playerFactory1;
		this.playerFactory2 = playerFactory2;
	}
	/*
	private static Player getPlayerFactory(String string) {
		if (string.equals("bot")) {
			//return p -> new Bot(new Random(),p.getSize());
			return Bot bot = new Bot(bot.getID());
		}
		return (p -> new Human(p, new ConsoleView(string)));
	}
	*/
	public static void main(String[] args) {
		start();

	}

	private static void start() {
		
		
	}

}
