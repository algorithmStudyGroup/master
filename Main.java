import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n==1){
            System.out.println(3);
            return;
        }else if(n==2){
            System.out.println(7);
            return;
        }

        long[] dp=new long[n];
        dp[0]=3;
        dp[1]=7;

        for(int i=2;i<n; i++) {
            dp[i]= (dp[i-1] + dp[i-1] + dp[i-2])%9901;
        }
        System.out.println(dp[n-1]);
    }
}