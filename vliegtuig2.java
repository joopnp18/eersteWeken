public class vliegtuig2
{
	String kenteken;
	String naam;
	
	public vliegtuig2 (String k, String n)
	{
		kenteken = k;
		naam = n;
	}
	
	public void vliegtuigInformatie()
	{
		System.out.println("De " + kenteken + " is een " + naam + ".");
	}
	
	public static void main(String[] args)
	{
		vliegtuig2 G_ZD = new vliegtuig2("G-ZD", "Supermarine Spitfire Mk V");
		vliegtuig2 G_UF = new vliegtuig2("G-UF", "Hawker Hurricane Mk I");
		vliegtuig2 G_LM = new vliegtuig2("G-LM", "Blackburn Skua");
		
		G_ZD.vliegtuigInformatie();
		G_UF.vliegtuigInformatie();
		G_LM.vliegtuigInformatie();
		
		System.out.println();
		System.out.println("Ready.");

	}

}
