
/**
 * @author Michele
 * 
 * Questa classe mi dice chi ha vinto
 *
 */
public class Risultato
{
	private final int winnerId;

	public Risultato(int winnerId) 
	{
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
