package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O3 {

	public static void main(String[] args) {

		int verdiInn = Integer.parseInt(showInputDialog("Oppgi tall > 0 og < 13: "));
		while (verdiInn <= 0 || verdiInn >= 13) {
			verdiInn = Integer.parseInt(showInputDialog("Oppgi tall > 0 og < 13: "));

		}

		int p = 1;
		
		for (int i = 1; i <= verdiInn; i++) {
			p = p * i;
		}

		System.out.print(p);
		showMessageDialog(null, p);

	}
}
