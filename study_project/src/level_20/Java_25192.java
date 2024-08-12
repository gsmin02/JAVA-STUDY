package level_20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Java_25192 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Set<String> set = new HashSet<>();
		int result = 0;
		
		for(int i = 0; i < num; i++) {
			String str = sc.next();
			if(str.equals("ENTER")) {
				result += set.size();
				set.removeAll(set);
			} else {
				set.add(str);
			}
		}
		result += set.size();
		System.out.println(result);
		sc.close();
	}

}
