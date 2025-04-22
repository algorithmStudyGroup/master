import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Apr2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+1; // 1 뺐을 때
            if(i%2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2]+1); // 2로 나눴을 때
            }
            if(i%3 == 0){
                dp[i] = Math.min(dp[i], dp[i/3]+1); // 3으로 나눴을 때
            }
        }
        System.out.println(dp[n]);
    }
}
// dp- bottom-up: dp[n]을 구하기 위해서는 dp[n-1]까지의 값이 다 나와야 한다. 
// n에서 가능한 모든 연산 과정을 수행하고 이 중에서 최소 연산 횟수를 출력
