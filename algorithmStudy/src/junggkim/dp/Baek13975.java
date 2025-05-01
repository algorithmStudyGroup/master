package junggkim.dp;

import java.util.*;
import java.io.*;



public class Baek13975 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //초기 설정
        for (int i = 0 ; i < N; i++){
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < M; j++){
                pq.offer(Integer.parseInt(st.nextToken()));
            }
            //큐에 넣어둔거 꺼내서 합쳐서 최소값 구하기
            int minSum = pq.poll();
            List<Integer> sumList = new ArrayList<>();
            while(!pq.isEmpty()){

                minSum += pq.poll();
                sumList.add(minSum);
            }

            //합치기
            int resultSum = 0;
            while(!sumList.isEmpty()){
                resultSum += sumList.remove(0);
            }
            System.out.println(resultSum);

        }

        System.out.println();


    }
}
