package gittest;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class bj_2751 {
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
    }
}
