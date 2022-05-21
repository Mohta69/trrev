package trrev_1;

import java.util.*;

class Trrev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		System.out.println("What function do you want to perform? \n 1. Arithematic Operation \n 2. Misc");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Enter two numbers.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(
					"Press: \n 1. Addtion \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5.  Modulous");
			int choice1 = sc.nextInt();
			if (choice1 == 1)
				System.out.println(a + b);
			else if (choice1 == 2)
				System.out.println(a - b);
			else if (choice1 == 3)
				System.out.println(a * b);
			else if (choice1 == 4)
				System.out.println(a / b);
			else if (choice1 == 5)
				System.out.println(a % b);
			else
				System.out.println("Wrong Choice");
		} else if (n == 2) {
			System.out.println("Press: \n 1. Average \n 2. Simple Interest \n 3. Square root");
			int choice2 = sc.nextInt();
			if (choice2 == 1) {
				System.out.println("Enter Your Marks in 3 Subjects");
				int m1 = sc.nextInt();
				int m2 = sc.nextInt();
				int m3 = sc.nextInt();
				System.out.println("Average in 3 subjects= " + (m1 + m2 + m3) / 3);
			} else if (choice2 == 2) {
				System.out.println("Enter Principal amount, time duration (in years) and rate of interest");
				double pr = sc.nextDouble();
				double time = sc.nextDouble();
				double rate = sc.nextDouble();
				System.out.println("Simple Interest= " + (pr * rate * time) / 100);
			} else if (choice2 == 3) {
				System.out.println("Enter the number which you want to find the square root of.");
				double number = sc.nextDouble();
				System.out.println("Square root of " + number + " = " + Math.sqrt(number));
			}
		} else
			System.out.println("Incorrect Option");
		sc.close();
	}
}