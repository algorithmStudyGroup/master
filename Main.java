
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int c=0;c<t;c++){
            int n = Integer.parseInt(br.readLine());
            long[] dp=new long[1000001];
            dp[1]=1;
            dp[2]=2;
            dp[3]=4;
            for(int i=4;i<=n;i++){
                dp[i]=dp[i-1]%1000000009+dp[i-2]%1000000009+dp[i-3]%1000000009;
            }
            System.out.println(dp[n]%1000000009);
        }
    }
}
