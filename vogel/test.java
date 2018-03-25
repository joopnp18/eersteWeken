package vogel;

public class test
{

	public static void main(String[] args)
	{
		Vogel koert = new Duif("Koert");
		Vogel quart = new Kwartel("Quart");
		Vogel roekie = new Duif("Roekie");
		Vogel artie = new Kwartel("Artie");
		
		System.out.print(artie);
		artie.vliegen();
		System.out.print(koert);
		koert.vliegen();
		System.out.print(quart);
		quart.vliegen();
		System.out.print(roekie);
		roekie.vliegen();
		
		koert.raaktGewond();
		System.out.print(koert);
		koert.vliegen();
		
		koert.hersteld();
		System.out.print(koert);
		koert.vliegen();		
	}

}
