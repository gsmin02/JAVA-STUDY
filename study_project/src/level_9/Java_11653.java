package level_9;

import java.util.Scanner;

public class Java_11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 2; i <= num;) {
			if(num % i == 0) {
				System.out.println(i);
				num /= i;
			}
			else {
				i++;
			}
		}
		sc.close();
	}
}
