package level_8;

import java.util.Scanner;

public class Java_2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int add = sc.nextInt();
		int sup = sc.nextInt();
		int len = sc.nextInt();
		
		int result = (len - sup) / (add - sup);
		
		if((len - sup) % (add - sup) != 0) {
			result++;
		}
		System.out.println(result);
		sc.close();
	}

}
