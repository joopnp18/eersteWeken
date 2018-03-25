package wagenpark;

public class Personenbusje extends Busje
{
	int pZitplaatsen;

	public Personenbusje (String naam, String brandstof, int zitplaatsen)
	{
		super (naam, brandstof);
		pZitplaatsen = zitplaatsen;
	}
	
	public void instappen(int passagiers)
	{
		if (passagiers <= pZitplaatsen)
		{
			System.out.println("Er zijn " + passagiers + " passagiers in de " + vNaam + " gestapt.");
		}
		else
		{
			System.out.println("Er zitten teveel passagiers in de " + vNaam + "; er kunnen er maar " + pZitplaatsen + " in en geen " + passagiers + ".");
		}
	}
}