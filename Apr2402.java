import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Apr2402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            result[i] = Integer.parseInt(br.readLine());
            if (result[i] > max) {
                max = result[i];
            }
        }
        int[] dp = new int[max + 6];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        dp[4] = 7;
        dp[5] = 13;
        dp[6] = 24;
        if (max > 6) {
            for (int i = 7; i < 11; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(dp[result[i]]);
        }
    }
}
// dp- bottom-up: dp[n]을 구하기 위해서는 dp[n-1]까지의 값이 다 나와야 한다.
// n에서 가능한 모든 연산 과정을 수행하고 이 중에서 최소 연산 횟수를 출력
// 더하는 수가 1개 이상, 따라서 dp[2]는 1+1, 2로 2 가지/ dp[3]은 1+1+1, 1+2, 2+1, 3으로 4 가지
// 더하는 수가 1개면 안된다고 생각해서 잘못 풀었다...
