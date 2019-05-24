package it.unicam.cs.pa.mastermind2019;
/**
 * @author Daniele
 *
 */
public class Perdente implements Risultato
{
	private final String loserId;

	public Perdente(String winnerId) {
		this.loserId = winnerId;
	}

	/**
	 * @return the winnerId
	 */
	public String getWinnerId() {
		return loserId;
	}

	@Override
	public String toString() {
		return "Il giocatore "+loserId+" ha vinto!";
	}
}
