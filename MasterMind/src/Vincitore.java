/**
 * @author Daniele
 *
 */
public class Vincitore implements Risultato
{
	private final int winnerId;

	public Vincitore(int winnerId) {
		this.winnerId = winnerId;
	}

	/**
	 * @return the winnerId
	 */
	public int getWinnerId() {
		return winnerId;
	}

	@Override
	public String toString() {
		return "Il giocatore "+winnerId+" ha vinto!";
	}
}
