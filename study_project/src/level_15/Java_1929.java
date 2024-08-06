package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());

		for(int i = n1; i <= n2; i++) {
			boolean chk = false;
			
			if(i < 2)
				chk = true;
			
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					chk = true;
					break;
				}
			}
			if(!chk) {
				System.out.println(i);
			}
		}
	}

}
