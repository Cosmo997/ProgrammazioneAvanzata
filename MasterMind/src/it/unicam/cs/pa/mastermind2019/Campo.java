package it.unicam.cs.pa.mastermind2019;

import java.util.ArrayList;

/**
 * <b>Responsabilità</b>: Creare il campo di battaglia.
 * 
 * @author TeamTrustMe
 * @param decodeArray Array da decodificare.
 * @param codeArray   Tentativo corrente di codice.
 * @param lunghezza   Lunghezza del codice da indovinare.
 */

public class Campo
{
	private ArrayList<Integer> decodeArray;
	private ArrayList<Integer> codeArray;
	int lunghezza;

	/**
	 * Costruttore con un oggetto di tipo {@link}GameParameters in ingresso.
	 * 
	 * @param settings
	 */
	public Campo(GameParameters settings )
	{
		this.lunghezza = settings.codeLenght;
		this.decodeArray = new ArrayList<Integer>();
		this.codeArray = new ArrayList<Integer>();
	}

	/*
	 ****************** GETTERS ******************
	 */
	public ArrayList<Integer> getArrayFromDeco()
	{ return this.decodeArray; }

	public ArrayList<Integer> getArrayFromCode()
	{ return this.codeArray; }

	/*
	 ****************** SETTERS ******************
	 */
	public void setDecodeArray(ArrayList<Integer> arrayList)
	{ this.decodeArray = arrayList; }

	public void setCodeArray(ArrayList<Integer> codeArray)
	{ this.codeArray = codeArray; }

}
