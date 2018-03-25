package wagenpark;

public class Bakwagen extends Vrachtwagen implements belaadbaar
{
	int bLaadruimte;
	
	public Bakwagen (String naam, int motorvermogen, int laadruimte)
	{
		super (naam, motorvermogen);
		bLaadruimte = laadruimte;
	}
	
	public void laden(int volume)
	{
		if (volume > bLaadruimte)
		{
			System.out.println("De " + vNaam + " is te vol geladen. Check lading!");
		}
		else
		{
			if (volume > (bLaadruimte*0.9))
			{
				System.out.println("De " + vNaam + " zit erg vol; check of er een pompwagen in zit!");
			}
			else
			{
				System.out.println("Er is " + volume + " m3 in de " + vNaam + " geladen.");
			}
		}
	}
}