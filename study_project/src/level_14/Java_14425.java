package level_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Java_14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Set<String> set = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int count = 0;
		
		for(int i = 0; i < num1; i++) {
			set.add(br.readLine());
		}
		for(int i = 0; i < num2; i++) {
			if(set.contains(br.readLine())) {
                count++;
            }
		}
		sb.append(count);
		System.out.println(sb.toString());
		
	}

}
