package it.unicam.cs.pa.mastermind2019;

import java.io.IOException;
import java.util.ArrayList;

/**
 * <b>Responsabilità</b>: gestire la partita (Arbitro)
 * 
 * @author TeamTrustMe
 * @param players    Giocatori
 * @param parameters Parametri usati nella partita
 * @param tentativi  Tentativi eseguiti
 * @param campo      Mettere il codice da decriptare nel campo
 */

public class MatchCoordinator {
	private Player p1;
	private Player p2;
	private GameParameters parameters;
	private int tentativi;
	private Campo campo;
	private ArrayList<Pioli> suggerimento;

	public MatchCoordinator(GameParameters parametri, Campo campo, Player uno, Player due) {
		this.parameters = parametri;
		this.p1 = uno;
		this.p2 = due;
		this.tentativi = 0;
		this.campo = campo;
	}

	public Risultato play() throws IOException, IllegalParameterException {
		campo.setDecodeArray(p1.generateCode(parameters));
		this.tentativi = parameters.attempts;
		Risultato esito;
		do {
			campo.setCodeArray(p2.generateCode(parameters));
			suggerimento = new ArrayList<>(check(campo.getArrayFromCode()));
			System.out.println("Suggerimento" +suggerimento);
			if (isWinner(suggerimento)) {
				esito = new Vincitore(this.p2.getID());
				return esito;
			}
			//InputOutput.getSuggerimento(suggerimento); // Array di suggerimento
			this.tentativi--; // Tentativi rimasti
			InputOutput.getAttempts(this.tentativi);

		} while (tentativi > 0);
		return esito = new Perdente(this.p2.getID());
	}
	
	public ArrayList<Pioli> check(ArrayList<Integer> tentativo) {
		ArrayList<Pioli> checkResult = new ArrayList<Pioli>();
		ArrayList<Integer> usedNum = new ArrayList<Integer>();
		int rightNumRightPlace = 0;
		int rightNumWrongPlace = 0;

		for (Integer arr : tentativo) {
		if(!(usedNum.contains(arr)))
		{
			if (campo.getArrayFromDeco().contains(arr)) {
				if (campo.getArrayFromDeco().indexOf(arr) == tentativo.indexOf(arr)) {
					rightNumRightPlace++;
				} else
					rightNumWrongPlace++;
					
				}
			}	
		usedNum.add(arr);
		}
		
		for (int i = 0; i < rightNumRightPlace; i++) {
			checkResult.add(Pioli.SIMBOLIPOSIZIONI);
		}
		for (int i = 0; i < rightNumWrongPlace; i++) {
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
	public static boolean isWinner(ArrayList<Pioli> tentativo) {
		int count = 0;
		for (Pioli c : tentativo) {
			if (c.equals(Pioli.SIMBOLIPOSIZIONI)) {
				count++;
			}
		}
		if (count == tentativo.size())
			return true;
		else
			return false;
	}

}
