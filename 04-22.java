
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = (br.readLine().split(" "));
        int c= Integer.parseInt(input[0]);
        int n= Integer.parseInt(input[1]);

        int[] cost=new int[n];
        int[] reward=new int[n];

        for(int i=0; i<n; i++){
            input = (br.readLine().split(" "));
            cost[i]= Integer.parseInt(input[0]);
            reward[i]= Integer.parseInt(input[1]);
        }
        long[] dp=new long[1101];

        for(int i=0; i<=1100; i++){
            dp[i]=1000000000;
        }

        for(int i=0; i<n; i++){
            dp[reward[i]]=Math.min(dp[reward[i]],cost[i]);
        }

        for(int i = 0; i<= c+99; i++){
            for(int j=0; j<=i/2; j++){
                dp[i]=Math.min(dp[i], dp[j]+dp[i-j]);
            }
            for(int j=i; j>=0; j--){
                if(dp[i]<dp[j]){
                    dp[j]=dp[i];
                }
            }
        }
        System.out.println(dp[c]);
   }
}





