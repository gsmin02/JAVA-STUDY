package level_13;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Java_18870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			set.add(arr[i]);
        }
		
		HashMap<Integer, Integer> kv = new HashMap<>();
		int val = 0;
		for (int key : set) {
			kv.put(key, val++);
		}
		
		StringBuilder sb = new StringBuilder();
        for (int ele : arr) {
            sb.append(kv.get(ele)).append(" ");
        }
        
        System.out.println(sb.toString());
		
		sc.close();
	}

}
