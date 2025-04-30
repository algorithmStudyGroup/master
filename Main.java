
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = (br.readLine().split(" "));
        int n = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);

        int[] arr = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[][][] dp = new int[n+1][b+1][2];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= b; j++)
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
        dp[0][0][0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k < 2; k++) {
                    if (dp[i][j][k] == -1) continue;
                    dp[i+1][j][0] = Math.max(dp[i][j][k],dp[i+1][j][0]);

                    if(j<b){
                        if(k==1){
                            dp[i+1][j+1][1] = Math.max(dp[i][j][k]+arr[i+1],dp[i+1][j+1][1]);
                        }else{
                            dp[i+1][j+1][1] = Math.max(dp[i][j][k],dp[i+1][j+1][1]);
                        }
                    }

                }
            }
        }

        int result = Math.max(dp[n][b][0], dp[n][b][1]);
        System.out.println(result);

    }
}
