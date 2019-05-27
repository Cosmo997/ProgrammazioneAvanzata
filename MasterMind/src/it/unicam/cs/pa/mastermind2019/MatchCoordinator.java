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

public class MatchCoordinator
{
	private Player uno;
	private Player due;
	private GameParameters parameters;
	private int turn;
	private Campo terreno;

	public MatchCoordinator(GameParameters parametri,
							Campo terreno,
							Player uno,
							Player due )
	{
		this.parameters = parametri;
		this.uno = uno;
		this.due = due;
		this.turn = 0;
		this.terreno = terreno;
	}

	public Risultato play() throws IOException, IllegalParameterException
	{
		terreno.setDecodeArray(uno.generateCode(parameters));
		Risultato esito;
		Checker claudio = new Checker(parameters, terreno);
		do
		{
			
			if (Checker.isWinner(claudio.check(terreno.decodeArray, due.generateCode(parameters) )))
			{
				return esito = new Vincitore(this.due.getID());
			}
		}
		while (turn < parameters.attempts);
		return esito = new Perdente(this.uno.getID());
	}

}
