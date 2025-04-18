package junggkim.dp;

import java.io.*;
import java.util.*;

public class Baek1932 {
    static int[] triangle = new int[500 * 500];;
    static int[] dp = new int[500 * 500];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int index = 0;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
             for (int j = 0; j < count + 1; j++){
                 triangle[index++] = Integer.parseInt(st.nextToken());
             }
             count++;
        }

        //초기  1줄 dp 설정
        int temp = index;
        for (int i = 0; i < N; i ++){
            dp[temp - 1] = triangle[temp - 1];
            temp--;
        }

        int count2 = N;
        for (int i = index - 1 - N; i >= 0; i--){
            dp[i] = Math.max(dp[i + N] + triangle[i], dp[i + N - 1] + triangle[i]);
            count2--;
            if (count2 == 1) {
                N--;
                count2 = N;
            }
        }

        System.out.println(dp[0]);

    }
}
