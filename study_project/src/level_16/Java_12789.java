package level_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_12789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		// [Queue 함수] offer : 맨뒤 추가, poll : 맨앞 제거, peek : 맨앞 반환
		Queue<Integer> queue = new LinkedList<>();
		// [Stack 함수 ] push : 맨위 추가, pop : 맨위 제거, peek : 맨위 반환, search : 위치 반환
		Stack<Integer> stack = new Stack<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			int in = Integer.parseInt(st.nextToken());
            queue.offer(in);
        }
		
		int current = 1;
		
		while (!queue.isEmpty()) {
            if (queue.peek() == current) {
                queue.poll();
                current++;
            } else if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
                current++;
            } else {
                stack.push(queue.poll());
            }
        }
		
        while (!stack.isEmpty()) {
            if (stack.pop() != current) {
                System.out.println("Sad");
                return;
            }
            current++;
        }
        
        System.out.println("Nice");
		
	}

}
