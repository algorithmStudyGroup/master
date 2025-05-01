import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class May0101 { //2156
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] quan = new int[n + 3];
        for (int i = 1; i < n + 1; i++) {
            quan[i] = Integer.parseInt(br.readLine());
        }
        long[] dp = new long[n + 3];
        dp[0] = 0;
        dp[1] = quan[1];
        dp[2] = quan[1]+quan[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+quan[i], dp[i-3]+quan[i-1]+quan[i]));
        }

        System.out.println(dp[n]);

    }
}
// dp- bottom-up: dp[n]을 구하기 위해서는 dp[n-1]까지의 값이 다 나와야 한다.
