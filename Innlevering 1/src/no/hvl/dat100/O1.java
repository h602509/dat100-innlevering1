package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {

		String inntektTxt = showInputDialog("Oppgi inntekt");
		int inntekt = Integer.parseInt(inntektTxt);
		double skatt = 0;

		if (inntekt <= 164100) {

		} else if (inntekt <= 230950) {
			skatt = inntekt * 0.0093;

		} else if (inntekt <= 580650) {
			skatt = inntekt * 0.0241;

		} else if (inntekt <= 934050) {
			skatt = inntekt * 0.1152;

		} else 
			skatt = inntekt * 0.1452;
		
		System.out.println("beregnet skatt: " + (int)(skatt+0.5) + ",- runnet av til nærmeste krone");

	}

}
