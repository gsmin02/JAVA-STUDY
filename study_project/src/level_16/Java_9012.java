package level_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			int count = 0;
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(ch == '(') {
					count++;
				}
				else if(ch == ')') {
					count--;
				}
				if(count < 0) {
					break;
				}
			}
			
			if(count == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
