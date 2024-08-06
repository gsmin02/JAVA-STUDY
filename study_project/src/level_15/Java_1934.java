package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			result = gcd(num1, num2);
			// 최소공배수 : (a, b) = (a * b) / (a, b 최대공약수)
			// 최대공약수 (유클리드 호제법) : GCD(a, b) = GCD(b, a % b)
			// *GCD : Greatest Common Divisor
			// 48 / 18 = 2 ... 12
			// 18 / 12 = 1 ... 6
			// 12 / 6 = 2 ... 0 <- 최대공약수, GCD = 6
			System.out.println((num1 * num2) / result);
		}
	}
	
	public static int gcd(int a, int b) {
		// b 가 0이 될 때까지 반복
		if(b == 0) {
			return a;
		}
		// 재귀적 호출
		return gcd(b, a % b);
	}

}
