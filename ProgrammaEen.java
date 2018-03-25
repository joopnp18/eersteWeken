public class ProgrammaEen{
	public static void main(String args[]) {
		String naam;
		int getal = 8;
		naam = "hallo";
		naam = "een ander waarde";
		System.out.println(naam);
		System.out.println(getal);
		
//		int boolean long short double float char byte;
		Hond fikkie = new Hond();
		fikkie.naam = "Astor";
	}
}
class Hond{
	int leeftijd;
	String naam;
}