package junggkim.dp;

import java.util.*;
import java.io.*;


public class Baek2696 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        List<Integer> temp;

        PriorityQueue<Integer> pq;

        for (int i = 0; i < N; i++){
            int M = Integer.parseInt(br.readLine());
            temp = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            System.out.println(M/2 + 1);       //소수 개수
            int printCount = 0; // ★ 추가

            pq = new PriorityQueue<>();

            for (int j = 1; j < M + 1 ; j++){

                if ((j - 1) % 10 == 0 && j != 1) {
//                    System.out.println("j = " + j);
                    st = new StringTokenizer(br.readLine());

                }

                int num = Integer.parseInt(st.nextToken());
                pq.offer(num);

                if (j % 2 !=0){  //홀수 일경우
                    int index = j / 2;
                    for (int k = 0; k < M; k++){
                        int tempNum = pq.poll();
                        if (k == index){
                            System.out.print(tempNum + " ");
                            printCount++;
                            if (printCount % 10 == 0) {     // ★ 10개마다 줄바꿈
                                System.out.println();
                            }
                            temp.add(tempNum);
                            break;
                        }
                        temp.add(tempNum);
                    }
                    int l = 0;
                    while(!temp.isEmpty()){
                        pq.offer(temp.remove(l));
                    }

                }

            }
            System.out.println();
        }


    }
}
