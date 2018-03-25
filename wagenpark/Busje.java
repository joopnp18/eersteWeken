package wagenpark;

public class Busje extends Voertuig
{
	String bBrandstof;

	public Busje (String naam, String brandstof)
	{
		super (naam);
		bBrandstof = brandstof;
	}
	
	public void wassen()
	{
		System.out.println("De " + vNaam + " is gewassen.");
	}
	
	public void brandstofnoemen()
	{
		System.out.println("De "+ vNaam + " loopt op " + bBrandstof + ".");
	}
}