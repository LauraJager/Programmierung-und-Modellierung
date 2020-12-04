
public class Functionality {

	// exercise 1
	public static int[] generateNumbers(int start, int end) {
		if (start > end) {
			return new int[0];
		}
		int[] array = new int[(end - start) + 1];
		int i = 0;
		return generateNumbers(array, start, end, i);
	}

	public static int[] generateNumbers(int[] array, int start, int end, int i) {
		if (start > end) {
			return array;
		}
		array[i] = start;
		return generateNumbers(array, ++start, end, ++i);
	}

	public static void printArray(int[] arr) {
		if ((arr == null) || (arr.length == 0)) {
			return;
		}
		printArray(arr, 0, "[");
	}

	public static void printArray(int[] arr, int i, String res) {
		if (i == (arr.length - 1)) {
			res += arr[i] + "]";
			System.out.println(res);
			return;
		}
		res += arr[i] + ", ";
		printArray(arr, ++i, res);
	}

	// exercise 2
	public static double geoReihe(int n) {
		assert n >= 0;
		double result = 0;
		for (int i = 0; i <= n; i++) {
			result += Math.pow(0.5, i);
			assert (result == (2 - Math.pow(0.5, i)));
		}
		assert (result <= 2.0) && (result >= 1.0);
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// printArray(generateNumbers(-23, 2));
		geoReihe(800000);
	}

}
