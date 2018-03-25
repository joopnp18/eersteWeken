
public class alfabet
{
	char letter;
	String klinkerOfMedeklinker;
	
	public alfabet (char l, String kom)
	{
		letter = l;
		klinkerOfMedeklinker = kom;
	}

	public void letterInformatie()
	{
		System.out.println("De letter " + letter + " is een " + klinkerOfMedeklinker + ".");
	}	
	
	public static void main(String[] args) {
		alfabet a = new alfabet('a',"klinker");
		alfabet b = new alfabet('b',"medeklinker");
		
		a.letterInformatie();
		b.letterInformatie();
		
		System.out.println();
		System.out.println("Ready.");
	}

}
