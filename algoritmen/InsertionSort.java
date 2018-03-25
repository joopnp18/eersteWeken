package algoritmen;

public class InsertionSort
{
	public static void main(String[] args)
	{
/*		Uncomment één van de volgende vijf regels die een array (reeks) declareren en instantiëren
*		De eerste is de opgave
*		De rest wordt gebruikt om te checken of de efficiëntie-tellers werken
*/		
		int[] reeks = new int[] {6, 2, 10, 4, 6, 3, 9, 5, 13, 7, 4, 2, 5};
//		int[] reeks = new int[] {1, 2};
//		int[] reeks = new int[] {2, 1,};
//		int[] reeks = new int[] {1, 2, 3};
//		int[] reeks = new int[] {2, 1, 3};
		
		reeksWeergeven(reeks);			// Laat de reeks zien
		reeksInsertionSort(reeks);		// Sorteer de reeks volgens de InsertionSort methode
		reeksWeergeven(reeks);			// Laat de reeks zien
		
		System.out.println();
		System.out.println("Klaar.");	// Einde programma
	}
	
	public static void reeksWeergeven(int[] reeks)
	{
//		loper loopt hier de reeks af (N.B.: het eerste element van een array heeft de index 0)
		for (int loper = 0; loper < reeks.length; loper++)
		{
			System.out.print(reeks[loper] + " ");
		}
		System.out.println();
	}
	
	public static void reeksInsertionSort(int[] reeks)
	{
//		de volgende twee variabelen worden gebruikt om een idee te krijgen van de efficiëntie van de manier van sorteren
		int aantalVergelijkingen = 0;
		int aantalVerwisselingen = 0;
		int aantalForLoops = 0;
		
//		teller telt het aantal reeds gesorteerde elementen (de eerste waarde is automatisch correct)		
		for (int teller = 1; teller < reeks.length; teller++)
		{
			aantalForLoops++;
			if (reeks[teller] < reeks[teller - 1])
			{
//				loper loopt de overige plaatsen van de reeks af		
				for (int loper = 0; loper < teller; loper++)
				{
					aantalForLoops++;
					if (reeks[teller] < reeks[loper])
					{
//				 		overloop is nodig om te kunnen 'rangeren'
						int overloop = reeks[loper];
						reeks[loper] = reeks[teller];
						reeks[teller] = overloop;
						aantalVerwisselingen++;
					}
					aantalVergelijkingen++;
				}
			}
			aantalVergelijkingen++;
		}
		System.out.println("De reeks bestaat uit " + reeks.length + " elementen.");
		System.out.println("Er is " + aantalForLoops + " keer een for-loop doorlopen, "+ aantalVergelijkingen + " keer vergeleken en " + aantalVerwisselingen + " keer verwisseld.");
	}
}
