package it.unicam.cs.pa.mastermind2019;
import java.io.BufferedReader;
import java.io.IOException;


public class Human implements Player
	{

		public String nome;
		BufferedReader codice;
		
		
		
		public Human()
		{
			this.nome = "Franco";
		}
		public Human(String name)
			{
				this.nome = name;
			}

		@Override
		public String getNome()
			{
				return nome;
			}

		/**
		 * Metodo per prendere da tastiera il codice del giocatore
		 * 
		 * @param
		 * @return array riempito dal giocatore
		 * @throws IOException 
		 */

		public int[] generateCode(GameParameters settings) throws IOException
			{
				System.out.println("Inserisci un codice di dimensione "+ settings.codeLenght);
				String codString = codice.readLine();
				return stringToArray(codString,settings);
			}

		private int[] stringToArray(String codString, GameParameters settings)
		{
			int[] charToIntArray = new int[settings.codeLenght];
			char[] detacco = codString.toCharArray();
			int i = 0;
			for(char c: detacco)
			{
				charToIntArray[i]= c-48;
				i++;
			}
			return charToIntArray;
		}
		
		
	}
