package level_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.StringTokenizer;

public class Java_7785 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		TreeSet<String> set = new TreeSet<>();
		
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			String enl = st.nextToken();
			if (enl.equals("enter")) {
				set.add(str);
			} else if(enl.equals("leave")) {
				set.remove(str);
			}
		}
		
		for(String str : set.descendingSet()) {
			sb.append(str).append('\n');
		}
		System.out.println(sb.toString());

		
	}

}
