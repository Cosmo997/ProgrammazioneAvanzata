import java.util.Random;

public class Bot implements Player
	{

		public String nome;

		public Bot()
			{
				this.nome = "BOT";
			}

		
		/**
		 * Metodo che genera un codice random per il bot
		 * 
		 * @param dati presi da GameParameters
		 * @return Array da decodificare o array da controllare
		 * 
		 **/
		public int[] generateCode(GameParameters settings)
			{
				int[] appArray = new int[settings.codeLenght];

				for (int i = 0; i < settings.codeLenght; i++)
					{
						Random random = new Random();
						int n = settings.maxCodValue - settings.minCodValue;
						int k = random.nextInt(n) + settings.minCodValue;// Valori compresi tra 1 e maxCodValue
						appArray[i] = k;
					}
				return appArray;
			}


		@Override
		public String getNome() {
			return nome;
		}

	}
