package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_4134 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			if(num == 0 | num == 1) {
				sb.append(2).append('\n');
				continue;
			}
			
			while(true) {
				long cnt = 0;
				for(long j = 2; j <= Math.sqrt(num); j++) {
					if(num % j == 0) {
						cnt++;
						break;
					}
				}
				
				if(cnt == 0) {
					sb.append(num).append('\n');
					break;
				}
				num++;
			}
		}
		System.out.println(sb.toString());
	}

}
