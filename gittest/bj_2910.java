package gittest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> qq = new LinkedHashMap<>();

        for(int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(st.nextToken());
            qq.put(num, qq.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> list1 = new ArrayList<>(qq.keySet());


        for(int key : list1) {
            for(int i = 0 ; i < qq.get(key) ; i++) {

            }
        }
    }
}
