package junggkim.dp;

import java.io.*;
import java.util.*;


public class baek11053 {
    static int[] array;
    static int[] dp;
    static int[] count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        array = new int[N];
        dp = new int[N];
        count = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        //bottom-up
        int max = Integer.MIN_VALUE;
        dp[0] = array[0];
        count[0] = 1;
        if (N == 1){
            System.out.println("1");
            return ;
        }
        for (int i = 0; i < N - 1; i++){

            dp[i] = array[i];
            count[i] = 1;
            for (int j = i + 1; j < N; j++){
//                System.out.println("dp[" + (j - 1) + "] = " + dp[j - 1] + "  array[" + j + "] = " + array[j]);
               if (dp[j - 1] < array[j]) {
                   dp[j ] = array[j];
//                   System.out.println(count[j]);
                   count[j] = count[j - 1] + 1;
               }else {
                   dp[j] = dp[j - 1];

                   count[j] = count[j -1];
               }
               if (j == N - 1){
//                   System.out.println("max = " + max + "count = " + count[i]);
                   max =  Math.max(max, count[j]);
               }
           }
        }

        System.out.println(max);
    }
}
