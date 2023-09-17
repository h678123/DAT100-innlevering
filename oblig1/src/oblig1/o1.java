package oblig1;

import java.util.Scanner;

public class o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ish = new Scanner(System.in);
		System.out.println("Skriv inn din bruttoinntekt:");
		double skatt = ish.nextDouble();
		double pay;
		
		if (skatt < 164100) {
			System.out.println("Du betaler ingen trinnskatt. Din bruttolønn er: " + skatt);
			// Trinn 1
		} else if (skatt > 164100 && skatt < 230950) {
			pay = skatt * 0.0093;
			System.out.println("Du betaler " + pay + " trinnskatt.");
			System.out.println("Du får totalt " + (skatt - pay));
			// Trinn 2
		} else if (skatt > 230951 && skatt < 580650) {
			pay = skatt * 0.0241;
			System.out.println("Du betaler " + pay + " trinnskatt.");
			System.out.println("Du får totalt " + (skatt - pay));
			// Trinn 3
		} else if (skatt > 580651 && skatt < 934050) {
			pay = skatt * 0.1152;
			System.out.println("Du betaler " + pay + " trinnskatt.");
			System.out.println("Du får totalt " + (skatt - pay));
			// Trinn 4
		} else {
			pay = skatt * 0.1452;
			System.out.println("Du betaler " + pay + " trinnskatt.");
			System.out.println("Du får totalt " + (skatt - pay));
		}
		ish.close();
		
	}}