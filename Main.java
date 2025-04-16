
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp=new long[1000001];
        for (int i = 0; i <= n; i++) {
            dp[i]=1000000;
        }
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;
        for(int i=1;i<n;i++) {
            if(i*2<=n) {
                dp[i*2]=Math.min(dp[i*2],dp[i]+1);
            }
            if(i*3<=n) {
                dp[i*3]=Math.min(dp[i*3],dp[i]+1);
            }
            dp[i+1]=Math.min(dp[i+1],dp[i]+1);

        }
        System.out.println(dp[n]);


    }

}




