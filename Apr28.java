import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apr28 { //10844
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mod = 1000000000;
        long[][] dp = new long[n + 1][10];
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }
        if (n > 1) {
            for (int i = 2; i < n + 1; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j == 0) {
                        dp[i][0] = dp[i - 1][1] % mod;
                    } else if (j == 9) {
                        dp[i][9] = dp[i - 1][8] % mod;
                    } else {
                        dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                    }
                }
            }
        }
        long count = 0;
        for (int i = 0; i < 10; i++) {
            count = (count + dp[n][i]) % mod;
        }
        System.out.println(count);

    }
}
// dp- bottom-up: dp[n]을 구하기 위해서는 dp[n-1]까지의 값이 다 나와야 한다.
// n에서 가능한 모든 연산 과정을 수행하고 이 중에서 최소 연산 횟수를 출력