package level_10;

import java.util.Scanner;

public class Java_3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1_x = sc.nextInt();
		int num1_y = sc.nextInt();
		int num2_x = sc.nextInt();
		int num2_y = sc.nextInt();
		int num3_x = sc.nextInt();
		int num3_y = sc.nextInt();
		
		if(num1_x == num2_x) {
			System.out.print(num3_x);
		}
		else if(num2_x == num3_x) {
			System.out.print(num1_x);
		}
		else {
			System.out.print(num2_x);
		}
		if(num1_y == num2_y) {
			System.out.println(" " + num3_y);
		}
		else if(num2_y == num3_y) {
			System.out.println(" " + num1_y);
		}
		else {
			System.out.println(" " + num2_y);
		}
		
		sc.close();
	}

}
