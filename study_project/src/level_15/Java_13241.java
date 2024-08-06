package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		long result = 0;
		
		st = new StringTokenizer(br.readLine());
		long num1 = Integer.parseInt(st.nextToken());
		long num2 = Integer.parseInt(st.nextToken());
		
		result = gcd(num1, num2);
		System.out.println((num1 * num2) / result);
	}
	
	public static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
