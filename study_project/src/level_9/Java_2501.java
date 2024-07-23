package level_9;

import java.util.Scanner;

public class Java_2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input_N = sc.nextInt();
		int input_K = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input_N; i++) {
			if(input_N % i == 0) {
				count++;
			}
			if(count == input_K) {
				System.out.println(i);
				break;
			}
			if(i == input_N) {
				System.out.println(0);
			}
		}
		sc.close();
	}

}
