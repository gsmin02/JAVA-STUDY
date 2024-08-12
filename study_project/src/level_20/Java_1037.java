package level_20;

import java.util.Scanner;

public class Java_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int min = 1000000;
		int max = 1;
		
		for(int i = 0; i < num; i++) {
			int in = sc.nextInt();
			
			if(in < min) {
				min = in;
			}
			if(in > max) {
				max = in;
			}
		}
		System.out.println(min * max);
		sc.close();
	}

}
