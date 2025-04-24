import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Apr2401 { // 11727
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        if (n > 2) {
            for (int i = 3; i <= n; i++) {
                dp[i] = ((2 * dp[i - 2]) + dp[i - 1]) % 10007;
            }
        }
        System.out.println(dp[n]);
    }
}
// dp- bottom-up: dp[n]을 구하기 위해서는 dp[n-1]까지의 값이 다 나와야 한다.
// n에서 가능한 모든 연산 과정을 수행하고 이 중에서 최소 연산 횟수를 출력
//