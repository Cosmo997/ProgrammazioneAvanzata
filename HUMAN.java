
public class HUMAN implements Player {

	public String ID;
	
	public HUMAN(String name)
	{
		this.ID = name;
	}
	
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	/**
	 * Metodo per prendere da tastiera il codice del giocatore
	 * @param
	 * @return array riempito dal giocatore
	 */
	 
	public int[] generateCode(GameParameters settings) {
		// TODO Auto-generated method stub
		//return getCode(settings);
		return null;
	}
}
