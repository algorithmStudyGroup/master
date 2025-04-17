
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dp=new long[n][4];
        long[] num=new long[n];
        for(int i=0;i<n;i++){
            num[i]=Long.parseLong(br.readLine());
        }
        if(n==1){
            System.out.println(num[0]);
            return;
        }

        dp[0][0]=0;
        dp[0][1]=num[1];
        dp[0][2]=num[0];
        dp[0][3]=num[0]+num[1];
        for(int i=1;i<n/2;i++){
            dp[i][0]=Math.max(dp[i-1][2],Math.max(dp[i-1][0],Math.max(dp[i-1][3],dp[i-1][1])));
            dp[i][1]=Math.max(dp[i-1][2],Math.max(dp[i-1][0],Math.max(dp[i-1][3],dp[i-1][1])))+num[2*i+1];
            dp[i][2]=Math.max(dp[i-1][2],Math.max(dp[i-1][0],dp[i-1][1]))+num[2*i];
            dp[i][3]=Math.max(dp[i-1][0],dp[i-1][2])+num[2*i+1]+num[2*i];

        }
        if(n%2==1){
            dp[n/2][0]=Math.max(dp[n/2-1][2],Math.max(dp[n/2-1][0],Math.max(dp[n/2-1][3],dp[n/2-1][1])));
            dp[n/2][1]=Math.max(dp[n/2-1][2],Math.max(dp[n/2-1][0],Math.max(dp[n/2-1][3],dp[n/2-1][1])));
            dp[n/2][2]=Math.max(dp[n/2-1][2],Math.max(dp[n/2-1][0],dp[n/2-1][1]))+num[n-1];
            dp[n/2][3]=Math.max(dp[n/2-1][2],Math.max(dp[n/2-1][0],dp[n/2-1][1]))+num[n-1];
            System.out.println(Math.max(dp[n/2][0],Math.max(dp[n/2][1],Math.max(dp[n/2][2],dp[n/2][3]))));
            return;
        }
        System.out.println(Math.max(dp[n/2-1][0],Math.max(dp[n/2-1][1],Math.max(dp[n/2-1][2],dp[n/2-1][3]))));
    }

}





