package statement1;

import set1.util.ScannerValidate;

public class Likitha {

	public static void main(String args[]) {
		int[] arr = new int[100];
		System.out.println("How many elements you want to enter");
		int n = ScannerValidate.getValidInt();
		System.out.println("enter elemets ");

		for (int i = 0; i < n; i++) {
			arr[i] = ScannerValidate.getValidInt();
		}

		System.out.println("elemets are");

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}
}
