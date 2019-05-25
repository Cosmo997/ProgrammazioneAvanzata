package it.unicam.cs.pa.mastermind2019;

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
	int[] decodeArray;
	int[] codeArray;
	int lunghezza;

	/**
	 * Costruttore con un oggetto di tipo {@link}GameParameters in ingresso.
	 * 
	 * @param settings
	 */
	public Campo(GameParameters settings )
	{
		this.lunghezza = settings.codeLenght;
		this.decodeArray = new int[lunghezza];
		this.codeArray = new int[lunghezza];
	}

	/*
	 ****************** GETTERS ******************
	 */
	public int[] getArrayFromDeco()
	{ return this.decodeArray; }

	public int[] getArrayFromCode()
	{ return this.codeArray; }

	/*
	 ****************** SETTERS ******************
	 */
	public void setDecodeArray(int[] decodeArray)
	{ this.decodeArray = decodeArray; }

	public void setCodeArray(int[] codeArray)
	{ this.codeArray = codeArray; }

}
