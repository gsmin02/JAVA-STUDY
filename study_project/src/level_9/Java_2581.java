package level_9;

import java.util.Scanner;

public class Java_2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num_M = sc.nextInt();
		int num_N = sc.nextInt();
		
		int result = 0;
		int min = num_N;
		
		for(int i = num_M; i <= num_N; i++) {
			for(int j = 2; j <= i; j++) {
				if(j == i) {
					result += i;
					if(min == num_N) {
						min = i;
					}
				}
				if(i % j == 0) {
					break;
				}
			}
		}
		
		if(result == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(result);
			System.out.println(min);
		}
		sc.close();
	}

}
