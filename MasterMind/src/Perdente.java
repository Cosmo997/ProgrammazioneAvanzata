/**
 * @author Daniele
 *
 */
public class Perdente implements Risultato
{
	private final int loserId;

	public Perdente(int winnerId) {
		this.loserId = winnerId;
	}

	/**
	 * @return the winnerId
	 */
	public int getWinnerId() {
		return loserId;
	}

	@Override
	public String toString() {
		return "Il giocatore "+loserId+" ha vinto!";
	}
}
