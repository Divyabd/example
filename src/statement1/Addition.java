package statement1;

import set1.util.ScannerValidate;

public class Addition {
	public static void main(String[] args) {
		System.out.println("Enter the 1st number");
		long input = ScannerValidate.getValiedLong();
		System.out.println("Enter the 2st number");
		long inputOne = ScannerValidate.getValiedLong();
		System.out.println("1> Addition\n 2> Subtraction\n 3> multiplication\n 4> division\n 5> Exit");
		int choice = ScannerValidate.getInt();
		switch (choice) {
		case 1:
			int num = (int) (input + inputOne);
			String str = "";
			int resultOne=0;
			while (num > 0) {
				 resultOne += num % 2;
				num = num / 2;
			}
			System.out.println(resultOne);
			count(str);
			break;
		case 2:
			if (input < inputOne) {
				System.out.println("We cant do");
			} else {
				int num1 = (int) (input - inputOne);
				String str1 = "";
				while (num1 > 0) {
					int result = num1 % 2;
					str1 = result + str1;
					num1 = num1 / 2;
				}
				System.out.println(str1);
				count(str1);
			}
			
			break;
		case 3:
			int num2 = (int) (input * inputOne);
			String str2 = "";
			while (num2 > 0) {
				int result = num2 % 2;
				str2 = result + str2;
				num2 = num2 / 2;
			}
			System.out.println(str2);
			
			break;
		case 4:
			if (input < inputOne) {
				System.out.println("We cant do");
			} else {
				int num4 = (int) (input / inputOne);
				String str4 = "";
				while (num4 > 0) {
					int result = num4 % 2;
					str4 = result + str4;
					num4 = num4 / 2;
				}
				System.out.println(str4);
				count(str4);

			}

		default:
			System.out.println("invalied choice");
		}

	}

	public static void count(String str) {
		long count = 0L;
		for (int i = 0; i < str.length(); i++) {

			count = count * 10 + str.charAt(i) - '0';
		}
		if(count!=0)
		System.out.println(count);
		else
		{
			System.out.println("long Over flow");

		}
		

	}

}
