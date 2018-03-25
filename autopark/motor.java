package autopark;

public class motor
{
	double jInhoud;
	String jVorm;
	char jBrandstof;
	int jVermogen;
	
	public motor (double inhoud, String vorm, char brandstof, int vermogen)
	{
		jInhoud = inhoud;
		jVorm = vorm;
		jBrandstof = brandstof;
		jVermogen = vermogen;
	}
	
	public void motorInformatie()
	{
		String jjBrandstof = "benzine";
		if (jBrandstof == 'd')
		{
			jjBrandstof = "diesel";
		}
		System.out.println("Een " + jInhoud + " l " + jjBrandstof + " " + jVorm + "-blok heeft een vermogen van " + jVermogen + " pk.");
	}
	
	public static void main(String[] args)
	{
		// beschrijving motorblokken: inhoud, vorm, brandstof, vermogen
		motor motor1 = new motor (1.8, "4-in-lijn", 'b', 117);
		motor motor2 = new motor (2.0, "4-in-lijn", 'b', 143);
		motor motor3 = new motor (3.0, "V6", 'b', 210);
		motor motor4 = new motor (1.6, "HDIF", 'd', 110);
		motor motor5 = new motor (2.0, "HDIF", 'd', 138);
		motor motor6 = new motor (2.2, "HDIF", 'd', 136);
		
		motor1.motorInformatie();
		motor2.motorInformatie();
		motor3.motorInformatie();
		motor4.motorInformatie();
		motor5.motorInformatie();
		motor6.motorInformatie();
		
		
		System.out.println();
		System.out.println("Ready.");
	}
}
