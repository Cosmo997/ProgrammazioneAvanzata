
/**
 * <b>Responsabilità</b>: creare il campo.
 * 
 * @author TeamTrustMe
 *
 */

public class FieldArray implements FieldView
	{

		int[] decodeArray = new int[0];
		int[] codeArray = new int[0];
		int[] suggestArray = new int[0];

		int lunghezza;

		public FieldArray(GameParameters settings)
			{
				this.lunghezza = settings.codeLenght;

				decodeArray = new int[lunghezza];
				codeArray = new int[lunghezza];
				suggestArray = new int[lunghezza];

			}

		@Override
		public int[] getArrayFromDeco()
			{
				// TODO Auto-generated method stub
				return this.decodeArray;

			}

		@Override
		public int[] getArrayFromCode()
			{
				// TODO Auto-generated method stub
				return this.codeArray;

			}

	}
