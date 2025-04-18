package junggkim.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1149번 RGB 거리
public class Baek1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g;
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b;
        }
        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));

    }
}




//public class Back1149 {
//    static int[][] house;
//    static int N;
//    static int min = 2147483647;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        N = Integer.parseInt(br.readLine());
//        house = new int[N][3];
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < 3; j++) {
//                house[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        int sum = 0;
//
//        int i = 0;
//        for (int j = 0; j < 3; j++) {
//            sum = 0;
//            sum += house[i][j];
//            check(sum, i + 1, j);
//        }
//        System.out.println(min);
//
//
//    }
//
//    public static void check(int sum, int i, int j) {
//        if (i == N) {
//            if (sum < min)
//                min = sum;
//            return ;
//        }
//        System.out.println("sum =  " + sum + ", i = " + i);
//        for (int k = 0; k < 3; k++) {
//            if (k == j) {
//                continue;
//            }
//            sum += house[i][k];
//            check(sum,i + 1,k);
//        }
//    }
//}
