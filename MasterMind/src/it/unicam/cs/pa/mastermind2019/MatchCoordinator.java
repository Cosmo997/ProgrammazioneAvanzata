package it.unicam.cs.pa.mastermind2019;

import java.io.IOException;

/**
 * <b>Responsabilità</b>: gestire la partita
 * 
 * @author TeamTrustMe
 * @param players    Array contenente i riferimenti ai due giocatori.
 * @param parameters Parametri usati nella partita
 * @param turn       Turno attuale
 * @param soluzione  Codice da decriptare
 */

public class MatchCoordinator {
	private Player p1;
	private Player p2;
	private GameParameters parameters;
	private int turn;
	private Campo campo;

	public MatchCoordinator(GameParameters parametri, Campo campo, Player uno, Player due) {
		this.parameters = parametri;
		this.p1 = uno;
		this.p2 = due;
		this.turn = 0;
		this.campo = campo;
	}

	public Risultato play() throws IOException, IllegalParameterException {
		campo.setDecodeArray(p1.generateCode(parameters));
		Risultato esito;
		Checker checker = new Checker(parameters, campo);
		do {
			if (Checker.isWinner(checker.check(campo.decodeArray, p2.generateCode(parameters)))) {
				esito = new Vincitore(this.p2.getID());
				return esito;
			}
			//Stampare array di suggerimento
			System.out.println("Array di suggerimento: " +checker.check(campo.decodeArray, p2.generateCode(parameters)));
			this.turn++;
		} while (turn < parameters.attempts);
		return esito = new Perdente(this.p1.getID());
	}

}
