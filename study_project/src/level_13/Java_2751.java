package level_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		// 범위가 만 이하의 자연수여서 만개 생성
		int[] arr = new int[10001];
		
		// 입력한 값을 배열의 위치로 가서 1번 더함
		for(int i = 0; i < num; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		// 더해진 만큼 그 수를 출력
		for(int i = 0; i < arr.length; i++) {
			// 입력이 안된 만 이하의 수는 0이기 때문
			if(arr[i] != 0) {
				for(int j = 0; j < arr[i]; j++) {
					sb.append(i).append('\n');
				}
			}
		}
		System.out.println(sb);
	}

}
