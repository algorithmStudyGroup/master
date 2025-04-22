import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Apr2202 { // 10866
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.contains("push_front")) {
                q.addFirst(Integer.parseInt(str.split(" ")[1]));
            } else if (str.contains("push_back")) {
                q.addLast(Integer.parseInt(str.split(" ")[1]));
            } else if (str.contains("pop_front")) {
                if (!q.isEmpty()) {
                    sb.append(q.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }else if (str.contains("pop_back")) {
                if (!q.isEmpty()) {
                    sb.append(q.pollLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            } else if (str.contains("size")) {
                sb.append(q.size()).append("\n");
            } else if (str.contains("empty")) {
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            } else if (str.contains("front")) {
                if (!q.isEmpty()) {
                    sb.append(q.getFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (str.contains("back")) {
                if (!q.isEmpty()) {
                    sb.append(q.getLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}