package it.unicam.cs.pa.mastermind2019;

/**
 * <b>Responsabilitą </b>: Creare il giocatore adatto alla richiesta
 * 
 * @author Daniele
 *
 */
public class PlayerFactory
{
	/**
	 * Costruttore vuoto
	 */
	public PlayerFactory() {}

	/**
	 * Metodo che consente di creare un player data una stringa iniziale
	 * 
	 * @param c Parametro che inciderą sulla creazione del player
	 * @return Il player desiderato
	 */
	public Player getPlayer(String c)
	{
		Player p;
		if (c.equalsIgnoreCase("bot"))
			p = new Bot();
		else
			p = new Human(c);
		return p;
	}
}
