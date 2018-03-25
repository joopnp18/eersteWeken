package autopark;

public class auto
{
	String jMerk;
	String jType;
	
	public auto (String merk, String type)
	{
		// auto's kunnen maken
		jMerk = merk;
		jType = type;
	}

	public void parkInformatie()
	{
		System.out.println(jMerk + " " + jType);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welkom bij JJCars");
		System.out.println();
		
		// autovoorraad aanmaken
		auto auto1 = new auto ("Saab", "9-3");
		auto auto2 = new auto ("Citroën", "C5");
		auto auto3 = new auto ("Peugeot", "508");
		
		// autovoorraad laten zien
		auto1.parkInformatie();
		auto2.parkInformatie();
		auto3.parkInformatie();
		
		System.out.println();
		System.out.println("Ready.");
	}

}
