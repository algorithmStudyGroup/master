package junggkim.dp;

import java.util.*;
import java.io.*;


public class Baek2696 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++){
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1 ; j++){
                if (j % 11 == 0){
                    st = new StringTokenizer(br.readLine());
                }
                int num = Integer.parseInt(st.nextToken());
                if (j %2 !=0){  //홀수 일경우
                    int index = j / 2;
                    pq.poll();
                }

            }
        }


    }
}
