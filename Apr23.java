import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Apr23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        if(n>2) {
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1])%10007;
                if(dp[i]<0){
                    System.out.println(dp[i]);
                }
            }
        }
        System.out.println(dp[n]);
    }
}