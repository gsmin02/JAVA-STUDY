package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0)
				break;
			else if(num == 1)
				sb.append(1).append('\n');
			else {
				int result = 0;
				// 입력 받은 수 보다 큰 값(+1)부터 포함
				for(int i = num + 1; i <= 2 * num; i++) {
					int cnt = 0;
					
					for(int j = 2; j <= Math.sqrt(i); j++) {
						if(i % j == 0) {
							cnt++;
							break;
						}
					}
					if(cnt == 0) {
						result++;
					}
				}
				sb.append(result).append('\n');
			}
		}
		System.out.println(sb.toString());
	}

}
