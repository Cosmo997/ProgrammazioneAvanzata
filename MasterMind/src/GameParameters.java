import java.io.IOException;

/**
 * <b>Responsabilità </b>: Impostare i parametri di gioco.
 * 
 * @author TeamTrustMe
 * @param duplicateAllow Boolean per avere la duplicazione di caratteri nel
 *                       codice
 * @param codeLenght     Lunghezza del codice da indovinare
 * @param attempts       Numero di tentativi possibili
 * @param minCodValue    Numero minimo di caratteri del codice
 * @param maxCodValue    Numero massimo di caratteri del codice
 */



public class GameParameters
	{
		final boolean duplicateAllow;
		final int codeLenght;
		
		int attempts;
		final int minCodValue = 1;
		int maxCodValue;

		
		/**
		 * Costruttore con valori in ingresso. Il numero di tentativi e il numero
		 * massimo di caratteri viene impostato a seconda della lunghezza del codice
		 * 
		 * @param lunghezza Lunghezza del codice da indovinare
		 * @param duplicate Booleano che consente di avere duplicati nel codice
		 * @throws IOException Viene lanciata se {@code}lunghezza{/@code} non è un
		 *                     numero tra 4-6-8
		 * 
		 */
		
		public GameParameters(int lunghezza, boolean duplicate) throws IOException
			{
				this.codeLenght = lunghezza;
				this.duplicateAllow = duplicate;

				if (codeLenght == 4)
					{
						this.attempts = 9;
						this.maxCodValue = 6;
					}
				else if (codeLenght == 6)
					{
						this.attempts = 15;
						this.maxCodValue = 8;
					}
				else if (codeLenght == 8)
					{
						this.attempts = 21;
						this.maxCodValue = 10;
					}
				else
					{
						throw new IOException("Il numero inserito non è utilizzabile");
					}
			}

		/**
		 * Costruttore di default che non prende parametri di ingresso e inserisce
		 * impostazioni standard
		 */
		
		public GameParameters()
			{
				this.codeLenght = 4;
				this.duplicateAllow = false;
				this.attempts = 9;
				this.maxCodValue = 6;
			}
		
		public int getCodeLenght() {
			return codeLenght;
		}

		public int getAttempts() {
			return attempts;
		}


	}
