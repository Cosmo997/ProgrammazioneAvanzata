package it.unicam.cs.pa.mastermind2019;

import java.util.ArrayList;
import java.util.Random;

/**
 * <b>Responsabilit�</b>: Creare un bot
 * 
 * @author TeamTrustMe
 * @param ID Identificatore del bot
 */

public class Bot implements Player {

	public String ID;

	/**
	 * Costruttore con una stringa in ingresso, assegna alla variabile
	 * <code>ID </code> il valore della stringa in ingresso.
	 * 
	 * @param id Identificatore dell'oggetto.
	 */
	public Bot(String id) {
		this.ID = id;
	}

	/**
	 * Costruttore senza parametri in ingresso, il nome di default di un bot �
	 * "Bot".
	 */
	public Bot() {
		this.ID = "Bot";
	}

	/**
	 * Metodo che genera un codice random per il bot
	 * 
	 * @param Impostazioni della partita corrente.
	 * @return Array da decodificare o array da controllare
	 * 
	 **/
	public ArrayList<Integer> generateCode(GameParameters settings) {
		ArrayList<Integer> code = new ArrayList<Integer>();

		while (!(code.size() == settings.codeLenght)) {
			Random random = new Random();
			int n = settings.maxCodValue - settings.minCodValue;
			int k = random.nextInt(n) + settings.minCodValue;
			if (!settings.duplicateAllow)
				while (code.contains(k)) {
					k = random.nextInt(n) + settings.minCodValue;
				}
			code.add(k);
		}
		System.out.println(code);
		return code;
	}

	/**
	 * Getter di <code>ID </code>.
	 * 
	 * @return L'ID dell'oggetto corrente
	 */

	@Override
	public String getID() {
		return ID;
	}

}
