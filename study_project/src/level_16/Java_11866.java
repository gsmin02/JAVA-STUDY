package level_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int count = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= num1; i++) {
			queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			count++;
			if(count % num2 == 0) {
				list.add(queue.poll());
			} else {
				queue.offer(queue.poll());
			}
		}
		
		System.out.print("<");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if(i != list.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(">");
		
	}

}
