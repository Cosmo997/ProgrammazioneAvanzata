/**
 * <b>Responsabilit�</b>: Gestire la strategia di un giocatore
 * 
 * @author TeamTrustMe
 * @param
 */
public interface Player
	{
		/**
		 * Restituisce l'ID del player corrente
		 * 
		 * @return L'ID del player
		 */
		public String getID();

		/**
		 * Genera un array di interi che pu� essere utilizzato sia come codice da
		 * indovinare, sia come tentativo
		 * 
		 * @param settings 
		 * @return Un array di interi
		 */
		public int[] generateCode(GameParameters settings);

	}
