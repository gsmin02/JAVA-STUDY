package level_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java_18258 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
			String com = st.nextToken();
            
            if (com.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.offer(num);
                
            } else if (com.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
                
            } else if (com.equals("size")) {
                sb.append(queue.size()).append("\n");
                
            } else if (com.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
                
            } else if (com.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
                
            } else if (com.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        
        System.out.print(sb.toString());
    }

}
