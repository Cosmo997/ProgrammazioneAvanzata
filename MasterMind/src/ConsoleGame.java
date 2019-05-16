import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.function.Function;

import it.unicam.cs.pa.battleship19.ConsoleView;
import it.unicam.cs.pa.battleship19.GameParameters;
import it.unicam.cs.pa.battleship19.InteractivePlayer;
import it.unicam.cs.pa.battleship19.Player;
import it.unicam.cs.pa.battleship19.RandomPlayer;


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
	
	private static Function<GameParameters, Player> getPlayerFactory(String string) {
		if (string.equals("bot")) {
			return p -> new Bot(new Random(),string);
		}
		return (p -> new Human(p, new ConsoleView(string)));
	}
	
	public static void main(String[] args) {
		start();

	}

	private static void start() {
		
		
	}

}
