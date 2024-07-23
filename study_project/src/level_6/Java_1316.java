package level_6;

import java.util.Scanner;

public class Java_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			
			boolean[] alpha = new boolean[26]; // a to z
			boolean group = true; // group check
			
			for(int j = 0; j < str.length(); j++) {
				char chk = str.charAt(j); // 입력 받은 알파벳의 ASCII CODE
				
				if(alpha[chk - 'a']) { // a 가 0부터 시작하도록 설정
					group = false; // 동일한 단어가 나온 경우
					break;
				}
				
				alpha[chk - 'a'] = true;
				
				// 연속된 문자가 아닌 경우
				while(j + 1 < str.length() && str.charAt(j+1) == chk) {
					j++;
				}
			}
			
			if(group) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();

	}
}
