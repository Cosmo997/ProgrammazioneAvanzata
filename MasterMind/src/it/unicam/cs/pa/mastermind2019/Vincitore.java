package it.unicam.cs.pa.mastermind2019;

/**
 * <b>Responsabilità </b>: Creare un Risultato in caso di vittoria
 * 
 * @author Daniele
 *
 */
public class Vincitore implements Risultato
{
	private final String winnerId;

	public Vincitore(String winnerId )
	{
		this.winnerId = winnerId;
	}

	/**
	 * @return the winnerId
	 */
	public String getWinnerId()
	{ return winnerId; }

	public String toString()
	{
		return "Il giocatore " +
				winnerId +
				" ha vinto!";
	}
}
