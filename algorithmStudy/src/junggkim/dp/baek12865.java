package junggkim.dp;

import java.util.*;
import java.io.*;



public class baek12865 {

    static int[][] temp;
    static int[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N];
        temp = new int[N][2];
        // 초기 설정
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            temp[i][0] = Integer.parseInt(st.nextToken());
            temp[i][1] = Integer.parseInt(st.nextToken());
        }

        List<Integer> dp = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int sum = 0;
        //판별
        for (int i = 0; i < N - 1; i++){
            sum += temp[i][0];
            for (int j = i + 1; j < N; j++){
//                if (sum )
            }
        }



    }
}
