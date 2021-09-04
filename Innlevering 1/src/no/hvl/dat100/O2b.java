package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2b {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			String poengsumTxt = showInputDialog("Oppgi antall poeng");
			int poengsum = Integer.parseInt(poengsumTxt);

			if (poengsum < 0 || poengsum >= 101) {
				System.out.println("pengsum er ugylding");				
			} else if (poengsum <= 39) {
				System.out.println("poengsummen " + poengsum + " karakter: F");
			} else if (poengsum <= 49) {
				System.out.println("poengsummen " + poengsum + " karakter: E");
			} else if (poengsum <= 59) {
				System.out.println("poengsummen " + poengsum + " karakter: D");
			} else if (poengsum <= 79) {
				System.out.println("poengsummen " + poengsum + " karakter: C");
			} else if (poengsum <= 89) {
				System.out.println("poengsummen " + poengsum + " karakter: B");
			} else {
				System.out.println("poengsummen " + poengsum + " karakter: A");
			}
		}
	}
}
