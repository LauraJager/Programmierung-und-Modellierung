public class Functionality {

	public static String encodeCaesar(String text, int verschiebung) {
		if ((verschiebung < 0) || (verschiebung > 26)) { // Sonderfall: wenn Int kleiner als 0 / größer als 26 -> leer
			return "";
		}
		String textKlein = text.toLowerCase(); // Umwandlung falls Großbuchstaben in Kleinbuchstaben
		char[] charArray = textKlein.toCharArray(); // Umwandlung String in Character Array
		String encoded = "";
		for (char buchstabe : charArray) {
			if ((buchstabe + verschiebung) > 122) {// falls > als z
				buchstabe += (verschiebung - 26); // beginnt wieder bei a
			} else {
				buchstabe += verschiebung; // Verschiebung chars um Int (ASCII System)
			}
			encoded += buchstabe; // Sammlung chars -> String
		}
		return encoded; // Rückgabe
	}

	public static void main(String[] args) {
	}

}
