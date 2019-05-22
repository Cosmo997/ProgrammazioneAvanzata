import java.util.Random;

public class Bot implements Player
	{

		public String ID;
	
	
		public Bot(String name)
			{
				this.ID = name;
				
			}

		@Override
		public String getID()
			{
				// TODO Auto-generated method stub
				return ID;
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

	}
