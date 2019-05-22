
/**
 * @author Michele
 * 
 * Questa classe mi dice chi ha vinto
 *
 */
public class Risultato
{
	private final String vincitore;

	public Risultato(String v) 
	{
		this.vincitore = v;
	}

	/**
	 * @return Il nome del vincitore
	 */
	public String getWinnerName() {
		return "Il giocatore "+vincitore+" ha vinto!";
	}
}
