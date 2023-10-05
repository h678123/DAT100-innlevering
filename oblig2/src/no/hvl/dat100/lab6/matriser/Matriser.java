package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] x : matrise) {			
			for (int i : x) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String ish = "";
		for (int[] i : matrise) {
			for (int x : i) {
				ish += x+ " ";
			}
			ish += "\n";
		}
		return ish;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		
		// sjekker hvor mange arrays det er
		int tl = matrise.length;
		
		// bestemmer hvor stor hver array skal være
		int ish = 0;
		for (int[] i : matrise) {
			if (i.length > ish) {
				ish = i.length;
			}
		}
		
		// lager en array som er lik matrise
		int[][] nyTabell = new int[tl][ish];
		
		// sier hvilken array vi skal jobbe med først
		int list = 0;
		for (int[] i : matrise) {
			// Må gjøre element til 0 etter hver array for å få riktig index.
			int element = 0;
			for (int x : i) {
				nyTabell[list][element] = x * tall;
				element++;
			}
			list++;
		}
		
		return nyTabell;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		
		// sjekker om matrisene er like lange.
		if (a.length != b.length) {
			return false;
		}
		
		
	// Sjekker om alle rader er like lange	
		for (int[] i : a) {
			for (int[] x : b) {
				if (x.length != i.length) {
					return false;
				}
			}
			
		}
				for (int i = 0; i < a.length; i++) {
			for (int x = 0; x < a[i].length; x++) {
				if (a[i][x] != b[i][x]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
