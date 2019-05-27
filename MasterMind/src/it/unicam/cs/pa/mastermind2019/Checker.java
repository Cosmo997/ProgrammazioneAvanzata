package it.unicam.cs.pa.mastermind2019;

import java.util.ArrayList;

/**
 * <b>Responsabilità </b>: Valutare gli array in input.
 * 
 * @author TeamTrustMe
 * @param settings Impostazioni della partita corrente.
 * @param terreno  Campo da gioco della partita corrente.
 *
 */
public class Checker
{
	GameParameters settings;
	Campo terreno;

	/**
	 * Costruttore con due parametri in ingresso.
	 * 
	 * @param settings Impostazioni della partita corrente.
	 * @param terreno  Terreno della partita corrente.
	 */
	public Checker(	GameParameters settings,
					Campo terreno )
	{
		this.settings = settings;
		this.terreno = terreno;
	}

	/**
	 * Metedo che permette di controllare i due array in ingresso e dare un valore
	 * di ritorno adeguato per ogni risultato. Inizialmente istanzio
	 * <code>checkResult</code>, ovvero l'arrayList che avrò come valore di ritorno,
	 * poi dichiaro due variabili d'appoggio app settate a 0. Dentro il primo ciclo
	 * for scorro tutto <code>risultato</code> e tutto <code>tentativo</code> e per
	 * ogni elemento controllo se corrisponde. Aumento la variabile
	 * <code>app1</code> ad ogni corrispondenza e alla fine del for controllo che
	 * app1 sia uguale alla lunghezza del codice, in caso affermativo ritorno
	 * <code>checkResault</code> in caso contrario continuo. Nel secondo for mi
	 * salvo in una variabile <code>app2</code> quante volte un int del primo codice
	 * compare nel secondo e successivamente inserisco
	 * <code>SIMBOLI</code>(app2-app1) volte dentro <code>checkResult</code> ed
	 * infine ritorno <code>checkResult</code>
	 * 
	 * @param risultato Array da decifrare.
	 * @param tentativo Tentativo del giocatore.
	 * @return ArrayList di Pioli
	 * 
	 */
	public ArrayList<Pioli> check(ArrayList<Integer> risultato,
										ArrayList<Integer> indovina)
	{
		ArrayList<Pioli> checkResult = new ArrayList<Pioli>();
		int rightNumRightPlace = 0;
		int rightNumWrongPlace = 0;

		for (Integer arr : indovina)
		{
			if (risultato.contains(arr))
			{
				if (risultato.indexOf(arr) == indovina.indexOf(arr))
				{
					rightNumRightPlace++;
				}
				else
					rightNumWrongPlace++;
			}
		}
		for (int i = 0; i < rightNumRightPlace; i++)
		{
			checkResult.add(Pioli.SIMBOLIPOSIZIONI);
		}
		for (int i = 0; i < rightNumWrongPlace; i++)
		{
			checkResult.add(Pioli.SIMBOLI);
		}

		return checkResult;
	}

	/**
	 * Metodo che controlla se un arrayList è vincente o no.
	 * 
	 * @param tentativo ArrayList in input
	 * @return <b>True</b> Se l'{@link}ArrayList è vincente(pieno di
	 *         <code>SIMBOLIPOSIZIONI</code>) <br>
	 *         <b>False</b> Se l'{@link}ArrayList non è vincente
	 */
	public static boolean isWinner(ArrayList<Pioli> tentativo)
	{int count = 0;
		for (Pioli c : tentativo)
		{
			if (c.equals(Pioli.SIMBOLIPOSIZIONI))
			{
				count++;
			}
		}
		if (count == tentativo.size())
			return true;
		else
			return false;
	}
}
