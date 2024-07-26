package level_13;

import java.util.Scanner;

public class Java_1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[10];
		
		// 입력한 값을 배열의 위치로 가서 1번 더함
		while(num != 0) {
			arr[num % 10]++;
			num /= 10;
		}
		for(int i = 9; i >= 0; i--) {
			// 더해진 만큼 그 숫자를 반복 출력
			while (arr[i]-- > 0) {
				System.out.print(i);
			}
		}

		sc.close();
	}

}
