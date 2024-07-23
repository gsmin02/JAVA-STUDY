package level_8;

import java.util.Scanner;

public class Java_2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] C = new int[T];
		
		for(int i = 0; i < T; i++) {
			C[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < T; i++) {
			System.out.print((C[i] / 25) + " ");
			C[i] = C[i] % 25;
			System.out.print((C[i] / 10) + " ");
			C[i] = C[i] % 10;
			System.out.print((C[i] / 5) + " ");
			C[i] = C[i] % 5;
			System.out.println(C[i]);
		}
	}

}
