package wagenpark;

public class Bestelbusje extends Busje implements belaadbaar
{
	int bLaadvermogen;

	public Bestelbusje (String naam, String brandstof, int laadvermogen)
	{
		super (naam, brandstof);
		bLaadvermogen = laadvermogen;
	}

	public void laden(int gewicht)
	{
		System.out.print("De " + vNaam + " is beladen met " + gewicht + " kg.");
		if (gewicht > bLaadvermogen)
		{
			System.out.print(" Dat is " + (gewicht - bLaadvermogen) + " kg teveel.");
		}
			System.out.println();
	}

}