package it.unicam.cs.pa.mastermind2019;
import java.util.ArrayList;



/**
 * @author Daniele
 *
 */
public class Checker
{
	GameParameters settings;
	Campo terreno;

	public Checker(	GameParameters settings,
					Campo terreno )
	{
		this.settings = settings;
		this.terreno = terreno;
	}

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
