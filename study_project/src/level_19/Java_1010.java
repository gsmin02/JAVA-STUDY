package level_19;

import java.util.Scanner;

public class Java_1010 {

	static int[][] arr = new int[30][30];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			sb.append(com(num2, num1)).append('\n');
		}
		System.out.println(sb.toString());
		sc.close();
	}
	
	public static int com(int n, int r) {
		if(arr[n][r] > 0) {
			return arr[n][r];
		}
		
		if(n == r || r == 0) {
			return arr[n][r] = 1;
		}
		return arr[n][r] = com(n - 1, r - 1) + com (n - 1, r);
	}

}
