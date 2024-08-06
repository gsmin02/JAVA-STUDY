package level_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Java_28279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> deque = new ArrayDeque<>(); 
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int in = Integer.parseInt(st.nextToken());
			
			switch(in) {
			case 1 :
				deque.addFirst(Integer.parseInt(st.nextToken())); break;
			case 2 :
				deque.addLast(Integer.parseInt(st.nextToken())); break;
			case 3 :
				sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append('\n'); break;
			case 4 :
				sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append('\n'); break;
			case 5 :
				sb.append(deque.size()).append('\n'); break;
			case 6 :
				sb.append(deque.isEmpty() ? 1 : 0).append('\n'); break;
			case 7 :
				sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n'); break;
			case 8 :
				sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n'); break;
			}
		}
		System.out.println(sb.toString());
	}

}
