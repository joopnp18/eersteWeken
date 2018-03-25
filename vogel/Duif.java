package vogel;

public class Duif extends Vogel
{
	String dNaam;
	
	public Duif(String naam)
	{
		super();
		dNaam = naam;
		this.vlieg = new KanVliegen();
	}
	
}
