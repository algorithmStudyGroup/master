import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Apr1802 { // 11651
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<User> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int x = Integer.parseInt(str.split(" ")[0]);
            int y = Integer.parseInt(str.split(" ")[1]);
            User user = new User(x, y);
            pq.add(user);
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            User user = pq.poll();
            sb.append(user.x).append(" ").append(user.y).append("\n");
        }
        System.out.println(sb);
    }
    static class User implements Comparable<User> {
        int x = 0;
        int y = 0;
        User(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(User o) {
            if(this.y == o.y) {
                return this.x - o.x;
            }else{
                return this.y - o.y;
            }
        }
    }
}
