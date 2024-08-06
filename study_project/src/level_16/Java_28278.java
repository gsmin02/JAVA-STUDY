package level_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_28278 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int com = Integer.parseInt(st.nextToken());
			int val;
			if(com == 1) {
				val = Integer.parseInt(st.nextToken());
				stack.push(val);
			} else if (com == 2) {
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					val = stack.pop();
					System.out.println(val);
				}
			} else if (com == 3) {
				System.out.println(stack.size());
			} else if (com == 4) {
				if(stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (com == 5) {
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					val = stack.peek();
					System.out.println(val);
				}
			}
		}
	}

}
