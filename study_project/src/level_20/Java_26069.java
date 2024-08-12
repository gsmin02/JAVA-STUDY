package level_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Java_26069 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			
			if(set.size() == 0 && (str1.equals("ChongChong") || str2.equals("ChongChong"))) {
				set.add(str1);
				set.add(str2);
			}
			
			if(set.contains(str1) || set.contains(str2)) {
				set.add(str1);
				set.add(str2);
			}
		}
		System.out.println(set.size());
	}

}
