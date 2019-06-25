package it.unicam.cs.pa.mastermind2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

/**
 * <b>Responsabilità:</b> Leggere stringhe e numeri dallo standard input.</br>
 * <b>Fonte:</b>{@link http://pages.di.unipi.it/corradini/Didattica/LIP-07/Tipi-Input/Input/main.html}
 */

public class Input
{

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Legge una linea di input. Nell'improbabile caso di una IOException, il
	 * programma termina.
	 * 
	 * @return restituisce la linea di input che l'utente ha battuto.
	 */
	public static String readLine()
	{
		String inputLine = "";
		try
		{
			inputLine = reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(1);
		}
		return inputLine;
	}

	/**
	 * Legge una linea di input e la converte in un intero. Eventuali spazi bianchi
	 * prima e dopo l'intero vengono ignorati.
	 * 
	 * @return l'intero dato in input dall'utente
	 */
	public static int readInt()
	{
		String inputString = readLine();
		inputString = inputString.trim();
		int n = Integer.parseInt(inputString);
		return n;
	}

	/**
	 * Legge una linea di input e la converte in un numero in virgola mobile.
	 * Eventuali spazi bianchi prima e dopo il numero vengono ignorati.
	 * 
	 * @return il numero dato in input dall'utente
	 */
	public static double readDouble()
	{
		String inputString = readLine();
		inputString = inputString.trim();
		double x = Double.parseDouble(inputString);
		return x;
	}

	/**
	 * Legge una linea di input e ne estrae il primo carattere.
	 * 
	 * @return il primo carattere della riga data in input dall'utente
	 */
	public static char readChar()
	{
		String inputString = readLine();
		char c = inputString.charAt(0);
		return c;
	}

	public static int prendiLunghezza() throws IOException
	{
		while (true)
		{
			System.out.println("Inserisci la lunghezza del codice da decifrare fra 4, 6 e 8 numeri: ");
			String s = Input.readLine();
			if (s.equals("4") || s.equals("6") || s.equals("8"))
			{
				System.out.println("Il codice da decifrare è lungo: " +
									s);
				return Integer.parseInt(s);
			}
			System.out.println("Insersci il numero 4, 6 o 8!");
		}
	}

	public static boolean prendiDuplicati() throws IOException
	{
		while (true)
		{
			System.out.println("Vuoi duplicati nel codice?: (S/N)");
			String s = Input.readLine();
			if (s.equals("N"))
			{
				System.out.println("Non ci saranno duplicati");
				return false;
			}
			if (s.equals("S"))
			{
				System.out.println("Il codice potrà contenere duplicati");
				return true;
			}
			System.out.println("Inserisci S o N!");
		}
	}

	public static boolean matchAgain() throws IOException
	{
		while (true)
		{
			System.out.println("Try again? (S/N)");
			String str = Input.readLine();
			if (str.equals("N"))
			{
				System.out.println("Ciao chicco");
				return false;
			}
			if (str.equals("S"))
			{
				System.out.println("Daje");
				return true;
			}
			System.out.println("Inserisci S o N!");
		}
	}
/**
 * Prende i tipi di giocatore da tastiera
 * @return
 * @throws IOException
 */
	public static String typePlayer() throws IOException
	{
		System.out.println("Inserisci il tipo di giocatore: 'Bot' o 'Umano' ");
		String c = Input.readLine();
		if (c == null)
			System.out.println("Inserisci tipo di giocatore: 'Bot' o 'Umano' ");
		return c;
	}
	
	public static void getNum(int num)
	{
		System.out.println("Numero inserito: " +num);
	}
	
	public static void getAttempts(int num)
	{
		System.out.println("Tentativi rimasti: " +num);
	}
	
	public static void getSuggerimento(ArrayList<Pioli> sugg)
	{
		System.out.println("Array di sugerimento: " +sugg);
	}

}