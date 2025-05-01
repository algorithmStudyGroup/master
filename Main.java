import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { //2193
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] quan = new int[n];
        for (int i = 0; i < n; i++) {
            quan[i] = Integer.parseInt(br.readLine());
        }
        long[][] dp = new long[n + 2][2];
        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[2][0] = 2;
        dp[2][1] = 2;
        if (n > 2) {
            for (int i = 3; i < n + 2; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
                dp[i][1] = dp[i - 1][0] + dp[i - 2][0];
            }
        }
        long max = 0;



        long count = dp[n][0] + dp[n][1];
        System.out.println(n + ": " + count);

    }
}
// dp- bottom-up: dp[n]을 구하기 위해서는 dp[n-1]까지의 값이 다 나와야 한다.
