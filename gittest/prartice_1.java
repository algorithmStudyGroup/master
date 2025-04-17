package gittest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class prartice_1 {
    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();

        String input[] = br.readLine().split(" ");
        String start1 = input[0];
        String end1 = input[1];

        int start = Integer.parseInt(start1);
        int end = Integer.parseInt(end1);


        int sum = 0;



        for (int i = 1; arr.size() <= end; i++) {
            for (int j = 1; j <= i && arr.size() <= end; j++) {
                arr.add(i);
            }
        }


        for(int i = start-1 ; i <end ; i++){
            sum += arr.get(i);
        }

        System.out.println(sum);
    }
}
