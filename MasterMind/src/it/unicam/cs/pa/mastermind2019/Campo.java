package it.unicam.cs.pa.mastermind2019;
/**
 * <b>Responsabilità</b>: creare il campo.
 * 
 * @author TeamTrustMe
 *
 */

public class Campo
{
	int[] decodeArray;
	int[] codeArray;
	int lunghezza;

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
