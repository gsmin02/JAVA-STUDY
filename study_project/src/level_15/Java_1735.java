package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_1735 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int n3 = Integer.parseInt(st.nextToken());
		int n4 = Integer.parseInt(st.nextToken());
		
		int num1 = (n1 * n4) + (n2 * n3);
		int num2 = n2 * n4;
		
		// 기약분수 : 분자와 분모의 최대공약수가 1인 분수
		// ( a / GCD(a, b) ) / ( b / GCD(a, b) )
		int result = gcd(num1, num2);
		num1 /= result;
		num2 /= result;
		
		System.out.println(num1 + " " + num2);
	}
	public static int gcd(int a, int b) {
		// a 와 b 의 나머지가 0 일 때까지 반복
		if(a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

}
