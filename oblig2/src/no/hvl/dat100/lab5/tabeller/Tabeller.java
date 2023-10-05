package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i : tabell) {
			System.out.println(i);
		}
		

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String x = "";
		x += "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i == tabell.length - 1) {
				x += tabell[i];
			} else {
				x += tabell[i] + ",";
			}
		}
		x += "]";
		return x;
		
	}
	
	// c)
	public static int summer(int[] tabell) {
		
/*		Vanlig for-løkke

		int x = 0;
		for (int i = 0; i < tabell.length; i++) {
			x += tabell[i];
		}
		return x;
	}
*/	
/*		Utvidet for løkke		
		int x = 0;
		for (int i : tabell) {
			x += i;
		}
		return x;
*/
//	 	While løkke
		
		int x = 0;
		int i = 0;
		while (true) {
			if (tabell.length == 0) {
				break;
			} else  {
				if ( i == tabell.length - 1) {
					x += tabell[i];
					i++;
					break;
				} else {
					x += tabell[i];
					i++;
				}
			}
			
		}
		return x;
	}
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		
		for (int i : tabell) {
			if (i == tall) {
				funnet = true;
			}
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int index = 0;
		for (int i : tabell) {
			if (i == tall) {
				return index;
			} else {
				index += 1;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		// lager en array som er like lang
		int[] ish = new int[tabell.length];
		
		int index = 0;
		
		// copy paste
		for (int i = tabell.length - 1; i >= 0; i--) {
			ish[index] = tabell[i];
			index++;
		}
		
		return ish;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// gjør det lett å bruke
		int x = tabell.length;
		
		// alle tabeller som er enten 1 eller 2 i lengde er allerede sortert
		if (x <=1) {
			return true;
		}
		
		// sjekk - hvis det er feil i sorteringen stopper vi det der
		for (int i = 0; i < x -1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		// ingen feil derfor er det sortert.
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int totn = tabell1.length + tabell2.length;
		int t1 = tabell1.length;
		int t2 = tabell2.length;
		int[] nyListe = new int[totn];
		
		for (int i = 0; i < t2; i++) {
			for (int x = 0; x < t1; x++) {
				nyListe[x] = tabell1[x];
			}
			nyListe[t1 + i] = tabell2[i];
		}
		
		

		
		for (int i : nyListe) {
			System.out.println(i);
		}
		return nyListe;
	}
}
