package it.unicam.cs.pa.mastermind2019;

/**
 * <b>Responsabilità </b>: Creare un Risultato in caso di sconfitta
 * 
 * @author Daniele
 *
 */
public class Perdente implements Risultato
{
	private final String loserId;

	public Perdente(String winnerId )
	{
		this.loserId = winnerId;
	}

	/**
	 * @return the winnerId
	 */
	public String getWinnerId()
	{ return loserId; }

	@Override
	public String toString()
	{
		return "Il giocatore " +
				loserId +
				" ha vinto!";
	}
}
