public class vliegtuig
{
	String kenteken;
	String naam;
	
	public vliegtuig (String k, String n)
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
		vliegtuig G_ZD = new vliegtuig("G-ZD", "Supermarine Spitfire Mk V");
		vliegtuig G_UF = new vliegtuig("G-UF", "Hawker Hurricane Mk I");
		vliegtuig G_LM = new vliegtuig("G-LM", "Blackburn Skua");
		vliegtuig N_KN987 = new vliegtuig("N-KN987", "North American P-51A Mustang");
		
		G_ZD.vliegtuigInformatie();
		G_UF.vliegtuigInformatie();
		G_LM.vliegtuigInformatie();
		N_KN987.vliegtuigInformatie();
		
		System.out.println();
		System.out.println("Ready.");

	}

}
