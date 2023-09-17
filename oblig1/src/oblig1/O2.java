package oblig1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 11; i++) {
		// input
		
        int input;
        do {
            String inputStr = showInputDialog("Hvor mange poeng fikk du?");
            input = parseInt(inputStr);

            if (input < 0 || input > 100) {
                System.out.println(i + ". Vennligst skriv inn gyldig tall mellom 0 og 100");
            }
        } while (input < 0 || input > 100);
        
		// Sjekk
		if (input < 0 || input > 100) {
			System.out.println(i + ". Vennligst skriv inn gyldig tall mellom 0 og 100");
		} else if (input < 40) {
			System.out.println( i + ". F");
		} else if (input >= 40 && input < 50) {
			System.out.println( i + ". E");
		} else if (input >= 50 && input < 60) {
			System.out.println( i + ". D");
		}	else if (input >= 60 && input < 80) {
			System.out.println( i + ". C");
		}	else if (input >= 80 && input < 90) {
			System.out.println( i + ". B");
		}	else if (input >= 90 && input <= 100) {
			System.out.println( i + ". A");
		} else {
			System.out.println("En feil har opstått");
		}
		
	}}}
