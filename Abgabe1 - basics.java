
public class Hausaufgabe1 {

	public static String convert(double d) {
		String result;
		result = "" + d;
		if (result.length() == 4) {
			return result;
		} else {
			while (result.contains(".")) {
				result = result.substring(0, result.length() - 1);
			}
			return result;
		}
	}

}
