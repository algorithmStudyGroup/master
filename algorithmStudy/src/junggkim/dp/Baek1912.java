package junggkim.dp;

import java.io.*;
import java.util.*;


public class Baek1912 {

    static int[] dp;
    static int[] list;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        list = new int[N];
        dp = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < N; i++){
            list[i] = Integer.parseInt(st.nextToken());

        }

        dp[0] = list[0];
        int max = list[0];
        //재귀 또는 반복문
        for (int i = 1; i < N; i++){
            dp[i] = Math.max(dp[i - 1] + list[i], list[i]);
            if (max < dp[i]){
                max = dp[i];
            }


        }
        System.out.println(max);

    }

}
