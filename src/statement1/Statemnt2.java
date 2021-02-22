package statement1;
import set1.util.ScannerValidate;

public class Statemnt2 {

	public static void main(String[] args) {
		System.out.println("Enter the size of an 1st array");
		int len = ScannerValidate.getValidInt();
		System.out.println("Enter the size of an 2st array");
		int lenOne = ScannerValidate.getValidInt();
		double[] arr = new double[len];
		double[] arrOne = new double[lenOne];
		System.out.println("Enter the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ScannerValidate.getValiedDouble();
		}
		System.out.println("Enter the array");

		for (int i = 0; i < arrOne.length; i++) {
			arrOne[i] = ScannerValidate.getValiedDouble();
		}
		int size = 0;
		if (arr.length > arrOne.length) {
			size = arr.length;
		} else
			size = arrOne.length;
		double result[] = new double[size];
		for (int i = 0; i < result.length; i++) {
			if (arr.length <= i) {
				result[i] = arrOne[i];
			} else if (i < arrOne.length && i < arr.length) {
				result[i] = arr[i] + arrOne[i];
			} else
				result[i] = arr[i];

		}

		for (int i = 0; i < result.length; i++) {
			result[i] = round(result[i]);
		}
		sortInteger(result);
		for (int i = 0; i < result.length; i++) {
			System.out.println((int) result[i]);
		}
	}

	public static long round(double value) {
		long number = (int) value;
		String str = "" + value;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				if (str.charAt(i + 1) - '0' > 5) {
					int sum = (str.charAt(i - 1) - '0');
					number = number + sum;
				} else {
					number = number - ((str.charAt(i - 1) - '0'));
				}
				break;
			} else {
			}
		}

		return number;
	}

	public static double[] sortInteger(double[] buble) {

		int length = buble.length;
		double temp;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < (length); j++) {
				if (buble[i] > buble[j]) {
					temp = buble[i];
					buble[i] = buble[j];
					buble[j] = temp;
				}
			}
		}
		return buble;

	}

}
