package level_8;

import java.util.Scanner;

public class Java_2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int num = sc.nextInt();
		int tmp = 1;
		int result = 0;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z' ) {
				result += (c - 55) * tmp;
			} else {
				result += (c - 48) * tmp;
			}
			tmp *= num;
		}
		System.out.println(result);
		sc.close();
	}

}
