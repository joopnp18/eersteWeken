package algoritmen;

public class SelectionSort
{

	public static void main(String[] args)
	{
/*		Uncomment één van de volgende vijf regels die een array (reeks) declareren en instantiëren
*		De eerste is de opgave
*		De rest wordt gebruikt om te checken of de efficiëntie-tellers werken
*/		
		int[] reeks = new int[] {6, 2, 10, 4, 6, 3, 9, 5, 13, 7, 4, 2, 5};
//		int[] reeks = new int[] {1, 2};
//		int[] reeks = new int[] {2, 1};
//		int[] reeks = new int[] {1, 2, 3};
//		int[] reeks = new int[] {2, 1, 3};
		
		reeksWeergeven(reeks);			// Laat de reeks zien
		reeksSelectionSort(reeks);		// Sorteer de reeks volgens de SelectionSort methode
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
	
	public static void reeksSelectionSort(int[] reeks)
	{
//		de volgende twee variabelen worden gebruikt om een idee te krijgen van de efficiëntie van de manier van sorteren
		int aantalVergelijkingen = 0;
		int aantalVerwisselingen = 0;
		int aantalForLoops = 0;

//		teller telt het aantal reeds gesorteerde waarden in het array
//		loper loopt de resterende (niet-gesorteerde) plaatsen in het array af
		
		for (int teller = 0; teller < (reeks.length - 1); teller++)
		{
			aantalForLoops++;
			for (int loper = teller + 1; loper < reeks.length; loper++)
			{
				aantalForLoops++;
				if (reeks[loper] < reeks[teller])
				{
//					overloop is nodig om te kunnen 'rangeren'
					int overloop = reeks[teller];
					reeks[teller] = reeks[loper];
					reeks[loper] = overloop;
					aantalVerwisselingen++;
				}
				aantalVergelijkingen++;
			}
		}
		System.out.println("De reeks bestaat uit " + reeks.length + " elementen.");
		System.out.println("Er is " + aantalForLoops + " keer een for-loop doorlopen, "+ aantalVergelijkingen + " keer vergeleken en " + aantalVerwisselingen + " keer verwisseld.");
	}	
}
