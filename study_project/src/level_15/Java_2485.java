package level_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2485 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		int min = 0; // 최소 간격
		
		// 간격 중 가장 큰 값의 최소 간격을 구해야 함 -> 최대공약수
		// 가장 짧은 거리를 구하는 방식의 경우 3, 7, 14, 21 같은 상황을 해결 못함
		for(int i = 1; i < num; i++) {
			int diff = arr[i] - arr[i-1];
			min = gcd(diff, min);
		}
		
		int count = 0; // 최소 간격의 값 저장
		
		for(int i = 1; i < num; i++) {
			// 각 간격에서 최대공약수로 나눈 값을 더해줌
			// 1을 빼서 간격 사이만 추가함
			count += ((arr[i] - arr[i-1]) / min) -1;
		}
		
		System.out.println(count);
	}
	public static int gcd(int a, int b) {
		// b 가 0 일 때까지 반복
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
