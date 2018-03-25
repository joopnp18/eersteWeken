package wagenpark;

public class ZZZ
{
	public static void main(String[] args)
	{
		Personenbusje t3 = new Personenbusje ("T3", "diesel", 6);
		Personenbusje liteace = new Personenbusje ("Lite-Ace", "benzine", 5);
		Personenbusje zafira = new Personenbusje ("Zafira", "gas", 8);
		
		Bestelbusje sprinter = new Bestelbusje ("Sprinter", "diesel", 750);
		Bestelbusje hiace = new Bestelbusje ("Hi-Ace", "benzine", 1100);
		Bestelbusje transporter = new Bestelbusje ("Transporter", "gas", 500);
		
		Bakwagen manTGS = new Bakwagen ("MAN TGS Frigo", 320, 53);
		Bakwagen scaniaG360 = new Bakwagen ("Scania G360 L90H29", 360, 65);

		Trekker manTGX = new Trekker ("MAN TGX", 680);
		Trekker dafCF = new Trekker ("DAF CF", 410);
		Trekker manXLX = new Trekker ("MAN XLX", 480);
		
		t3.brandstofnoemen();
		transporter.brandstofnoemen();

		sprinter.tanken(70);
		manTGS.tanken(350);
		manTGX.tanken(700);
		
		liteace.wassen();
		hiace.wassen();

		t3.instappen(5);
		zafira.instappen(14);

		hiace.laden(1200);
		manTGS.laden(47);
		scaniaG360.laden(63);

		scaniaG360.tachoActiveren("Ton");
		dafCF.tachoActiveren("Henk");

		manXLX.koppelen();

		System.out.println();
		System.out.println("Ready.");
	}
}
