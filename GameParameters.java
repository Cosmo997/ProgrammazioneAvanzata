
public class GameParameters {

	public boolean duplicateAllow;
	public int codeLenght;
	public int attempts;
	public int minCodValue = 1;
	public int maxCodValue;
	
	public GameParameters(int lunghezza, boolean duplicate)
	{
		this.codeLenght = lunghezza;
		this.duplicateAllow = duplicate;
		if(codeLenght == 4)
		{
			this.attempts = 9;
			this.maxCodValue = 6;
		}else if(codeLenght == 6){
			this.attempts = 15;
			this.maxCodValue = 8;
		}else if(codeLenght == 8){
			this.attempts = 21;
			this.maxCodValue = 10;}
	}
	
	public GameParameters()
	{
		this.codeLenght = 4;
		this.duplicateAllow = false;
		this.attempts = 9;
		this.maxCodValue = 6;
	}
	
}
