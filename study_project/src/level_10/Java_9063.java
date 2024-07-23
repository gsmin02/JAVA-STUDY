package level_10;

import java.util.Scanner;

public class Java_9063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int min_x = 10001;
		int min_y = 10001;
		int max_x = -10001;
		int max_y = -10001;
		
		for(int i = 0; i < input; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			min_x = (min_x > x) ? x : min_x;
			min_y = (min_y > y) ? y : min_y;
			max_x = (max_x < x) ? x : max_x;
			max_y = (max_y < y) ? y : max_y;
		}
		
		System.out.println((max_x - min_x) * (max_y - min_y));
		
		sc.close();
	}

}
