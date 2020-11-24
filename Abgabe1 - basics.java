
public class Functionality {
	
	// berechnet die Fläche eines Trapez (Länge a und c, Höhe h) 
	public static double trapezoidArea(int a, int c, int h) {
		double trapezFlaeche = ((double) a + (double) c) * h * 0.5;
		if (((a <= 0) || (c <= 0)) || (h <= 0)) {
			System.out.println(-1.0);
			return -1.0;
		} else {
			System.out.println(trapezFlaeche);
			return trapezFlaeche;
		}

	}

	// int a steht vor dem "." und b dahinter 
	public static double createDouble(int a, int b) {
		while ((b % 10) == 0) {
			b = b / 10;
		}
		String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);
		String ausgabeString = a1 + "." + b1;
		double ausgabeDouble = Double.parseDouble(ausgabeString);
		return ausgabeDouble;
	}
	public static void main(String[] args) {
	}

}
