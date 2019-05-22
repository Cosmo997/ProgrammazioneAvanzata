/**
 * <b>Responsabilità</b>: gestire i pioli dei giocatori.
 * 
 * @author TeamTrustMe
 *
 */
public interface FieldView
	{

		// prende l'array dal decodificatore per darlo al checkResult
		int[] getArrayFromDeco();

		// prende l'array dal codificatore per darlo al checkResult
		int[] getArrayFromCode();


	}
