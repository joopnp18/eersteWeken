package wagenpark;

public class Trekker extends Vrachtwagen
{
	public Trekker (String naam, int motorvermogen)
	{
		super (naam, motorvermogen);
	}
	
	public void koppelen()
	{
		System.out.println("De oplegger is aan de " + vNaam + " gekoppeld.");
	}
}
