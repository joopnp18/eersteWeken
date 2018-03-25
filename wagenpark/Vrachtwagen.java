package wagenpark;

public class Vrachtwagen extends Voertuig
{
	int vMotorvermogen;

	public Vrachtwagen (String naam, int motorvermogen)
	{
		super (naam);
		vMotorvermogen = motorvermogen;
	}
	
	public void tachoActiveren(String chauffeur)
	{
		System.out.println("De tacho van de " + vNaam + " is geactiveerd voor " + chauffeur + ".");
	}
}