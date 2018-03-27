package algoritmen;

public class FaculteitsBerekening
{
	public static void main (String[] args)
	{
		int invoer = 9;		// van dit getal wordt de faculteit berekend (N.B.: maximale waarde is 25)
		long fac = faculteit(invoer);
		
		System.out.println("De faculteit van " + invoer + " (oftewel " + invoer + "!) is " + fac);
		
		System.out.println();
		System.out.println("Klaar.");
	}
	
	private static long faculteit(int invoer)
	{
		if (invoer == 0)
		{
			return 1;
		}
		else
		{
			return (invoer * faculteit((invoer - 1)));
		}
	}
}
