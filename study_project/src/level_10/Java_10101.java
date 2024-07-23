package level_10;

import java.util.Scanner;

public class Java_10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 == 60 && num2 == 60 && num3 == 60) {
			System.out.println("Equilateral");
		}
		else if(num1 + num2 + num3 == 180) {
			if(num1 == num2 || num2 == num3 || num3 == num1) {
				System.out.println("Isosceles");
			}
			else {
				System.out.println("Scalene");
			}
		}
		else {
			System.out.println("Error");
		}
		
		sc.close();
	}

}
