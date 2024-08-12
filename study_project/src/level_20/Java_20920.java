package level_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Java_20920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < num1; i++) {
			String str = br.readLine();
			if(str.length() >= num2) {
				map.put(str, map.getOrDefault(str, 0) + 1);
			}
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		
		// 정렬 조건 수정
		list.sort((a, b) -> {
			int cnt = map.get(b) - map.get(a);
			if(cnt != 0)
				return cnt;
			int len = b.length() - a.length();
			if(len != 0)
				return len;
			return a.compareTo(b);
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(String word : list) {
			sb.append(word).append('\n');
		}
		System.out.println(sb.toString());
		
	}

}
