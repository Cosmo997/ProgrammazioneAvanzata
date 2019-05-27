package it.unicam.cs.pa.mastermind2019;


/**
 * <b>Responsabilit�</b>: Creare il giocatore adatto alla richiesta
 * 
 * @author Daniele
 *
 */
public class PlayerFactory
{

	public PlayerFactory() {}

	public Player getPlayer(String c)
	{
		Player p;
		if (c.equals("Bot"))
			p = new Bot(c);
		else
			p = new Human(c);
		return p;
	}
	
	
}
