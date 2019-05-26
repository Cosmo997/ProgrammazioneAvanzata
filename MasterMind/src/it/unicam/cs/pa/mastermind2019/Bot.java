package it.unicam.cs.pa.mastermind2019;

import java.util.Random;

/**
 * <b>Responsabilità </b>: Creare un bot
 * 
 * @author TeamTrustMe
 * @param ID Identificatore del bot
 */

public class Bot implements Player
{

	public String ID;

	/**
	 * Costruttore con una stringa in ingresso, assegna alla variabile
	 * <code>ID </code> il valore della stringa in ingresso.
	 * 
	 * @param name Identificatore dell'oggetto.
	 */
	public Bot(String name )
	{
		this.ID = name;
	}

	/**
	 * Costruttore senza parametri in ingresso, il nome di default di un bot è
	 * "BOT".
	 */
	public Bot()
	{
		this.nome = "BOT";
	}

	/**
	 * Getter di <code>ID </code>.
	 * 
	 * @return L'ID dell'oggetto corrente
	 */

	public String nome;

	/**
	 * Metodo che genera un codice random per il bot
	 * 
	 * @param Impostazioni della partita corrente.
	 * @return Array da decodificare o array da controllare
	 * 
	 **/
	public int[] generateCode(GameParameters settings)
	{
		int[] appArray = new int[settings.codeLenght];

		for (int i = 0; i < settings.codeLenght; i++)
		{
			Random random = new Random();
			int n = settings.maxCodValue - settings.minCodValue;
			int k = random.nextInt(n) + settings.minCodValue;// Valori compresi tra 1 e maxCodValue
			appArray[i] = k;
		}
		return appArray;
	}

	@Override
	public String getID()
	{ return nome; }

}
