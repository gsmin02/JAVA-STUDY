package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_17103 {
	static boolean[] arr = new boolean[1000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 이렇게 선언 가능
		arr[0] = arr[1] = true;
		
		// 에라토스테네스의 체
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] == false) {
				for(int j = 2; i * j < arr.length; j++) {
					arr[i * j] = true;
				}
			}
		}
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			int in = Integer.parseInt(br.readLine());
			int count = 0;
			
			if(in % 2 == 0) {
				// 입력받은 값의 절반만큼만 연산
				// j 부터 입력받은 값 - j 까지 수 중 두 수가 소수인 경우
				for(int j = 2; j <= in / 2; j++) {
					if(!arr[j] && !arr[in-j]) {
						count++;
					}
				}
				sb.append(count).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
			
		}
		System.out.println(sb.toString());
	}

}
