
public class Functionality {

	public static double medianInception(double[][] a) {
		if ((a == null) || (a.length == 0)) {
			return Double.NaN;
		}
		for (int i = 0; i < a.length; i++) {
			if ((a[i] == null) || (a[i].length == 0)) {
				return Double.NaN;
			}
		}
		// Sortiert innere Arrays
		for (int i = 0; i < a.length; i++) {
			bubbleSort(a[i]);
		}
		// Deklaration neues Array
		double[] medianInnere = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			medianInnere[i] = medianVersuch(a[i]);
			// Einfüllen in neues 1dimensionales Array mit medianWerten
		}
		// Prüfen ob Median von einem inneren Array leer oder null ist
		if ((medianInnere == null) || (medianInnere.length == 0)) {
			return Double.NaN;
		}
		// sortiert neues Median Array und berechnet Median davon
		double medianGesamt = 0;
		for (int i = 0; i < medianInnere.length; i++) {
			medianInnere = bubbleSort(medianInnere);
			medianGesamt = medianVersuch(medianInnere);
		}
		return medianGesamt;
	}

	// Methode medianBerechnung über innereArrays
	public static double medianVersuch(double[] a) {
		double medianInnere = 0;
		if ((a.length % 2) != 0) {
			medianInnere = (a[a.length / 2]);
		} else {
			medianInnere = (a[(a.length / 2) - 1] + a[a.length / 2]) / 2.0;
		}
		return medianInnere;
	}

	// Sortier Algorithmus
	public static double[] bubbleSort(double[] a) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < (a.length); i++) {
				if (a[i - 1] > a[i]) {
					double temp = a[i]; // tausch
					a[i] = a[i - 1];
					a[i - 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		return a;
	}

	public static void main(String[] args) {
	}

}
