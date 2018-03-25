package verhuurbedrijf;

public class vrachtauto
{
	String vMerk;
	String vModel;
	int vVermogen;
	int vHuurprijs;
	
	public vrachtauto (String merk, String model, int vermogen, int huurprijs)
	{
		vMerk = merk;
		vModel = model;
		vVermogen = vermogen;
		vHuurprijs = huurprijs;
	}
	
	public void vrachtautoInformatie()
	{
		System.out.println("Een " + vMerk + " " + vModel + " (" + vVermogen + " pk)"+ " kost € " + vHuurprijs + " per dag (ex BTW).");
	}
	
	public static void main(String[] args) {
		vrachtauto obj1 = new vrachtauto ("MAN","TGX",440,350);
		vrachtauto obj2 = new vrachtauto ("MAN","TGA",540,395);
		vrachtauto obj3 = new vrachtauto ("MAN","TGS",400,325);
		vrachtauto obj4 = new vrachtauto ("Scania","G360",360,325);
		vrachtauto obj5 = new vrachtauto ("Scania","R420",420,415);
		
		obj1.vrachtautoInformatie();
		obj2.vrachtautoInformatie();
		obj3.vrachtautoInformatie();
		obj4.vrachtautoInformatie();
		obj5.vrachtautoInformatie();
		
		System.out.println();
		System.out.println("Ready.");
	}

}
