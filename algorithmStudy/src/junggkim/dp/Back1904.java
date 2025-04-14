package junggkim.dp;

import java.io.*;
import java.util.Scanner;

//빠른 풀이--------------------------------------------------------------
public class Back1904{
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int[]dp=new int[n+1];     // 이부분은 굿!!
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++)
            dp[i]=(dp[i-1]+dp[i-2])%15746;

        System.out.print(dp[n]);
    }
}

 // 내가 푼것 --------------------------------------------------------------------

//public class Back1904 {
//    static int[] dp = new int[1000001];
//    //1 2 3 5 8 13
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        dp[0] = 0;
//        dp[1] = 1;
//        dp[2] = 2;
//        // -1 로 초기화
//        for(int i = 3; i < dp.length; i++) {
//            dp[i] = -1;
//        }
//        System.out.println(check(N));
//    }
//    public static int check(int N){
//        if(dp[N] == -1) {
//            dp[N] = (check(N - 1) + check((N - 2))) % 15746;
//        }
//        return dp[N];
//    }
//}
