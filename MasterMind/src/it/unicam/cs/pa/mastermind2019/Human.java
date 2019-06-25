package it.unicam.cs.pa.mastermind2019;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * <b>Responsabilitą </b>: Creare un human
 * @author Daniele
 *
 */

public class Human implements Player
	{

		public String ID;
		BufferedReader codice;
		
		
		public Human()
		{
			this.ID = "Franco";
		}
	
		/**
		 * Costruttore Human con una stringa in ingresso, assegna alla variabile
		 * <code>ID </code> il valore della stringa in ingresso.
		 * 
		 * @param id Identificatore dell'oggetto.
		 */
		
		public Human(String id)
			{
				this.ID = id;
			}

		@Override
		public String getID()
			{
				return ID;
			}

		/**
		 * Metodo per prendere da tastiera il codice del giocatore
		 * 
		 * @param
		 * @return array riempito dal giocatore
		 * @throws IOException 
		 * @throws IllegalParameterException 
		 */

		public ArrayList<Integer> generateCode(GameParameters settings) throws IOException, IllegalParameterException
			{
				int c;
				ArrayList<Integer> code = new ArrayList<Integer>();
				while(!(code.size() == settings.codeLenght)){
				c = InputOutput.getC(settings.maxCodValue);
				if(!settings.isValidNumber(c))
					throw new IllegalParameterException();
				else
					if(!(settings.duplicateAllow) && code.contains(c))
						throw new IllegalParameterException();
					code.add(c);
					InputOutput.getNum(c);
				}
				return code;
			}
		
	}
