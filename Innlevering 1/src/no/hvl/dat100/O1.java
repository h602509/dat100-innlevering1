package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {

		String inntektTxt = showInputDialog("Oppgi inntekt");
		int inntekt = Integer.parseInt(inntektTxt);
		double skatt = 0;
		int skatteFriInntekt = 164100;
		int skatteTrinn1 = 230590;
		int skatteTrinn2 = 580650;
		int skatteTrinn3 = 934050;
		double skatt1 = (skatteTrinn1 - skatteFriInntekt) * 0.0093;
		double skatt2 = (skatteTrinn2 - skatteTrinn1) * 0.0241;
		double skatt3 = (skatteTrinn3 - skatteTrinn2) * 0.1152;

		if (inntekt <= skatteFriInntekt) {
		}

		if (inntekt > skatteFriInntekt && inntekt <= skatteTrinn1) {
			skatt = (inntekt - skatteFriInntekt) * 0.0093;
		}

		if (inntekt > skatteTrinn1 && inntekt <= skatteTrinn2) {
			skatt = skatt1 + (inntekt - skatteTrinn1) * 0.0241;
		}

		if (inntekt > skatteTrinn2 && inntekt <= skatteTrinn3) {
			skatt = skatt1 + skatt2 + (inntekt - skatteTrinn2) * 0.1152;
		}

		if (inntekt > skatteTrinn3) {
			skatt = skatt1 + skatt2 + skatt3 + (inntekt - skatteTrinn3) * 0.1452;
		}

		System.out.println("beregnet skatt: " + (int) (skatt + 0.5) + ",- runnet av til nærmeste krone");

	}
}
