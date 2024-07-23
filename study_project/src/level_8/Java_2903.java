package level_8;

import java.util.Scanner;

public class Java_2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size+1];
		arr[0] = 4;
		
		int count = 0;
		int num = 2;
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = (int) Math.sqrt(arr[i - 1]) + (int) Math.pow(num, count);
			arr[i] = (int) Math.pow(arr[i], 2);
			count++;
		}
		System.out.println(arr[size]);
		sc.close();
	}

}
