package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_13909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		// 창문이 열려있기 위해서는 홀수번 열고 닫아야 함
		// 입력한 수의 약수의 개수가 홀수 개어야 열려있는 상태가 됨
		// 이를 만족하는 경우는 제곱수임
		// 따라서 입력한 수보다 적은 제곱수의 개수만 새면 됨
		for(int i = 1; i * i <= num; i++)
			cnt++;
		
		System.out.println(cnt);
	}

}
