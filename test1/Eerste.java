package test1;

public class Eerste
{
	public static void main(String[] args)
	{
		String[] kleuren = {"schoppen", "harten", "ruiten", "klaveren"};
		String[] waarde = {"aas", "heer", "vrouw", "boer", "10", "9", "8", "7", "6", "5", "4", "3", "2"}; 
			
		for (int loper1 = 0; loper1 < waarde.length; loper1++)
		{
			for (int loper2 = 0; loper2 < kleuren.length; loper2++)
			{
				System.out.print(kleuren[loper2] + waarde[loper1] + " ");
			}
			System.out.println();
		}
				
		System.out.println();
		System.out.println("Ready.");
	}
}