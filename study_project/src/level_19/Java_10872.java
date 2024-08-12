package level_19;

import java.util.Scanner;

public class Java_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		long result = 1;
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}
		
		System.out.println(result);
		sc.close();
	}

}
