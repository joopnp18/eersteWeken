package kermis;
// De Kermis heeft een zestal attracties, die zijn allemaal subclasse van een klasse Attractie.
public class Kermis
{
	String attractie;
	double prijs;

	public Kermis(String n, double p)
	{
		attractie = n;
		prijs = p;
	}
	
	public void printAttractieInformatie()
	{
		System.out.println("De " + attractie + " kost € " + prijs);
	}
	
	public static void main(String[] args)
	{
		Kermis eerste = new Kermis("botsauto's", 2.50);
		Kermis tweede = new Kermis("spin", 2.25);
		Kermis derde = new Kermis("lachspiegels", 2.75);
		Kermis vierde = new Kermis("schiettent", 3.20);
		Kermis vijfde = new Kermis("touwtjetrek", 2.90);
		Kermis zesde = new Kermis("cakewalk", 5);
						
		System.out.println("Welkom op de kermis!");
		eerste.printAttractieInformatie();
		tweede.printAttractieInformatie();
		derde.printAttractieInformatie();
		vierde.printAttractieInformatie();
		vijfde.printAttractieInformatie();
		zesde.printAttractieInformatie();
		
		System.out.println();
		System.out.println("Ready.");
	}


}
