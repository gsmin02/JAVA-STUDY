package level_9;

import java.util.Scanner;

public class Java_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input_N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < input_N; i++) {
			int num = sc.nextInt();
			for(int j = 2; j <= num; j++) {
				if(j == num)
					cnt++;
				if(num % j == 0)
					break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
