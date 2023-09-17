package oblig1;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ish = new Scanner(System.in);
		System.out.println("Tast inn et tall;");
		int n = ish.nextInt();
		int result = 1;
		String res = n + "! = ";
		for (int i = 1; i <= n; i++) {
			result *= i;
			if (i < n-1) {
				res += i + " x ";
			} else if (i < n) {
				res += i + " ";
			} else {
				res += "x " + i;
			}
		}
		System.out.println(result);
		System.out.println(res + " = " + result);
		ish.close();
	}
}