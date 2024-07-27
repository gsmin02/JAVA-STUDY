package level_13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Java_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < num; i++) {
			set.add(sc.next());
		}
		
		ArrayList<String> list = new ArrayList<>(set);
		
		list.sort((a, b) -> {
			int com = Integer.compare(a.length(), b.length());
			if(com != 0) {
				return com;
			}
			else {
				return a.compareTo(b);
			}
		});
		
		for(String st : list) {
			System.out.println(st);
		}
		
		sc.close();
	}

}
