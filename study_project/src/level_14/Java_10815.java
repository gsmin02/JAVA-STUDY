package level_14;

import java.util.Scanner;

public class Java_10815 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		boolean[] arr1 = new boolean[20000001];
		for(int i = 0; i < 20000001; i++) {
			arr1[i] = false;
		}
		for(int i = 0; i < num1; i++) {
			arr1[sc.nextInt() + 10000001] = true;
		}
		int num2 = sc.nextInt();
		boolean[] arr2 = new boolean[num2];
		for(int i = 0; i < num2; i++) {
			if(arr1[sc.nextInt() + 10000001] == true) {
				arr2[i] = true;
			}
		}
		for(int i = 0; i < num2; i++) {
			if(arr2[i] == true) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
		
		sc.close();
	}

}
