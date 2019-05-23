import java.io.BufferedReader;
import java.io.IOException;

/**
 * 
 * @author Daniele
 *
 */
public class PlayerFactory
{
	private BufferedReader input;
	public PlayerFactory()
	{

	}

	public Player getPlayer(String c)
	{
		Player p = null;
		if (c.equals("Bot"))
			p = new Bot(c);
		else
			p = new Human(c);
		return p;
	}
	public String prendiNome() throws IOException {
		System.out.println("Inserisci il tuo nome: ");
		return input.readLine();
	}
}
