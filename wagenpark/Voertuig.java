package wagenpark;

public class Voertuig
{
	String vNaam;
	
	public Voertuig(String naam)
	{
		vNaam = naam;
	}
	
	public void tanken(int hh)
	{
		System.out.println("In de "+ vNaam + " is " + hh + " liter bijgetankt.");
	}
}