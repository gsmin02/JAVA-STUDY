package level_8;

import java.util.Scanner;

public class Java_11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		int num = sc.nextInt();
		
		char arr[] = new char[36];
		long result = 0;
		String str = "";
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (char)(i + '0');
		}
		for(int i = 10; i < 36; i++) {
			arr[i] = (char)(i + 'A' - 10);
		}
		while(N>0) {
			result = N % num;
			N = N / num;
			str = arr[(int)result] + str;
		}
		System.out.println(str);
		sc.close();
	}

}
