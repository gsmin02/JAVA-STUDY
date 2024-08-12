package level_19;

import java.util.Scanner;

public class Java_24723 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 1;
		
		for(int i = 0; i < num; i++) {
			result *= 2;
		}
		
		System.out.println(result);
		sc.close();
	}

}
