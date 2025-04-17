package junggkim.dp;

import java.io.*;

public class Back2156 {
    static int[] podo;
    static int[] dp;

    //포도주 잔에 들어있는거 모두 마셔야 된다.
    // 연속으로 놓여 있는 3잔을 모두 마실 수 없다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        podo = new int[N + 1];
        dp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            podo[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = podo[1];
        if (N > 1) {
            dp[2] = podo[1] + podo[2];
        }
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + podo[i], dp[i - 3] + podo[i] + podo[i - 1]));
        }
        System.out.println(dp[N]);


    }
}
