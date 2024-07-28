package level_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java_1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		HashMap<Integer, String> ItoS = new HashMap<>();
		HashMap<String, Integer> StoI = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= num1; i++) {
			String str = br.readLine();
			ItoS.put(i, str);
			StoI.put(str, i);
		}
		
		for(int i = 0; i < num2; i++) {
			String str = br.readLine();
			if(chkNum(str)) {
				int num = Integer.parseInt(str);
				sb.append(ItoS.get(num)).append('\n');
			}
			else {
				sb.append(StoI.get(str)).append('\n');
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static boolean chkNum(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
