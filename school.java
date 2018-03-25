
public class school
{

	public class Personeel
	{
		String naam;
		int personeelsnummer;
		int datumInDienst;
		
		public Personeel (String achternaam, int bsn, int did)
		{
			naam = achternaam;
			personeelsnummer = bsn;
			datumInDienst = did;
		}
		
		public void printPersoneelsInformatie()
		{
			System.out.println(naam + personeelsnummer + datumInDienst);
		}
	}
	
	
	public static void main(String[] args)
	{
		Personeel directeur = new Personeel ("van Puffelen", 554397485, 20180305);
		
		System.out.println("Welkom op het Mendacium College.");
		directeur.printPersoneelsInformatie();
		
		System.out.println();
		System.out.println("Ready.");
	}

}
