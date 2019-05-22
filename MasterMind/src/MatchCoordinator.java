import java.util.function.Function;

/**
 * <b>ResponsabilitÓ</b>: gestire la partita, prende i codici dei giocatori e li
 * inserisce negli apposoti array
 * 
 * @author TeamTrustMe
 * @param players    Array contenente i riferimenti ai due giocatori.
 * @param parameters Parametri usati nella partita
 * @param turn       Turno attuale
 * @param soluzione  Codice da decriptare
 */

public class MatchCoordinator
{
	private Player[] players;
	private GameParameters parameters;
	private int turn;
	private int[] soluzione;

	// metodo placeCode, che ce mette il codice nell'array del palyer[id];
	public MatchCoordinator(GameParameters parametri,
							Function<GameParameters, Player> playerFactory1,
							Function<GameParameters, Player> playerFactory2 )
	{
		this.parameters = parametri;
		this.players = new Player[] { playerFactory1.apply(parameters), playerFactory2.apply(parameters) };
		this.turn = 0;
	}
	
	public Risultato play()
	{
		return 0;
	}

	public void placeCode(int[] chicco)
	{
		this.soluzione = chicco;
	}

}
