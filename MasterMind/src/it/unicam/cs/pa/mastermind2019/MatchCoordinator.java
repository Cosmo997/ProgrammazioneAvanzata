package it.unicam.cs.pa.mastermind2019;

import java.io.IOException;
import java.util.ArrayList;

/**
 * <b>Responsabilità</b>: gestire la partita
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
		Checker checker = new Checker(parameters, campo);
		do {
			suggerimento = new ArrayList<>(checker.check(campo.decodeArray, p2.generateCode(parameters)));
			if (Checker.isWinner(suggerimento)) {
				esito = new Vincitore(this.p2.getID());
				return esito;
			}
			Input.getSuggerimento(suggerimento); // Array di suggerimento
			this.tentativi--; // Tentativi rimasti
			Input.getAttempts(this.tentativi);

		} while (tentativi > 0);
		return esito = new Perdente(this.p1.getID());
	}

}
