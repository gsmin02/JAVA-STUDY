package level_13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java_10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[][] arr = new String[num][2];
		
		for(int i = 0; i < num; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		Comparator<String[]> Comparator = (a, b) -> Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
		
		Arrays.sort(arr, Comparator);
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
		sc.close();
	}

}
