package level_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_25501 {
	
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String str = br.readLine();
			sb.append(isPalindrome(str)).append(" ").append(count).append('\n');
			count = 0;
		}
		
		System.out.println(sb.toString());
	}
	
	public static int recursion(String str,int str_fir, int str_las) {
		count++;
		if(str_fir >= str_las) return 1;
	    else if(str.charAt(str_fir) != str.charAt(str_las)) return 0;
	    else return recursion(str, str_fir+1, str_las-1);
	}
	
	public static int isPalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}

}
