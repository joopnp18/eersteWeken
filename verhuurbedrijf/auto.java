package verhuurbedrijf;

public class auto
{
	String aMerk;
	String aModel;
	char aBrandstof;
	int aVermogen;
	int aHuurprijs;
	
	public auto (String merk, String model, char brandstof, int vermogen, int huurprijs)
	{
		aMerk = merk;
		aModel = model;
		aBrandstof = brandstof;
		aVermogen = vermogen;
		aHuurprijs = huurprijs;
	}
	
	public void autoInformatie()
	{
		String volBrandstof = "benzine";
		if (aBrandstof == 'd')
			volBrandstof = "diesel";
		System.out.println("Een " + aMerk + " " + aModel + " op " +  volBrandstof + " kost € " + aHuurprijs + " per dag.");
	}
	
	public static void main(String[] args) {
		auto obj1 = new auto ("Citroën","Berlingo",'d',92,45);
		auto obj2 = new auto ("Citroën","Berlingo",'b',109,40);
		auto obj3 = new auto ("Citroën","C5",'d',109,100);
		auto obj4 = new auto ("Citroën","C5",'b',207,125);
		auto obj5 = new auto ("Saab","9-3",'b',122,70);
		auto obj6 = new auto ("Saab","9-3",'d',116,95);
		auto obj7 = new auto ("Saab","9000",'b',150,85);
		
		obj1.autoInformatie();
		obj2.autoInformatie();
		obj3.autoInformatie();
		obj4.autoInformatie();
		obj5.autoInformatie();
		obj6.autoInformatie();
		obj7.autoInformatie();
		
		System.out.println();
		System.out.println("Ready.");
	}

}
