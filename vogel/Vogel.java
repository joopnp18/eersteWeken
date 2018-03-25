package vogel;

public class Vogel
{
	String jNaam; 
	
	Vlieg vlieg;
	
	public Vogel(String naam)
	{
		jNaam = naam;
	}
	
	public void eten()
	{
		System.out.println("Vogel eet.");
	}
	
	public void vliegen()
	{
		this.vlieg.vliegen();
	}
	
	public void hersteld()
	{
		this.vlieg = new KanVliegen();
	}

	public void raaktGewond()
	{
		this.vlieg = new KanNietVliegen();
	}
}
