import java.util.function.Function;

import it.unicam.cs.pa.battleship19.BattleShipException;
import it.unicam.cs.pa.battleship19.WinForFailure;
import it.unicam.cs.pa.battleship19.Winner;

/**
 * <b>Responsabilità</b>: gestire la partita, prende i codici dei giocatori e li
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
							Player uno,
							Player due)
	{
		this.parameters = parametri;
		this.players = new Player[] {uno,due};
		this.turn = 0;
	}
	
	public Risultato play()
	{
		try
		{
			placeCode(chicco);
			placeCode(chicco);
			
			while (true)
			{
				manageTurn();
				if (fields[opponent()].getShips() == 0)
				{
					return new Winner(current());
				}
				turn = opponent();
			}
		}
		catch (BattleShipException e)
		{
			return new WinForFailure((e.getPlayerId() + 1) % 2, e);
		}
	}

	public void placeCode(int[] chicco)
	{
		this.soluzione = chicco;
	}

}
