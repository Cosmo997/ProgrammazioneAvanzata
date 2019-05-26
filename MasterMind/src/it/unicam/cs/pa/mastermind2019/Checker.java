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
	 * @return ArrayList di {@link}Pioli
	 * 
	 */
	public ArrayList<Enum<Pioli>> check(int[] risultato,
										int[] tentativo)
	{
		ArrayList<Enum<Pioli>> checkResult = new ArrayList<Enum<Pioli>>(settings.getCodeLenght());
		int app1 = 0;
		int app2 = 0;
		for (int i = 0; i < settings.getCodeLenght(); i++)
		{
			if (risultato[i] == tentativo[i])
			{
				checkResult.add(Pioli.SIMBOLIPOSIZIONI);
				app1++;
			}
		}
		if (app1 == settings.codeLenght)
			return checkResult;
		for (int i = 0; i < settings.codeLenght; i++)
		{
			for (int k = 0; k < settings.codeLenght; k++)
			{
				if (risultato[i] == tentativo[k])
				{
					app2++;
				}
			}
		}
		for (int x = 0; x < (app2 - app1); x++)
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
	{
		int count = 0;
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
