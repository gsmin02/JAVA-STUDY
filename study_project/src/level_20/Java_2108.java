package level_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Java_2108 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		double sum = 0;
		
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		int cnt = 0;
		int max_cnt = -1;
		int fval = arr[0];
		boolean chk = false;
		
		for(int i = 0; i < num - 1; i++) {
			if(arr[i] == arr[i+1]) {
				cnt++;
			} else {
				cnt = 0;
			}
			
			if(max_cnt < cnt) {
				max_cnt = cnt;
				fval = arr[i];
				chk = true;
			}
			// 최빈값이 여러 개 있는 경우, 최빈값 중 두 번째로 작은 값으로 저장
			else if(max_cnt == cnt && chk == true) {
				fval = arr[i];
				chk = false;
			}
		}
		
		System.out.println(Math.round(sum / num));
		System.out.println(arr[(num-1) / 2]);
		System.out.println(fval);
		System.out.println(arr[num-1] - arr[0]);
	}

}
