package level_7;

import java.util.Scanner;

public class Java_10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[5][15];
		int max = -1;
		
		for(int i = 0; i < 5; i++) {
			String str = sc.next();
			
			if(str.length() > max) {
				max = str.length();
			}
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] == '\0') {
					continue; // 공백이 아닌 NULL 문자이므로 \0
				}
				System.out.print(arr[j][i]);
			}
		}
		sc.close();
	}

}
