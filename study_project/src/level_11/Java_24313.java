package level_11;

import java.util.Scanner;

public class Java_24313 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		
		if(a1 * n0 + a0 <= (n0 * c) && c >= a1) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		sc.close();
	}

}
